// 
// Decompiled by Procyon v0.6.0
// 

final class oke extends okg
{
    private final byte[] a;
    private final int b;
    private int c;
    
    public oke(final byte[] a, final int b) {
        if (a == null) {
            throw new NullPointerException("buffer");
        }
        final int length = a.length;
        if ((length - b | b) >= 0) {
            this.a = a;
            this.c = 0;
            this.b = b;
            return;
        }
        throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", length, 0, b));
    }
    
    @Override
    public final void A(final int n, final int n2) {
        this.C(onx.c(n, n2));
    }
    
    @Override
    public final void B(final int n, final int n2) {
        this.A(n, 0);
        this.C(n2);
    }
    
    @Override
    public final void C(int n) {
        final boolean e = okg.e;
        while (true) {
            Label_0038: {
                if ((n & 0xFFFFFF80) != 0x0) {
                    break Label_0038;
                }
                try {
                    this.a[this.c++] = (byte)n;
                    return;
                    this.a[this.c++] = (byte)((n & 0x7F) | 0x80);
                    n >>>= 7;
                }
                catch (final IndexOutOfBoundsException ex) {
                    throw new okf(String.format("Pos: %d, limit: %d, len: %d", this.c, this.b, 1), ex);
                }
            }
        }
    }
    
    @Override
    public final void D(final int n, final long n2) {
        this.A(n, 0);
        this.E(n2);
    }
    
    @Override
    public final void E(long n) {
        if (okg.e) {
            if (this.b() >= 10) {
                while ((n & 0xFFFFFFFFFFFFFF80L) != 0x0L) {
                    ons.n(this.a, this.c++, (byte)(((int)n & 0x7F) | 0x80));
                    n >>>= 7;
                }
                ons.n(this.a, this.c++, (byte)n);
                return;
            }
        }
        while (true) {
            Label_0140: {
                if ((n & 0xFFFFFFFFFFFFFF80L) != 0x0L) {
                    break Label_0140;
                }
                try {
                    this.a[this.c++] = (byte)n;
                    return;
                    this.a[this.c++] = (byte)(((int)n & 0x7F) | 0x80);
                    n >>>= 7;
                }
                catch (final IndexOutOfBoundsException ex) {
                    throw new okf(String.format("Pos: %d, limit: %d, len: %d", this.c, this.b, 1), ex);
                }
            }
        }
    }
    
    @Override
    public final void F(final byte[] array, final int n) {
        this.C(n);
        this.c(array, 0, n);
    }
    
    @Override
    public final void a(final byte[] array, final int n, final int n2) {
        this.c(array, n, n2);
    }
    
    @Override
    public final int b() {
        return this.b - this.c;
    }
    
    public final void c(final byte[] array, final int n, final int n2) {
        try {
            System.arraycopy(array, n, this.a, this.c, n2);
            this.c += n2;
        }
        catch (final IndexOutOfBoundsException ex) {
            throw new okf(String.format("Pos: %d, limit: %d, len: %d", this.c, this.b, n2), ex);
        }
    }
    
    @Override
    public final void i() {
    }
    
    @Override
    public final void j(final byte b) {
        try {
            this.a[this.c++] = b;
        }
        catch (final IndexOutOfBoundsException ex) {
            throw new okf(String.format("Pos: %d, limit: %d, len: %d", this.c, this.b, 1), ex);
        }
    }
    
    @Override
    public final void l(final int n, final boolean b) {
        this.A(n, 0);
        this.j((byte)(b ? 1 : 0));
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
        this.A(n, 5);
        this.p(n2);
    }
    
    @Override
    public final void p(final int n) {
        try {
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
        }
        catch (final IndexOutOfBoundsException ex) {
            throw new okf(String.format("Pos: %d, limit: %d, len: %d", this.c, this.b, 1), ex);
        }
    }
    
    @Override
    public final void q(final int n, final long n2) {
        this.A(n, 1);
        this.r(n2);
    }
    
    @Override
    public final void r(final long n) {
        try {
            final byte[] a = this.a;
            final int c = this.c;
            final int c2 = c + 1;
            this.c = c2;
            a[c] = (byte)((int)n & 0xFF);
            final int c3 = c2 + 1;
            this.c = c3;
            a[c2] = (byte)((int)(n >> 8) & 0xFF);
            final int c4 = c3 + 1;
            this.c = c4;
            a[c3] = (byte)((int)(n >> 16) & 0xFF);
            final int c5 = c4 + 1;
            this.c = c5;
            a[c4] = (byte)((int)(n >> 24) & 0xFF);
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
        }
        catch (final IndexOutOfBoundsException ex) {
            throw new okf(String.format("Pos: %d, limit: %d, len: %d", this.c, this.b, 1), ex);
        }
    }
    
    @Override
    public final void s(final int n, final int n2) {
        this.A(n, 0);
        this.t(n2);
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
        final int c = this.c;
        try {
            final int ad = okg.ad(s.length() * 3);
            final int ad2 = okg.ad(s.length());
            if (ad2 == ad) {
                final int c2 = c + ad2;
                this.c = c2;
                final int a = onu.a(s, this.a, c2, this.b());
                this.C(a - (this.c = c) - ad2);
                this.c = a;
                return;
            }
            this.C(onu.b(s));
            this.c = onu.a(s, this.a, this.c, this.b());
        }
        catch (final IndexOutOfBoundsException ex) {
            throw new okf(ex);
        }
        catch (final ont ont) {
            this.c = c;
            this.al(s, ont);
        }
    }
}
