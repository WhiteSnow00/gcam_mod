import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class pdp extends AtomicReference implements oxg, oxp
{
    private static final long serialVersionUID = 8094547886072529208L;
    final oxg a;
    final AtomicReference b;
    
    public pdp(final oxg a) {
        this.a = a;
        this.b = new AtomicReference();
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
        oyj.e(this.b, oxp);
    }
    
    @Override
    public final void bX() {
        oyj.g(this.b);
        oyj.g(this);
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
