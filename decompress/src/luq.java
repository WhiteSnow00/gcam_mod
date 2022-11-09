import java.util.concurrent.TimeUnit;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class luq implements oey
{
    private final oey a;
    
    private luq(final oey a) {
        this.a = a;
    }
    
    public static oey a(final oey oey) {
        return new luq(oey);
    }
    
    @Override
    public final boolean cancel(final boolean b) {
        throw new UnsupportedOperationException("Cancellation of future is invalid.");
    }
    
    @Override
    public final void d(final Runnable runnable, final Executor executor) {
        this.a.d(runnable, executor);
    }
    
    @Override
    public final Object get() {
        return this.a.get();
    }
    
    @Override
    public final Object get(final long n, final TimeUnit timeUnit) {
        return this.a.get(n, timeUnit);
    }
    
    @Override
    public final boolean isCancelled() {
        return this.a.isCancelled();
    }
    
    @Override
    public final boolean isDone() {
        return this.a.isDone();
    }
}
