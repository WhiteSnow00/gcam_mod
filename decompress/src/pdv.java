import java.util.concurrent.atomic.AtomicBoolean;

// 
// Decompiled by Procyon v0.6.0
// 

final class pdv extends AtomicBoolean implements oxg, oxp
{
    private static final long serialVersionUID = 1015244841293359600L;
    final oxg a;
    final oxj b;
    oxp c;
    
    public pdv(final oxg a, final oxj b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void b(final Throwable t) {
        if (this.get()) {
            pip.g(t);
            return;
        }
        this.a.b(t);
    }
    
    @Override
    public final void bU() {
        if (!this.get()) {
            this.a.bU();
        }
    }
    
    @Override
    public final void bV(final oxp c) {
        if (oyj.f(this.c, c)) {
            this.c = c;
            this.a.bV(this);
        }
    }
    
    @Override
    public final void bX() {
        if (this.compareAndSet(false, true)) {
            this.b.d(new pdu(this));
        }
    }
    
    @Override
    public final boolean ca() {
        throw null;
    }
    
    @Override
    public final void e(final Object o) {
        if (!this.get()) {
            this.a.e(o);
        }
    }
}
