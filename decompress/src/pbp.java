import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicInteger;

// 
// Decompiled by Procyon v0.6.0
// 

final class pbp extends AtomicInteger implements owy, pss
{
    private static final long serialVersionUID = -1776795561228106469L;
    final psr a;
    final oyd b;
    final ozc c;
    final AtomicLong d;
    final int e;
    final int f;
    volatile boolean g;
    volatile boolean h;
    Throwable i;
    pss j;
    Object k;
    int l;
    
    public pbp(final psr a, final oyd b, final Object k, final int e) {
        this.a = a;
        this.b = b;
        this.k = k;
        this.e = e;
        this.f = e - (e >> 2);
        (this.c = new pfs(e)).j(k);
        this.d = new AtomicLong();
    }
    
    @Override
    public final void a() {
        this.g = true;
        this.j.a();
        if (this.getAndIncrement() == 0) {
            this.c.bZ();
        }
    }
    
    @Override
    public final void bY(final pss j) {
        if (phe.h(this.j, j)) {
            this.j = j;
            this.a.bY(this);
            j.cb(this.e - 1);
        }
    }
    
    @Override
    public final void cb(final long n) {
        if (phe.g(n)) {
            phn.b(this.d, n);
            this.f();
        }
    }
    
    @Override
    public final void cc() {
        if (this.h) {
            return;
        }
        this.h = true;
        this.f();
    }
    
    @Override
    public final void cd(final Throwable i) {
        if (this.h) {
            pip.g(i);
            return;
        }
        this.i = i;
        this.h = true;
        this.f();
    }
    
    @Override
    public final void ce(Object a) {
        if (this.h) {
            return;
        }
        final Object k = this.k;
        try {
            a = this.b.a(k, a);
            phn.g(a, "The accumulator returned a null value");
            this.k = a;
            this.c.j(a);
            this.f();
        }
        finally {
            final Throwable t;
            psn.e(t);
            this.j.a();
            this.cd(t);
        }
    }
    
    final void f() {
        if (this.getAndIncrement() != 0) {
            return;
        }
        final psr a = this.a;
        final ozc c = this.c;
        final int f = this.f;
        int l = this.l;
        int addAndGet = 1;
        do {
            final long value = this.d.get();
            long n = 0L;
            while (n != value) {
                if (this.g) {
                    c.bZ();
                    return;
                }
                final boolean h = this.h;
                if (h) {
                    final Throwable i = this.i;
                    if (i != null) {
                        c.bZ();
                        a.cd(i);
                        return;
                    }
                }
                final Object bw = c.bW();
                if (h) {
                    if (bw == null) {
                        a.cc();
                        return;
                    }
                }
                else if (bw == null) {
                    break;
                }
                a.ce(bw);
                ++n;
                if (++l != f) {
                    continue;
                }
                this.j.cb(f);
                l = 0;
            }
            if (n == value && this.h) {
                final Throwable j = this.i;
                if (j != null) {
                    c.bZ();
                    a.cd(j);
                    return;
                }
                if (c.i()) {
                    a.cc();
                    return;
                }
            }
            if (n != 0L) {
                phn.d(this.d, n);
            }
            this.l = l;
        } while ((addAndGet = this.addAndGet(-addAndGet)) != 0);
    }
}
