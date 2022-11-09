import com.google.googlex.gcam.GcamModuleJNI;
import com.google.googlex.gcam.ShotMetadata;
import java.util.Map;
import java.util.concurrent.Future;

// 
// Decompiled by Procyon v0.6.0
// 

public final class okn
{
    public static int A(final int n) {
        switch (n) {
            default: {
                return 0;
            }
            case 3: {
                return 4;
            }
            case 2: {
                return 3;
            }
            case 1: {
                return 2;
            }
            case 0: {
                return 1;
            }
        }
    }
    
    public static int B(final int n) {
        switch (n) {
            default: {
                return 0;
            }
            case 6: {
                return 7;
            }
            case 5: {
                return 6;
            }
            case 4: {
                return 5;
            }
            case 3: {
                return 4;
            }
            case 2: {
                return 3;
            }
            case 1: {
                return 2;
            }
            case 0: {
                return 1;
            }
        }
    }
    
    public static Object C(final Future future) {
        int n = 0;
        while (true) {
            try {
                final Object value = future.get();
                if (n != 0) {
                    Thread.currentThread().interrupt();
                }
                return value;
            }
            catch (final InterruptedException ex) {
                n = 1;
                continue;
            }
            finally {
                if (n != 0) {
                    Thread.currentThread().interrupt();
                }
            }
            break;
        }
    }
    
    public static int a(final Map.Entry entry) {
        return entry.getKey().b;
    }
    
    public static okp b(final Object o) {
        return ((okw)o).f;
    }
    
    public static okp c(final Object o) {
        return ((okw)o).i();
    }
    
    public static void d(final omu omu, final Object o, final okm okm, final okp okp) {
        final okk okk = (okk)o;
        okp.l(okk.d, omu.t(okk.c.getClass(), okm));
    }
    
    public static void e(final okh okh, final Map.Entry entry) {
        final okx okx = entry.getKey();
        final onv a = onv.a;
        switch (okx.c.ordinal()) {
            default: {
                return;
            }
            case 17: {
                okh.p(okx.b, (long)entry.getValue());
                return;
            }
            case 16: {
                okh.o(okx.b, (int)entry.getValue());
                return;
            }
            case 15: {
                okh.n(okx.b, (long)entry.getValue());
                return;
            }
            case 14: {
                okh.m(okx.b, (int)entry.getValue());
                return;
            }
            case 13: {
                okh.i(okx.b, (int)entry.getValue());
                return;
            }
            case 12: {
                okh.r(okx.b, (int)entry.getValue());
                return;
            }
            case 11: {
                okh.b(okx.b, (ojw)entry.getValue());
                return;
            }
            case 10: {
                okh.k(okx.b, entry.getValue(), omr.a.a(entry.getValue().getClass()));
                return;
            }
            case 9: {
                okh.h(okx.b, entry.getValue(), omr.a.a(entry.getValue().getClass()));
                return;
            }
            case 8: {
                okh.q(okx.b, (String)entry.getValue());
                return;
            }
            case 7: {
                okh.a(okx.b, (boolean)entry.getValue());
                return;
            }
            case 6: {
                okh.e(okx.b, (int)entry.getValue());
                return;
            }
            case 5: {
                okh.f(okx.b, (long)entry.getValue());
                return;
            }
            case 4: {
                okh.i(okx.b, (int)entry.getValue());
                return;
            }
            case 3: {
                okh.s(okx.b, (long)entry.getValue());
                return;
            }
            case 2: {
                okh.j(okx.b, (long)entry.getValue());
                return;
            }
            case 1: {
                okh.g(okx.b, (float)entry.getValue());
                return;
            }
            case 0: {
                okh.c(okx.b, (double)entry.getValue());
            }
        }
    }
    
    public static final void f(final Object o) {
        b(o).e();
    }
    
    public static final ojw g(final okg okg, final byte[] array) {
        okg.ak();
        return new ojv(array);
    }
    
    static double h(final byte[] array, final int n) {
        return Double.longBitsToDouble(x(array, n));
    }
    
    static float i(final byte[] array, final int n) {
        return Float.intBitsToFloat(k(array, n));
    }
    
