import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class pby extends AtomicReference implements oxa, owu, oxp
{
    private static final long serialVersionUID = -2177128922851101253L;
    final owu a;
    final oyf b;
    
    public pby(final owu a, final oyf b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void a(Object a) {
        try {
            a = this.b.a(a);
            if (!oyj.c(this.get())) {
                ((owv)a).i(this);
            }
        }
        finally {
            final Throwable t;
            psn.e(t);
            this.b(t);
        }
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
    public final void e() {
        this.a.e();
    }
}
