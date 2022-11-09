import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pbw extends AtomicReference implements oxp
{
    private static final long serialVersionUID = -2467358622224974244L;
    public final oxa a;
    
    public pbw(final oxa a) {
        this.a = a;
    }
    
    public final void b() {
        if (this.get() != oyj.a) {
            final oxp oxp = this.getAndSet(oyj.a);
            if (oxp != oyj.a) {
                try {
                    this.a.e();
                    if (oxp != null) {
                        oxp.bX();
                    }
                }
                finally {
                    if (oxp != null) {
                        oxp.bX();
                    }
                }
            }
        }
    }
    
    @Override
    public final void bX() {
        oyj.g(this);
    }
    
    public final void c(final Throwable t) {
        Throwable t2;
        if (t == null) {
            t2 = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        }
        else {
            t2 = t;
        }
        if (this.get() != oyj.a) {
            final oxp oxp = this.getAndSet(oyj.a);
            if (oxp != oyj.a) {
                try {
                    this.a.b(t2);
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
    public final boolean ca() {
        throw null;
    }
    
    @Override
    public final String toString() {
        return String.format("%s{%s}", this.getClass().getSimpleName(), super.toString());
    }
}
