import android.os.Looper;
import android.content.Context;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Locale;

// 
// Decompiled by Procyon v0.6.0
// 

public class lio
{
    public static String c(final lim lim) {
        if (lim == null) {
            return "-";
        }
        if (lim instanceof lij) {
            return Long.toString(((lij)lim).a);
        }
        if (lim instanceof lik) {
            final lik lik = (lik)lim;
            return String.format(Locale.ROOT, "n: %6.6s, min: %12.12s, max: %12.12s, mean: %12.12s, last: %12.12s", Long.toString((long)lik.a), n(lik.b), n(lik.c), n(lik.d), n(lik.e));
        }
        return "-";
    }
    
    public static void d(final String s, final lht[] array, final lht[] array2) {
        if (Arrays.equals(array, array2)) {
            return;
        }
        final String string = Arrays.toString(array);
        final String string2 = Arrays.toString(array2);
        final StringBuilder sb = new StringBuilder(s.length() + 32 + String.valueOf(string).length() + String.valueOf(string2).length());
        sb.append(s);
        sb.append(" has: ");
        sb.append(string);
        sb.append(" which is different from: ");
        sb.append(string2);
        throw new IllegalArgumentException(sb.toString());
    }
    
    public static float e(final byte[] array, final int n) {
        return Float.intBitsToFloat(f(array, n));
    }
    
    public static int f(final byte[] array, final int n) {
        return (array[n + 3] & 0xFF) << 24 | ((array[n] & 0xFF) | (array[n + 1] & 0xFF) << 8 | (array[n + 2] & 0xFF) << 16);
    }
    
    public static long g(final byte[] array, final int n) {
        return (long)f(array, n + 12) & 0xFFFFFFFFL;
    }
    
    public static long h(final byte[] array, int n) {
        n += 16;
        return (array[n] & 0xFF) + ((long)(array[n + 1] & 0xFF) << 8) + ((long)(array[n + 2] & 0xFF) << 16) + ((long)(array[n + 3] & 0xFF) << 24) + ((long)(array[n + 4] & 0xFF) << 32) + ((long)(array[n + 5] & 0xFF) << 40) + ((long)(array[n + 6] & 0xFF) << 48) + ((long)(array[n + 7] & 0xFF) << 56);
    }
    
    public static String i(final ljx ljx) {
        return j(ljx.b(), ljx.d());
    }
    
    public static String j(final int n, final int n2) {
        final String f = lou.f(n);
        final StringBuilder sb = new StringBuilder(String.valueOf(f).length() + 12);
        sb.append(f);
        sb.append("w");
        sb.append(n2);
        return sb.toString();
    }
    
    public static jqx k(final jrf jrf, final jqw jqw) {
        final jrb jrb = new jrb(jqw);
        jrb.j(jrf);
        return new jqx(jrb);
    }
    
    public static String l(final int n) {
        switch (n) {
            default: {
                final StringBuilder sb = new StringBuilder(32);
                sb.append("unknown status code: ");
                sb.append(n);
                return sb.toString();
            }
            case 22: {
                return "RECONNECTION_TIMED_OUT";
            }
            case 21: {
                return "RECONNECTION_TIMED_OUT_DURING_UPDATE";
            }
            case 20: {
                return "CONNECTION_SUSPENDED_DURING_CALL";
            }
            case 19: {
                return "REMOTE_EXCEPTION";
            }
            case 18: {
                return "DEAD_CLIENT";
            }
            case 17: {
                return "API_NOT_CONNECTED";
            }
            case 16: {
                return "CANCELED";
            }
            case 15: {
                return "TIMEOUT";
            }
            case 14: {
                return "INTERRUPTED";
            }
            case 13: {
                return "ERROR";
            }
            case 10: {
                return "DEVELOPER_ERROR";
            }
            case 8: {
                return "INTERNAL_ERROR";
            }
            case 7: {
                return "NETWORK_ERROR";
            }
            case 6: {
                return "RESOLUTION_REQUIRED";
            }
            case 5: {
                return "INVALID_ACCOUNT";
            }
            case 4: {
                return "SIGN_IN_REQUIRED";
            }
            case 3: {
                return "SERVICE_DISABLED";
            }
            case 2: {
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            }
            case 0: {
                return "SUCCESS";
            }
            case -1: {
                return "SUCCESS_CACHE";
            }
        }
    }
    
