import java.util.concurrent.TimeUnit;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

final class oei extends oet
{
    private final oey a;
    
    public oei(final oey a) {
        a.getClass();
        this.a = a;
    }
    
    @Override
    public final boolean cancel(final boolean b) {
        return this.a.cancel(b);
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
    
    @Override
    public final String toString() {
        return this.a.toString();
    }
}
