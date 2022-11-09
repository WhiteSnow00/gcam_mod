import java.nio.ByteBuffer;
import java.nio.charset.Charset;

// 
// Decompiled by Procyon v0.6.0
// 

public final class olk
{
    static final Charset a;
    public static final byte[] b;
    public static final ByteBuffer c;
    
    static {
        a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        final byte[] array = b = new byte[0];
        c = ByteBuffer.wrap(array);
        okb.J(array);
    }
    
    public static int a(final boolean b) {
        if (b) {
            return 1231;
        }
        return 1237;
    }
    
    public static int b(final byte[] array) {
        final int length = array.length;
        int d;
        if ((d = d(length, array, 0, length)) == 0) {
            d = 1;
        }
        return d;
    }
    
    public static int c(final long n) {
        return (int)(n ^ n >>> 32);
    }
    
    static int d(int i, final byte[] array, final int n, final int n2) {
        int n3 = i;
        for (i = n; i < n + n2; ++i) {
            n3 = n3 * 31 + array[i];
        }
        return n3;
    }
    
    static Object e(final Object o, final Object o2) {
        return ((omj)o).bH().c((omj)o2).k();
    }
    
    public static String f(final byte[] array) {
        return new String(array, olk.a);
    }
    
    public static boolean g(final byte[] array) {
        final pjv a = onu.a;
        return pjv.p(array, 0, array.length);
    }
    
    static void h(final Object o) {
        if (o != null) {
            return;
        }
        throw null;
    }
    
    static void i(final Object o, final String s) {
        if (o != null) {
            return;
        }
        throw new NullPointerException(s);
    }
    
    static void j(final omj omj) {
        if (!(omj instanceof ojh)) {
            return;
        }
        final ojh ojh = (ojh)omj;
        throw null;
    }
}
