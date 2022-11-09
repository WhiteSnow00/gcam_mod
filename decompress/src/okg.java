import java.util.logging.Level;
import java.io.OutputStream;
import java.util.logging.Logger;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class okg extends ojp
{
    private static final Logger a;
    public static final boolean e;
    okh f;
    
    static {
        a = Logger.getLogger(okg.class.getName());
        e = ons.b;
    }
    
    public static int G(final byte[] array) {
        return R(array.length);
    }
    
    public static int H(final int n, final ojw ojw) {
        return ab(n) + I(ojw);
    }
    
    public static int I(final ojw ojw) {
        return R(ojw.d());
    }
    
    public static int J(final int n, final int n2) {
        return ab(n) + N(n2);
    }
    
    @Deprecated
    static int K(int n, final omj omj, final omy omy) {
        final int ab = ab(n);
        final ojg ojg = (ojg)omj;
        if ((n = ojg.c()) == -1) {
            n = omy.a(ojg);
            ojg.e(n);
        }
        return ab + ab + n;
    }
    
    @Deprecated
    public static int L(final omj omj) {
        return omj.k();
    }
    
    public static int M(final int n, final int n2) {
        return ab(n) + N(n2);
    }
    
    public static int N(final int n) {
        if (n >= 0) {
            return ad(n);
        }
        return 10;
    }
    
    public static int O(final int n, final long n2) {
        return ab(n) + af(n2);
    }
    
    public static int P(final int n, final ols ols) {
        return ab(n) + Q(ols);
    }
    
    public static int Q(final ols ols) {
        int n;
        if (ols.b != null) {
            n = ols.b.d();
        }
        else if (ols.a != null) {
            n = ols.a.k();
        }
        else {
            n = 0;
        }
        return R(n);
    }
    
    public static int R(final int n) {
        return ad(n) + n;
    }
    
    public static int S(final omj omj) {
        return R(omj.k());
    }
    
    static int T(final omj omj, final omy omy) {
        final ojg ojg = (ojg)omj;
        int n;
        if ((n = ojg.c()) == -1) {
            n = omy.a(ojg);
            ojg.e(n);
        }
        return R(n);
    }
    
    public static int U(final int n) {
        if (n > 4096) {
            return 4096;
        }
        return n;
    }
    
    public static int V(final int n, final int n2) {
        return ab(n) + W(n2);
    }
    
    public static int W(final int n) {
        return ad(ag(n));
    }
    
    public static int X(final int n, final long n2) {
        return ab(n) + Y(n2);
    }
    
    public static int Y(final long n) {
        return af(ah(n));
    }
    
    public static int Z(final int n, final String s) {
        return ab(n) + aa(s);
    }
    
    public static int aA(final int n) {
        return ab(n) + 4;
    }
    
    public static int aB(final int n) {
        return ab(n) + 8;
    }
    
    public static int aa(final String s) {
        int n;
        try {
            n = onu.b(s);
        }
        catch (final ont ont) {
            n = s.getBytes(olk.a).length;
        }
        return R(n);
    }
    
    public static int ab(final int n) {
        return ad(onx.c(n, 0));
    }
    
    public static int ac(final int n, final int n2) {
        return ab(n) + ad(n2);
    }
    
    public static int ad(final int n) {
        if ((n & 0xFFFFFF80) == 0x0) {
            return 1;
        }
        if ((n & 0xFFFFC000) == 0x0) {
            return 2;
        }
        if ((0xFFE00000 & n) == 0x0) {
            return 3;
        }
        if ((n & 0xF0000000) == 0x0) {
            return 4;
        }
        return 5;
    }
    
    public static int ae(final int n, final long n2) {
        return ab(n) + af(n2);
    }
    
    public static int af(long n) {
        if ((0xFFFFFFFFFFFFFF80L & n) == 0x0L) {
            return 1;
        }
        if (n < 0L) {
            return 10;
        }
        int n2;
        if ((0xFFFFFFF800000000L & n) != 0x0L) {
            n >>>= 28;
            n2 = 6;
        }
        else {
            n2 = 2;
        }
        int n3 = n2;
        long n4 = n;
        if ((0xFFFFFFFFFFE00000L & n) != 0x0L) {
            n3 = n2 + 2;
            n4 = n >>> 14;
        }
        int n5 = n3;
        if ((n4 & 0xFFFFFFFFFFFFC000L) != 0x0L) {
            n5 = n3 + 1;
        }
        return n5;
    }
    
    public static int ag(final int n) {
        return n >> 31 ^ n + n;
    }
    
    public static long ah(final long n) {
        return n >> 63 ^ n + n;
    }
    
    public static okg ai(final byte[] array) {
        return new oke(array, array.length);
    }
    
    public static okg aj(final OutputStream outputStream, final int n) {
        return new okd(outputStream, n);
    }
    
    public static int av(final int n) {
        return ab(n) + 1;
    }
    
    public static int aw(final int n) {
        return ab(n) + 8;
    }
    
    public static int ax(final int n) {
        return ab(n) + 4;
    }
    
    public static int ay(final int n) {
        return ab(n) + 8;
    }
    
    public static int az(final int n) {
        return ab(n) + 4;
    }
    
    public abstract void A(final int p0, final int p1);
    
    public abstract void B(final int p0, final int p1);
    
    public abstract void C(final int p0);
    
    public abstract void D(final int p0, final long p1);
    
    public abstract void E(final long p0);
    
    public abstract void F(final byte[] p0, final int p1);
    
    @Override
    public abstract void a(final byte[] p0, final int p1, final int p2);
    
    public final void ak() {
        if (this.b() == 0) {
            return;
        }
        throw new IllegalStateException("Did not write as much data as expected.");
    }
    
    final void al(final String s, final ont ont) {
        okg.a.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", ont);
        final byte[] bytes = s.getBytes(olk.a);
        try {
            final int length = bytes.length;
            this.C(length);
            this.a(bytes, 0, length);
        }
        catch (final okf okf) {
            throw okf;
        }
        catch (final IndexOutOfBoundsException ex) {
            throw new okf(ex);
        }
    }
    
    public final void am(final int n, final double n2) {
        this.q(n, Double.doubleToRawLongBits(n2));
    }
    
    public final void an(final double n) {
        this.r(Double.doubleToRawLongBits(n));
    }
    
    public final void ao(final int n, final float n2) {
        this.o(n, Float.floatToRawIntBits(n2));
    }
    
    public final void ap(final float n) {
        this.p(Float.floatToRawIntBits(n));
    }
    
    @Deprecated
    public final void aq(final omj omj) {
        omj.aT(this);
    }
    
    public final void ar(final int n, final int n2) {
        this.B(n, ag(n2));
    }
    
    public final void as(final int n) {
        this.C(ag(n));
    }
    
    public final void at(final int n, final long n2) {
        this.D(n, ah(n2));
    }
    
    public final void au(final long n) {
        this.E(ah(n));
    }
    
    public abstract int b();
    
    public abstract void i();
    
    public abstract void j(final byte p0);
    
    public abstract void l(final int p0, final boolean p1);
    
    public abstract void m(final int p0, final ojw p1);
    
    public abstract void n(final ojw p0);
    
    public abstract void o(final int p0, final int p1);
    
    public abstract void p(final int p0);
    
    public abstract void q(final int p0, final long p1);
    
    public abstract void r(final long p0);
    
    public abstract void s(final int p0, final int p1);
    
    public abstract void t(final int p0);
    
    public abstract void u(final int p0, final omj p1, final omy p2);
    
    public abstract void v(final omj p0);
    
    public abstract void w(final int p0, final omj p1);
    
    public abstract void x(final int p0, final ojw p1);
    
    public abstract void y(final int p0, final String p1);
    
    public abstract void z(final String p0);
}
