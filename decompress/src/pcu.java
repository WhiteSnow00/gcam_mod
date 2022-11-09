import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class pcu extends AtomicReference implements oxa, oxp
{
    private static final long serialVersionUID = -502562646270949838L;
    final /* synthetic */ pcv a;
    
    public pcu(final pcv a) {
        this.a = a;
    }
    
    @Override
    public final void a(final Object o) {
        final pcv a = this.a;
        a.b.c(this);
        Label_0192: {
            pft pft2;
            if (a.get() == 0 && a.compareAndSet(0, 1)) {
                a.a.e(o);
                final int decrementAndGet = a.c.decrementAndGet();
                final pft pft = a.f.get();
                if (decrementAndGet == 0 && (pft == null || pft.i())) {
                    final Throwable b = phi.b(a.d);
                    if (b != null) {
                        a.a.b(b);
                        return;
                    }
                    a.a.bU();
                    return;
                }
                else {
                    if (a.decrementAndGet() == 0) {
                        return;
                    }
                    break Label_0192;
                }
            }
            else {
                while ((pft2 = a.f.get()) == null) {
                    pft2 = new pft(owx.a);
                    if (a.f.compareAndSet(null, pft2)) {
                        break;
                    }
                }
            }
            monitorenter(pft2);
            try {
                pft2.j(o);
                monitorexit(pft2);
                a.c.decrementAndGet();
                if (a.getAndIncrement() != 0) {
                    return;
                }
                a.h();
            }
            finally {
                monitorexit(pft2);
                while (true) {}
            }
        }
    }
    
    @Override
    public final void b(final Throwable t) {
        final pcv a = this.a;
        a.b.c(this);
        if (phi.c(a.d, t)) {
            a.g.bX();
            a.b.bX();
            a.c.decrementAndGet();
            a.g();
            return;
        }
        pip.g(t);
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
        final pcv a = this.a;
        a.b.c(this);
        if (a.get() != 0 || !a.compareAndSet(0, 1)) {
            a.c.decrementAndGet();
            a.g();
            return;
        }
        final int decrementAndGet = a.c.decrementAndGet();
        final pft pft = a.f.get();
        if (decrementAndGet == 0 && (pft == null || pft.i())) {
            final Throwable b = phi.b(a.d);
            if (b != null) {
                a.a.b(b);
                return;
            }
            a.a.bU();
        }
        else {
            if (a.decrementAndGet() == 0) {
                return;
            }
            a.h();
        }
    }
}
