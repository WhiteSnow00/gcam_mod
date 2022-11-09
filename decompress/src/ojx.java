import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

final class ojx extends okb
{
    private final byte[] e;
    private int f;
    private int g;
    private int h;
    private final int i;
    private int j;
    private int k;
    
    public ojx(final byte[] e, final int n, final int n2) {
        this.k = Integer.MAX_VALUE;
        this.e = e;
        this.f = n2 + n;
        this.h = n;
        this.i = n;
    }
    
    private final void L() {
        final int f = this.f + this.g;
        this.f = f;
        final int n = f - this.i;
        final int k = this.k;
        if (n > k) {
            final int g = n - k;
            this.g = g;
            this.f = f - g;
            return;
        }
        this.g = 0;
    }
    
    @Override
    public final void A(final int k) {
        this.k = k;
        this.L();
    }
    
    public final void B(final int n) {
        if (n >= 0) {
            final int f = this.f;
            final int h = this.h;
            if (n <= f - h) {
                this.h = h + n;
                return;
            }
        }
        if (n < 0) {
            throw olm.f();
        }
        throw olm.i();
    }
    
    @Override
    public final boolean C() {
        return this.h == this.f;
    }
    
    @Override
    public final boolean D() {
        return this.r() != 0L;
    }
    
    @Override
    public final boolean E(int i) {
        final int b = onx.b(i);
        final int n = 0;
        final int n2 = 0;
        switch (b) {
            default: {
                throw olm.a();
            }
            case 5: {
                this.B(4);
                return true;
            }
            case 4: {
                return false;
            }
            case 3: {
                int m;
                do {
                    m = this.m();
                } while (m != 0 && this.E(m));
                this.z(onx.c(onx.a(i), 4));
                return true;
            }
            case 2: {
                this.B(this.j());
                return true;
            }
            case 1: {
                this.B(8);
                return true;
            }
            case 0: {
                if (this.f - this.h >= 10) {
                    for (i = n2; i < 10; ++i) {
                        if (this.e[this.h++] >= 0) {
                            return true;
                        }
                    }
                    throw olm.e();
                }
                for (i = n; i < 10; ++i) {
                    if (this.a() >= 0) {
                        return true;
                    }
                }
                throw olm.e();
            }
        }
    }
    
    public final byte a() {
        final int h = this.h;
        if (h != this.f) {
            final byte[] e = this.e;
            this.h = h + 1;
            return e[h];
        }
        throw olm.i();
    }
    
    @Override
    public final double b() {
        return Double.longBitsToDouble(this.q());
    }
    
    @Override
    public final float c() {
        return Float.intBitsToFloat(this.i());
    }
    
    @Override
    public final int d() {
        return this.h - this.i;
    }
    
    @Override
    public final int e(int k) {
        if (k < 0) {
            throw olm.f();
        }
        k += this.d();
        if (k < 0) {
            throw olm.g();
        }
        final int i = this.k;
        if (k <= i) {
            this.k = k;
            this.L();
            return i;
        }
        throw olm.i();
    }
    
    @Override
    public final int f() {
        return this.j();
    }
    
    @Override
    public final int g() {
        return this.i();
    }
    
    @Override
    public final int h() {
        return this.j();
    }
    
    public final int i() {
        final int h = this.h;
        if (this.f - h >= 4) {
            final byte[] e = this.e;
            this.h = h + 4;
            return (e[h + 3] & 0xFF) << 24 | ((e[h] & 0xFF) | (e[h + 1] & 0xFF) << 8 | (e[h + 2] & 0xFF) << 16);
        }
        throw olm.i();
    }
    
    @Override
    public final int j() {
        final int h = this.h;
        final int f = this.f;
        if (f != h) {
            final byte[] e = this.e;
            final int h2 = h + 1;
            final byte b = e[h];
            if (b >= 0) {
                this.h = h2;
                return b;
            }
            if (f - h2 >= 9) {
                int h3 = h2 + 1;
                final int n = b ^ e[h2] << 7;
                int n2 = 0;
                Label_0262: {
                    if (n < 0) {
                        n2 = (n ^ 0xFFFFFF80);
                    }
                    else {
                        final int n3 = h3 + 1;
                        final int n4 = n ^ e[h3] << 14;
                        if (n4 >= 0) {
                            final int n5 = n4 ^ 0x3F80;
                            h3 = n3;
                            n2 = n5;
                        }
                        else {
                            h3 = n3 + 1;
                            final int n6 = n4 ^ e[n3] << 21;
                            if (n6 < 0) {
                                n2 = (n6 ^ 0xFFE03F80);
                            }
                            else {
                                final int n7 = h3 + 1;
                                final byte b2 = e[h3];
                                final int n8 = n6 ^ b2 << 28 ^ 0xFE03F80;
                                h3 = n7;
                                if (b2 < 0) {
                                    final int n9 = n7 + 1;
                                    n2 = n8;
                                    h3 = n9;
                                    if (e[n7] >= 0) {
                                        break Label_0262;
                                    }
                                    final int n10 = h3 = n9 + 1;
                                    if (e[n9] < 0) {
                                        final int n11 = n10 + 1;
                                        n2 = n8;
                                        h3 = n11;
                                        if (e[n10] >= 0) {
                                            break Label_0262;
                                        }
                                        final int n12 = h3 = n11 + 1;
                                        if (e[n11] < 0) {
                                            h3 = n12 + 1;
                                            if (e[n12] >= 0) {
                                                n2 = n8;
                                                break Label_0262;
                                            }
                                            return (int)this.s();
                                        }
                                    }
                                }
                                n2 = n8;
                            }
                        }
                    }
                }
                this.h = h3;
                return n2;
            }
        }
        return (int)this.s();
    }
    
