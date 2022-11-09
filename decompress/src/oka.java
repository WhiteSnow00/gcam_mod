import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

final class oka extends okb
{
    private final ByteBuffer e;
    private final long f;
    private long g;
    private long h;
    private final long i;
    private int j;
    private int k;
    private int l;
    
    public oka(final ByteBuffer e) {
        this.l = Integer.MAX_VALUE;
        this.e = e;
        final long e2 = ons.e(e);
        this.f = e2;
        this.g = e.limit() + e2;
        final long n = e2 + e.position();
        this.h = n;
        this.i = n;
    }
    
    private final int L() {
        return (int)(this.g - this.h);
    }
    
    private final void M() {
        final long g = this.g + this.j;
        this.g = g;
        final int n = (int)(g - this.i);
        final int l = this.l;
        if (n > l) {
            final int j = n - l;
            this.j = j;
            this.g = g - j;
            return;
        }
        this.j = 0;
    }
    
    @Override
    public final void A(final int l) {
        this.l = l;
        this.M();
    }
    
    public final void B(final int n) {
        if (n >= 0 && n <= this.L()) {
            this.h += n;
            return;
        }
        if (n < 0) {
            throw olm.f();
        }
        throw olm.i();
    }
    
    @Override
    public final boolean C() {
        return this.h == this.g;
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
                if (this.L() >= 10) {
                    long h;
                    for (i = n2; i < 10; ++i) {
                        h = this.h;
                        this.h = 1L + h;
                        if (ons.a(h) >= 0) {
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
        final long h = this.h;
        if (h != this.g) {
            this.h = 1L + h;
            return ons.a(h);
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
        return (int)(this.h - this.i);
    }
    
    @Override
    public final int e(int l) {
        if (l < 0) {
            throw olm.f();
        }
        l += this.d();
        final int i = this.l;
        if (l <= i) {
            this.l = l;
            this.M();
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
        final long h = this.h;
        if (this.g - h >= 4L) {
            this.h = 4L + h;
            return (ons.a(h + 3L) & 0xFF) << 24 | ((ons.a(h) & 0xFF) | (ons.a(1L + h) & 0xFF) << 8 | (ons.a(2L + h) & 0xFF) << 16);
        }
        throw olm.i();
    }
    
    @Override
    public final int j() {
        final long h = this.h;
        if (this.g != h) {
            final long h2 = h + 1L;
            final byte a = ons.a(h);
            if (a >= 0) {
                this.h = h2;
                return a;
            }
            if (this.g - h2 >= 9L) {
                long h3 = h2 + 1L;
                final int n = a ^ ons.a(h2) << 7;
                int n2;
                if (n < 0) {
                    n2 = (n ^ 0xFFFFFF80);
                }
                else {
                    final long n3 = h3 + 1L;
                    final int n4 = n ^ ons.a(h3) << 14;
                    if (n4 >= 0) {
                        n2 = (n4 ^ 0x3F80);
                        h3 = n3;
                    }
                    else {
                        h3 = n3 + 1L;
                        final int n5 = n4 ^ ons.a(n3) << 21;
                        if (n5 < 0) {
                            n2 = (n5 ^ 0xFFE03F80);
                        }
                        else {
                            final long n6 = h3 + 1L;
                            final byte a2 = ons.a(h3);
                            n2 = (n5 ^ a2 << 28 ^ 0xFE03F80);
                            h3 = n6;
                            if (a2 < 0) {
                                final long n7 = h3 = n6 + 1L;
                                if (ons.a(n6) < 0) {
                                    final long n8 = h3 = n7 + 1L;
                                    if (ons.a(n7) < 0) {
                                        final long n9 = h3 = n8 + 1L;
                                        if (ons.a(n8) < 0) {
                                            final long n10 = h3 = n9 + 1L;
                                            if (ons.a(n9) < 0) {
                                                h3 = n10 + 1L;
                                                if (ons.a(n10) < 0) {
                                                    return (int)this.s();
                                                }
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
            return this.k = 0;
        }
        final int j = this.j();
        this.k = j;
        if (onx.a(j) != 0) {
            return this.k;
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
        final long h = this.h;
        if (this.g - h >= 8L) {
            this.h = 8L + h;
            return ((long)ons.a(h + 7L) & 0xFFL) << 56 | (((long)ons.a(h) & 0xFFL) | ((long)ons.a(1L + h) & 0xFFL) << 8 | ((long)ons.a(2L + h) & 0xFFL) << 16 | ((long)ons.a(3L + h) & 0xFFL) << 24 | ((long)ons.a(4L + h) & 0xFFL) << 32 | ((long)ons.a(5L + h) & 0xFFL) << 40 | ((long)ons.a(6L + h) & 0xFFL) << 48);
        }
        throw olm.i();
    }
    
    public final long r() {
        final long h = this.h;
        if (this.g != h) {
            final long h2 = h + 1L;
            final byte a = ons.a(h);
            if (a >= 0) {
                this.h = h2;
                return a;
            }
            if (this.g - h2 >= 9L) {
                long h3 = h2 + 1L;
                final int n = a ^ ons.a(h2) << 7;
                long n2;
                if (n < 0) {
                    n2 = (n ^ 0xFFFFFF80);
                }
                else {
                    final long n3 = h3 + 1L;
                    final int n4 = n ^ ons.a(h3) << 14;
                    if (n4 >= 0) {
                        final long n5 = n4 ^ 0x3F80;
                        h3 = n3;
                        n2 = n5;
                    }
                    else {
                        final long n6 = n3 + 1L;
                        final int n7 = n4 ^ ons.a(n3) << 21;
                        if (n7 < 0) {
                            n2 = (n7 ^ 0xFFE03F80);
                            h3 = n6;
                        }
                        else {
                            h3 = n6 + 1L;
                            final long n8 = (long)n7 ^ (long)ons.a(n6) << 28;
                            if (n8 >= 0L) {
                                n2 = (n8 ^ 0xFE03F80L);
                            }
                            else {
                                final long n9 = h3 + 1L;
                                final long n10 = n8 ^ (long)ons.a(h3) << 35;
                                if (n10 < 0L) {
                                    final long n11 = n10 ^ 0xFFFFFFF80FE03F80L;
                                    h3 = n9;
                                    n2 = n11;
                                }
                                else {
                                    h3 = n9 + 1L;
                                    final long n12 = n10 ^ (long)ons.a(n9) << 42;
                                    if (n12 >= 0L) {
                                        n2 = (n12 ^ 0x3F80FE03F80L);
                                    }
                                    else {
                                        final long n13 = h3 + 1L;
                                        final long n14 = n12 ^ (long)ons.a(h3) << 49;
                                        if (n14 < 0L) {
                                            final long n15 = n14 ^ 0xFFFE03F80FE03F80L;
                                            h3 = n13;
                                            n2 = n15;
                                        }
                                        else {
                                            h3 = n13 + 1L;
                                            n2 = (n14 ^ (long)ons.a(n13) << 56 ^ 0xFE03F80FE03F80L);
                                            if (n2 < 0L) {
                                                if (ons.a(h3) < 0L) {
                                                    return this.s();
                                                }
                                                ++h3;
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
        if (j > 0 && j <= this.L()) {
            final byte[] array = new byte[j];
            final long n = j;
            ons.k(this.h, array, 0L, n);
            this.h += n;
            return ojw.x(array);
        }
        if (j == 0) {
            return ojw.b;
        }
        if (j < 0) {
            throw olm.f();
        }
        throw olm.i();
    }
    
    @Override
    public final String x() {
        final int j = this.j();
        if (j > 0 && j <= this.L()) {
            final byte[] array = new byte[j];
            final long n = j;
            ons.k(this.h, array, 0L, n);
            final String s = new String(array, olk.a);
            this.h += n;
            return s;
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
        if (j > 0 && j <= this.L()) {
            final String f = onu.f(this.e, (int)(this.h - this.f), j);
            this.h += j;
            return f;
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
        if (this.k == n) {
            return;
        }
        throw olm.b();
    }
}
