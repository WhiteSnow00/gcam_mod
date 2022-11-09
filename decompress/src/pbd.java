// 
// Decompiled by Procyon v0.6.0
// 

final class pbd extends pbc
{
    private static final long serialVersionUID = 2587302975077663557L;
    final oyx d;
    
    public pbd(final oyx d, final int n) {
        super(n);
        this.d = d;
    }
    
    @Override
    public final void e() {
        final int a = this.a;
        final oyx d = this.d;
        for (int i = this.b; i != a; ++i) {
            if (this.c) {
                return;
            }
            d.d(i);
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
        final oyx d = this.d;
        long n2 = 0L;
        while (true) {
            if (n2 != n && b != a) {
                if (this.c) {
                    return;
                }
                long n3 = n2;
                if (d.d(b)) {
                    n3 = n2 + 1L;
                }
                ++b;
                n2 = n3;
            }
            else {
                if (b == a) {
                    if (!this.c) {
                        d.cc();
                    }
                    return;
                }
                n = this.get();
                if (n2 != n) {
                    continue;
                }
                this.b = b;
                n = this.addAndGet(-n2);
                if (n == 0L) {
                    return;
                }
                n2 = 0L;
            }
        }
    }
}
