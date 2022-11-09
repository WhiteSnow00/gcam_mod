import java.util.concurrent.TimeUnit;
import java.util.concurrent.Future;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class oek extends nmq implements Future
{
    protected oek() {
    }
    
    protected abstract Future b();
    
    @Override
    public boolean cancel(final boolean b) {
        return this.b().cancel(b);
    }
    
    @Override
    public final Object get() {
        return this.b().get();
    }
    
    @Override
    public final Object get(final long n, final TimeUnit timeUnit) {
        return this.b().get(n, timeUnit);
    }
    
    @Override
    public final boolean isCancelled() {
        return this.b().isCancelled();
    }
    
    @Override
    public final boolean isDone() {
        return this.b().isDone();
    }
}
