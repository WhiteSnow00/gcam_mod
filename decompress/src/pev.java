import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class pev extends AtomicReference implements oxl, oxp
{
    private static final long serialVersionUID = 3258103020495908596L;
    final oxl a;
    final oyf b;
    
    public pev(final oxl a, final oyf b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void b(final Throwable t) {
        this.a.b(t);
    }
    
    @Override
    public final void bV(final oxp oxp) {
        if (oyj.e(this, oxp)) {
            this.a.bV(this);
        }
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
    public final void d(final Object o) {
        try {
            final oxm oxm = (oxm)this.b.a(o);
            phn.g(oxm, "The single returned by the mapper is null");
            if (!oyj.c(this.get())) {
                oxm.m(new peu(this, this.a));
            }
        }
        finally {
            final Throwable t;
            psn.e(t);
            this.a.b(t);
        }
    }
}
