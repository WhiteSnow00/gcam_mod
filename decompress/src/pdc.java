import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class pdc extends AtomicReference implements oxp
{
    private static final long serialVersionUID = -1100270633763673112L;
    final oxg a;
    
    public pdc(final oxg a) {
        this.a = a;
    }
    
    @Override
    public final void bX() {
        final pdc andSet = this.getAndSet(this);
        if (andSet != null && andSet != this) {
            ((pdd)andSet).f(this);
        }
    }
    
    @Override
    public final boolean ca() {
        throw null;
    }
}