    static int j(final byte[] array, int a, final ojl ojl) {
        final int s = s(array, a, ojl);
        a = ojl.a;
        if (a < 0) {
            throw olm.f();
        }
        if (a > array.length - s) {
            throw olm.i();
        }
        if (a == 0) {
            ojl.c = ojw.b;
            return s;
        }
        ojl.c = ojw.u(array, s, a);
        return s + a;
    }
    
    static int k(final byte[] array, final int n) {
        return (array[n + 3] & 0xFF) << 24 | ((array[n] & 0xFF) | (array[n + 1] & 0xFF) << 8 | (array[n + 2] & 0xFF) << 16);
    }
    
    static int l(final omy omy, final byte[] array, int c, final int n, final int n2, final ojl ojl) {
        final oml oml = (oml)omy;
        final Object e = oml.e();
        c = oml.c(e, array, c, n, n2, ojl);
        oml.f(e);
        ojl.c = e;
        return c;
    }
    
    static int m(final omy omy, final byte[] array, int t, int n, final ojl ojl) {
        final int n2 = t + 1;
        final byte b = array[t];
        int a;
        if (b < 0) {
            t = t(b, array, n2, ojl);
            a = ojl.a;
        }
        else {
            t = n2;
            a = b;
        }
        if (a >= 0 && a <= n - t) {
            final Object e = omy.e();
            n = a + t;
            omy.i(e, array, t, n, ojl);
            omy.f(e);
            ojl.c = e;
            return n;
        }
        throw olm.i();
    }
    
    static int n(final omy omy, final int n, final byte[] array, int i, final int n2, final olj olj, final ojl ojl) {
        i = m(omy, array, i, n2, ojl);
        olj.add(ojl.c);
        while (i < n2) {
            final int s = s(array, i, ojl);
            if (n != ojl.a) {
                break;
            }
            i = m(omy, array, s, n2, ojl);
            olj.add(ojl.c);
        }
        return i;
    }
    
    static int o(final byte[] array, int i, final olj olj, final ojl ojl) {
        final okz okz = (okz)olj;
        i = s(array, i, ojl);
        final int n = ojl.a + i;
        while (i < n) {
            i = s(array, i, ojl);
            okz.g(ojl.a);
        }
        if (i == n) {
            return i;
        }
        throw olm.i();
    }
    
    static int p(final byte[] array, int a, final ojl ojl) {
        final int s = s(array, a, ojl);
        a = ojl.a;
        if (a < 0) {
            throw olm.f();
        }
        if (a == 0) {
            ojl.c = "";
            return s;
        }
        ojl.c = new String(array, s, a, olk.a);
        return s + a;
    }
    
    static int q(final byte[] array, int s, final ojl ojl) {
        s = s(array, s, ojl);
        final int a = ojl.a;
        if (a < 0) {
            throw olm.f();
        }
        if (a == 0) {
            ojl.c = "";
            return s;
        }
        ojl.c = onu.g(array, s, a);
        return s + a;
    }
    
    static int r(final int n, final byte[] array, int n2, int a, final onk onk, final ojl ojl) {
        if (onx.a(n) == 0) {
            throw olm.c();
        }
        switch (onx.b(n)) {
            default: {
                throw olm.c();
            }
            case 5: {
                onk.e(n, k(array, n2));
                return n2 + 4;
            }
            case 3: {
                final int n3 = (n & 0xFFFFFFF8) | 0x4;
                final onk c = onk.c();
                final int n4 = 0;
                int i;
                for (i = n2, n2 = n4; i < a; i = r(n2, array, i, a, c, ojl)) {
                    i = s(array, i, ojl);
                    n2 = ojl.a;
                    if (n2 == n3) {
                        break;
                    }
                }
                if (i <= a && n2 == n3) {
                    onk.e(n, c);
                    return i;
                }
                throw olm.g();
            }
            case 2: {
                n2 = s(array, n2, ojl);
                a = ojl.a;
                if (a < 0) {
                    throw olm.f();
                }
                if (a <= array.length - n2) {
                    if (a == 0) {
                        onk.e(n, ojw.b);
                    }
                    else {
                        onk.e(n, ojw.u(array, n2, a));
                    }
                    return n2 + a;
                }
                throw olm.i();
            }
            case 1: {
                onk.e(n, x(array, n2));
                return n2 + 8;
            }
            case 0: {
                n2 = v(array, n2, ojl);
                onk.e(n, ojl.b);
                return n2;
            }
        }
    }
    
