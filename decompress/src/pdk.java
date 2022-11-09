import java.util.concurrent.atomic.AtomicBoolean;

// 
// Decompiled by Procyon v0.6.0
// 

final class pdk extends AtomicBoolean implements oxg, oxp
{
    private static final long serialVersionUID = -7419642935409022375L;
    final oxg a;
    final pdl b;
    final pdj c;
    oxp d;
    
    public pdk(final oxg a, final pdl b, final pdj c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final void b(final Throwable t) {
        if (this.compareAndSet(false, true)) {
            this.b.c(this.c);
            this.a.b(t);
            return;
        }
        pip.g(t);
    }
    
    @Override
    public final void bU() {
        if (this.compareAndSet(false, true)) {
            this.b.c(this.c);
            this.a.bU();
        }
    }
    
    @Override
    public final void bV(final oxp d) {
        if (oyj.f(this.d, d)) {
            this.d = d;
            this.a.bV(this);
        }
    }
    
    @Override
    public final void bX() {
        this.d.bX();
        if (this.compareAndSet(false, true)) {
            final pdl b = this.b;
            final pdj c = this.c;
            synchronized (b) {
                final pdj b2 = b.b;
                if (b2 == null || b2 != c) {
                    return;
                }
                final long c2 = c.c - 1L;
                c.c = c2;
                if (c2 == 0L && c.d) {
                    b.k(c);
                }
            }
        }
    }
    
    @Override
    public final boolean ca() {
        throw null;
    }
    
    @Override
    public final void e(final Object o) {
        this.a.e(o);
    }
}
