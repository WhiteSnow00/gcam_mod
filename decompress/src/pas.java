import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class pas extends AtomicReference implements owy, oxp
{
    private static final long serialVersionUID = -4606175640614850599L;
    final long a;
    final pat b;
    final int c;
    final int d;
    volatile boolean e;
    volatile ozd f;
    long g;
    int h;
    
    public pas(final pat b, final long a) {
        this.a = a;
        this.b = b;
        final int f = b.f;
        this.d = f;
        this.c = f >> 2;
    }
    
    @Override
    public final void bX() {
        phe.i(this);
    }
    
    @Override
    public final void bY(final pss pss) {
        if (phe.f(this, pss)) {
            if (pss instanceof oza) {
                final oza oza = (oza)pss;
                final int k = oza.k();
                if (k == 1) {
                    this.h = 1;
                    this.f = oza;
                    this.e = true;
                    this.b.h();
                    return;
                }
                if (k == 2) {
                    this.h = 2;
                    this.f = oza;
                }
            }
            pss.cb(this.d);
        }
    }
    
    @Override
    public final boolean ca() {
        throw null;
    }
    
    @Override
    public final void cc() {
        this.e = true;
        this.b.h();
    }
    
    @Override
    public final void cd(final Throwable t) {
        this.lazySet(phe.a);
        final pat b = this.b;
        if (phi.c(b.i, t)) {
            this.e = true;
            b.m.a();
            final pas[] array = b.k.getAndSet(pat.b);
            for (int length = array.length, i = 0; i < length; ++i) {
                phe.i(array[i]);
            }
            b.h();
            return;
        }
        pip.g(t);
    }
    
    @Override
    public final void ce(final Object o) {
        if (this.h != 2) {
            final pat b = this.b;
            Label_0243: {
                if (b.get() == 0 && b.compareAndSet(0, 1)) {
                    final long value = b.l.get();
                    final ozd f = this.f;
                    if (value != 0L && (f == null || f.i())) {
                        b.c.ce(o);
                        if (value != Long.MAX_VALUE) {
                            b.l.decrementAndGet();
                        }
                        this.f(1L);
                    }
                    else {
                        ozd f2;
                        if ((f2 = f) == null && (f2 = this.f) == null) {
                            f2 = new pfs(b.f);
                            this.f = f2;
                        }
                        if (!f2.j(o)) {
                            b.cd(new oxx("Inner queue full?!"));
                            return;
                        }
                    }
                    if (b.decrementAndGet() != 0) {
                        break Label_0243;
                    }
                }
                else {
                    ozd f3;
                    if ((f3 = this.f) == null) {
                        f3 = new pfs(b.f);
                        this.f = f3;
                    }
                    if (!f3.j(o)) {
                        b.cd(new oxx("Inner queue full?!"));
                        return;
                    }
                    if (b.getAndIncrement() == 0) {
                        break Label_0243;
                    }
                }
                return;
            }
            b.i();
            return;
        }
        this.b.h();
    }
    
    final void f(long g) {
        if (this.h != 1) {
            g += this.g;
            if (g >= this.c) {
                this.g = 0L;
                this.get().cb(g);
                return;
            }
            this.g = g;
        }
    }
}
