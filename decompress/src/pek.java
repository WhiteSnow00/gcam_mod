import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pek extends AtomicReference implements oxp
{
    private static final long serialVersionUID = -2467358622224974244L;
    public final oxl a;
    
    public pek(final oxl a) {
        this.a = a;
    }
    
    public final boolean b(final Throwable t) {
        if (this.get() != oyj.a) {
            final oxp oxp = this.getAndSet(oyj.a);
            if (oxp != oyj.a) {
                try {
                    this.a.b(t);
                    if (oxp != null) {
                        oxp.bX();
                    }
                    return true;
                }
                finally {
                    if (oxp != null) {
                        oxp.bX();
                    }
                }
            }
        }
        return false;
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
    public final String toString() {
        return String.format("%s{%s}", this.getClass().getSimpleName(), super.toString());
    }
}
