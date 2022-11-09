import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.ThreadFactory;

// 
// Decompiled by Procyon v0.6.0
// 

final class jlu implements ThreadFactory
{
    private static final AtomicInteger a;
    
    static {
        a = new AtomicInteger();
    }
    
    public jlu() {
    }
    
    @Override
    public final Thread newThread(final Runnable runnable) {
        final int incrementAndGet = jlu.a.incrementAndGet();
        final StringBuilder sb = new StringBuilder(23);
        sb.append("measurement-");
        sb.append(incrementAndGet);
        return new jlv(runnable, sb.toString());
    }
}
