import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class pex extends AtomicReference implements oxl, owu, oxp
{
    private static final long serialVersionUID = -2177128922851101253L;
    final owu a;
    final oyf b;
    
    public pex(final owu a, final oyf b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void b(final Throwable t) {
        this.a.b(t);
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
    public final void d(final Object o) {
        try {
            final owv owv = (owv)this.b.a(o);
            phn.g(owv, "The mapper returned a null CompletableSource");
            if (!oyj.c(this.get())) {
                owv.i(this);
            }
        }
        finally {
            final Throwable t;
            psn.e(t);
            this.b(t);
        }
    }
    
    @Override
    public final void e() {
        this.a.e();
    }
}
