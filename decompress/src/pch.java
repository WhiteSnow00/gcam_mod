import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class pch extends AtomicReference implements oxg, oxl, oxp
{
    private static final long serialVersionUID = -8948264376121066672L;
    final oxg a;
    final oyf b;
    
    public pch(final oxg a, final oyf b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void b(final Throwable t) {
        this.a.b(t);
    }
    
    @Override
    public final void bU() {
        this.a.bU();
    }
    
    @Override
    public final void bV(final oxp oxp) {
        oyj.h(this, oxp);
    }
    
    @Override
    public final void bX() {
        oyj.g(this);
    }
    
    @Override
    public final boolean ca() {
        throw null;
    }
    
    @Override
    public final void d(Object a) {
        try {
            a = this.b.a(a);
            phn.g(a, "The mapper returned a null Publisher");
            ((oxf)a).f(this);
        }
        finally {
            final Throwable t;
            psn.e(t);
            this.a.b(t);
        }
    }
    
    @Override
    public final void e(final Object o) {
        this.a.e(o);
    }
}
