import android.os.SystemClock;
import java.util.LinkedList;
import android.os.HandlerThread;
import android.os.Handler;
import java.util.Queue;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atx extends Thread
{
    private static final aub c;
    public final Queue a;
    public Boolean b;
    private final Handler d;
    private final HandlerThread e;
    
    static {
        c = new aub("DispatchThread");
    }
    
    public atx(final Handler d, final HandlerThread e) {
        super("Camera Job Dispatch Thread");
        this.a = new LinkedList();
        this.b = new Boolean(false);
        this.d = d;
        this.e = e;
    }
    
    private final boolean c() {
        synchronized (this.b) {
            return this.b;
        }
    }
    
    public final void a(final Runnable runnable) {
        if (!this.c()) {
            synchronized (this.a) {
                if (this.a.size() != 256L) {
                    this.a.add(runnable);
                    this.a.notifyAll();
                    return;
                }
                throw new RuntimeException("Camera master thread job queue full");
            }
        }
        throw new IllegalStateException("Trying to run job on interrupted dispatcher thread");
    }
    
    public final void b(final Runnable runnable, final Object o, String string) {
        final StringBuilder sb = new StringBuilder();
        sb.append("Timeout waiting 3500ms for ");
        sb.append(string);
        string = sb.toString();
        synchronized (o) {
            final long n = SystemClock.uptimeMillis() + 3500L;
            try {
                this.a(runnable);
                o.wait(3500L);
                if (SystemClock.uptimeMillis() > n) {
                    throw new IllegalStateException(string);
                }
            }
            catch (final InterruptedException ex) {
                if (SystemClock.uptimeMillis() > n) {
                    throw new IllegalStateException(string);
                }
            }
        }
    }
    
    @Override
    public final void run() {
        while (true) {
            final Queue a = this.a;
            monitorenter(a);
            try {
                while (this.a.size() == 0 && !this.c()) {
                    try {
                        this.a.wait();
                        continue;
                    }
                    catch (final InterruptedException ex) {
                        auc.c(atx.c, "Dispatcher thread wait() interrupted, exiting");
                    }
                    break;
                }
                final Runnable runnable = this.a.poll();
                monitorexit(a);
                if (runnable == null) {
                    if (this.c()) {
                        this.e.quitSafely();
                        return;
                    }
                    continue;
                }
                else {
                    runnable.run();
                    synchronized (this) {
                        this.d.post((Runnable)new atw(this));
                        try {
                            this.wait();
                        }
                        catch (final InterruptedException ex2) {}
                    }
                }
            }
            finally {
                monitorexit(a);
                while (true) {}
            }
        }
    }
}
