import java.nio.ByteBuffer;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class oky extends ojg
{
    public static final Map az;
    public onk aA;
    public int aB;
    
    static {
        az = (Map)new ConcurrentHashMap();
    }
    
    public oky() {
        this.aA = onk.a;
        this.aB = -1;
    }
    
    public static oli A(final oli oli) {
        final int size = oli.size();
        int n;
        if (size == 0) {
            n = 10;
        }
        else {
            n = size + size;
        }
        return oli.a(n);
    }
    
    public static olj B() {
        return oms.b;
    }
    
    public static olj C(final olj olj) {
        final int size = olj.size();
        int n;
        if (size == 0) {
            n = 10;
        }
        else {
            n = size + size;
        }
        return olj.e(n);
    }
    
    public static Object E(final Method method, final Object o, final Object... array) {
        try {
            return method.invoke(o, array);
        }
        catch (final InvocationTargetException ex) {
            final Throwable cause = ex.getCause();
            if (cause instanceof RuntimeException) {
                throw (RuntimeException)cause;
            }
            if (cause instanceof Error) {
                throw (Error)cause;
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
        catch (final IllegalAccessException ex2) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", ex2);
        }
    }
    
    protected static Object F(final omj omj, final String s, final Object[] array) {
        return new omt(omj, s, array);
    }
    
    protected static void G(final Class clazz, final oky oky) {
        oky.az.put(clazz, oky);
    }
    
    public static void I(final oky oky) {
        if (oky != null && !oky.n()) {
            throw ojg.h().a();
        }
    }
    
    public static okk J(final omj omj, final Object o, final omj omj2, final int n, final onv onv) {
        return new okk(omj, o, omj2, new okx(n, onv));
    }
    
    public static oky o(oky oky, final InputStream inputStream) {
        final okm a = okm.a();
        try {
            int read = inputStream.read();
            Label_0197: {
                if (read == -1) {
                    oky = null;
                    break Label_0197;
                }
                final int d = okb.d;
                Label_0140: {
                    if ((read & 0x80) != 0x0) {
                        int n = read & 0x7F;
                        int n2 = 7;
                        int i;
                        while (true) {
                            i = n2;
                            if (n2 >= 32) {
                                break;
                            }
                            final int read2 = inputStream.read();
                            if (read2 == -1) {
                                throw olm.i();
                            }
                            n = (read = (n | (read2 & 0x7F) << n2));
                            if ((read2 & 0x80) == 0x0) {
                                break Label_0140;
                            }
                            n2 += 7;
                        }
                        while (i < 64) {
                            final int read3 = inputStream.read();
                            if (read3 == -1) {
                                throw olm.i();
                            }
                            read = n;
                            if ((read3 & 0x80) == 0x0) {
                                break Label_0140;
                            }
                            i += 7;
                        }
                        throw olm.e();
                    }
                }
                final okb h = okb.H(new oje(inputStream, read));
                oky = (oky)oky.H(4);
                try {
                    final omy b = omr.a.b(oky);
                    b.h(oky, okc.p(h), a);
                    b.f(oky);
                    try {
                        h.z(0);
                        I(oky);
                        return oky;
                    }
                    catch (final olm olm) {
                        throw olm;
                    }
                }
                catch (final RuntimeException ex) {
                    if (ex.getCause() instanceof olm) {
                        throw (olm)ex.getCause();
                    }
                    throw ex;
                }
                catch (final IOException ex2) {
                    if (ex2.getCause() instanceof olm) {
                        throw (olm)ex2.getCause();
                    }
                    throw new olm(ex2);
                }
                catch (final olm olm2) {
                    if (olm2.a) {
                        throw new olm(olm2);
                    }
                    throw olm2;
                }
            }
            throw olm.i();
        }
        catch (final IOException ex3) {
            throw new olm(ex3);
        }
        catch (final olm olm3) {
            if (olm3.a) {
                throw new olm(olm3);
            }
            throw olm3;
        }
    }
    
    public static oky p(final oky oky, final ByteBuffer byteBuffer) {
        final okm a = okm.a();
        final okb i = okb.I(byteBuffer);
        final oky oky2 = (oky)oky.H(4);
        try {
            final omy b = omr.a.b(oky2);
            b.h(oky2, okc.p(i), a);
            b.f(oky2);
            I(oky2);
            I(oky2);
            return oky2;
        }
        catch (final RuntimeException ex) {
            if (ex.getCause() instanceof olm) {
                throw (olm)ex.getCause();
            }
            throw ex;
        }
        catch (final IOException ex2) {
            if (ex2.getCause() instanceof olm) {
                throw (olm)ex2.getCause();
            }
            throw new olm(ex2);
        }
        catch (final olm olm) {
            if (olm.a) {
                throw new olm(olm);
            }
            throw olm;
        }
    }
    
    public static oky q(oky v, final byte[] array) {
        v = v(v, array, 0, array.length, okm.a());
        I(v);
        return v;
    }
    
    public static oky r(oky oky, final InputStream inputStream, final okm okm) {
        final okb h = okb.H(inputStream);
        oky = (oky)oky.H(4);
        try {
            final omy b = omr.a.b(oky);
            b.h(oky, okc.p(h), okm);
            b.f(oky);
            I(oky);
            return oky;
        }
        catch (final RuntimeException ex) {
            if (ex.getCause() instanceof olm) {
                throw (olm)ex.getCause();
            }
            throw ex;
        }
        catch (final IOException ex2) {
            if (ex2.getCause() instanceof olm) {
                throw (olm)ex2.getCause();
            }
            throw new olm(ex2);
        }
        catch (final olm olm) {
            if (olm.a) {
                throw new olm(olm);
            }
            throw olm;
        }
    }
    
    public static oky s(oky oky, final ByteBuffer byteBuffer, final okm okm) {
        final okb i = okb.I(byteBuffer);
        oky = (oky)oky.H(4);
        try {
            final omy b = omr.a.b(oky);
            b.h(oky, okc.p(i), okm);
            b.f(oky);
            I(oky);
            I(oky);
            return oky;
        }
        catch (final RuntimeException ex) {
            if (ex.getCause() instanceof olm) {
                throw (olm)ex.getCause();
            }
            throw ex;
        }
        catch (final IOException ex2) {
            if (ex2.getCause() instanceof olm) {
                throw (olm)ex2.getCause();
            }
            throw new olm(ex2);
        }
        catch (final olm olm) {
            if (olm.a) {
                throw new olm(olm);
            }
            throw olm;
        }
    }
    
    public static oky t(oky v, final byte[] array, final okm okm) {
        v = v(v, array, 0, array.length, okm);
        I(v);
        return v;
    }
    
    static oky u(oky oky, final okb okb, final okm okm) {
        oky = (oky)oky.H(4);
        try {
            final omy b = omr.a.b(oky);
            b.h(oky, okc.p(okb), okm);
            b.f(oky);
            return oky;
        }
        catch (final RuntimeException ex) {
            if (ex.getCause() instanceof olm) {
                throw (olm)ex.getCause();
            }
            throw ex;
        }
        catch (final IOException ex2) {
            if (ex2.getCause() instanceof olm) {
                throw (olm)ex2.getCause();
            }
            throw new olm(ex2);
        }
        catch (final olm olm) {
            if (olm.a) {
                throw new olm(olm);
            }
            throw olm;
        }
    }
    
    public static oky v(oky oky, final byte[] array, final int n, final int n2, final okm okm) {
        oky = (oky)oky.H(4);
        try {
            final omy b = omr.a.b(oky);
            b.i(oky, array, n, n + n2, new ojl(okm));
            b.f(oky);
            if (oky.ay == 0) {
                return oky;
            }
            throw new RuntimeException();
        }
        catch (final IndexOutOfBoundsException ex) {
            throw olm.i();
        }
        catch (final IOException ex2) {
            if (ex2.getCause() instanceof olm) {
                throw (olm)ex2.getCause();
            }
            throw new olm(ex2);
        }
        catch (final olm olm) {
            if (olm.a) {
                throw new olm(olm);
            }
            throw olm;
        }
    }
    
    public static ole w(final ole ole) {
        final int size = ole.size();
        int n;
        if (size == 0) {
            n = 10;
        }
        else {
            n = size + size;
        }
        return ole.f(n);
    }
    
    public static olf x() {
        return okz.b;
    }
    
    public static olf y(final olf olf) {
        final int size = olf.size();
        int n;
        if (size == 0) {
            n = 10;
        }
        else {
            n = size + size;
        }
        return olf.f(n);
    }
    
    public static oli z() {
        return oly.b;
    }
    
    @Override
    public final omp D() {
        return (omp)this.H(7);
    }
    
    public final Object H(final int n) {
        return this.a(n, null);
    }
    
    protected abstract Object a(final int p0, final Object p1);
    
    @Override
    public final void aT(final okg okg) {
        final omy b = omr.a.b(this);
        final okh f = okg.f;
        okh okh;
        if (f != null) {
            okh = f;
        }
        else {
            okh = new okh(okg);
        }
        b.l(this, okh);
    }
    
    @Override
    public final int c() {
        return this.aB;
    }
    
    @Override
    public final void e(final int ab) {
        this.aB = ab;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o != null && this.getClass() == o.getClass() && omr.a.b(this).j(this, o));
    }
    
    @Override
    public final int hashCode() {
        final int ay = this.ay;
        if (ay != 0) {
            return ay;
        }
        return this.ay = omr.a.b(this).b(this);
    }
    
    @Override
    public final int k() {
        int ab;
        if ((ab = this.aB) == -1) {
            ab = omr.a.b(this).a(this);
            this.aB = ab;
        }
        return ab;
    }
    
    public final okt m() {
        return (okt)this.H(5);
    }
    
    @Override
    public final boolean n() {
        final boolean booleanValue = Boolean.TRUE;
        boolean k = true;
        final byte byteValue = (byte)this.H(1);
        if (byteValue != 1) {
            if (byteValue == 0) {
                k = false;
            }
            else {
                k = omr.a.b(this).k(this);
                if (booleanValue) {
                    Object o;
                    if (!k) {
                        o = null;
                    }
                    else {
                        o = this;
                    }
                    this.a(2, o);
                    return k;
                }
            }
        }
        return k;
    }
    
    @Override
    public final String toString() {
        final String string = super.toString();
        final StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        phn.m(this, sb, 0);
        return sb.toString();
    }
}
