import java.util.concurrent.locks.LockSupport;
import java.util.concurrent.TimeUnit;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pof extends pom implements Runnable
{
    private static volatile Thread _thread;
    public static final pof b;
    private static volatile int debugStatus;
    private static final long g;
    
    static {
        pol.r(b = new pof());
        final TimeUnit milliseconds = TimeUnit.MILLISECONDS;
        Long n;
        try {
            n = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        }
        catch (final SecurityException ex) {
            n = 1000L;
        }
        g = milliseconds.toNanos(n);
    }
    
    private pof() {
    }
    
    private final Thread u() {
        synchronized (this) {
            final Thread thread = pof._thread;
            if (thread != null) {
                return thread;
            }
            final Thread thread2 = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
            (pof._thread = thread2).setDaemon(true);
            thread2.start();
            return thread2;
        }
    }
    
    private final void v() {
        synchronized (this) {
            if (!x()) {
                return;
            }
            pof.debugStatus = 3;
            final pnf e = super.e;
            final int a = png.a;
            e.a = null;
            super.f.a = null;
            this.notifyAll();
        }
    }
    
    private final boolean w() {
        synchronized (this) {
            if (x()) {
                return false;
            }
            pof.debugStatus = 1;
            this.notifyAll();
            return true;
        }
    }
    
    private static final boolean x() {
        final int debugStatus = pof.debugStatus;
        return debugStatus == 2 || debugStatus == 3;
    }
    
    @Override
    protected final Thread h() {
        final Thread thread = pof._thread;
        if (thread != null) {
            return thread;
        }
        return this.u();
    }
    
    @Override
    public final void run() {
        final ThreadLocal a = ppg.a;
        ppg.a.set(this);
        try {
            if (!this.w()) {
                pof._thread = null;
                this.v();
                if (!this.t()) {
                    this.h();
                }
                return;
            }
            long n = Long.MAX_VALUE;
            while (true) {
                Thread.interrupted();
                long j = this.j();
                if (j == Long.MAX_VALUE) {
                    final long nanoTime = System.nanoTime();
                    if (n == Long.MAX_VALUE) {
                        n = pof.g + nanoTime;
                    }
                    final long n2 = n - nanoTime;
                    if (n2 <= 0L) {
                        pof._thread = null;
                        this.v();
                        if (!this.t()) {
                            this.h();
                        }
                        return;
                    }
                    if (j > n2) {
                        j = n2;
                    }
                }
                else {
                    n = Long.MAX_VALUE;
                }
                if (j > 0L) {
                    if (x()) {
                        pof._thread = null;
                        this.v();
                        if (!this.t()) {
                            this.h();
                        }
                        return;
                    }
                    LockSupport.parkNanos(this, j);
                }
            }
        }
        finally {
            pof._thread = null;
            this.v();
            Label_0214: {
                if (this.t()) {
                    break Label_0214;
                }
                this.h();
                break Label_0214;
            }
            while (true) {}
        }
    }
}
