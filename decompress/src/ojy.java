import java.nio.ByteBuffer;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

final class ojy extends okb
{
    private final Iterable e;
    private final Iterator f;
    private ByteBuffer g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private long m;
    private long n;
    private long o;
    
    public ojy(final Iterable e, final int h) {
        this.j = Integer.MAX_VALUE;
        this.h = h;
        this.e = e;
        this.f = e.iterator();
        this.l = 0;
        if (h == 0) {
            this.g = olk.c;
            this.m = 0L;
            this.n = 0L;
            this.o = 0L;
            return;
        }
        this.P();
    }
    
    private final int L() {
        return (int)(this.h - this.l - this.m + this.n);
    }
    
    private final long M() {
        return this.o - this.m;
    }
    
    private final void N() {
        if (this.f.hasNext()) {
            this.P();
            return;
        }
        throw olm.i();
    }
    
    private final void O() {
        final int h = this.h + this.i;
        this.h = h;
        final int j = this.j;
        if (h > j) {
            final int i = h - j;
            this.i = i;
            this.h = h - i;
            return;
        }
        this.i = 0;
    }
    
    private final void P() {
        final ByteBuffer g = this.f.next();
        this.g = g;
        this.l += (int)(this.m - this.n);
        final long n = g.position();
        this.m = n;
        this.n = n;
        this.o = this.g.limit();
        final long e = ons.e(this.g);
        this.m += e;
        this.n += e;
        this.o += e;
    }
    
    private final void Q(final byte[] array, final int n) {
        if (n <= this.L()) {
            int min;
            long n2;
            for (int i = n; i > 0; i -= min, this.m += n2) {
                if (this.M() == 0L) {
                    this.N();
                }
                min = Math.min(i, (int)this.M());
                n2 = min;
                ons.k(this.m, array, n - i, n2);
            }
            return;
        }
        if (n <= 0) {
            return;
        }
        throw olm.i();
    }
    
    @Override
    public final void A(final int j) {
        this.j = j;
        this.O();
    }
    
    public final void B(int i) {
        if (i >= 0 && i <= this.h - this.l - this.m + this.n) {
            while (i > 0) {
                if (this.M() == 0L) {
                    this.N();
                }
                final int min = Math.min(i, (int)this.M());
                i -= min;
                this.m += min;
            }
            return;
        }
        if (i < 0) {
            throw olm.f();
        }
        throw olm.i();
    }
    
    @Override
    public final boolean C() {
        return this.l + this.m - this.n == this.h;
    }
    
    @Override
    public final boolean D() {
        return this.r() != 0L;
    }
    
