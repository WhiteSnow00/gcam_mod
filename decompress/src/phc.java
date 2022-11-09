import java.util.concurrent.atomic.AtomicInteger;

// 
// Decompiled by Procyon v0.6.0
// 

public final class phc extends AtomicInteger implements oza
{
    private static final long serialVersionUID = -3830916580126663321L;
    final Object a;
    final psr b;
    
    public phc(final psr b, final Object a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void a() {
        this.lazySet(2);
    }
    
    @Override
    public final Object bW() {
        if (this.get() == 0) {
            this.lazySet(1);
            return this.a;
        }
        return null;
    }
    
    @Override
    public final void bZ() {
        this.lazySet(1);
    }
    
    @Override
    public final void cb(final long n) {
        if (!phe.g(n)) {
            return;
        }
        if (this.compareAndSet(0, 1)) {
            final psr b = this.b;
            b.ce(this.a);
            if (this.get() != 2) {
                b.cc();
            }
        }
    }
    
    @Override
    public final boolean i() {
        return this.get() != 0;
    }
    
    @Override
    public final boolean j(final Object o) {
        throw new UnsupportedOperationException("Should not be called!");
    }
    
    @Override
    public final int k() {
        return 1;
    }
}
