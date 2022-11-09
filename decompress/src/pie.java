import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class pie extends AtomicReference implements oxp
{
    private static final long serialVersionUID = -7650903191002190468L;
    final oxl a;
    
    public pie(final oxl a, final pif pif) {
        this.a = a;
        this.lazySet(pif);
    }
    
    @Override
    public final void bX() {
        final pif pif = this.getAndSet(null);
        if (pif != null) {
            pif.o(this);
        }
    }
    
    @Override
    public final boolean ca() {
        throw null;
    }
}