    @Override
    public final boolean E(final int n) {
        final int b = onx.b(n);
        int i = 0;
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
                this.z(onx.c(onx.a(n), 4));
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
                while (i < 10) {
                    if (this.a() >= 0) {
                        return true;
                    }
                    ++i;
                }
                throw olm.e();
            }
        }
    }
    
    public final byte a() {
        if (this.M() == 0L) {
            this.N();
        }
        final long m = this.m;
        this.m = 1L + m;
        return ons.a(m);
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
        return (int)(this.l + this.m - this.n);
    }
    
    @Override
    public final int e(int j) {
        if (j < 0) {
            throw olm.f();
        }
        j += this.d();
        final int i = this.j;
        if (j <= i) {
            this.j = j;
            this.O();
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
        if (this.M() >= 4L) {
            final long m = this.m;
            this.m = 4L + m;
            return (ons.a(m + 3L) & 0xFF) << 24 | ((ons.a(m) & 0xFF) | (ons.a(1L + m) & 0xFF) << 8 | (ons.a(2L + m) & 0xFF) << 16);
        }
        return (this.a() & 0xFF) | (this.a() & 0xFF) << 8 | (this.a() & 0xFF) << 16 | (this.a() & 0xFF) << 24;
    }
    
    @Override
    public final int j() {
        final long m = this.m;
        if (this.o != m) {
            final long n = m + 1L;
            final byte a = ons.a(m);
            if (a >= 0) {
                ++this.m;
                return a;
            }
            if (this.o - this.m >= 10L) {
                final long n2 = n + 1L;
                final int n3 = a ^ ons.a(n) << 7;
                int n4;
                long i;
                if (n3 < 0) {
                    n4 = (n3 ^ 0xFFFFFF80);
                    i = n2;
                }
                else {
                    i = n2 + 1L;
                    final int n5 = n3 ^ ons.a(n2) << 14;
                    if (n5 >= 0) {
                        n4 = (n5 ^ 0x3F80);
                    }
                    else {
                        final long n6 = i + 1L;
                        final int n7 = n5 ^ ons.a(i) << 21;
                        if (n7 < 0) {
                            n4 = (n7 ^ 0xFFE03F80);
                            i = n6;
                        }
                        else {
                            final long n8 = n6 + 1L;
                            final byte a2 = ons.a(n6);
                            n4 = (n7 ^ a2 << 28 ^ 0xFE03F80);
                            i = n8;
                            if (a2 < 0) {
                                final long n9 = i = n8 + 1L;
                                if (ons.a(n8) < 0) {
                                    final long n10 = i = n9 + 1L;
                                    if (ons.a(n9) < 0) {
                                        final long n11 = i = n10 + 1L;
                                        if (ons.a(n10) < 0) {
                                            final long n12 = i = n11 + 1L;
                                            if (ons.a(n11) < 0) {
                                                i = n12 + 1L;
                                                if (ons.a(n12) < 0) {
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
                this.m = i;
                return n4;
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
        if (this.M() >= 8L) {
            final long m = this.m;
            this.m = 8L + m;
            return ((long)ons.a(m + 7L) & 0xFFL) << 56 | (((long)ons.a(6L + m) & 0xFFL) << 48 | (((long)ons.a(4L + m) & 0xFFL) << 32 | (((long)ons.a(2L + m) & 0xFFL) << 16 | (((long)ons.a(m) & 0xFFL) | ((long)ons.a(1L + m) & 0xFFL) << 8) | ((long)ons.a(3L + m) & 0xFFL) << 24) | ((long)ons.a(5L + m) & 0xFFL) << 40));
        }
        return ((long)this.a() & 0xFFL) | ((long)this.a() & 0xFFL) << 8 | ((long)this.a() & 0xFFL) << 16 | ((long)this.a() & 0xFFL) << 24 | ((long)this.a() & 0xFFL) << 32 | ((long)this.a() & 0xFFL) << 40 | ((long)this.a() & 0xFFL) << 48 | ((long)this.a() & 0xFFL) << 56;
    }
    
    public final long r() {
        final long m = this.m;
        if (this.o != m) {
            final long n = m + 1L;
            final byte a = ons.a(m);
            if (a >= 0) {
                ++this.m;
                return a;
            }
            if (this.o - this.m >= 10L) {
                long i = n + 1L;
                final int n2 = a ^ ons.a(n) << 7;
                long n3;
                if (n2 < 0) {
                    n3 = (n2 ^ 0xFFFFFF80);
                }
                else {
                    final long n4 = i + 1L;
                    final int n5 = n2 ^ ons.a(i) << 14;
                    if (n5 >= 0) {
                        final long n6 = n5 ^ 0x3F80;
                        i = n4;
                        n3 = n6;
                    }
                    else {
                        i = n4 + 1L;
                        final int n7 = n5 ^ ons.a(n4) << 21;
                        if (n7 < 0) {
                            n3 = (n7 ^ 0xFFE03F80);
                        }
                        else {
                            final long n8 = i + 1L;
                            final long n9 = (long)n7 ^ (long)ons.a(i) << 28;
                            if (n9 >= 0L) {
                                final long n10 = n9 ^ 0xFE03F80L;
                                i = n8;
                                n3 = n10;
                            }
                            else {
                                i = n8 + 1L;
                                final long n11 = n9 ^ (long)ons.a(n8) << 35;
                                if (n11 < 0L) {
                                    n3 = (n11 ^ 0xFFFFFFF80FE03F80L);
                                }
                                else {
                                    final long n12 = i + 1L;
                                    final long n13 = n11 ^ (long)ons.a(i) << 42;
                                    if (n13 >= 0L) {
                                        final long n14 = n13 ^ 0x3F80FE03F80L;
                                        i = n12;
                                        n3 = n14;
                                    }
                                    else {
                                        i = n12 + 1L;
                                        final long n15 = n13 ^ (long)ons.a(n12) << 49;
                                        if (n15 < 0L) {
                                            n3 = (n15 ^ 0xFFFE03F80FE03F80L);
                                        }
                                        else {
                                            final long n16 = i + 1L;
                                            n3 = (n15 ^ (long)ons.a(i) << 56 ^ 0xFE03F80FE03F80L);
                                            if (n3 < 0L) {
                                                if (ons.a(n16) < 0L) {
                                                    return this.s();
                                                }
                                                i = 1L + n16;
                                            }
                                            else {
                                                i = n16;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                this.m = i;
                return n3;
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
            final long n = j;
            final long o = this.o;
            final long m = this.m;
            if (n <= o - m) {
                final byte[] array = new byte[j];
                ons.k(m, array, 0L, n);
                this.m += n;
                return ojw.x(array);
            }
        }
        if (j > 0 && j <= this.L()) {
            final byte[] array2 = new byte[j];
            this.Q(array2, j);
            return ojw.x(array2);
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
        if (j > 0) {
            final long n = j;
            final long o = this.o;
            final long m = this.m;
            if (n <= o - m) {
                final byte[] array = new byte[j];
                ons.k(m, array, 0L, n);
                final String s = new String(array, olk.a);
                this.m += n;
                return s;
            }
        }
        if (j > 0 && j <= this.L()) {
            final byte[] array2 = new byte[j];
            this.Q(array2, j);
            return new String(array2, olk.a);
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
            final long n = j;
            final long o = this.o;
            final long m = this.m;
            if (n <= o - m) {
                final String f = onu.f(this.g, (int)(m - this.n), j);
                this.m += n;
                return f;
            }
        }
        if (j >= 0 && j <= this.L()) {
            final byte[] array = new byte[j];
            this.Q(array, j);
            return onu.g(array, 0, j);
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
