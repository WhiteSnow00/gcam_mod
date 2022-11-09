import java.nio.ByteBuffer;
import java.util.Map;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.LinkedHashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pjv
{
    public static final pjl a(final plc plc, final Object o, final pjl pjl) {
        pjl c;
        if (plc instanceof pjw) {
            c = ((pjw)plc).c(o, pjl);
        }
        else {
            final pjq d = pjl.d();
            if (d == pjr.a) {
                c = new pjt(pjl, plc, o);
            }
            else {
                c = new pju(pjl, d, plc, o);
            }
        }
        return c;
    }
    
    public static final pjl b(pjl c) {
        c.getClass();
        pjl pjl;
        if (!(c instanceof pjy)) {
            pjl = null;
        }
        else {
            pjl = c;
        }
        final pjy pjy = (pjy)pjl;
        if (pjy != null && (c = pjy.c) == null) {
            final pjm pjm = (pjm)pjy.d().b(pjm.a);
            if (pjm != null) {
                c = pjm.f(pjy);
            }
            else {
                c = pjy;
            }
            pjy.c = c;
        }
        return c;
    }
    
    public static Object c(final pjn pjn, final Object o, final plc plc) {
        return plc.a(o, pjn);
    }
    
    public static pjn d(final pjn pjn, final pjo pjo) {
        if (plr.b(pjn.c(), pjo)) {
            return pjn;
        }
        return null;
    }
    
    public static pjq e(final pjn pjn, final pjo pjo) {
        Object a = pjn;
        if (plr.b(pjn.c(), pjo)) {
            a = pjr.a;
        }
        return (pjq)a;
    }
    
    public static pjq f(final pjn pjn, final pjq pjq) {
        pjq.getClass();
        return g(pjn, pjq);
    }
    
    public static pjq g(final pjq pjq, final pjq pjq2) {
        pjq2.getClass();
        if (pjq2 == pjr.a) {
            return pjq;
        }
        return (pjq)pjq2.a(pjq, pjp.a);
    }
    
    public static int h(final int n) {
        if (n < 3) {
            return n + 1;
        }
        if (n < 1073741824) {
            return (int)(n / 0.75f + 1.0f);
        }
        return Integer.MAX_VALUE;
    }
    
    public static LinkedHashMap i(final int n) {
        return new LinkedHashMap(h(n));
    }
    
    public static List j(final int n) {
        if (n == 0) {
            return Collections.emptyList();
        }
        return new ArrayList(n);
    }
    
    public static final oup k(final LinkedHashMap linkedHashMap) {
        return new oup(linkedHashMap);
    }
    
    public static final void l(final Object o, final pii pii, final LinkedHashMap linkedHashMap) {
        o.getClass();
        pii.getClass();
        linkedHashMap.put(o, pii);
    }
    
    public static final String m(final ByteBuffer byteBuffer, int i, int j) {
        if ((i | j | byteBuffer.limit() - i - j) >= 0) {
            final int n = i + j;
            final char[] array = new char[j];
            j = 0;
            while (i < n) {
                final byte value = byteBuffer.get(i);
                if (!u(value)) {
                    break;
                }
                ++i;
                r(value, array, j);
                ++j;
            }
            final int n2 = j;
            j = i;
            i = n2;
            while (j < n) {
                final int n3 = j + 1;
                final byte value2 = byteBuffer.get(j);
                if (u(value2)) {
                    r(value2, array, i);
                    j = n3;
                    ++i;
                    while (j < n) {
                        final byte value3 = byteBuffer.get(j);
                        if (!u(value3)) {
                            break;
                        }
                        ++j;
                        r(value3, array, i);
                        ++i;
                    }
                }
                else if (w(value2)) {
                    if (n3 >= n) {
                        throw olm.d();
                    }
                    t(value2, byteBuffer.get(n3), array, i);
                    j = n3 + 1;
                    ++i;
                }
                else if (v(value2)) {
                    if (n3 >= n - 1) {
                        throw olm.d();
                    }
                    j = n3 + 1;
                    s(value2, byteBuffer.get(n3), byteBuffer.get(j), array, i);
                    ++j;
                    ++i;
                }
                else {
                    if (n3 >= n - 2) {
                        throw olm.d();
                    }
                    final int n4 = n3 + 1;
                    j = n4 + 1;
                    q(value2, byteBuffer.get(n3), byteBuffer.get(n4), byteBuffer.get(j), array, i);
                    i += 2;
                    ++j;
                }
            }
            return new String(array, 0, i);
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", byteBuffer.limit(), i, j));
    }
    
    public static String n(final byte[] array, int n, int i) {
        final int length = array.length;
        if ((n | i | length - n - i) >= 0) {
            final int n2 = n + i;
            final char[] array2 = new char[i];
            final int n3 = 0;
            i = n;
            n = n3;
            while (i < n2) {
                final byte b = array[i];
                if (!u(b)) {
                    break;
                }
                ++i;
                r(b, array2, n);
                ++n;
            }
            while (i < n2) {
                final int n4 = i + 1;
                final byte b2 = array[i];
                if (u(b2)) {
                    r(b2, array2, n);
                    i = n4;
                    ++n;
                    while (i < n2) {
                        final byte b3 = array[i];
                        if (!u(b3)) {
                            break;
                        }
                        ++i;
                        r(b3, array2, n);
                        ++n;
                    }
                }
                else if (w(b2)) {
                    if (n4 >= n2) {
                        throw olm.d();
                    }
                    t(b2, array[n4], array2, n);
                    i = n4 + 1;
                    ++n;
                }
                else if (v(b2)) {
                    if (n4 >= n2 - 1) {
                        throw olm.d();
                    }
                    i = n4 + 1;
                    s(b2, array[n4], array[i], array2, n);
                    ++i;
                    ++n;
                }
                else {
                    if (n4 >= n2 - 2) {
                        throw olm.d();
                    }
                    final int n5 = n4 + 1;
                    i = n5 + 1;
                    q(b2, array[n4], array[n5], array[i], array2, n);
                    n += 2;
                    ++i;
                }
            }
            return new String(array2, 0, n);
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", length, n, i));
    }
    
    public static int o(int i, final byte[] array, int n, final int n2) {
        final int n3 = 0;
        if (i != 0) {
            if (n >= n2) {
                return i;
            }
            final byte b = (byte)i;
            if (b < -32) {
                if (b < -62 || array[n] > -65) {
                    return -1;
                }
                ++n;
            }
            else if (b < -16) {
                final int n4 = (byte)~(i >> 8);
                if (n4 == 0) {
                    i = n + 1;
                    n = array[n];
                    if (i >= n2) {
                        return onu.c(b, n);
                    }
                }
                else {
                    i = n;
                    n = n4;
                }
                if (n > -65 || (b == -32 && n < -96) || (b == -19 && n >= -96) || array[i] > -65) {
                    return -1;
                }
                n = i + 1;
            }
            else {
                byte b2 = (byte)~(i >> 8);
                if (b2 == 0) {
                    i = n + 1;
                    b2 = array[n];
                    if (i >= n2) {
                        return onu.c(b, b2);
                    }
                    n = i;
                    i = 0;
                }
                else {
                    i >>= 16;
                }
                int n5;
                if (i == 0) {
                    i = n + 1;
                    n = array[n];
                    if (i >= n2) {
                        return onu.d(b, b2, n);
                    }
                    n5 = i;
                }
                else {
                    n5 = n;
                    n = i;
                }
                if (b2 > -65 || (b << 28) + (b2 + 112) >> 30 != 0 || n > -65 || array[n5] > -65) {
                    return -1;
                }
                n = n5 + 1;
            }
        }
        while (n < n2 && array[n] >= 0) {
            ++n;
        }
        if ((i = n) < n2) {
            while (i < n2) {
                n = i + 1;
                i = array[i];
                if (i < 0) {
                    if (i < -32) {
                        if (n < n2) {
                            if (i >= -62) {
                                i = n + 1;
                                if (array[n] <= -65) {
                                    continue;
                                }
                            }
                            i = -1;
                            return i;
                        }
                        return i;
                    }
                    else if (i < -16) {
                        if (n >= n2 - 1) {
                            i = onu.e(array, n, n2);
                            return i;
                        }
                        final int n6 = n + 1;
                        n = array[n];
                        if (n <= -65 && (i != -32 || n >= -96) && (i != -19 || n < -96)) {
                            i = n6 + 1;
                            if (array[n6] <= -65) {
                                continue;
                            }
                        }
                        i = -1;
                        return i;
                    }
                    else {
                        if (n >= n2 - 2) {
                            i = onu.e(array, n, n2);
                            return i;
                        }
                        final int n7 = n + 1;
                        n = array[n];
                        if (n <= -65 && (i << 28) + (n + 112) >> 30 == 0) {
                            n = n7 + 1;
                            if (array[n7] <= -65) {
                                i = n + 1;
                                if (array[n] <= -65) {
                                    continue;
                                }
                            }
                        }
                        i = -1;
                        return i;
                    }
                }
                else {
                    i = n;
                }
            }
        }
        i = n3;
        return i;
    }
    
    public static final boolean p(final byte[] array, final int n, final int n2) {
        return o(0, array, n, n2) == 0;
    }
    
    public static void q(final byte b, final byte b2, final byte b3, final byte b4, final char[] array, final int n) {
        if (!y(b2) && (b << 28) + (b2 + 112) >> 30 == 0 && !y(b3) && !y(b4)) {
            final int n2 = (b & 0x7) << 18 | x(b2) << 12 | x(b3) << 6 | x(b4);
            array[n] = (char)((n2 >>> 10) + 55232);
            array[n + 1] = (char)((n2 & 0x3FF) + 56320);
            return;
        }
        throw olm.d();
    }
    
    public static void r(final byte b, final char[] array, final int n) {
        array[n] = (char)b;
    }
    
    public static void s(final byte b, final byte b2, final byte b3, final char[] array, final int n) {
        if (!y(b2)) {
            int n2;
            if ((n2 = b) == -32) {
                if (b2 < -96) {
                    throw olm.d();
                }
                n2 = -32;
            }
            int n3;
            if ((n3 = n2) == -19) {
                if (b2 >= -96) {
                    throw olm.d();
                }
                n3 = -19;
            }
            if (!y(b3)) {
                array[n] = (char)((n3 & 0xF) << 12 | x(b2) << 6 | x(b3));
                return;
            }
        }
        throw olm.d();
    }
    
    public static void t(final byte b, final byte b2, final char[] array, final int n) {
        if (b >= -62 && !y(b2)) {
            array[n] = (char)((b & 0x1F) << 6 | x(b2));
            return;
        }
        throw olm.d();
    }
    
    public static boolean u(final byte b) {
        return b >= 0;
    }
    
    public static boolean v(final byte b) {
        return b < -16;
    }
    
    public static boolean w(final byte b) {
        return b < -32;
    }
    
    private static int x(final byte b) {
        return b & 0x3F;
    }
    
    private static boolean y(final byte b) {
        return b > -65;
    }
}
