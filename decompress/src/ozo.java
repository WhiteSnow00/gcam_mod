import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ozo extends AtomicReference implements oxp
{
    private static final long serialVersionUID = -2467358622224974244L;
    public final owu a;
    
    public ozo(final owu a) {
        this.a = a;
    }
    
    public final void b(final Throwable t) {
        if (this.get() != oyj.a) {
            final oxp oxp = this.getAndSet(oyj.a);
            if (oxp != oyj.a) {
                try {
                    this.a.b(t);
                    if (oxp != null) {
                        oxp.bX();
                    }
                    return;
                }
                finally {
                    if (oxp != null) {
                        oxp.bX();
                    }
                }
            }
        }
        pip.g(t);
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
