import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

// 
// Decompiled by Procyon v0.6.0
// 

final class aok implements ThreadFactory
{
    private int a;
    
    public aok() {
        this.a = 0;
    }
    
    @Override
    public final Thread newThread(final Runnable runnable) {
        final Thread thread = Executors.defaultThreadFactory().newThread(runnable);
        final StringBuilder sb = new StringBuilder();
        sb.append("WorkManager-WorkTimer-thread-");
        sb.append(this.a);
        thread.setName(sb.toString());
        ++this.a;
        return thread;
    }
}
