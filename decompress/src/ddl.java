import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.Callable;
import java.util.List;
import java.util.Collection;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ScheduledExecutorService;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ddl implements ScheduledExecutorService
{
    private final ScheduledExecutorService a;
    private final kse b;
    private final String c;
    
    public ddl(final ScheduledExecutorService a, final kse b) {
        this.a = a;
        this.b = b;
        this.c = "Primes";
    }
    
    @Override
    public final boolean awaitTermination(final long n, final TimeUnit timeUnit) {
        return this.a.awaitTermination(n, timeUnit);
    }
    
    @Override
    public final void execute(final Runnable runnable) {
        this.a.execute(this.b.c(this.c, runnable));
    }
    
    @Override
    public final List invokeAll(final Collection collection) {
        return this.a.invokeAll((Collection<? extends Callable<Object>>)collection);
    }
    
    @Override
    public final List invokeAll(final Collection collection, final long n, final TimeUnit timeUnit) {
        return this.a.invokeAll((Collection<? extends Callable<Object>>)collection, n, timeUnit);
    }
    
    @Override
    public final Object invokeAny(final Collection collection) {
        return this.a.invokeAny((Collection<? extends Callable<Object>>)collection);
    }
    
    @Override
    public final Object invokeAny(final Collection collection, final long n, final TimeUnit timeUnit) {
        return this.a.invokeAny((Collection<? extends Callable<Object>>)collection, n, timeUnit);
    }
    
    @Override
    public final boolean isShutdown() {
        return this.a.isShutdown();
    }
    
    @Override
    public final boolean isTerminated() {
        return this.a.isTerminated();
    }
    
    @Override
    public final ScheduledFuture schedule(final Runnable runnable, final long n, final TimeUnit timeUnit) {
        return this.a.schedule(this.b.c(this.c, runnable), n, timeUnit);
    }
    
    @Override
    public final ScheduledFuture schedule(final Callable callable, final long n, final TimeUnit timeUnit) {
        return this.a.schedule((Callable<Object>)this.b.d(this.c, callable), n, timeUnit);
    }
    
    @Override
    public final ScheduledFuture scheduleAtFixedRate(final Runnable runnable, final long n, final long n2, final TimeUnit timeUnit) {
        return this.a.scheduleAtFixedRate(this.b.c(this.c, runnable), n, n2, timeUnit);
    }
    
    @Override
    public final ScheduledFuture scheduleWithFixedDelay(final Runnable runnable, final long n, final long n2, final TimeUnit timeUnit) {
        return this.a.scheduleWithFixedDelay(this.b.c(this.c, runnable), n, n2, timeUnit);
    }
    
    @Override
    public final void shutdown() {
        this.a.shutdown();
    }
    
    @Override
    public final List shutdownNow() {
        return this.a.shutdownNow();
    }
    
    @Override
    public final Future submit(final Runnable runnable) {
        return this.a.submit(this.b.c(this.c, runnable));
    }
    
    @Override
    public final Future submit(final Runnable runnable, final Object o) {
        return this.a.submit(this.b.c(this.c, runnable), o);
    }
    
    @Override
    public final Future submit(final Callable callable) {
        return this.a.submit((Callable<Object>)this.b.d(this.c, callable));
    }
}
