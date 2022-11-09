import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.ThreadFactory;

// 
// Decompiled by Procyon v0.6.0
// 

final class pno implements ThreadFactory
{
    final /* synthetic */ AtomicInteger a;
    
    public pno(final AtomicInteger a) {
        this.a = a;
    }
    
    @Override
    public final Thread newThread(final Runnable runnable) {
        final StringBuilder sb = new StringBuilder();
        sb.append("CommonPool-worker-");
        sb.append(this.a.incrementAndGet());
        final Thread thread = new Thread(runnable, sb.toString());
        thread.setDaemon(true);
        return thread;
    }
}
