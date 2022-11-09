import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class pfj extends AtomicReference implements Runnable, oxl, oxp
{
    private static final long serialVersionUID = 7000911171163930287L;
    final oxl a;
    final oym b;
    final oxm c;
    
    public pfj(final oxl a, final oxm c) {
        this.a = a;
        this.c = c;
        this.b = new oym();
    }
    
    @Override
    public final void b(final Throwable t) {
        this.a.b(t);
    }
    
    @Override
    public final void bV(final oxp oxp) {
        oyj.e(this, oxp);
    }
    
    @Override
    public final void bX() {
        oyj.g(this);
        oyj.g(this.b);
    }
    
    @Override
    public final boolean ca() {
        throw null;
    }
    
    @Override
    public final void d(final Object o) {
        this.a.d(o);
    }
    
    @Override
    public final void run() {
        this.c.m(this);
    }
}
