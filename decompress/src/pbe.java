// 
// Decompiled by Procyon v0.6.0
// 

final class pbe extends pbc
{
    private static final long serialVersionUID = 2587302975077663557L;
    final psr d;
    
    public pbe(final psr d, final int n) {
        super(n);
        this.d = d;
    }
    
    @Override
    public final void e() {
        final int a = this.a;
        final psr d = this.d;
        for (int i = this.b; i != a; ++i) {
            if (this.c) {
                return;
            }
            d.ce(i);
        }
        if (this.c) {
            return;
        }
        d.cc();
    }
    
    @Override
    public final void f(long n) {
        final int a = this.a;
        int b = this.b;
        final psr d = this.d;
        final long n2 = 0L;
        long n3 = n;
        n = n2;
        while (true) {
            if (n != n3 && b != a) {
                if (this.c) {
                    return;
                }
                d.ce(b);
                ++n;
                ++b;
            }
            else {
                if (b == a) {
                    if (!this.c) {
                        d.cc();
                    }
                    return;
                }
                n3 = this.get();
                if (n != n3) {
                    continue;
                }
                this.b = b;
                n3 = this.addAndGet(-n);
                if (n3 == 0L) {
                    return;
                }
                n = 0L;
            }
        }
    }
}
