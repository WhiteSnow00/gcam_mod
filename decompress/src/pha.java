// 
// Decompiled by Procyon v0.6.0
// 

public class pha extends pgy
{
    private static final long serialVersionUID = -2151279923272604993L;
    protected final psr e;
    protected Object f;
    
    public pha(final psr e) {
        this.e = e;
    }
    
    @Override
    public void a() {
        this.set(4);
        this.f = null;
    }
    
    @Override
    public final Object bW() {
        if (this.get() == 16) {
            this.lazySet(32);
            final Object f = this.f;
            this.f = null;
            return f;
        }
        return null;
    }
    
    @Override
    public final void bZ() {
        this.lazySet(32);
        this.f = null;
    }
    
    @Override
    public final void cb(final long n) {
        if (phe.g(n)) {
            do {
                final int value = this.get();
                if ((value & 0xFFFFFFFE) != 0x0) {
                    return;
                }
                if (value == 1) {
                    if (this.compareAndSet(1, 3)) {
                        final Object f = this.f;
                        if (f != null) {
                            this.f = null;
                            final psr e = this.e;
                            e.ce(f);
                            if (this.get() != 4) {
                                e.cc();
                            }
                        }
                    }
                }
            } while (!this.compareAndSet(0, 2));
        }
    }
    
    public final void f(final Object o) {
        int i = this.get();
        while (i != 8) {
            if ((i & 0xFFFFFFFD) != 0x0) {
                return;
            }
            if (i == 2) {
                this.lazySet(3);
                final psr e = this.e;
                e.ce(o);
                if (this.get() != 4) {
                    e.cc();
                }
                return;
            }
            this.f = o;
            if (this.compareAndSet(0, 1)) {
                return;
            }
            if ((i = this.get()) == 4) {
                this.f = null;
                return;
            }
        }
        this.f = o;
        this.lazySet(16);
        final psr e2 = this.e;
        e2.ce(o);
        if (this.get() != 4) {
            e2.cc();
        }
    }
    
    @Override
    public final boolean i() {
        return this.get() != 16;
    }
    
    @Override
    public final int k() {
        this.lazySet(8);
        return 2;
    }
}
