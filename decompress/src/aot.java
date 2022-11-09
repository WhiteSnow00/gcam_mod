import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

// 
// Decompiled by Procyon v0.6.0
// 

final class aot extends aoo
{
    final AtomicReferenceFieldUpdater a;
    final AtomicReferenceFieldUpdater b;
    final AtomicReferenceFieldUpdater c;
    final AtomicReferenceFieldUpdater d;
    final AtomicReferenceFieldUpdater e;
    
    public aot(final AtomicReferenceFieldUpdater a, final AtomicReferenceFieldUpdater b, final AtomicReferenceFieldUpdater c, final AtomicReferenceFieldUpdater d, final AtomicReferenceFieldUpdater e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    @Override
    public final void a(final aow aow, final aow aow2) {
        this.b.lazySet(aow, aow2);
    }
    
    @Override
    public final void b(final aow aow, final Thread thread) {
        this.a.lazySet(aow, thread);
    }
    
    @Override
    public final boolean c(final aox aox, final aos aos, final aos aos2) {
        return this.d.compareAndSet(aox, aos, aos2);
    }
    
    @Override
    public final boolean d(final aox aox, final Object o, final Object o2) {
        return this.e.compareAndSet(aox, o, o2);
    }
    
    @Override
    public final boolean e(final aox aox, final aow aow, final aow aow2) {
        return this.c.compareAndSet(aox, aow, aow2);
    }
}
