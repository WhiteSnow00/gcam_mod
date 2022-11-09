import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.ThreadFactory;

// 
// Decompiled by Procyon v0.6.0
// 

final class meh implements ThreadFactory
{
    public final int a;
    private final AtomicInteger b;
    private final String c;
    
    public meh(final int a) {
        this.b = new AtomicInteger(1);
        this.a = a;
        this.c = "Primes";
    }
    
    @Override
    public final Thread newThread(final Runnable runnable) {
        final meg meg = new meg(this, runnable);
        final String c = this.c;
        final int andIncrement = this.b.getAndIncrement();
        final StringBuilder sb = new StringBuilder(c.length() + 12);
        sb.append(c);
        sb.append("-");
        sb.append(andIncrement);
        final Thread thread = new Thread(meg, sb.toString());
        if (thread.isDaemon()) {
            thread.setDaemon(false);
        }
        return thread;
    }
}
