import java.io.IOException;
import java.io.File;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public class och
{
    public static float c(final float n, final float n2, final float n3) {
        if (n2 <= n3) {
            return Math.min(Math.max(n, n2), n3);
        }
        throw new IllegalArgumentException(njo.b("min (%s) must be less than or equal to max (%s)", n2, n3));
    }
    
    public static float d(final float... array) {
        final int length = array.length;
        int i = 1;
        njo.d(length > 0);
        float min = array[0];
        while (i < array.length) {
            min = Math.min(min, array[i]);
            ++i;
        }
        return min;
    }
    
    public static int e(final float[] array, final float n, int i, final int n2) {
        while (i < n2) {
            if (array[i] == n) {
                return i;
            }
            ++i;
        }
        return -1;
    }
    
    public static List f(final float... array) {
        final int length = array.length;
        if (length == 0) {
            return Collections.emptyList();
        }
        return new ocg(array, 0, length);
    }
    
    public static float[] g(final Collection collection) {
        if (collection instanceof ocg) {
            final ocg ocg = (ocg)collection;
            return Arrays.copyOfRange(ocg.a, ocg.b, ocg.c);
        }
        final Object[] array = collection.toArray();
        final int length = array.length;
        final float[] array2 = new float[length];
        for (int i = 0; i < length; ++i) {
            final Object o = array[i];
            o.getClass();
            array2[i] = ((Number)o).floatValue();
        }
        return array2;
    }
    
    public static void h(final boolean b, final String s, final long n, final long n2) {
        if (b) {
            return;
        }
        final StringBuilder sb = new StringBuilder(s.length() + 54);
        sb.append("overflow: ");
        sb.append(s);
        sb.append("(");
        sb.append(n);
        sb.append(", ");
        sb.append(n2);
        sb.append(")");
        throw new ArithmeticException(sb.toString());
    }
    
    public static void i(final boolean b) {
        if (b) {
            return;
        }
        throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
    }
    
    public static long j(final long n, final long n2) {
        final long n3 = n + n2;
        boolean b = true;
        final boolean b2 = (n ^ n2) < 0L;
        if ((n ^ n3) < 0L) {
            b = false;
        }
        h(b2 | b, "checkedAdd", n, n2);
        return n3;
    }
    
    public static long k(final long n, final long n2) {
        final int n3 = Long.numberOfLeadingZeros(n) + Long.numberOfLeadingZeros(~n) + Long.numberOfLeadingZeros(n2) + Long.numberOfLeadingZeros(-1L ^ n2);
        if (n3 > 65) {
            return n * n2;
        }
        h(n3 >= 64, "checkedMultiply", n, n2);
        h(true, "checkedMultiply", n, n2);
        final long n4 = n * n2;
        h(n == 0L || n4 / n == n2, "checkedMultiply", n, n2);
        return n4;
    }
    
    public static long l(final long n, final long n2) {
        final long n3 = n - n2;
        boolean b = true;
        final boolean b2 = (n ^ n2) >= 0L;
        if ((n ^ n3) < 0L) {
            b = false;
        }
        h(b2 | b, "checkedSubtract", n, n2);
        return n3;
    }
    
    public static int m(final int n, final int n2) {
        final long n3 = n - (long)n2;
        final int n4 = (int)n3;
        if (n3 == n4) {
            return n4;
        }
        final StringBuilder sb = new StringBuilder(51);
        sb.append("overflow: checkedSubtract(");
        sb.append(n);
        sb.append(", ");
        sb.append(n2);
        sb.append(")");
        throw new ArithmeticException(sb.toString());
    }
    
    public static int n(int abs, final int n, final RoundingMode roundingMode) {
        roundingMode.getClass();
        if (n == 0) {
            throw new ArithmeticException("/ by zero");
        }
        final int n2 = abs / n;
        final int n3 = abs - n * n2;
        if (n3 == 0) {
            return n2;
        }
        final int n4 = 1;
        final int n5 = (abs ^ n) >> 31 | 0x1;
        Label_0188: {
            Label_0186: {
                switch (ocf.a[roundingMode.ordinal()]) {
                    default: {
                        throw new AssertionError();
                    }
                    case 6:
                    case 7:
                    case 8: {
                        abs = Math.abs(n3);
                        abs -= Math.abs(n) - abs;
                        if (abs == 0) {
                            if (roundingMode == RoundingMode.HALF_UP) {
                                break;
                            }
                            if (roundingMode == RoundingMode.HALF_EVEN) {
                                abs = 1;
                            }
                            else {
                                abs = 0;
                            }
                            if ((abs & (n2 & 0x1)) != 0x0) {
                                break;
                            }
                            break Label_0186;
                        }
                        else {
                            if (abs > 0) {
                                break;
                            }
                            break Label_0186;
                        }
                        break;
                    }
                    case 5: {
                        if (n5 > 0) {
                            break;
                        }
                        abs = 0;
                        break Label_0188;
                    }
                    case 3: {
                        if (n5 < 0) {
                            break;
                        }
                        break Label_0186;
                    }
                    case 4: {
                        return n2 + n5;
                    }
                    case 1: {
                        i(false);
                    }
                    case 2: {
                        return n2;
                    }
                }
                abs = n4;
                break Label_0188;
            }
            abs = 0;
        }
        if (abs != 0) {
            return n2 + n5;
        }
        return n2;
    }
    
    public static int o(final int n, final RoundingMode roundingMode) {
        if (n <= 0) {
            final StringBuilder sb = new StringBuilder(27);
            sb.append("x (");
            sb.append(n);
            sb.append(") must be > 0");
            throw new IllegalArgumentException(sb.toString());
        }
        switch (ocf.a[roundingMode.ordinal()]) {
            default: {
                throw new AssertionError();
            }
            case 6:
            case 7:
            case 8: {
                final int numberOfLeadingZeros = Integer.numberOfLeadingZeros(n);
                return 31 - numberOfLeadingZeros + ((-1257966797 >>> numberOfLeadingZeros) - n >>> 31);
            }
            case 4:
            case 5: {
                return 32 - Integer.numberOfLeadingZeros(n - 1);
            }
            case 1: {
                i((n - 1 & n) == 0x0);
            }
            case 2:
            case 3: {
                return 31 - Integer.numberOfLeadingZeros(n);
            }
        }
    }
    
    public static int[] p() {
        return new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    }
    
    public static String q(final int n) {
        return Integer.toString(n - 1);
    }
    
    public static void r(final File file) {
        final File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile == null) {
            return;
        }
        parentFile.mkdirs();
        if (parentFile.isDirectory()) {
            return;
        }
        final String value = String.valueOf(file);
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 39);
        sb.append("Unable to create parent directories of ");
        sb.append(value);
        throw new IOException(sb.toString());
    }
    
    public static byte[] s(final File file) {
        return t(file).a();
    }
    
    public static ofi t(final File file) {
        return new nxd(file);
    }
}
