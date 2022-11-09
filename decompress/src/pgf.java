import java.util.Iterator;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ConcurrentLinkedQueue;

// 
// Decompiled by Procyon v0.6.0
// 

final class pgf implements Runnable
{
    public final long a;
    public final ConcurrentLinkedQueue b;
    final oxo c;
    public final ThreadFactory d;
    private final ScheduledExecutorService e;
    private final Future f;
    
    public pgf(long nanos, final TimeUnit timeUnit, final ThreadFactory d) {
        if (timeUnit != null) {
            nanos = timeUnit.toNanos(nanos);
        }
        else {
            nanos = 0L;
        }
        this.a = nanos;
        this.b = new ConcurrentLinkedQueue();
        this.c = new oxo();
        this.d = d;
        final ScheduledExecutorService scheduledExecutorService = null;
        ScheduledExecutorService scheduledThreadPool;
        ScheduledFuture<?> scheduleWithFixedDelay;
        if (timeUnit != null) {
            scheduledThreadPool = Executors.newScheduledThreadPool(1, pgi.b);
            scheduleWithFixedDelay = scheduledThreadPool.scheduleWithFixedDelay(this, nanos, nanos, TimeUnit.NANOSECONDS);
        }
        else {
            scheduleWithFixedDelay = null;
            scheduledThreadPool = scheduledExecutorService;
        }
        this.e = scheduledThreadPool;
        this.f = scheduleWithFixedDelay;
    }
    
    final void a() {
        this.c.bX();
        final Future f = this.f;
        if (f != null) {
            f.cancel(true);
        }
        final ScheduledExecutorService e = this.e;
        if (e != null) {
            e.shutdownNow();
        }
    }
    
    @Override
    public final void run() {
        if (!this.b.isEmpty()) {
            final long nanoTime = System.nanoTime();
            for (final pgh pgh : this.b) {
                if (pgh.a > nanoTime) {
                    break;
                }
                if (!this.b.remove(pgh)) {
                    continue;
                }
                this.c.e(pgh);
            }
        }
    }
}
