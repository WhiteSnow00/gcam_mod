import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class pen extends AtomicReference implements owu, oxp
{
    private static final long serialVersionUID = -8565274649390031272L;
    final oxl a;
    final oxm b;
    
    public pen(final oxl a, final oxm b) {
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
        this.b.m(new peu(this, this.a, 1));
    }
}
