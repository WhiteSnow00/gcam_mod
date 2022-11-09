import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.ThreadFactory;

// 
// Decompiled by Procyon v0.6.0
// 

final class wx implements ThreadFactory
{
    private final AtomicInteger a;
    
    public wx() {
        this.a = new AtomicInteger(0);
    }
    
    @Override
    public final Thread newThread(final Runnable runnable) {
        final Thread thread = new Thread(runnable);
        thread.setName(String.format("arch_disk_io_%d", this.a.getAndIncrement()));
        return thread;
    }
}
