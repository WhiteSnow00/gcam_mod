import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ThreadPoolExecutor;

// 
// Decompiled by Procyon v0.6.0
// 

final class jlt extends ThreadPoolExecutor
{
    final /* synthetic */ jlw a;
    
    public jlt(final jlw a) {
        this.a = a;
        super(1, 1, 1L, TimeUnit.MINUTES, new LinkedBlockingQueue<Runnable>());
        this.setThreadFactory(new jlu());
        this.allowCoreThreadTimeOut(true);
    }
    
    @Override
    protected final RunnableFuture newTaskFor(final Runnable runnable, final Object o) {
        return new jls(this, runnable, o);
    }
}
