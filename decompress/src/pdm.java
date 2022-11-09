import java.util.concurrent.atomic.AtomicInteger;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pdm extends AtomicInteger implements Runnable, oyy
{
    private static final long serialVersionUID = 3880992722410194083L;
    final oxg a;
    final Object b;
    
    public pdm(final oxg a, final Object b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final Object bW() {
        if (this.get() == 1) {
            this.lazySet(3);
            return this.b;
        }
        return null;
    }
    
    @Override
    public final void bX() {
        this.set(3);
    }
    
    @Override
    public final void bZ() {
        this.lazySet(3);
    }
    
    @Override
    public final boolean ca() {
        throw null;
    }
    
    @Override
    public final boolean i() {
        return this.get() != 1;
    }
    
    @Override
    public final boolean j(final Object o) {
        throw new UnsupportedOperationException("Should not be called!");
    }
    
    @Override
    public final int k() {
        this.lazySet(1);
        return 1;
    }
    
    @Override
    public final void run() {
        if (this.get() == 0 && this.compareAndSet(0, 2)) {
            this.a.e(this.b);
            if (this.get() == 2) {
                this.lazySet(3);
                this.a.bU();
            }
        }
    }
}
