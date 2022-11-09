import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

// 
// Decompiled by Procyon v0.6.0
// 

final class ocu extends ocp
{
    final AtomicReferenceFieldUpdater a;
    final AtomicReferenceFieldUpdater b;
    final AtomicReferenceFieldUpdater c;
    final AtomicReferenceFieldUpdater d;
    final AtomicReferenceFieldUpdater e;
    
    public ocu(final AtomicReferenceFieldUpdater a, final AtomicReferenceFieldUpdater b, final AtomicReferenceFieldUpdater c, final AtomicReferenceFieldUpdater d, final AtomicReferenceFieldUpdater e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    @Override
    public final void a(final odb odb, final odb odb2) {
        this.b.lazySet(odb, odb2);
    }
    
    @Override
    public final void b(final odb odb, final Thread thread) {
        this.a.lazySet(odb, thread);
    }
    
    @Override
    public final boolean c(final odc odc, final oct oct, final oct oct2) {
        return this.d.compareAndSet(odc, oct, oct2);
    }
    
    @Override
    public final boolean d(final odc odc, final Object o, final Object o2) {
        return this.e.compareAndSet(odc, o, o2);
    }
    
    @Override
    public final boolean e(final odc odc, final odb odb, final odb odb2) {
        return this.c.compareAndSet(odc, odb, odb2);
    }
}
