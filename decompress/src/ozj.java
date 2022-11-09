import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ozj extends AtomicReference implements oxg, oxp
{
    private static final long serialVersionUID = -7251123623727029452L;
    final oye a;
    final oye b;
    
    public ozj(final oye a, final oye b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void b(final Throwable t) {
        if (!this.ca()) {
            this.lazySet(oyj.a);
            try {
                this.b.a(t);
                return;
            }
            finally {
                final Throwable t2;
                psn.e(t2);
                pip.g(new oxw(new Throwable[] { t, t2 }));
                return;
            }
        }
        pip.g(t);
    }
    
    @Override
    public final void bU() {
        if (!this.ca()) {
            this.lazySet(oyj.a);
        }
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
        return this.get() == oyj.a;
    }
    
    @Override
    public final void e(final Object o) {
        if (!this.ca()) {
            try {
                this.a.a(o);
            }
            finally {
                final Throwable t;
                psn.e(t);
                this.get().bX();
                this.b(t);
            }
        }
    }
}
