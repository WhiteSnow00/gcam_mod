import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.List;
import java.util.Collection;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kjv implements ScheduledExecutorService
{
    public final kjm a;
    private final ofb b;
    
    public kjv(final ScheduledExecutorService scheduledExecutorService) {
        final kjm a = kjs.a;
        this.a = a;
        this.b = ofi.d(scheduledExecutorService);
    }
    
    private final void a(final oey oey) {
        oey.d(new kjt(this, oey), odx.a);
    }
    
    @Override
    public final boolean awaitTermination(final long n, final TimeUnit timeUnit) {
        return this.b.awaitTermination(n, timeUnit);
    }
    
    @Override
    public final void execute(final Runnable runnable) {
        this.a(this.b.a(runnable));
    }
    
    @Override
    public final List invokeAll(final Collection collection) {
        throw new UnsupportedOperationException("Not yet implemented");
    }
    
    @Override
    public final List invokeAll(final Collection collection, final long n, final TimeUnit timeUnit) {
        throw new UnsupportedOperationException("Not yet implemented");
    }
    
    @Override
    public final Object invokeAny(final Collection collection) {
        throw new UnsupportedOperationException("Not yet implemented");
    }
    
    @Override
    public final Object invokeAny(final Collection collection, final long n, final TimeUnit timeUnit) {
        throw new UnsupportedOperationException("Not yet implemented");
    }
    
    @Override
    public final boolean isShutdown() {
        return this.b.isShutdown();
    }
    
    @Override
    public final boolean isTerminated() {
        return this.b.isTerminated();
    }
    
    @Override
    public final ScheduledFuture schedule(final Runnable runnable, final long n, final TimeUnit timeUnit) {
        final off d = this.b.d(runnable, n, timeUnit);
        this.a(d);
        return d;
    }
    
    @Override
    public final ScheduledFuture schedule(final Callable callable, final long n, final TimeUnit timeUnit) {
        final off e = this.b.e(callable, n, timeUnit);
        this.a(e);
        return e;
    }
    
    @Override
    public final ScheduledFuture scheduleAtFixedRate(final Runnable runnable, final long n, final long n2, final TimeUnit timeUnit) {
        final off f = this.b.f(runnable, n, n2, timeUnit);
        this.a(f);
        return f;
    }
    
    @Override
    public final ScheduledFuture scheduleWithFixedDelay(final Runnable runnable, final long n, final long n2, final TimeUnit timeUnit) {
        final off g = this.b.g(runnable, n, n2, timeUnit);
        this.a(g);
        return g;
    }
    
    @Override
    public final void shutdown() {
        this.b.shutdown();
    }
    
    @Override
    public final List shutdownNow() {
        return this.b.shutdownNow();
    }
    
    @Override
    public final Future submit(final Runnable runnable) {
        final oey a = this.b.a(runnable);
        this.a(a);
        return a;
    }
    
    @Override
    public final Future submit(final Runnable runnable, final Object o) {
        final oey c = this.b.c(runnable, o);
        this.a(c);
        return c;
    }
    
    @Override
    public final Future submit(final Callable callable) {
        final oey b = this.b.b(callable);
        this.a(b);
        return b;
    }
}
