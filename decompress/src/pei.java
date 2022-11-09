// 
// Decompiled by Procyon v0.6.0
// 

final class pei extends pef
{
    private static final long serialVersionUID = 1075119423897941642L;
    final psr k;
    
    public pei(final psr k, final int n, final pfs pfs, final oxi oxi) {
        super(n, pfs, oxi);
        this.k = k;
    }
    
    @Override
    public final void bY(final pss e) {
        if (phe.h(this.e, e)) {
            this.e = e;
            this.k.bY(this);
            e.cb(this.a);
        }
    }
    
    @Override
    public final void run() {
        int j = this.j;
        final pfs c = this.c;
        final psr k = this.k;
        final int b = this.b;
        int addAndGet = 1;
        while (true) {
            final long value = this.h.get();
            long n = 0L;
            while (n != value) {
                if (this.i) {
                    c.bZ();
                    return;
                }
                final boolean f = this.f;
                if (f) {
                    final Throwable g = this.g;
                    if (g != null) {
                        c.bZ();
                        k.cd(g);
                        this.d.bX();
                        return;
                    }
                }
                final Object bw = c.bW();
                if (f) {
                    if (bw == null) {
                        k.cc();
                        this.d.bX();
                        return;
                    }
                }
                else if (bw == null) {
                    break;
                }
                k.ce(bw);
                ++n;
                final int n2 = j + 1;
                if ((j = n2) != b) {
                    continue;
                }
                this.e.cb(n2);
                j = 0;
            }
            if (n == value) {
                if (this.i) {
                    c.bZ();
                    return;
                }
                if (this.f) {
                    final Throwable g2 = this.g;
                    if (g2 != null) {
                        c.bZ();
                        k.cd(g2);
                        this.d.bX();
                        return;
                    }
                    if (c.i()) {
                        k.cc();
                        this.d.bX();
                        return;
                    }
                }
            }
            if (n != 0L && value != Long.MAX_VALUE) {
                this.h.addAndGet(-n);
            }
            final int value2 = this.get();
            if (value2 == addAndGet) {
                this.j = j;
                if ((addAndGet = this.addAndGet(-addAndGet)) == 0) {
                    return;
                }
                continue;
            }
            else {
                addAndGet = value2;
            }
        }
    }
}
