import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class pdg extends AtomicReference implements oxp
{
    private static final long serialVersionUID = 7463222674719692880L;
    final oxg a;
    
    public pdg(final oxg a, final pdh pdh) {
        this.a = a;
        this.lazySet(pdh);
    }
    
    @Override
    public final void bX() {
        final pdh pdh = this.getAndSet(null);
        if (pdh != null) {
            pdh.f(this);
        }
    }
    
    @Override
    public final boolean ca() {
        throw null;
    }
}
