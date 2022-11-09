import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicInteger;

// 
// Decompiled by Procyon v0.6.0
// 

final class pcv extends AtomicInteger implements oxg, oxp
{
    private static final long serialVersionUID = 8600231336733376951L;
    final oxg a;
    final oxo b;
    final AtomicInteger c;
    final phg d;
    final oyf e;
    final AtomicReference f;
    oxp g;
    volatile boolean h;
    
    public pcv(final oxg a, final oyf e) {
        this.a = a;
        this.e = e;
        this.b = new oxo();
        this.d = new phg();
        this.c = new AtomicInteger(1);
        this.f = new AtomicReference();
    }
    
    @Override
    public final void b(final Throwable t) {
        this.c.decrementAndGet();
        if (phi.c(this.d, t)) {
            this.b.bX();
            this.g();
            return;
        }
        pip.g(t);
    }
    
    @Override
    public final void bU() {
        this.c.decrementAndGet();
        this.g();
    }
    
    @Override
    public final void bV(final oxp g) {
        if (oyj.f(this.g, g)) {
            this.g = g;
            this.a.bV(this);
        }
    }
    
    @Override
    public final void bX() {
        this.h = true;
        this.g.bX();
        this.b.bX();
    }
    
    @Override
    public final boolean ca() {
        throw null;
    }
    
    @Override
    public final void e(final Object o) {
        try {
            final owz a = ((aw)this.e).a;
            this.c.getAndIncrement();
            final pcu pcu = new pcu(this);
            if (!this.h && this.b.b(pcu)) {
                a.b(pcu);
            }
        }
        finally {
            final Throwable t;
            psn.e(t);
            this.g.bX();
            this.b(t);
        }
    }
    
    final void f() {
        final pft pft = this.f.get();
        if (pft != null) {
            pft.bZ();
        }
    }
    
    final void g() {
        if (this.getAndIncrement() == 0) {
            this.h();
        }
    }
    
    final void h() {
        final oxg a = this.a;
        final AtomicInteger c = this.c;
        final AtomicReference f = this.f;
        int addAndGet = 1;
        while (!this.h) {
            if (this.d.get() != null) {
                final Throwable b = phi.b(this.d);
                this.f();
                a.b(b);
                return;
            }
            final int value = c.get();
            final pft pft = f.get();
            Object bw;
            if (pft != null) {
                bw = pft.bW();
            }
            else {
                bw = null;
            }
            if (value == 0) {
                if (bw == null) {
                    final Throwable b2 = phi.b(this.d);
                    if (b2 != null) {
                        a.b(b2);
                        return;
                    }
                    a.bU();
                    return;
                }
            }
            else if (bw == null) {
                if ((addAndGet = this.addAndGet(-addAndGet)) == 0) {
                    return;
                }
                continue;
            }
            a.e(bw);
        }
        this.f();
    }
}
