import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

// 
// Decompiled by Procyon v0.6.0
// 

final class zi extends zd
{
    final AtomicReferenceFieldUpdater a;
    final AtomicReferenceFieldUpdater b;
    final AtomicReferenceFieldUpdater c;
    final AtomicReferenceFieldUpdater d;
    final AtomicReferenceFieldUpdater e;
    
    public zi(final AtomicReferenceFieldUpdater a, final AtomicReferenceFieldUpdater b, final AtomicReferenceFieldUpdater c, final AtomicReferenceFieldUpdater d, final AtomicReferenceFieldUpdater e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    @Override
    public final void a(final zl zl, final zl zl2) {
        this.b.lazySet(zl, zl2);
    }
    
    @Override
    public final void b(final zl zl, final Thread thread) {
        this.a.lazySet(zl, thread);
    }
    
    @Override
    public final boolean c(final zm zm, final zh zh, final zh zh2) {
        return this.d.compareAndSet(zm, zh, zh2);
    }
    
    @Override
    public final boolean d(final zm zm, final Object o, final Object o2) {
        return this.e.compareAndSet(zm, o, o2);
    }
    
    @Override
    public final boolean e(final zm zm, final zl zl, final zl zl2) {
        return this.c.compareAndSet(zm, zl, zl2);
    }
}
