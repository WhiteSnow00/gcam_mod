import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pnf
{
    @Deprecated
    private static final AtomicReferenceFieldUpdater b;
    public volatile Object a;
    
    static {
        b = AtomicReferenceFieldUpdater.newUpdater(pnf.class, Object.class, "a");
    }
    
    public pnf(final Object a) {
        this.a = a;
    }
    
    public final Object a(final Object o) {
        final int a = png.a;
        return pnf.b.getAndSet(this, o);
    }
    
    public final void b(final Object o) {
        final int a = png.a;
        pnf.b.lazySet(this, o);
    }
    
    public final boolean c(final Object o, final Object o2) {
        final int a = png.a;
        return pnf.b.compareAndSet(this, o, o2);
    }
    
    @Override
    public final String toString() {
        return String.valueOf(this.a);
    }
}
