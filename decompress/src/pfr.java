import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pfr implements ozc
{
    private final AtomicReference a;
    private final AtomicReference b;
    
    public pfr() {
        this.a = new AtomicReference();
        this.b = new AtomicReference();
        final pfq pfq = new pfq();
        this.e(pfq);
        this.d(pfq);
    }
    
    final pfq a() {
        return this.a.get();
    }
    
    @Override
    public final Object bW() {
        final pfq pfq = this.b.get();
        final pfq a = pfq.a();
        if (a != null) {
            final Object b = a.b();
            this.e(a);
            return b;
        }
        if (pfq != this.a()) {
            pfq a2;
            do {
                a2 = pfq.a();
            } while (a2 == null);
            final Object b2 = a2.b();
            this.e(a2);
            return b2;
        }
        return null;
    }
    
    @Override
    public final void bZ() {
        while (this.bW() != null && !this.i()) {}
    }
    
    final pfq d(final pfq pfq) {
        return this.a.getAndSet(pfq);
    }
    
    final void e(final pfq pfq) {
        this.b.lazySet(pfq);
    }
    
    @Override
    public final boolean i() {
        return this.b.get() == this.a();
    }
    
    @Override
    public final boolean j(final Object o) {
        if (o != null) {
            final pfq pfq = new pfq(o);
            this.d(pfq).lazySet(pfq);
            return true;
        }
        throw new NullPointerException("Null is not a valid element");
    }
}
