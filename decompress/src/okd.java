import java.io.OutputStream;

// 
// Decompiled by Procyon v0.6.0
// 

final class okd extends okg
{
    final byte[] a;
    final int b;
    int c;
    int d;
    private final OutputStream g;
    
    public okd(final OutputStream g, final int n) {
        if (n < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        final byte[] a = new byte[Math.max(n, 20)];
        this.a = a;
        this.b = a.length;
        if (g != null) {
            this.g = g;
            return;
        }
        throw new NullPointerException("out");
    }
    
    private final void aC() {
        this.g.write(this.a, 0, this.c);
        this.c = 0;
    }
    
    private final void aD(final int n) {
        if (this.b - this.c < n) {
            this.aC();
        }
    }
    
    @Override
    public final void A(final int n, final int n2) {
        this.C(onx.c(n, n2));
    }
    
    @Override
    public final void B(final int n, final int n2) {
        this.aD(20);
        this.f(n, 0);
        this.g(n2);
    }
    
    @Override
    public final void C(final int n) {
        this.aD(5);
        this.g(n);
    }
    
    @Override
    public final void D(final int n, final long n2) {
        this.aD(20);
        this.f(n, 0);
        this.h(n2);
    }
    
    @Override
    public final void E(final long n) {
        this.aD(10);
        this.h(n);
    }
    
    @Override
    public final void F(final byte[] array, final int n) {
        this.C(n);
        this.k(array, 0, n);
    }
    
    @Override
    public final void a(final byte[] array, final int n, final int n2) {
        this.k(array, n, n2);
    }
    
    @Override
    public final int b() {
        throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
    }
    
    final void c(final byte b) {
        this.a[this.c++] = b;
        ++this.d;
    }
    
    final void d(final int n) {
        final byte[] a = this.a;
        final int c = this.c;
        final int c2 = c + 1;
        this.c = c2;
        a[c] = (byte)(n & 0xFF);
        final int c3 = c2 + 1;
        this.c = c3;
        a[c2] = (byte)(n >> 8 & 0xFF);
        final int c4 = c3 + 1;
        this.c = c4;
        a[c3] = (byte)(n >> 16 & 0xFF);
        this.c = c4 + 1;
        a[c4] = (byte)(n >> 24 & 0xFF);
        this.d += 4;
    }
    
    final void e(final long n) {
        final byte[] a = this.a;
        final int c = this.c;
        final int c2 = c + 1;
        this.c = c2;
        a[c] = (byte)(n & 0xFFL);
        final int c3 = c2 + 1;
        this.c = c3;
        a[c2] = (byte)(n >> 8 & 0xFFL);
        final int c4 = c3 + 1;
        this.c = c4;
        a[c3] = (byte)(n >> 16 & 0xFFL);
        final int c5 = c4 + 1;
        this.c = c5;
        a[c4] = (byte)(0xFFL & n >> 24);
        final int c6 = c5 + 1;
        this.c = c6;
        a[c5] = (byte)((int)(n >> 32) & 0xFF);
        final int c7 = c6 + 1;
        this.c = c7;
        a[c6] = (byte)((int)(n >> 40) & 0xFF);
        final int c8 = c7 + 1;
        this.c = c8;
        a[c7] = (byte)((int)(n >> 48) & 0xFF);
        this.c = c8 + 1;
        a[c8] = (byte)((int)(n >> 56) & 0xFF);
        this.d += 8;
    }
    
    final void f(final int n, final int n2) {
        this.g(onx.c(n, n2));
    }
    
    final void g(int c) {
        int n = c;
        if (okg.e) {
            final long n2 = this.c;
            while ((c & 0xFFFFFF80) != 0x0) {
                ons.n(this.a, this.c++, (byte)((c & 0x7F) | 0x80));
                c >>>= 7;
            }
            ons.n(this.a, this.c++, (byte)c);
            c = this.c;
            this.d += (int)(c - n2);
            return;
        }
        while ((n & 0xFFFFFF80) != 0x0) {
            final byte[] a = this.a;
            c = this.c++;
            a[c] = (byte)((n & 0x7F) | 0x80);
            ++this.d;
            n >>>= 7;
        }
        final byte[] a2 = this.a;
        c = this.c++;
        a2[c] = (byte)n;
        ++this.d;
    }
    
    final void h(long n) {
        if (okg.e) {
            final long n2 = this.c;
            while ((n & 0xFFFFFFFFFFFFFF80L) != 0x0L) {
                ons.n(this.a, this.c++, (byte)(((int)n & 0x7F) | 0x80));
                n >>>= 7;
            }
            ons.n(this.a, this.c++, (byte)n);
            this.d += (int)(this.c - n2);
            return;
        }
        while ((n & 0xFFFFFFFFFFFFFF80L) != 0x0L) {
            this.a[this.c++] = (byte)(((int)n & 0x7F) | 0x80);
            ++this.d;
            n >>>= 7;
        }
        this.a[this.c++] = (byte)n;
        ++this.d;
    }
    
    @Override
    public final void i() {
        if (this.c > 0) {
            this.aC();
        }
    }
    
    @Override
    public final void j(final byte b) {
        if (this.c == this.b) {
            this.aC();
        }
        this.c(b);
    }
    
    public final void k(final byte[] array, int n, int c) {
        final int b = this.b;
        final int c2 = this.c;
        final int n2 = b - c2;
        if (n2 >= c) {
            System.arraycopy(array, n, this.a, c2, c);
            this.c += c;
            this.d += c;
            return;
        }
        System.arraycopy(array, n, this.a, c2, n2);
        n += n2;
        c -= n2;
        this.c = this.b;
        this.d += n2;
        this.aC();
        if (c <= this.b) {
            System.arraycopy(array, n, this.a, 0, c);
            this.c = c;
        }
        else {
            this.g.write(array, n, c);
        }
        this.d += c;
    }
    
    @Override
    public final void l(final int n, final boolean b) {
        this.aD(11);
        this.f(n, 0);
        this.c((byte)(b ? 1 : 0));
    }
    
    @Override
    public final void m(final int n, final ojw ojw) {
        this.A(n, 2);
        this.n(ojw);
    }
    
    @Override
    public final void n(final ojw ojw) {
        this.C(ojw.d());
        ojw.o(this);
    }
    
    @Override
    public final void o(final int n, final int n2) {
        this.aD(14);
        this.f(n, 5);
        this.d(n2);
    }
    
    @Override
    public final void p(final int n) {
        this.aD(4);
        this.d(n);
    }
    
    @Override
    public final void q(final int n, final long n2) {
        this.aD(18);
        this.f(n, 1);
        this.e(n2);
    }
    
    @Override
    public final void r(final long n) {
        this.aD(8);
        this.e(n);
    }
    
    @Override
    public final void s(final int n, final int n2) {
        this.aD(20);
        this.f(n, 0);
        if (n2 >= 0) {
            this.g(n2);
            return;
        }
        this.h(n2);
    }
    
    @Override
    public final void t(final int n) {
        if (n >= 0) {
            this.C(n);
            return;
        }
        this.E(n);
    }
    
    @Override
    public final void u(int n, final omj omj, final omy omy) {
        this.A(n, 2);
        final ojg ojg = (ojg)omj;
        n = ojg.c();
        if (n == -1) {
            n = omy.a(ojg);
            ojg.e(n);
        }
        this.C(n);
        omy.l(omj, this.f);
    }
    
    @Override
    public final void v(final omj omj) {
        this.C(omj.k());
        omj.aT(this);
    }
    
    @Override
    public final void w(final int n, final omj omj) {
        this.A(1, 3);
        this.B(2, n);
        this.A(3, 2);
        this.v(omj);
        this.A(1, 4);
    }
    
    @Override
    public final void x(final int n, final ojw ojw) {
        this.A(1, 3);
        this.B(2, n);
        this.m(3, ojw);
        this.A(1, 4);
    }
    
    @Override
    public final void y(final int n, final String s) {
        this.A(n, 2);
        this.z(s);
    }
    
    @Override
    public final void z(final String s) {
        try {
            final int n = s.length() * 3;
            final int ad = okg.ad(n);
            final int n2 = ad + n;
            final int b = this.b;
            if (n2 > b) {
                final byte[] array = new byte[n];
                final int a = onu.a(s, array, 0, n);
                this.C(a);
                this.k(array, 0, a);
                return;
            }
            if (n2 > b - this.c) {
                this.aC();
            }
            final int ad2 = okg.ad(s.length());
            final int c = this.c;
            Label_0149: {
                if (ad2 != ad) {
                    break Label_0149;
                }
                final int c2 = c + ad2;
                try {
                    this.c = c2;
                    final int a2 = onu.a(s, this.a, c2, this.b - c2);
                    this.c = c;
                    int b2 = a2 - c - ad2;
                    this.g(b2);
                    this.c = a2;
                    this.d += b2;
                    return;
                    b2 = onu.b(s);
                    this.g(b2);
                    this.c = onu.a(s, this.a, this.c, b2);
                }
                catch (final ArrayIndexOutOfBoundsException ex) {
                    throw new okf(ex);
                }
                catch (final ont ont) {
                    try {
                        this.d -= this.c - c;
                        this.c = c;
                        throw ont;
                    }
                    catch (final ont ont2) {
                        this.al(s, ont2);
                    }
                }
            }
        }
        catch (final ont ont3) {}
    }
}
