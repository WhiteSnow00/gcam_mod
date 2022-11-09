import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class pff extends AtomicReference implements Runnable, oxl, oxp
{
    private static final long serialVersionUID = 3528003840217436037L;
    final oxl a;
    final oxj b;
    Object c;
    Throwable d;
    
    public pff(final oxl a, final oxj b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void b(final Throwable d) {
        this.d = d;
        oyj.h(this, this.b.d(this));
    }
    
    @Override
    public final void bV(final oxp oxp) {
        if (oyj.e(this, oxp)) {
            this.a.bV(this);
        }
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
    public final void d(final Object c) {
        this.c = c;
        oyj.h(this, this.b.d(this));
    }
    
    @Override
    public final void run() {
        final Throwable d = this.d;
        if (d != null) {
            this.a.b(d);
            return;
        }
        this.a.d(this.c);
    }
}
