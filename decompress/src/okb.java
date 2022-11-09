import java.nio.ByteBuffer;
import java.io.InputStream;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class okb
{
    private static volatile int e;
    int a;
    final int b;
    okc c;
    
    static {
        okb.e = 100;
    }
    
    public okb() {
        this.b = okb.e;
    }
    
    public static int F(final int n) {
        return -(n & 0x1) ^ n >>> 1;
    }
    
    public static long G(final long n) {
        return -(n & 0x1L) ^ n >>> 1;
    }
    
    public static okb H(final InputStream inputStream) {
        okb j;
        if (inputStream == null) {
            j = J(olk.b);
        }
        else {
            j = new ojz(inputStream);
        }
        return j;
    }
    
    public static okb I(final ByteBuffer byteBuffer) {
        okb okb;
        if (byteBuffer.hasArray()) {
            okb = K(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
        }
        else if (byteBuffer.isDirect() && ons.a) {
            okb = new oka(byteBuffer);
        }
        else {
            final int remaining = byteBuffer.remaining();
            final byte[] array = new byte[remaining];
            byteBuffer.duplicate().get(array);
            okb = K(array, 0, remaining);
        }
        return okb;
    }
    
    public static okb J(final byte[] array) {
        return K(array, 0, array.length);
    }
    
    static okb K(final byte[] array, final int n, final int n2) {
        final ojx ojx = new ojx(array, n, n2);
        try {
            ojx.e(n2);
            return ojx;
        }
        catch (final olm olm) {
            throw new IllegalArgumentException(olm);
        }
    }
    
    public abstract void A(final int p0);
    
    public abstract boolean C();
    
    public abstract boolean D();
    
    public abstract boolean E(final int p0);
    
    public abstract double b();
    
    public abstract float c();
    
    public abstract int d();
    
    public abstract int e(final int p0);
    
    public abstract int f();
    
    public abstract int g();
    
    public abstract int h();
    
    public abstract int j();
    
    public abstract int k();
    
    public abstract int l();
    
    public abstract int m();
    
    public abstract int n();
    
    public abstract long o();
    
    public abstract long p();
    
    public abstract long t();
    
    public abstract long u();
    
    public abstract long v();
    
    public abstract ojw w();
    
    public abstract String x();
    
    public abstract String y();
    
    public abstract void z(final int p0);
}