    public static long m(final byte[] array) {
        final int length = array.length;
        long n = -7286425919675154353L;
        if (length <= 32) {
            if (length <= 16) {
                if (length >= 8) {
                    final long n2 = length + length - 7286425919675154353L;
                    final long n3 = q(array, 0) - 7286425919675154353L;
                    final long q = q(array, length - 8);
                    n = p(Long.rotateRight(q, 37) * n2 + n3, (Long.rotateRight(n3, 25) + q) * n2, n2);
                }
                else if (length >= 4) {
                    n = p(length + (((long)o(array, 0) & 0xFFFFFFFFL) << 3), (long)o(array, length - 4) & 0xFFFFFFFFL, length + length - 7286425919675154353L);
                }
                else if (length > 0) {
                    n = -7286425919675154353L * r(((array[0] & 0xFF) + ((array[length >> 1] & 0xFF) << 8)) * -7286425919675154353L ^ (length + ((array[length - 1] & 0xFF) << 2)) * -4348849565147123417L);
                }
            }
            else {
                final long n4 = length + length - 7286425919675154353L;
                final long n5 = q(array, 0) * -5435081209227447693L;
                final long q2 = q(array, 8);
                final long n6 = q(array, length - 8) * n4;
                n = p(Long.rotateRight(n5 + q2, 43) + Long.rotateRight(n6, 30) + q(array, length - 16) * -7286425919675154353L, n5 + Long.rotateRight(q2 - 7286425919675154353L, 18) + n6, n4);
            }
        }
        else if (length <= 64) {
            final long n7 = length + length - 7286425919675154353L;
            final long n8 = q(array, 0) * -7286425919675154353L;
            final long q3 = q(array, 8);
            final long n9 = q(array, length - 8) * n7;
            final long n10 = Long.rotateRight(n8 + q3, 43) + Long.rotateRight(n9, 30) + q(array, length - 16) * -7286425919675154353L;
            final long rotateRight = Long.rotateRight(q3 - 7286425919675154353L, 18);
            final long n11 = q(array, 16) * n7;
            final long q4 = q(array, 24);
            final long n12 = (n10 + q(array, length - 32)) * n7;
            n = p(Long.rotateRight(n11 + q4, 43) + Long.rotateRight(n12, 30) + (p(n10, rotateRight + n8 + n9, n7) + q(array, length - 24)) * n7, n11 + Long.rotateRight(q4 + n8, 18) + n12, n7);
        }
        else {
            long n13 = r(-7956866745689871395L) * -7286425919675154353L;
            final long[] array2 = new long[2];
            final long[] array3 = new long[2];
            long n14 = q(array, 0) + 95310865018149119L;
            final int n15 = length - 1;
            final int n16 = (n15 >> 6) * 64;
            final int n17 = n15 & 0x3F;
            final int n18 = n16 + n17 - 63;
            long n19 = 2480279821605975764L;
            int n20 = 0;
            long n21;
            long n22;
            while (true) {
                final long rotateRight2 = Long.rotateRight(n14 + n19 + array2[0] + q(array, n20 + 8), 37);
                final long rotateRight3 = Long.rotateRight(n19 + array2[1] + q(array, n20 + 48), 42);
                n21 = (rotateRight2 * -5435081209227447693L ^ array3[1]);
                n22 = rotateRight3 * -5435081209227447693L + (array2[0] + q(array, n20 + 40));
                n14 = Long.rotateRight(n13 + array3[0], 33) * -5435081209227447693L;
                s(array, n20, array2[1] * -5435081209227447693L, n21 + array3[0], array2);
                s(array, n20 + 32, n14 + array3[1], q(array, n20 + 16) + n22, array3);
                n20 += 64;
                if (n20 == n16) {
                    break;
                }
                n13 = n21;
                n19 = n22;
            }
            final long n23 = n21 & 0xFFL;
            final long n24 = -5435081209227447693L + (n23 + n23);
            final long n25 = array3[0] + n17;
            final long n26 = array2[0] + n25;
            array3[0] = n25 + (array2[0] = n26);
            final long rotateRight4 = Long.rotateRight(n14 + n22 + n26 + q(array, n18 + 8), 37);
            final long rotateRight5 = Long.rotateRight(n22 + array2[1] + q(array, n18 + 48), 42);
            final long n27 = rotateRight4 * n24 ^ array3[1] * 9L;
            final long n28 = rotateRight5 * n24 + (array2[0] * 9L + q(array, n18 + 40));
            final long n29 = Long.rotateRight(n21 + array3[0], 33) * n24;
            s(array, n18, array2[1] * n24, array3[0] + n27, array2);
            s(array, n18 + 32, n29 + array3[1], q(array, n18 + 16) + n28, array3);
            n = p(p(array2[0], array3[0], n24) + r(n28) * -4348849565147123417L + n27, p(array2[1], array3[1], n24) + n29, n24);
        }
        return n;
    }
    
    private static String n(final double n) {
        if (n <= 9.999999999E9 && n >= -9.99999999E8) {
            return String.format(Locale.ROOT, "%.4f", n);
        }
        return String.format(Locale.ROOT, "%.6e", n);
    }
    
    private static int o(final byte[] array, final int n) {
        return (array[n + 3] & 0xFF) << 24 | ((array[n] & 0xFF) | (array[n + 1] & 0xFF) << 8 | (array[n + 2] & 0xFF) << 16);
    }
    
    private static long p(long n, final long n2, final long n3) {
        n = (n ^ n2) * n3;
        n = (n ^ n >>> 47 ^ n2) * n3;
        return (n ^ n >>> 47) * n3;
    }
    
    private static long q(final byte[] array, final int n) {
        final ByteBuffer wrap = ByteBuffer.wrap(array, n, 8);
        wrap.order(ByteOrder.LITTLE_ENDIAN);
        return wrap.getLong();
    }
    
    private static long r(final long n) {
        return n ^ n >>> 47;
    }
    
    private static void s(final byte[] array, final int n, long n2, long rotateRight, final long[] array2) {
        final long q = q(array, n);
        final long q2 = q(array, n + 8);
        final long q3 = q(array, n + 16);
        final long q4 = q(array, n + 24);
        n2 += q;
        rotateRight = Long.rotateRight(rotateRight + n2 + q4, 21);
        final long n3 = q2 + n2 + q3;
        final long rotateRight2 = Long.rotateRight(n3, 44);
        array2[0] = n3 + q4;
        array2[1] = rotateRight + rotateRight2 + n2;
    }
    
    @Deprecated
    public jqo a(final Context context, final Looper looper, final juq juq, final Object o, final jqu jqu, final jqv jqv) {
        return this.b(context, looper, juq, o, jqu, jqv);
    }
    
    public jqo b(final Context context, final Looper looper, final juq juq, final Object o, final jsa jsa, final jtg jtg) {
        throw new UnsupportedOperationException("buildClient must be implemented");
    }
}