    static int s(final byte[] array, int a, final ojl ojl) {
        final int n = a + 1;
        a = array[a];
        if (a >= 0) {
            ojl.a = a;
            return n;
        }
        return t(a, array, n, ojl);
    }
    
    static int t(int n, final byte[] array, int n2, final ojl ojl) {
        final int n3 = n & 0x7F;
        n = n2 + 1;
        n2 = array[n2];
        if (n2 >= 0) {
            ojl.a = (n3 | n2 << 7);
            return n;
        }
        n2 = (n3 | (n2 & 0x7F) << 7);
        final int n4 = n + 1;
        n = array[n];
        if (n >= 0) {
            ojl.a = (n2 | n << 14);
            return n4;
        }
        n = (n2 | (n & 0x7F) << 14);
        n2 = n4 + 1;
        final byte b = array[n4];
        if (b >= 0) {
            ojl.a = (n | b << 21);
            return n2;
        }
        final int n5 = n | (b & 0x7F) << 21;
        n = n2 + 1;
        final byte b2 = array[n2];
        if (b2 >= 0) {
            ojl.a = (n5 | b2 << 28);
            return n;
        }
        while (true) {
            n2 = n + 1;
            if (array[n] >= 0) {
                break;
            }
            n = n2;
        }
        ojl.a = (n5 | (b2 & 0x7F) << 28);
        return n2;
    }
    
    static int u(final int n, final byte[] array, int i, final int n2, final olj olj, final ojl ojl) {
        final okz okz = (okz)olj;
        i = s(array, i, ojl);
        okz.g(ojl.a);
        while (i < n2) {
            final int s = s(array, i, ojl);
            if (n != ojl.a) {
                break;
            }
            i = s(array, s, ojl);
            okz.g(ojl.a);
        }
        return i;
    }
    
    static int v(final byte[] array, int n, final ojl ojl) {
        final int n2 = n + 1;
        final long b = array[n];
        if (b < 0L) {
            n = n2 + 1;
            byte b2 = array[n2];
            long b3 = (b & 0x7FL) | (long)(b2 & 0x7F) << 7;
            for (int n3 = 7; b2 < 0; b2 = array[n], n3 += 7, b3 |= (long)(b2 & 0x7F) << n3, ++n) {}
            ojl.b = b3;
            return n;
        }
        ojl.b = b;
        return n2;
    }
    
    static int w(int a, final byte[] array, int i, final int n, final ojl ojl) {
        if (onx.a(a) == 0) {
            throw olm.c();
        }
        switch (onx.b(a)) {
            default: {
                throw olm.c();
            }
            case 5: {
                return i + 4;
            }
            case 3: {
                final int n2 = (a & 0xFFFFFFF8) | 0x4;
                for (a = 0; i < n; i = w(a, array, i, n, ojl)) {
                    i = s(array, i, ojl);
                    a = ojl.a;
                    if (a == n2) {
                        break;
                    }
                }
                if (i <= n && a == n2) {
                    return i;
                }
                throw olm.g();
            }
            case 2: {
                return s(array, i, ojl) + ojl.a;
            }
            case 1: {
                return i + 8;
            }
            case 0: {
                return v(array, i, ojl);
            }
        }
    }
    
    static long x(final byte[] array, final int n) {
        return ((long)array[n + 7] & 0xFFL) << 56 | (((long)array[n] & 0xFFL) | ((long)array[n + 1] & 0xFFL) << 8 | ((long)array[n + 2] & 0xFFL) << 16 | ((long)array[n + 3] & 0xFFL) << 24 | ((long)array[n + 4] & 0xFFL) << 32 | ((long)array[n + 5] & 0xFFL) << 40 | ((long)array[n + 6] & 0xFFL) << 48);
    }
    
    public static int y(final int n) {
        switch (n) {
            default: {
                return 0;
            }
            case 2: {
                return 4;
            }
            case 1: {
                return 3;
            }
            case 0: {
                return 2;
            }
        }
    }
    
    public static void z(final ShotMetadata shotMetadata) {
        GcamModuleJNI.RotateShotMetadata__SWIG_1(ShotMetadata.c(shotMetadata), shotMetadata, 60);
    }
}
