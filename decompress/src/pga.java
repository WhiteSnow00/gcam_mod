import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class pga extends AtomicReference implements Runnable, oxp
{
    private static final long serialVersionUID = -4101336210206799084L;
    final oym a;
    final oym b;
    
    public pga(final Runnable runnable) {
        super(runnable);
        this.a = new oym();
        this.b = new oym();
    }
    
    @Override
    public final void bX() {
        if (this.getAndSet(null) != null) {
            oyj.g(this.a);
            oyj.g(this.b);
        }
    }
    
    @Override
    public final boolean ca() {
        throw null;
    }
    
    @Override
    public final void run() {
        final Runnable runnable = this.get();
        if (runnable != null) {
            try {
                runnable.run();
            }
            finally {
                this.lazySet(null);
                this.a.lazySet(oyj.a);
                this.b.lazySet(oyj.a);
            }
        }
    }
}
