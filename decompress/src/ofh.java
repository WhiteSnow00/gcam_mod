import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

// 
// Decompiled by Procyon v0.6.0
// 

final class ofh extends ofe implements ofb
{
    final ScheduledExecutorService a;
    
    public ofh(final ScheduledExecutorService a) {
        super(a);
        a.getClass();
        this.a = a;
    }
    
    @Override
    public final off d(final Runnable runnable, final long n, final TimeUnit timeUnit) {
        final ofv h = ofv.h(runnable, null);
        return new off(h, this.a.schedule(h, n, timeUnit));
    }
    
    @Override
    public final off e(final Callable callable, final long n, final TimeUnit timeUnit) {
        final ofv g = ofv.g(callable);
        return new off(g, this.a.schedule(g, n, timeUnit));
    }
    
    @Override
    public final off f(final Runnable runnable, final long n, final long n2, final TimeUnit timeUnit) {
        final ofg ofg = new ofg(runnable);
        return new off(ofg, this.a.scheduleAtFixedRate(ofg, n, n2, timeUnit));
    }
    
    @Override
    public final off g(final Runnable runnable, final long n, final long n2, final TimeUnit timeUnit) {
        final ofg ofg = new ofg(runnable);
        return new off(ofg, this.a.scheduleWithFixedDelay(ofg, n, n2, timeUnit));
    }
}
