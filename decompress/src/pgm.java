import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pgm extends AtomicLong implements ThreadFactory
{
    private static final long serialVersionUID = -7789753024099756196L;
    final String a;
    final int b;
    final boolean c;
    
    public pgm(final String s) {
        this(s, 5, false);
    }
    
    public pgm(final String s, final int n) {
        this(s, n, false);
    }
    
    public pgm(final String a, final int b, final boolean c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final Thread newThread(final Runnable runnable) {
        final StringBuilder sb = new StringBuilder(this.a);
        sb.append('-');
        sb.append(this.incrementAndGet());
        final String string = sb.toString();
        Thread thread;
        if (this.c) {
            thread = new pgl(runnable, string);
        }
        else {
            thread = new Thread(runnable, string);
        }
        thread.setPriority(this.b);
        thread.setDaemon(true);
        return thread;
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 17);
        sb.append("RxThreadFactory[");
        sb.append(a);
        sb.append("]");
        return sb.toString();
    }
}