    @Override
    public final int k() {
        return this.i();
    }
    
    @Override
    public final int l() {
        return okb.F(this.j());
    }
    
    @Override
    public final int m() {
        if (this.C()) {
            return this.j = 0;
        }
        final int j = this.j();
        this.j = j;
        if (onx.a(j) != 0) {
            return this.j;
        }
        throw olm.c();
    }
    
    @Override
    public final int n() {
        return this.j();
    }
    
    @Override
    public final long o() {
        return this.q();
    }
    
    @Override
    public final long p() {
        return this.r();
    }
    
    public final long q() {
        final int h = this.h;
        if (this.f - h >= 8) {
            final byte[] e = this.e;
            this.h = h + 8;
            return ((long)e[h + 7] & 0xFFL) << 56 | (((long)e[h] & 0xFFL) | ((long)e[h + 1] & 0xFFL) << 8 | ((long)e[h + 2] & 0xFFL) << 16 | ((long)e[h + 3] & 0xFFL) << 24 | ((long)e[h + 4] & 0xFFL) << 32 | ((long)e[h + 5] & 0xFFL) << 40 | ((long)e[h + 6] & 0xFFL) << 48);
        }
        throw olm.i();
    }
    
    public final long r() {
        final int h = this.h;
        final int f = this.f;
        if (f != h) {
            final byte[] e = this.e;
            final int h2 = h + 1;
            final byte b = e[h];
            if (b >= 0) {
                this.h = h2;
                return b;
            }
            if (f - h2 >= 9) {
                int h3 = h2 + 1;
                final int n = b ^ e[h2] << 7;
                long n2;
                if (n < 0) {
                    n2 = (n ^ 0xFFFFFF80);
                }
                else {
                    final int n3 = h3 + 1;
                    final int n4 = n ^ e[h3] << 14;
                    if (n4 >= 0) {
                        n2 = (n4 ^ 0x3F80);
                        h3 = n3;
                    }
                    else {
                        h3 = n3 + 1;
                        final int n5 = n4 ^ e[n3] << 21;
                        if (n5 < 0) {
                            n2 = (n5 ^ 0xFFE03F80);
                        }
                        else {
                            final int n6 = h3 + 1;
                            final long n7 = (long)e[h3] << 28 ^ (long)n5;
                            if (n7 >= 0L) {
                                h3 = n6;
                                n2 = (n7 ^ 0xFE03F80L);
                            }
                            else {
                                h3 = n6 + 1;
                                final long n8 = n7 ^ (long)e[n6] << 35;
                                if (n8 < 0L) {
                                    n2 = (0xFFFFFFF80FE03F80L ^ n8);
                                }
                                else {
                                    final int n9 = h3 + 1;
                                    final long n10 = n8 ^ (long)e[h3] << 42;
                                    if (n10 >= 0L) {
                                        h3 = n9;
                                        n2 = (n10 ^ 0x3F80FE03F80L);
                                    }
                                    else {
                                        h3 = n9 + 1;
                                        final long n11 = n10 ^ (long)e[n9] << 49;
                                        if (n11 < 0L) {
                                            n2 = (0xFFFE03F80FE03F80L ^ n11);
                                        }
                                        else {
                                            final int n12 = h3 + 1;
                                            n2 = (n11 ^ (long)e[h3] << 56 ^ 0xFE03F80FE03F80L);
                                            if (n2 < 0L) {
                                                if (e[n12] < 0L) {
                                                    return this.s();
                                                }
                                                h3 = n12 + 1;
                                            }
                                            else {
                                                h3 = n12;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                this.h = h3;
                return n2;
            }
        }
        return this.s();
    }
    
    final long s() {
        long n = 0L;
        for (int i = 0; i < 64; i += 7) {
            final byte a = this.a();
            n |= (long)(a & 0x7F) << i;
            if ((a & 0x80) == 0x0) {
                return n;
            }
        }
        throw olm.e();
    }
    
    @Override
    public final long t() {
        return this.q();
    }
    
    @Override
    public final long u() {
        return okb.G(this.r());
    }
    
    @Override
    public final long v() {
        return this.r();
    }
    
    @Override
    public final ojw w() {
        final int j = this.j();
        if (j > 0) {
            final int f = this.f;
            final int h = this.h;
            if (j <= f - h) {
                final ojw u = ojw.u(this.e, h, j);
                this.h += j;
                return u;
            }
        }
        if (j == 0) {
            return ojw.b;
        }
        if (j > 0) {
            final int f2 = this.f;
            final int h2 = this.h;
            if (j <= f2 - h2) {
                final int h3 = j + h2;
                this.h = h3;
                return ojw.x(Arrays.copyOfRange(this.e, h2, h3));
            }
        }
        if (j <= 0) {
            throw olm.f();
        }
        throw olm.i();
    }
    
    @Override
    public final String x() {
        final int j = this.j();
        if (j > 0) {
            final int f = this.f;
            final int h = this.h;
            if (j <= f - h) {
                final String s = new String(this.e, h, j, olk.a);
                this.h += j;
                return s;
            }
        }
        if (j == 0) {
            return "";
        }
        if (j < 0) {
            throw olm.f();
        }
        throw olm.i();
    }
    
    @Override
    public final String y() {
        final int j = this.j();
        if (j > 0) {
            final int f = this.f;
            final int h = this.h;
            if (j <= f - h) {
                final String g = onu.g(this.e, h, j);
                this.h += j;
                return g;
            }
        }
        if (j == 0) {
            return "";
        }
        if (j <= 0) {
            throw olm.f();
        }
        throw olm.i();
    }
    
    @Override
    public final void z(final int n) {
        if (this.j == n) {
            return;
        }
        throw olm.b();
    }
}
