import java.util.concurrent.Callable;
import java.util.concurrent.RunnableScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ScheduledThreadPoolExecutor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kka extends ScheduledThreadPoolExecutor
{
    public kka(final int n, final ThreadFactory threadFactory) {
        super(n, threadFactory);
    }
    
    @Override
    protected final RunnableScheduledFuture decorateTask(final Runnable runnable, final RunnableScheduledFuture runnableScheduledFuture) {
        return mcn.i(runnableScheduledFuture);
    }
    
    @Override
    protected final RunnableScheduledFuture decorateTask(final Callable callable, final RunnableScheduledFuture runnableScheduledFuture) {
        return mcn.i(runnableScheduledFuture);
    }
}
