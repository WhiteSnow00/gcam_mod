import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ozh extends AtomicReference implements owu, oxp, oye
{
    private static final long serialVersionUID = -4361286194466301354L;
    final oye a;
    final oyb b;
    
    public ozh(final oyb b) {
        this.a = this;
        this.b = b;
    }
    
    public ozh(final oye a, final oyb b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void b(final Throwable t) {
        try {
            this.a.a(t);
        }
        finally {
            psn.e(t);
            pip.g(t);
        }
        this.lazySet(oyj.a);
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
        try {
            this.b.a();
        }
        finally {
            final Throwable t;
            psn.e(t);
            pip.g(t);
        }
        this.lazySet(oyj.a);
    }
}
