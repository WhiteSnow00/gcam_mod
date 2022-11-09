import java.util.concurrent.locks.LockSupport;
import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

abstract class oex extends AtomicReference implements Runnable
{
    private static final Runnable a;
    private static final Runnable b;
    
    static {
        a = new iey(19);
        b = new iey(19);
    }
    
    public oex() {
    }
    
    private final void c(final Thread thread) {
        Runnable runnable = this.get();
        Object o = null;
        int n = 0;
        int n2 = 0;
        while (true) {
            if (!(runnable instanceof oew)) {
                if (runnable != oex.b) {
                    break;
                }
            }
            else {
                o = runnable;
            }
            final int n3 = n2 + 1;
            int n4 = 0;
            Label_0131: {
                if (n3 > 1000) {
                    final Runnable b = oex.b;
                    if (runnable != b) {
                        n4 = n;
                        if (!this.compareAndSet((oew)runnable, (oew)b)) {
                            break Label_0131;
                        }
                    }
                    final boolean b2 = Thread.interrupted() || n != 0;
                    LockSupport.park(o);
                    n4 = (b2 ? 1 : 0);
                }
                else {
                    Thread.yield();
                    n4 = n;
                }
            }
            runnable = this.get();
            n = n4;
            n2 = n3;
        }
        if (n != 0) {
            thread.interrupt();
        }
    }
    
    public abstract Object a();
    
    public abstract String b();
    
    public abstract void d(final Throwable p0);
    
    public abstract void e(final Object p0);
    
    public abstract boolean g();
    
    final void h() {
        final Runnable runnable = this.get();
        if (runnable instanceof Thread) {
            final oew oew = new oew(this);
            oew.a(Thread.currentThread());
            if (this.compareAndSet(runnable, oew)) {
                try {
                    final Thread thread = (Thread)runnable;
                    thread.interrupt();
                    if (this.getAndSet(oex.a) == oex.b) {
                        LockSupport.unpark(thread);
                    }
                }
                finally {
                    if (this.getAndSet(oex.a) == oex.b) {
                        LockSupport.unpark((Thread)runnable);
                    }
                }
            }
        }
    }
    
    @Override
    public final void run() {
        final Thread currentThread = Thread.currentThread();
        final Throwable t = null;
        if (!this.compareAndSet(null, currentThread)) {
            return;
        }
        final boolean b = this.g() ^ true;
        if (b) {
            try {
                this.a();
            }
            finally {
                if (!this.compareAndSet(currentThread, oex.a)) {
                    this.c(currentThread);
                }
                this.d(t);
                return;
            }
        }
        if (!this.compareAndSet(currentThread, oex.a)) {
            this.c(currentThread);
        }
        if (b) {
            this.e(t);
        }
    }
    
    @Override
    public final String toString() {
        final Runnable runnable = this.get();
        String string;
        if (runnable == oex.a) {
            string = "running=[DONE]";
        }
        else if (runnable instanceof oew) {
            string = "running=[INTERRUPTED]";
        }
        else if (runnable instanceof Thread) {
            final String name = ((Thread)runnable).getName();
            final StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 21);
            sb.append("running=[RUNNING ON ");
            sb.append(name);
            sb.append("]");
            string = sb.toString();
        }
        else {
            string = "running=[NOT STARTED YET]";
        }
        final String b = this.b();
        final StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 2 + String.valueOf(b).length());
        sb2.append(string);
        sb2.append(", ");
        sb2.append(b);
        return sb2.toString();
    }
}
