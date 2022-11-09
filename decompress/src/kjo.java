import java.util.Collections;
import java.util.List;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kjo extends odd
{
    private final Executor a;
    private final Object b;
    private int c;
    private boolean d;
    
    public kjo(final Executor a) {
        this.b = new Object();
        this.c = 0;
        this.d = false;
        this.a = a;
    }
    
    private final void d() {
        synchronized (this.b) {
            final int c = this.c - 1;
            this.c = c;
            if (c == 0) {
                this.b.notifyAll();
            }
        }
    }
    
    @Override
    public final boolean awaitTermination(long nanos, final TimeUnit timeUnit) {
        nanos = timeUnit.toNanos(nanos);
        final Object b = this.b;
        monitorenter(b);
        try {
            while (!this.d || this.c != 0) {
                if (nanos <= 0L) {
                    monitorexit(b);
                    return false;
                }
                final long nanoTime = System.nanoTime();
                TimeUnit.NANOSECONDS.timedWait(this.b, nanos);
                nanos -= System.nanoTime() - nanoTime;
            }
            monitorexit(b);
            return true;
        }
        finally {
            monitorexit(b);
            while (true) {}
        }
    }
    
    @Override
    public final void execute(final Runnable runnable) {
        synchronized (this.b) {
            if (!this.d) {
                ++this.c;
                monitorexit(this.b);
                try {
                    this.a.execute(runnable);
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
        synchronized (this.b) {
            return this.d;
        }
    }
    
    @Override
    public final boolean isTerminated() {
        synchronized (this.b) {
            final boolean d = this.d;
            boolean b = false;
            if (d && this.c == 0) {
                b = true;
            }
            return b;
        }
    }
    
    @Override
    public final void shutdown() {
        synchronized (this.b) {
            this.d = true;
            if (this.c == 0) {
                this.b.notifyAll();
            }
        }
    }
    
    @Override
    public final List shutdownNow() {
        this.shutdown();
        return Collections.emptyList();
    }
}
