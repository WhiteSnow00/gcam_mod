import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.Callable;
import java.util.List;
import java.util.Collection;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

// 
// Decompiled by Procyon v0.6.0
// 

public final class buc implements ScheduledExecutorService
{
    private static final nsd b;
    private final Executor c;
    private final ScheduledExecutorService d;
    
    static {
        b = nsd.g("com/google/android/apps/camera/async/readiness/GatedScheduledExecutorService");
    }
    
    public buc(final Executor c, final ScheduledExecutorService d) {
        this.c = c;
        this.d = d;
    }
    
    private static void a(final String s) {
        a.n(buc.b.c(), "%s is not gated and it doesn't guarantee the execution order", s, '\u0090', new UnsupportedOperationException(s));
    }
    
    @Override
    public final boolean awaitTermination(final long n, final TimeUnit timeUnit) {
        return this.d.awaitTermination(n, timeUnit);
    }
    
    @Override
    public final void execute(final Runnable runnable) {
        this.c.execute(runnable);
    }
    
    @Override
    public final List invokeAll(final Collection collection) {
        a("invokeAll(1)");
        return this.d.invokeAll((Collection<? extends Callable<Object>>)collection);
    }
    
    @Override
    public final List invokeAll(final Collection collection, final long n, final TimeUnit timeUnit) {
        a("invokeAll(2)");
        return this.d.invokeAll((Collection<? extends Callable<Object>>)collection, n, timeUnit);
    }
    
    @Override
    public final Object invokeAny(final Collection collection) {
        a("invokeAny(1)");
        return this.d.invokeAny((Collection<? extends Callable<Object>>)collection);
    }
    
    @Override
    public final Object invokeAny(final Collection collection, final long n, final TimeUnit timeUnit) {
        a("invokeAny(2)");
        return this.d.invokeAny((Collection<? extends Callable<Object>>)collection, n, timeUnit);
    }
    
    @Override
    public final boolean isShutdown() {
        return this.d.isShutdown();
    }
    
    @Override
    public final boolean isTerminated() {
        return this.d.isTerminated();
    }
    
    @Override
    public final ScheduledFuture schedule(final Runnable runnable, final long n, final TimeUnit timeUnit) {
        return this.d.schedule(runnable, n, timeUnit);
    }
    
    @Override
    public final ScheduledFuture schedule(final Callable callable, final long n, final TimeUnit timeUnit) {
        return this.d.schedule((Callable<Object>)callable, n, timeUnit);
    }
    
    @Override
    public final ScheduledFuture scheduleAtFixedRate(final Runnable runnable, final long n, final long n2, final TimeUnit timeUnit) {
        return this.d.scheduleAtFixedRate(runnable, n, n2, timeUnit);
    }
    
    @Override
    public final ScheduledFuture scheduleWithFixedDelay(final Runnable runnable, final long n, final long n2, final TimeUnit timeUnit) {
        return this.d.scheduleWithFixedDelay(runnable, n, n2, timeUnit);
    }
    
    @Override
    public final void shutdown() {
        this.d.shutdown();
    }
    
    @Override
    public final List shutdownNow() {
        return this.d.shutdownNow();
    }
    
    @Override
    public final Future submit(final Runnable runnable) {
        return this.submit(runnable, "");
    }
    
    @Override
    public final Future submit(final Runnable runnable, final Object o) {
        return ofi.q(new bub(runnable, o), this.c);
    }
    
    @Override
    public final Future submit(final Callable callable) {
        return ofi.q(callable, this.c);
    }
}
