// 
// Decompiled by Procyon v0.6.0
// 

final class pda extends ozf implements Runnable, oxg
{
    private static final long serialVersionUID = 6576896619930983584L;
    final oxg a;
    final oxi b;
    final int c;
    ozd d;
    oxp e;
    Throwable f;
    volatile boolean g;
    volatile boolean h;
    int i;
    boolean j;
    
    public pda(final oxg a, final oxi b, final int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final void b(final Throwable f) {
        if (this.g) {
            pip.g(f);
            return;
        }
        this.f = f;
        this.g = true;
        this.f();
    }
    
    @Override
    public final void bU() {
        if (this.g) {
            return;
        }
        this.g = true;
        this.f();
    }
    
    @Override
    public final void bV(final oxp e) {
        if (oyj.f(this.e, e)) {
            this.e = e;
            if (e instanceof oyy) {
                final oyy oyy = (oyy)e;
                final int k = oyy.k();
                if (k == 1) {
                    this.i = 1;
                    this.d = oyy;
                    this.g = true;
                    this.a.bV(this);
                    this.f();
                    return;
                }
                if (k == 2) {
                    this.i = 2;
                    this.d = oyy;
                    this.a.bV(this);
                    return;
                }
            }
            this.d = new pft(this.c);
            this.a.bV(this);
        }
    }
    
    @Override
    public final Object bW() {
        return this.d.bW();
    }
    
    @Override
    public final void bX() {
        if (!this.h) {
            this.h = true;
            this.e.bX();
            this.b.bX();
            if (this.getAndIncrement() == 0) {
                this.d.bZ();
            }
        }
    }
    
    @Override
    public final void bZ() {
        this.d.bZ();
    }
    
    @Override
    public final boolean ca() {
        throw null;
    }
    
    @Override
    public final void e(final Object o) {
        if (this.g) {
            return;
        }
        if (this.i != 2) {
            this.d.j(o);
        }
        this.f();
    }
    
    final void f() {
        if (this.getAndIncrement() == 0) {
            this.b.b(this);
        }
    }
    
    final boolean g(final boolean b, final boolean b2, final oxg oxg) {
        if (this.h) {
            this.d.bZ();
            return true;
        }
        if (b) {
            final Throwable f = this.f;
            if (f != null) {
                this.h = true;
                this.d.bZ();
                oxg.b(f);
                this.b.bX();
                return true;
            }
            if (b2) {
                this.h = true;
                oxg.bU();
                this.b.bX();
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final boolean i() {
        return this.d.i();
    }
    
    @Override
    public final int k() {
        this.j = true;
        return 2;
    }
    
    @Override
    public final void run() {
        Label_0291: {
            if (this.j) {
                int addAndGet = 1;
                while (!this.h) {
                    final boolean g = this.g;
                    final Throwable f = this.f;
                    if (g && f != null) {
                        this.h = true;
                        this.a.b(this.f);
                        this.b.bX();
                        return;
                    }
                    this.a.e(null);
                    if (g) {
                        this.h = true;
                        final Throwable f2 = this.f;
                        if (f2 != null) {
                            this.a.b(f2);
                        }
                        else {
                            this.a.bU();
                        }
                        this.b.bX();
                        return;
                    }
                    if ((addAndGet = this.addAndGet(-addAndGet)) == 0) {
                        break;
                    }
                }
            }
            else {
                final ozd d = this.d;
                final oxg a = this.a;
                int addAndGet2 = 1;
                while (!this.g(this.g, d.i(), a)) {
                    while (true) {
                        final boolean g2 = this.g;
                        try {
                            final Object bw = d.bW();
                            final boolean b = bw == null;
                            if (!this.g(g2, b, a)) {
                                if (!b) {
                                    a.e(bw);
                                    continue;
                                }
                                if ((addAndGet2 = this.addAndGet(-addAndGet2)) != 0) {
                                    break;
                                }
                            }
                        }
                        finally {
                            final Throwable t;
                            psn.e(t);
                            this.h = true;
                            this.e.bX();
                            d.bZ();
                            a.b(t);
                            this.b.bX();
                            return;
                        }
                        break Label_0291;
                    }
                }
            }
        }
    }
}
