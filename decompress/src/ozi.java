import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ozi extends AtomicReference implements owu, oxp
{
    private static final long serialVersionUID = -7545121636549663526L;
    
    @Override
    public final void b(final Throwable t) {
        this.lazySet(oyj.a);
        pip.g(new oxy(t));
    }
    
    @Override
    public final void bV(final oxp oxp) {
        oyj.e(this, oxp);
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
        this.lazySet(oyj.a);
    }
}
