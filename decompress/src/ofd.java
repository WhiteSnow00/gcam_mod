import java.util.Collections;
import java.util.List;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

// 
// Decompiled by Procyon v0.6.0
// 

final class ofd extends odd
{
    private final Object a;
    private int b;
    private boolean c;
    
    public ofd() {
        this.a = new Object();
        this.b = 0;
        this.c = false;
    }
    
    private final void d() {
        synchronized (this.a) {
            final int b = this.b - 1;
            this.b = b;
            if (b == 0) {
                this.a.notifyAll();
            }
        }
    }
    
    @Override
    public final boolean awaitTermination(long nanos, final TimeUnit timeUnit) {
        nanos = timeUnit.toNanos(nanos);
        final Object a = this.a;
        monitorenter(a);
        try {
            while (!this.c || this.b != 0) {
                if (nanos <= 0L) {
                    monitorexit(a);
                    return false;
                }
                final long nanoTime = System.nanoTime();
                TimeUnit.NANOSECONDS.timedWait(this.a, nanos);
                nanos -= System.nanoTime() - nanoTime;
            }
            monitorexit(a);
            return true;
        }
        finally {
            monitorexit(a);
            while (true) {}
        }
    }
    
    @Override
    public final void execute(final Runnable runnable) {
        synchronized (this.a) {
            if (!this.c) {
                ++this.b;
                monitorexit(this.a);
                try {
                    runnable.run();
                    return;
                }
                finally {
                    this.d();
                }
            }
            throw new RejectedExecutionException("Executor already shutdown");
        }
    }
    
    @Override
    public final boolean isShutdown() {
        synchronized (this.a) {
            return this.c;
        }
    }
    
    @Override
    public final boolean isTerminated() {
        synchronized (this.a) {
            final boolean c = this.c;
            boolean b = false;
            if (c && this.b == 0) {
                b = true;
            }
            return b;
        }
    }
    
    @Override
    public final void shutdown() {
        synchronized (this.a) {
            this.c = true;
            if (this.b == 0) {
                this.a.notifyAll();
            }
        }
    }
    
    @Override
    public final List shutdownNow() {
        this.shutdown();
        return Collections.emptyList();
    }
}
