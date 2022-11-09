import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.AbstractExecutorService;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class odd extends AbstractExecutorService implements ofa
{
    @Override
    public final oey a(final Runnable runnable) {
        return (oey)super.submit(runnable);
    }
    
    @Override
    public final oey b(final Callable callable) {
        return (oey)super.submit((Callable<Object>)callable);
    }
    
    @Override
    public final oey c(final Runnable runnable, final Object o) {
        return (oey)super.submit(runnable, o);
    }
    
    @Override
    protected final RunnableFuture newTaskFor(final Runnable runnable, final Object o) {
        return ofv.h(runnable, o);
    }
    
    @Override
    protected final RunnableFuture newTaskFor(final Callable callable) {
        return ofv.g(callable);
    }
}
