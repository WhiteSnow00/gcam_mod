import java.util.concurrent.TimeUnit;
import java.util.concurrent.Future;

// 
// Decompiled by Procyon v0.6.0
// 

final class pfy implements Future
{
    final oxp a;
    
    public pfy(final oxp a) {
        this.a = a;
    }
    
    @Override
    public final boolean cancel(final boolean b) {
        this.a.bX();
        return false;
    }
    
    @Override
    public final Object get() {
        return null;
    }
    
    @Override
    public final Object get(final long n, final TimeUnit timeUnit) {
        return null;
    }
    
    @Override
    public final boolean isCancelled() {
        return false;
    }
    
    @Override
    public final boolean isDone() {
        return false;
    }
}
