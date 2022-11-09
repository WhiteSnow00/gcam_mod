import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class ozm extends AtomicReference implements owu, oxp
{
    private static final long serialVersionUID = -4101678820158072998L;
    final owu a;
    final owv b;
    
    public ozm(final owu a, final owv b) {
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
    public final void e() {
        this.b.i(new ozl(this, this.a));
    }
}
