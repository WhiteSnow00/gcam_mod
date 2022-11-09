import java.util.concurrent.atomic.AtomicLong;

// 
// Decompiled by Procyon v0.6.0
// 

final class pba extends pgy implements owy
{
    private static final long serialVersionUID = -2514538129242366402L;
    final psr a;
    final ozc b;
    pss c;
    volatile boolean d;
    volatile boolean e;
    Throwable f;
    final AtomicLong g;
    boolean h;
    
    public pba(final psr a, final int n) {
        this.g = new AtomicLong();
        this.a = a;
        this.b = new pft(n);
    }
    
    @Override
    public final void a() {
        if (!this.d) {
            this.d = true;
            this.c.a();
            if (this.getAndIncrement() == 0) {
                this.b.bZ();
            }
        }
    }
    
    @Override
    public final Object bW() {
        return this.b.bW();
    }
    
    @Override
    public final void bY(final pss c) {
        if (phe.h(this.c, c)) {
            this.c = c;
            this.a.bY(this);
            c.cb(Long.MAX_VALUE);
        }
    }
    
    @Override
    public final void bZ() {
        this.b.bZ();
    }
    
    @Override
    public final void cb(final long n) {
        if (!this.h && phe.g(n)) {
            phn.b(this.g, n);
            this.f();
        }
    }
    
    @Override
    public final void cc() {
        this.e = true;
        if (this.h) {
            this.a.cc();
            return;
        }
        this.f();
    }
    
    @Override
    public final void cd(final Throwable f) {
        this.f = f;
        this.e = true;
        if (this.h) {
            this.a.cd(f);
            return;
        }
        this.f();
    }
    
    @Override
    public final void ce(final Object o) {
        this.b.j(o);
        if (this.h) {
            this.a.ce(null);
            return;
        }
        this.f();
    }
    
    final void f() {
        if (this.getAndIncrement() == 0) {
            final ozc b = this.b;
            final psr a = this.a;
            int addAndGet = 1;
            while (!this.g(this.e, b.i(), a)) {
                long value;
                long n;
                for (value = this.g.get(), n = 0L; n != value; ++n) {
                    final boolean e = this.e;
                    final Object bw = b.bW();
                    final boolean b2 = bw == null;
                    if (this.g(e, b2, a)) {
                        return;
                    }
                    if (b2) {
                        break;
                    }
                    a.ce(bw);
                }
                if (n == value && this.g(this.e, b.i(), a)) {
                    return;
                }
                if (n != 0L && value != Long.MAX_VALUE) {
                    this.g.addAndGet(-n);
                }
                if ((addAndGet = this.addAndGet(-addAndGet)) == 0) {
                    return;
                }
            }
        }
    }
    
    final boolean g(final boolean b, final boolean b2, final psr psr) {
        if (this.d) {
            this.b.bZ();
            return true;
        }
        if (b) {
            final Throwable f = this.f;
            if (f != null) {
                this.b.bZ();
                psr.cd(f);
                return true;
            }
            if (b2) {
                psr.cc();
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final boolean i() {
        return this.b.i();
    }
    
    @Override
    public final int k() {
        this.h = true;
        return 2;
    }
}
