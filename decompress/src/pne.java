import java.util.concurrent.atomic.AtomicLongFieldUpdater;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pne
{
    @Deprecated
    public static final AtomicLongFieldUpdater a;
    public volatile long b;
    
    static {
        a = AtomicLongFieldUpdater.newUpdater(pne.class, "b");
    }
    
    public pne(final long b) {
        this.b = b;
    }
    
    public final long a(final long n) {
        final int a = png.a;
        return pne.a.addAndGet(this, n);
    }
    
    public final boolean b(final long n, final long n2) {
        final int a = png.a;
        return pne.a.compareAndSet(this, n, n2);
    }
    
    @Override
    public final String toString() {
        return String.valueOf(this.b);
    }
}
