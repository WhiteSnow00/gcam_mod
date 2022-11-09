import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pnd
{
    @Deprecated
    private static final AtomicIntegerFieldUpdater b;
    public volatile int a;
    
    static {
        b = AtomicIntegerFieldUpdater.newUpdater(pnd.class, "a");
    }
    
    public pnd() {
        this.a = 0;
    }
    
    public final int a() {
        final int a = png.a;
        return pnd.b.decrementAndGet(this);
    }
    
    public final int b() {
        final int a = png.a;
        return pnd.b.incrementAndGet(this);
    }
    
    public final boolean c(final int n, final int n2) {
        final int a = png.a;
        return pnd.b.compareAndSet(this, n, n2);
    }
    
    @Override
    public final String toString() {
        return String.valueOf(this.a);
    }
}
