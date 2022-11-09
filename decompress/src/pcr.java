import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class pcr extends AtomicReference implements oxg
{
    private static final long serialVersionUID = -4606175640614850599L;
    final long a;
    final pcs b;
    volatile boolean c;
    volatile ozd d;
    int e;
    
    public pcr(final pcs b, final long a) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void b(final Throwable t) {
        if (phi.c(this.b.i, t)) {
            final pcs b = this.b;
            final boolean d = b.d;
            b.k();
            this.c = true;
            this.b.f();
            return;
        }
        pip.g(t);
    }
    
    @Override
    public final void bU() {
        this.c = true;
        this.b.f();
    }
    
    @Override
    public final void bV(final oxp oxp) {
        if (oyj.e(this, oxp) && oxp instanceof oyy) {
            final oyy oyy = (oyy)oxp;
            final int k = oyy.k();
            if (k == 1) {
                this.e = 1;
                this.d = oyy;
                this.c = true;
                this.b.f();
                return;
            }
            if (k == 2) {
                this.e = 2;
                this.d = oyy;
            }
        }
    }
    
    @Override
    public final void e(final Object o) {
        if (this.e == 0) {
            final pcs b = this.b;
            Label_0099: {
                if (b.get() == 0 && b.compareAndSet(0, 1)) {
                    b.c.e(o);
                    if (b.decrementAndGet() != 0) {
                        break Label_0099;
                    }
                }
                else {
                    ozd d;
                    if ((d = this.d) == null) {
                        d = new pft(b.f);
                        this.d = d;
                    }
                    d.j(o);
                    if (b.getAndIncrement() == 0) {
                        break Label_0099;
                    }
                }
                return;
            }
            b.g();
            return;
        }
        this.b.f();
    }
}
