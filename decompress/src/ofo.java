import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.ThreadFactory;

// 
// Decompiled by Procyon v0.6.0
// 

final class ofo implements ThreadFactory
{
    final /* synthetic */ ThreadFactory a;
    final /* synthetic */ String b;
    final /* synthetic */ AtomicLong c;
    
    public ofo(final ThreadFactory a, final String b, final AtomicLong c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final Thread newThread(final Runnable runnable) {
        final Thread thread = this.a.newThread(runnable);
        final String b = this.b;
        if (b != null) {
            final AtomicLong c = this.c;
            c.getClass();
            thread.setName(ofp.a(b, c.getAndIncrement()));
        }
        return thread;
    }
}
