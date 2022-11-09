import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.List;
import java.util.Arrays;
import java.lang.reflect.Field;
import sun.misc.Unsafe;

// 
// Decompiled by Procyon v0.6.0
// 

final class oml implements omy
{
    private static final int[] a;
    private static final Unsafe b;
    private final int[] c;
    private final Object[] d;
    private final int e;
    private final int f;
    private final omj g;
    private final boolean h;
    private final boolean i;
    private final boolean j;
    private final int[] k;
    private final int l;
    private final int m;
    private final olx n;
    private final pjf o;
    
    static {
        a = new int[0];
        b = ons.j();
    }
    
    private oml(final int[] c, final Object[] d, final int e, final int f, final omj g, final boolean j, final int[] k, final int l, final int m, final olx n, final pjf o, final okn okn, final byte[] array, final byte[] array2) {
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.i = (g instanceof oky);
        this.j = j;
        boolean h = false;
        if (okn != null && g instanceof okw) {
            h = true;
        }
        this.h = h;
        this.k = k;
        this.l = l;
        this.m = m;
        this.n = n;
        this.o = o;
        this.g = g;
    }
    
    private final int A(final int n, int i) {
        int n2 = this.c.length / 3 - 1;
        while (i <= n2) {
            final int n3 = n2 + i >>> 1;
            final int n4 = n3 * 3;
            final int s = this.s(n4);
            if (n == s) {
                return n4;
            }
            if (n < s) {
                n2 = n3 - 1;
            }
            else {
                i = n3 + 1;
            }
        }
        return -1;
    }
    
    private static int B(final int n) {
        return n >>> 20 & 0xFF;
    }
    
    private final int C(final int n) {
        return this.c[n + 1];
    }
    
    private static long D(final int n) {
        return n & 0xFFFFF;
    }
    
    private static long E(final Object o, final long n) {
        return (long)ons.h(o, n);
    }
    
    private final old F(int n) {
        n /= 3;
        return (old)this.d[n + n + 1];
    }
    
    private final omy G(int n) {
        n /= 3;
        n += n;
        final omy omy = (omy)this.d[n];
        if (omy != null) {
            return omy;
        }
        return (omy)(this.d[n] = omr.a.a((Class)this.d[n + 1]));
    }
    
    private final Object H(int n) {
        n /= 3;
        return this.d[n + n];
    }
    
    private static Field I(final Class clazz, final String s) {
        try {
            return clazz.getDeclaredField(s);
        }
        catch (final NoSuchFieldException ex) {
            final Field[] declaredFields = clazz.getDeclaredFields();
            for (final Field field : declaredFields) {
                if (s.equals(field.getName())) {
                    return field;
                }
            }
            final String name = clazz.getName();
            final String string = Arrays.toString(declaredFields);
            final StringBuilder sb = new StringBuilder(String.valueOf(s).length() + 40 + String.valueOf(name).length() + String.valueOf(string).length());
            sb.append("Field ");
            sb.append(s);
            sb.append(" for ");
            sb.append(name);
            sb.append(" not found. Known fields are ");
            sb.append(string);
            throw new RuntimeException(sb.toString());
        }
    }
    
    private static List J(final Object o, final long n) {
        return (List)ons.h(o, n);
    }
    
    private final void K(final Object o, Object h, final int n) {
        final long d = D(this.C(n));
        if (!this.R(h, n)) {
            return;
        }
        final Object h2 = ons.h(o, d);
        h = ons.h(h, d);
        if (h2 != null && h != null) {
            ons.u(o, d, olk.e(h2, h));
            this.N(o, n);
            return;
        }
        if (h != null) {
            ons.u(o, d, h);
            this.N(o, n);
        }
    }
    
    private final void L(final Object o, Object h, final int n) {
        final int c = this.C(n);
        final int s = this.s(n);
        final long d = D(c);
        if (!this.U(h, s, n)) {
            return;
        }
        Object h2;
        if (this.U(o, s, n)) {
            h2 = ons.h(o, d);
        }
        else {
            h2 = null;
        }
        h = ons.h(h, d);
        if (h2 != null && h != null) {
            ons.u(o, d, olk.e(h2, h));
            this.O(o, s, n);
            return;
        }
        if (h != null) {
            ons.u(o, d, h);
            this.O(o, s, n);
        }
    }
    
    private final void M(final Object o, final int n, final omu omu) {
        if (Q(n)) {
            ons.u(o, D(n), omu.x());
            return;
        }
        if (this.i) {
            ons.u(o, D(n), omu.v());
            return;
        }
        ons.u(o, D(n), omu.q());
    }
    
    private final void N(final Object o, int z) {
        z = this.z(z);
        final long n = 0xFFFFF & z;
        if (n == 1048575L) {
            return;
        }
        ons.s(o, n, 1 << (z >>> 20) | ons.d(o, n));
    }
    
    private final void O(final Object o, final int n, final int n2) {
        ons.s(o, this.z(n2) & 0xFFFFF, n);
    }
    
    private final boolean P(final Object o, final Object o2, final int n) {
        return this.R(o, n) == this.R(o2, n);
    }
    
    private static boolean Q(final int n) {
        return (n & 0x20000000) != 0x0;
    }
    
    private final boolean R(Object h, int c) {
        final int z = this.z(c);
        final long n = 0xFFFFF & z;
        if (n != 1048575L) {
            return (ons.d(h, n) & 1 << (z >>> 20)) != 0x0;
        }
        c = this.C(c);
        final long d = D(c);
        switch (B(c)) {
            default: {
                throw new IllegalArgumentException();
            }
            case 17: {
                return ons.h(h, d) != null;
            }
            case 16: {
                return ons.f(h, d) != 0L;
            }
            case 15: {
                return ons.d(h, d) != 0;
            }
            case 14: {
                return ons.f(h, d) != 0L;
            }
            case 13: {
                return ons.d(h, d) != 0;
            }
            case 12: {
                return ons.d(h, d) != 0;
            }
            case 11: {
                return ons.d(h, d) != 0;
            }
            case 10: {
                return !ojw.b.equals(ons.h(h, d));
            }
            case 9: {
                return ons.h(h, d) != null;
            }
            case 8: {
                h = ons.h(h, d);
                if (h instanceof String) {
                    return !((String)h).isEmpty();
                }
                if (h instanceof ojw) {
                    return !ojw.b.equals(h);
                }
                throw new IllegalArgumentException();
            }
            case 7: {
                return ons.w(h, d);
            }
            case 6: {
                return ons.d(h, d) != 0;
            }
            case 5: {
                return ons.f(h, d) != 0L;
            }
            case 4: {
                return ons.d(h, d) != 0;
            }
            case 3: {
                return ons.f(h, d) != 0L;
            }
            case 2: {
                return ons.f(h, d) != 0L;
            }
            case 1: {
                return ons.c(h, d) != 0.0f;
            }
            case 0: {
                return ons.b(h, d) != 0.0;
            }
        }
    }
    
    private final boolean S(final Object o, final int n, final int n2, final int n3, final int n4) {
        if (n2 == 1048575) {
            return this.R(o, n);
        }
        return (n3 & n4) != 0x0;
    }
    
    private static boolean T(final Object o, final int n, final omy omy) {
        return omy.k(ons.h(o, D(n)));
    }
    
    private final boolean U(final Object o, final int n, final int n2) {
        return ons.d(o, this.z(n2) & 0xFFFFF) == n;
    }
    
    private static boolean V(final Object o, final long n) {
        return (boolean)ons.h(o, n);
    }
    
    private static final int W(final byte[] array, int n, final int n2, final onv onv, final Class clazz, final ojl ojl) {
        final onv a = onv.a;
        switch (onv.ordinal()) {
            default: {
                throw new RuntimeException("unsupported field type.");
            }
            case 17: {
                n = okn.v(array, n, ojl);
                ojl.c = okb.G(ojl.b);
                break;
            }
            case 16: {
                n = okn.s(array, n, ojl);
                ojl.c = okb.F(ojl.a);
                break;
            }
            case 11: {
                n = okn.j(array, n, ojl);
                break;
            }
            case 10: {
                n = okn.m(omr.a.a(clazz), array, n, n2, ojl);
                break;
            }
            case 8: {
                n = okn.q(array, n, ojl);
                break;
            }
            case 7: {
                n = okn.v(array, n, ojl);
                ojl.c = (ojl.b != 0L);
                break;
            }
            case 6:
            case 14: {
                ojl.c = okn.k(array, n);
                n += 4;
                break;
            }
            case 5:
            case 15: {
                ojl.c = okn.x(array, n);
                n += 8;
                break;
            }
            case 4:
            case 12:
            case 13: {
                n = okn.s(array, n, ojl);
                ojl.c = ojl.a;
                break;
            }
            case 2:
            case 3: {
                n = okn.v(array, n, ojl);
                ojl.c = ojl.b;
                break;
            }
            case 1: {
                ojl.c = okn.i(array, n);
                n += 4;
                break;
            }
            case 0: {
                ojl.c = okn.h(array, n);
                n += 8;
                break;
            }
        }
        return n;
    }
    
    private final void X(final Object o, final byte[] array, int n, final int n2, final ojl ojl) {
        Unsafe b = oml.b;
        int i = n;
        int n3 = -1;
        int n4 = 0;
        n = 0;
        int n5 = 1048575;
        while (i < n2) {
            int t = i + 1;
            int a = array[i];
            if (a < 0) {
                t = okn.t(a, array, t, ojl);
                a = ojl.a;
            }
            final int n6 = a >>> 3;
            final int n7 = a & 0x7;
            int n8;
            if (n6 > n3) {
                n8 = this.y(n6, n4 / 3);
            }
            else {
                n8 = this.x(n6);
            }
            int w = 0;
            Label_1600: {
                if (n8 == -1) {
                    w = t;
                    n4 = 0;
                }
                else {
                    final int n9 = this.c[n8 + 1];
                    final int b2 = B(n9);
                    final long d = D(n9);
                    if (b2 <= 17) {
                        final int n10 = this.c[n8 + 2];
                        boolean b3 = true;
                        final int n11 = 1 << (n10 >>> 20);
                        final int n12 = n10 & 0xFFFFF;
                        int n13;
                        if (n12 != n5) {
                            if (n5 != 1048575) {
                                b.putInt(o, (long)n5, n);
                            }
                            if (n12 != 1048575) {
                                n = b.getInt(o, (long)n12);
                            }
                            n5 = n12;
                            n13 = n;
                        }
                        else {
                            n13 = n;
                        }
                        n = n8;
                        switch (b2) {
                            case 16: {
                                if (n7 == 0) {
                                    final int v = okn.v(array, t, ojl);
                                    b.putLong(o, d, okb.G(ojl.b));
                                    final int n14 = n13 | n11;
                                    final int n15 = n6;
                                    i = v;
                                    n3 = n15;
                                    n4 = n;
                                    n = n14;
                                    continue;
                                }
                                break;
                            }
                            case 15: {
                                if (n7 == 0) {
                                    final int s = okn.s(array, t, ojl);
                                    b.putInt(o, d, okb.F(ojl.a));
                                    final int n16 = n13 | n11;
                                    n3 = n6;
                                    i = s;
                                    n4 = n;
                                    n = n16;
                                    continue;
                                }
                                break;
                            }
                            case 12: {
                                if (n7 == 0) {
                                    final int s2 = okn.s(array, t, ojl);
                                    b.putInt(o, d, ojl.a);
                                    final int n17 = n13 | n11;
                                    n3 = n6;
                                    i = s2;
                                    n4 = n;
                                    n = n17;
                                    continue;
                                }
                                break;
                            }
                            case 10: {
                                if (n7 == 2) {
                                    final int j = okn.j(array, t, ojl);
                                    b.putObject(o, d, ojl.c);
                                    final int n18 = n13 | n11;
                                    n3 = n6;
                                    i = j;
                                    n4 = n;
                                    n = n18;
                                    continue;
                                }
                                break;
                            }
                            case 9: {
                                final int n19 = n;
                                if (n7 == 2) {
                                    final int m = okn.m(this.G(n19), array, t, n2, ojl);
                                    final Object object = b.getObject(o, d);
                                    if (object == null) {
                                        b.putObject(o, d, ojl.c);
                                    }
                                    else {
                                        b.putObject(o, d, olk.e(object, ojl.c));
                                    }
                                    final int n20 = n13 | n11;
                                    n = n6;
                                    n4 = n19;
                                    i = m;
                                    n3 = n;
                                    n = n20;
                                    continue;
                                }
                                break;
                            }
                            case 8: {
                                if (n7 == 2) {
                                    int n21;
                                    if ((n9 & 0x20000000) == 0x0) {
                                        n21 = okn.p(array, t, ojl);
                                    }
                                    else {
                                        n21 = okn.q(array, t, ojl);
                                    }
                                    b.putObject(o, d, ojl.c);
                                    final int n22 = n13 | n11;
                                    final int n23 = n6;
                                    i = n21;
                                    n3 = n23;
                                    n4 = n;
                                    n = n22;
                                    continue;
                                }
                                break;
                            }
                            case 7: {
                                if (n7 == 0) {
                                    final int v2 = okn.v(array, t, ojl);
                                    if (ojl.b == 0L) {
                                        b3 = false;
                                    }
                                    ons.m(o, d, b3);
                                    final int n24 = n13 | n11;
                                    n3 = n6;
                                    i = v2;
                                    n4 = n;
                                    n = n24;
                                    continue;
                                }
                                break;
                            }
                            case 6:
                            case 13: {
                                if (n7 == 5) {
                                    b.putInt(o, d, okn.k(array, t));
                                    final int n25 = t + 4;
                                    final int n26 = n13 | n11;
                                    n3 = n6;
                                    i = n25;
                                    n4 = n;
                                    n = n26;
                                    continue;
                                }
                                break;
                            }
                            case 5:
                            case 14: {
                                if (n7 == 1) {
                                    b.putLong(o, d, okn.x(array, t));
                                    final int n27 = t + 8;
                                    final int n28 = n13 | n11;
                                    n3 = n6;
                                    i = n27;
                                    n4 = n;
                                    n = n28;
                                    continue;
                                }
                                break;
                            }
                            case 4:
                            case 11: {
                                if (n7 == 0) {
                                    final int s3 = okn.s(array, t, ojl);
                                    b.putInt(o, d, ojl.a);
                                    final int n29 = n13 | n11;
                                    n3 = n6;
                                    i = s3;
                                    n4 = n;
                                    n = n29;
                                    continue;
                                }
                                break;
                            }
                            case 2:
                            case 3: {
                                if (n7 == 0) {
                                    final int v3 = okn.v(array, t, ojl);
                                    b.putLong(o, d, ojl.b);
                                    final int n30 = n13 | n11;
                                    final int n31 = v3;
                                    n3 = n6;
                                    i = n31;
                                    n4 = n;
                                    n = n30;
                                    continue;
                                }
                                break;
                            }
                            case 1: {
                                if (n7 == 5) {
                                    ons.r(o, d, okn.i(array, t));
                                    final int n32 = t + 4;
                                    final int n33 = n13 | n11;
                                    n3 = n6;
                                    i = n32;
                                    n4 = n;
                                    n = n33;
                                    continue;
                                }
                                break;
                            }
                            case 0: {
                                if (n7 == 1) {
                                    ons.q(o, d, okn.h(array, t));
                                    final int n34 = t + 8;
                                    final int n35 = n13 | n11;
                                    n3 = n6;
                                    i = n34;
                                    n4 = n;
                                    n = n35;
                                    continue;
                                }
                                break;
                            }
                        }
                        w = t;
                        final int n36 = n;
                        n = n13;
                        n4 = n36;
                    }
                    else {
                        final int n37 = n6;
                        if (b2 == 27) {
                            if (n7 == 2) {
                                final olj olj = (olj)b.getObject(o, d);
                                olj olj2;
                                if (!olj.c()) {
                                    final int size = olj.size();
                                    int n38;
                                    if (size == 0) {
                                        n38 = 10;
                                    }
                                    else {
                                        n38 = size + size;
                                    }
                                    final olj e = olj.e(n38);
                                    b.putObject(o, d, e);
                                    olj2 = e;
                                }
                                else {
                                    olj2 = olj;
                                }
                                i = okn.n(this.G(n8), a, array, t, n2, olj2, ojl);
                                n4 = n8;
                                n3 = n37;
                                continue;
                            }
                        }
                        else if (b2 <= 49) {
                            final long n39 = n9;
                            n4 = n8;
                            w = this.w(o, array, t, n2, a, n37, n7, n8, n39, b2, d, ojl);
                            if (w != t) {
                                i = w;
                                n3 = n37;
                                continue;
                            }
                            break Label_1600;
                        }
                        else {
                            final int n40 = t;
                            final int n41 = n;
                            final int n42 = n5;
                            final Unsafe unsafe = b;
                            final int n43 = n8;
                            if (b2 == 50) {
                                if (n7 == 2) {
                                    n = this.u(o, array, n40, n2, n43, d, ojl);
                                    if (n != n40) {
                                        n3 = n37;
                                        n5 = n42;
                                        b = unsafe;
                                        i = n;
                                        n4 = n43;
                                        n = n41;
                                        continue;
                                    }
                                    w = n;
                                    n = n41;
                                    n5 = n42;
                                    n4 = n43;
                                    b = unsafe;
                                    break Label_1600;
                                }
                            }
                            else {
                                n = this.v(o, array, n40, n2, a, n37, n7, n9, b2, d, n43, ojl);
                                if (n != n40) {
                                    n3 = n37;
                                    n5 = n42;
                                    b = unsafe;
                                    i = n;
                                    n4 = n43;
                                    n = n41;
                                    continue;
                                }
                                w = n;
                                n = n41;
                                n5 = n42;
                                b = unsafe;
                                n4 = n43;
                                break Label_1600;
                            }
                        }
                        n4 = n8;
                        w = t;
                    }
                }
            }
            final int r = okn.r(a, array, w, n2, d(o), ojl);
            n3 = n6;
            i = r;
        }
        if (n5 != 1048575) {
            b.putInt(o, (long)n5, n);
        }
        if (i == n2) {
            return;
        }
        throw olm.g();
    }
    
    private final void Y(final Object o, final okh okh) {
        Iterator d = null;
        Map.Entry entry = null;
        Label_0044: {
            if (this.h) {
                final okp b = okn.b(o);
                if (!b.h()) {
                    d = b.d();
                    entry = (Map.Entry)d.next();
                    break Label_0044;
                }
            }
            d = null;
            entry = null;
        }
        final int length = this.c.length;
        final Unsafe b2 = oml.b;
        int i = 0;
        int n = 1048575;
        int int1 = 0;
        while (i < length) {
            final int c = this.C(i);
            final int s = this.s(i);
            final int b3 = B(c);
            int n4;
            if (b3 <= 17) {
                final int n2 = this.c[i + 2];
                final int n3 = n2 & 0xFFFFF;
                if (n3 != n) {
                    int1 = b2.getInt(o, (long)n3);
                    n = n3;
                }
                n4 = 1 << (n2 >>> 20);
            }
            else {
                n4 = 0;
            }
            while (entry != null && okn.a(entry) <= s) {
                okn.e(okh, entry);
                if (d.hasNext()) {
                    entry = (Map.Entry)d.next();
                }
                else {
                    entry = null;
                }
            }
            final long d2 = D(c);
            switch (b3) {
                case 68: {
                    if (this.U(o, s, i)) {
                        okh.h(s, b2.getObject(o, d2), this.G(i));
                        break;
                    }
                    break;
                }
                case 67: {
                    if (this.U(o, s, i)) {
                        okh.p(s, E(o, d2));
                        break;
                    }
                    break;
                }
                case 66: {
                    if (this.U(o, s, i)) {
                        okh.o(s, t(o, d2));
                        break;
                    }
                    break;
                }
                case 65: {
                    if (this.U(o, s, i)) {
                        okh.n(s, E(o, d2));
                        break;
                    }
                    break;
                }
                case 64: {
                    if (this.U(o, s, i)) {
                        okh.m(s, t(o, d2));
                        break;
                    }
                    break;
                }
                case 63: {
                    if (this.U(o, s, i)) {
                        okh.d(s, t(o, d2));
                        break;
                    }
                    break;
                }
                case 62: {
                    if (this.U(o, s, i)) {
                        okh.r(s, t(o, d2));
                        break;
                    }
                    break;
                }
                case 61: {
                    if (this.U(o, s, i)) {
                        okh.b(s, (ojw)b2.getObject(o, d2));
                        break;
                    }
                    break;
                }
                case 60: {
                    if (this.U(o, s, i)) {
                        okh.k(s, b2.getObject(o, d2), this.G(i));
                        break;
                    }
                    break;
                }
                case 59: {
                    if (this.U(o, s, i)) {
                        aa(s, b2.getObject(o, d2), okh);
                        break;
                    }
                    break;
                }
                case 58: {
                    if (this.U(o, s, i)) {
                        okh.a(s, V(o, d2));
                        break;
                    }
                    break;
                }
                case 57: {
                    if (this.U(o, s, i)) {
                        okh.e(s, t(o, d2));
                        break;
                    }
                    break;
                }
                case 56: {
                    if (this.U(o, s, i)) {
                        okh.f(s, E(o, d2));
                        break;
                    }
                    break;
                }
                case 55: {
                    if (this.U(o, s, i)) {
                        okh.i(s, t(o, d2));
                        break;
                    }
                    break;
                }
                case 54: {
                    if (this.U(o, s, i)) {
                        okh.s(s, E(o, d2));
                        break;
                    }
                    break;
                }
                case 53: {
                    if (this.U(o, s, i)) {
                        okh.j(s, E(o, d2));
                        break;
                    }
                    break;
                }
                case 52: {
                    if (this.U(o, s, i)) {
                        okh.g(s, p(o, d2));
                        break;
                    }
                    break;
                }
                case 51: {
                    if (this.U(o, s, i)) {
                        okh.c(s, o(o, d2));
                        break;
                    }
                    break;
                }
                case 50: {
                    this.Z(okh, s, b2.getObject(o, d2), i);
                    break;
                }
                case 49: {
                    omz.I(this.s(i), (List)b2.getObject(o, d2), okh, this.G(i));
                    break;
                }
                case 48: {
                    omz.P(this.s(i), (List)b2.getObject(o, d2), okh, true);
                    break;
                }
                case 47: {
                    omz.O(this.s(i), (List)b2.getObject(o, d2), okh, true);
                    break;
                }
                case 46: {
                    omz.N(this.s(i), (List)b2.getObject(o, d2), okh, true);
                    break;
                }
                case 45: {
                    omz.M(this.s(i), (List)b2.getObject(o, d2), okh, true);
                    break;
                }
                case 44: {
                    omz.E(this.s(i), (List)b2.getObject(o, d2), okh, true);
                    break;
                }
                case 43: {
                    omz.R(this.s(i), (List)b2.getObject(o, d2), okh, true);
                    break;
                }
                case 42: {
                    omz.B(this.s(i), (List)b2.getObject(o, d2), okh, true);
                    break;
                }
                case 41: {
                    omz.F(this.s(i), (List)b2.getObject(o, d2), okh, true);
                    break;
                }
                case 40: {
                    omz.G(this.s(i), (List)b2.getObject(o, d2), okh, true);
                    break;
                }
                case 39: {
                    omz.J(this.s(i), (List)b2.getObject(o, d2), okh, true);
                    break;
                }
                case 38: {
                    omz.S(this.s(i), (List)b2.getObject(o, d2), okh, true);
                    break;
                }
                case 37: {
                    omz.K(this.s(i), (List)b2.getObject(o, d2), okh, true);
                    break;
                }
                case 36: {
                    omz.H(this.s(i), (List)b2.getObject(o, d2), okh, true);
                    break;
                }
                case 35: {
                    omz.D(this.s(i), (List)b2.getObject(o, d2), okh, true);
                    break;
                }
                case 34: {
                    omz.P(this.s(i), (List)b2.getObject(o, d2), okh, false);
                    break;
                }
                case 33: {
                    omz.O(this.s(i), (List)b2.getObject(o, d2), okh, false);
                    break;
                }
                case 32: {
                    omz.N(this.s(i), (List)b2.getObject(o, d2), okh, false);
                    break;
                }
                case 31: {
                    omz.M(this.s(i), (List)b2.getObject(o, d2), okh, false);
                    break;
                }
                case 30: {
                    omz.E(this.s(i), (List)b2.getObject(o, d2), okh, false);
                    break;
                }
                case 29: {
                    omz.R(this.s(i), (List)b2.getObject(o, d2), okh, false);
                    break;
                }
                case 28: {
                    omz.C(this.s(i), (List)b2.getObject(o, d2), okh);
                    break;
                }
                case 27: {
                    omz.L(this.s(i), (List)b2.getObject(o, d2), okh, this.G(i));
                    break;
                }
                case 26: {
                    omz.Q(this.s(i), (List)b2.getObject(o, d2), okh);
                    break;
                }
                case 25: {
                    omz.B(this.s(i), (List)b2.getObject(o, d2), okh, false);
                    break;
                }
                case 24: {
                    omz.F(this.s(i), (List)b2.getObject(o, d2), okh, false);
                    break;
                }
                case 23: {
                    omz.G(this.s(i), (List)b2.getObject(o, d2), okh, false);
                    break;
                }
                case 22: {
                    omz.J(this.s(i), (List)b2.getObject(o, d2), okh, false);
                    break;
                }
                case 21: {
                    omz.S(this.s(i), (List)b2.getObject(o, d2), okh, false);
                    break;
                }
                case 20: {
                    omz.K(this.s(i), (List)b2.getObject(o, d2), okh, false);
                    break;
                }
                case 19: {
                    omz.H(this.s(i), (List)b2.getObject(o, d2), okh, false);
                    break;
                }
                case 18: {
                    omz.D(this.s(i), (List)b2.getObject(o, d2), okh, false);
                    break;
                }
                case 17: {
                    if ((n4 & int1) != 0x0) {
                        okh.h(s, b2.getObject(o, d2), this.G(i));
                        break;
                    }
                    break;
                }
                case 16: {
                    if ((n4 & int1) != 0x0) {
                        okh.p(s, b2.getLong(o, d2));
                        break;
                    }
                    break;
                }
                case 15: {
                    if ((n4 & int1) != 0x0) {
                        okh.o(s, b2.getInt(o, d2));
                        break;
                    }
                    break;
                }
                case 14: {
                    if ((n4 & int1) != 0x0) {
                        okh.n(s, b2.getLong(o, d2));
                        break;
                    }
                    break;
                }
                case 13: {
                    if ((n4 & int1) != 0x0) {
                        okh.m(s, b2.getInt(o, d2));
                        break;
                    }
                    break;
                }
                case 12: {
                    if ((n4 & int1) != 0x0) {
                        okh.d(s, b2.getInt(o, d2));
                        break;
                    }
                    break;
                }
                case 11: {
                    if ((n4 & int1) != 0x0) {
                        okh.r(s, b2.getInt(o, d2));
                        break;
                    }
                    break;
                }
                case 10: {
                    if ((n4 & int1) != 0x0) {
                        okh.b(s, (ojw)b2.getObject(o, d2));
                        break;
                    }
                    break;
                }
                case 9: {
                    if ((n4 & int1) != 0x0) {
                        okh.k(s, b2.getObject(o, d2), this.G(i));
                        break;
                    }
                    break;
                }
                case 8: {
                    if ((n4 & int1) != 0x0) {
                        aa(s, b2.getObject(o, d2), okh);
                        break;
                    }
                    break;
                }
                case 7: {
                    if ((n4 & int1) != 0x0) {
                        okh.a(s, ons.w(o, d2));
                        break;
                    }
                    break;
                }
                case 6: {
                    if ((n4 & int1) != 0x0) {
                        okh.e(s, b2.getInt(o, d2));
                        break;
                    }
                    break;
                }
                case 5: {
                    if ((n4 & int1) != 0x0) {
                        okh.f(s, b2.getLong(o, d2));
                        break;
                    }
                    break;
                }
                case 4: {
                    if ((n4 & int1) != 0x0) {
                        okh.i(s, b2.getInt(o, d2));
                        break;
                    }
                    break;
                }
                case 3: {
                    if ((n4 & int1) != 0x0) {
                        okh.s(s, b2.getLong(o, d2));
                        break;
                    }
                    break;
                }
                case 2: {
                    if ((n4 & int1) != 0x0) {
                        okh.j(s, b2.getLong(o, d2));
                        break;
                    }
                    break;
                }
                case 1: {
                    if ((n4 & int1) != 0x0) {
                        okh.g(s, ons.c(o, d2));
                        break;
                    }
                    break;
                }
                case 0: {
                    if ((n4 & int1) != 0x0) {
                        okh.c(s, ons.b(o, d2));
                        break;
                    }
                    break;
                }
            }
            i += 3;
        }
        while (entry != null) {
            okn.e(okh, entry);
            if (d.hasNext()) {
                entry = (Map.Entry)d.next();
            }
            else {
                entry = null;
            }
        }
        ad(o, okh);
    }
    
    private final void Z(final okh okh, final int n, final Object o, final int n2) {
        if (o != null) {
            final omc n3 = phn.n(this.H(n2));
            final ome ome = (ome)o;
            final okg a = okh.a;
            for (final Map.Entry<Object, V> entry : ome.entrySet()) {
                okh.a.A(n, 2);
                okh.a.C(omd.a(n3, entry.getKey(), entry.getValue()));
                omd.c(okh.a, n3, entry.getKey(), entry.getValue());
            }
        }
    }
    
    private static final void aa(final int n, final Object o, final okh okh) {
        if (o instanceof String) {
            okh.q(n, (String)o);
            return;
        }
        okh.b(n, (ojw)o);
    }
    
    private final Object ab(Object o, int a, Object o2) {
        final int s = this.s(a);
        o = ons.h(o, D(this.C(a)));
        if (o == null) {
            return o2;
        }
        final old f = this.F(a);
        if (f == null) {
            return o2;
        }
        final ome ome = (ome)o;
        final omc n = phn.n(this.H(a));
        final Iterator<Map.Entry<Object, Object>> iterator = ome.entrySet().iterator();
        while (iterator.hasNext()) {
            final Map.Entry<K, Integer> entry = (Map.Entry<K, Integer>)iterator.next();
            if (!f.a(entry.getValue())) {
                if ((o = o2) == null) {
                    o = onk.c();
                }
                a = omd.a(n, entry.getKey(), entry.getValue());
                final ojw b = ojw.b;
                final byte[] array = new byte[a];
                final okg ai = okg.ai(array);
                try {
                    omd.c(ai, n, entry.getKey(), entry.getValue());
                    pjf.B(o, s, okn.g(ai, array));
                    iterator.remove();
                    o2 = o;
                    continue;
                }
                catch (final IOException ex) {
                    throw new RuntimeException(ex);
                }
                break;
            }
        }
        return o2;
    }
    
    private static final int ac(final Object o) {
        return pjf.D(o).a();
    }
    
    private static final void ad(final Object o, final okh okh) {
        pjf.D(o).f(okh);
    }
    
    static onk d(final Object o) {
        final oky oky = (oky)o;
        onk aa;
        if ((aa = oky.aA) == onk.a) {
            aa = onk.c();
            oky.aA = aa;
        }
        return aa;
    }
    
    static oml m(final omg omg, final pip pip, final olx olx, final pjf pjf, final okn okn, final phn phn) {
        if (omg instanceof omt) {
            return n((omt)omg, olx, pjf, okn, phn);
        }
        final onh onh = (onh)omg;
        throw null;
    }
    
    static oml n(final omt omt, final olx olx, final pjf pjf, final okn okn, final phn phn) {
        final int c = omt.c();
        final int n = 0;
        final boolean b = c == 2;
        final String b2 = omt.b;
        final int length = b2.length();
        int n4;
        if (b2.charAt(0) >= '\ud800') {
            int n2 = 1;
            while (true) {
                final int n3 = n4 = n2 + 1;
                if (b2.charAt(n2) < '\ud800') {
                    break;
                }
                n2 = n3;
            }
        }
        else {
            n4 = 1;
        }
        int n5 = n4 + 1;
        int char1 = b2.charAt(n4);
        if (char1 >= 55296) {
            int n6 = char1 & 0x1FFF;
            int n7 = 13;
            int n8;
            char char2;
            while (true) {
                n8 = n5 + 1;
                char2 = b2.charAt(n5);
                if (char2 < '\ud800') {
                    break;
                }
                n6 |= (char2 & '\u1fff') << n7;
                n7 += 13;
                n5 = n8;
            }
            final int n9 = n6 | char2 << n7;
            n5 = n8;
            char1 = n9;
        }
        int[] a;
        int n10;
        int n11;
        int n12;
        int n14;
        int n15;
        int n16;
        int n17;
        if (char1 == 0) {
            a = oml.a;
            n10 = 0;
            n11 = 0;
            n12 = 0;
            final int n13 = 0;
            n14 = 0;
            n15 = 0;
            n16 = n;
            n17 = n13;
        }
        else {
            int n18 = n5 + 1;
            int char3 = b2.charAt(n5);
            if (char3 >= 55296) {
                int n19 = char3 & 0x1FFF;
                int n20 = 13;
                int n21;
                char char4;
                while (true) {
                    n21 = n18 + 1;
                    char4 = b2.charAt(n18);
                    if (char4 < '\ud800') {
                        break;
                    }
                    n19 |= (char4 & '\u1fff') << n20;
                    n20 += 13;
                    n18 = n21;
                }
                char3 = (n19 | char4 << n20);
                n18 = n21;
            }
            int n22 = n18 + 1;
            int char5 = b2.charAt(n18);
            if (char5 >= 55296) {
                int n23 = char5 & 0x1FFF;
                int n24 = 13;
                int n25;
                char char6;
                while (true) {
                    n25 = n22 + 1;
                    char6 = b2.charAt(n22);
                    if (char6 < '\ud800') {
                        break;
                    }
                    n23 |= (char6 & '\u1fff') << n24;
                    n24 += 13;
                    n22 = n25;
                }
                char5 = (n23 | char6 << n24);
                n22 = n25;
            }
            final int n26 = n22 + 1;
            final char char7 = b2.charAt(n22);
            int n32;
            int n33;
            if (char7 >= '\ud800') {
                int n27 = char7 & '\u1fff';
                int n28 = 13;
                int n29 = n26;
                int n30;
                char char8;
                while (true) {
                    n30 = n29 + 1;
                    char8 = b2.charAt(n29);
                    if (char8 < '\ud800') {
                        break;
                    }
                    n27 |= (char8 & '\u1fff') << n28;
                    n28 += 13;
                    n29 = n30;
                }
                final int n31 = n27 | char8 << n28;
                n32 = n30;
                n33 = n31;
            }
            else {
                n32 = n26;
                n33 = char7;
            }
            int n34 = n32 + 1;
            int char9 = b2.charAt(n32);
            if (char9 >= 55296) {
                int n35 = char9 & 0x1FFF;
                int n36 = 13;
                int n37;
                char char10;
                while (true) {
                    n37 = n34 + 1;
                    char10 = b2.charAt(n34);
                    if (char10 < '\ud800') {
                        break;
                    }
                    n35 |= (char10 & '\u1fff') << n36;
                    n36 += 13;
                    n34 = n37;
                }
                char9 = (n35 | char10 << n36);
                n34 = n37;
            }
            final int n38 = n34 + 1;
            final char char11 = b2.charAt(n34);
            int n44;
            if (char11 >= '\ud800') {
                int n39 = char11 & '\u1fff';
                int n40 = 13;
                int n41 = n38;
                int n42;
                char char12;
                while (true) {
                    n42 = n41 + 1;
                    char12 = b2.charAt(n41);
                    if (char12 < '\ud800') {
                        break;
                    }
                    n39 |= (char12 & '\u1fff') << n40;
                    n40 += 13;
                    n41 = n42;
                }
                final int n43 = n39 | char12 << n40;
                n44 = n42;
                n17 = n43;
            }
            else {
                n44 = n38;
                n17 = char11;
            }
            int n45 = n44 + 1;
            int char13 = b2.charAt(n44);
            if (char13 >= 55296) {
                int n46 = char13 & 0x1FFF;
                int n47 = 13;
                int n48;
                char char14;
                while (true) {
                    n48 = n45 + 1;
                    char14 = b2.charAt(n45);
                    if (char14 < '\ud800') {
                        break;
                    }
                    n46 |= (char14 & '\u1fff') << n47;
                    n47 += 13;
                    n45 = n48;
                }
                char13 = (n46 | char14 << n47);
                n45 = n48;
            }
            int n49 = n45 + 1;
            int char15 = b2.charAt(n45);
            if (char15 >= 55296) {
                int n50 = char15 & 0x1FFF;
                int n51 = 13;
                int n52 = n49;
                char char16;
                while (true) {
                    n49 = n52 + 1;
                    char16 = b2.charAt(n52);
                    if (char16 < '\ud800') {
                        break;
                    }
                    n50 |= (char16 & '\u1fff') << n51;
                    n51 += 13;
                    n52 = n49;
                }
                char15 = (n50 | char16 << n51);
            }
            int n53 = n49 + 1;
            int char17 = b2.charAt(n49);
            if (char17 >= 55296) {
                int n54 = char17 & 0x1FFF;
                int n55 = n53;
                int n56 = 13;
                char char18;
                while (true) {
                    n53 = n55 + 1;
                    char18 = b2.charAt(n55);
                    if (char18 < '\ud800') {
                        break;
                    }
                    n54 |= (char18 & '\u1fff') << n56;
                    n56 += 13;
                    n55 = n53;
                }
                char17 = (n54 | char18 << n56);
            }
            a = new int[char17 + char13 + char15];
            final int n57 = char3 + char3 + char5;
            n10 = char13;
            final int n58 = char3;
            final int n59 = n53;
            n15 = char17;
            n14 = n57;
            n12 = char9;
            n11 = n33;
            n5 = n59;
            n16 = n58;
        }
        final Unsafe b3 = oml.b;
        final Object[] c2 = omt.c;
        final Class<? extends omj> class1 = omt.a.getClass();
        final int[] array = new int[n17 * 3];
        final Object[] array2 = new Object[n17 + n17];
        final int n60 = n15 + n10;
        final int n61 = n15;
        final int n62 = n5;
        int n63 = n60;
        int n64 = 0;
        int n65 = 0;
        int n66 = n61;
        int n67 = n14;
        final int n68 = n11;
        int i = n62;
        final int n69 = length;
        final int n70 = n16;
        while (i < n69) {
            int n71 = i + 1;
            final char char19 = b2.charAt(i);
            int n74;
            int n75;
            if (char19 >= '\ud800') {
                int n72 = char19 & '\u1fff';
                int n73 = 13;
                char char20;
                while (true) {
                    n74 = n71 + 1;
                    char20 = b2.charAt(n71);
                    if (char20 < '\ud800') {
                        break;
                    }
                    n72 |= (char20 & '\u1fff') << n73;
                    n73 += 13;
                    n71 = n74;
                }
                n75 = (n72 | char20 << n73);
            }
            else {
                n74 = n71;
                n75 = char19;
            }
            int n76 = n74 + 1;
            int char21 = b2.charAt(n74);
            int n80;
            int n81;
            if (char21 >= 55296) {
                int n77 = char21 & 0x1FFF;
                int n78 = 13;
                int n79;
                char char22;
                while (true) {
                    n79 = n76 + 1;
                    char22 = b2.charAt(n76);
                    n80 = n12;
                    if (char22 < '\ud800') {
                        break;
                    }
                    n77 |= (char22 & '\u1fff') << n78;
                    n78 += 13;
                    n12 = n80;
                    n76 = n79;
                }
                char21 = (n77 | char22 << n78);
                n81 = n79;
            }
            else {
                n81 = n76;
                n80 = n12;
            }
            final int n82 = char21 & 0xFF;
            int n83 = n65;
            if ((char21 & 0x400) != 0x0) {
                a[n65] = n64;
                n83 = n65 + 1;
            }
            int n91;
            int n95;
            int n96;
            int n97;
            int n98;
            if (n82 >= 51) {
                final int n84 = n81 + 1;
                int char23 = b2.charAt(n81);
                int n89;
                if (char23 >= 55296) {
                    final int n85 = 13;
                    int n86 = char23 & 0x1FFF;
                    int n87 = n84;
                    int n88 = n85;
                    char char24;
                    while (true) {
                        n89 = n87 + 1;
                        char24 = b2.charAt(n87);
                        if (char24 < '\ud800') {
                            break;
                        }
                        n86 |= (char24 & '\u1fff') << n88;
                        n88 += 13;
                        n87 = n89;
                    }
                    char23 = (n86 | char24 << n88);
                }
                else {
                    n89 = n84;
                }
                final int n90 = n82 - 51;
                if (n90 != 9 && n90 != 17) {
                    n91 = n67;
                    if (n90 == 12) {
                        n91 = n67;
                        if (!b) {
                            final int n92 = n64 / 3;
                            array2[n92 + n92 + 1] = c2[n67];
                            n91 = n67 + 1;
                        }
                    }
                }
                else {
                    final int n93 = n64 / 3;
                    array2[n93 + n93 + 1] = c2[n67];
                    n91 = n67 + 1;
                }
                int n94 = char23 + char23;
                final Object o = c2[n94];
                Field j;
                if (o instanceof Field) {
                    j = (Field)o;
                }
                else {
                    j = I(class1, (String)o);
                    c2[n94] = j;
                }
                n95 = (int)b3.objectFieldOffset(j);
                ++n94;
                final Object o2 = c2[n94];
                Field k;
                if (o2 instanceof Field) {
                    k = (Field)o2;
                }
                else {
                    k = I(class1, (String)o2);
                    c2[n94] = k;
                }
                n96 = (int)b3.objectFieldOffset(k);
                n97 = n89;
                n98 = 0;
            }
            else {
                final String s = b2;
                int n99 = n67 + 1;
                final Field l = I(class1, (String)c2[n67]);
                if (n82 != 9 && n82 != 17) {
                    if (n82 != 27 && n82 != 49) {
                        if (n82 != 12 && n82 != 30 && n82 != 44) {
                            if (n82 == 50) {
                                final int n100 = n66 + 1;
                                a[n66] = n64;
                                final int n101 = n64 / 3;
                                final int n102 = n101 + n101;
                                final int n103 = n99 + 1;
                                array2[n102] = c2[n99];
                                if ((char21 & 0x800) != 0x0) {
                                    n99 = n103 + 1;
                                    array2[n102 + 1] = c2[n103];
                                    n66 = n100;
                                }
                                else {
                                    n66 = n100;
                                    n99 = n103;
                                }
                            }
                        }
                        else if (!b) {
                            final int n104 = n64 / 3;
                            array2[n104 + n104 + 1] = c2[n99];
                            ++n99;
                        }
                    }
                    else {
                        final int n105 = n64 / 3;
                        array2[n105 + n105 + 1] = c2[n99];
                        ++n99;
                    }
                }
                else {
                    final int n106 = n64 / 3;
                    array2[n106 + n106 + 1] = l.getType();
                }
                n95 = (int)b3.objectFieldOffset(l);
                n96 = 1048575;
                final int n107 = n99;
                if ((char21 & 0x1000) == 0x1000 && n82 <= 17) {
                    int n108 = n81 + 1;
                    int char25 = s.charAt(n81);
                    if (char25 >= 55296) {
                        int n109 = char25 & 0x1FFF;
                        int n110 = 13;
                        int n111 = n108;
                        char char26;
                        while (true) {
                            n108 = n111 + 1;
                            char26 = s.charAt(n111);
                            if (char26 < '\ud800') {
                                break;
                            }
                            n109 |= (char26 & '\u1fff') << n110;
                            n110 += 13;
                            n111 = n108;
                        }
                        char25 = (n109 | char26 << n110);
                    }
                    final int n112 = n70 + n70 + char25 / 32;
                    final Object o3 = c2[n112];
                    Field m;
                    if (o3 instanceof Field) {
                        m = (Field)o3;
                    }
                    else {
                        m = I(class1, (String)o3);
                        c2[n112] = m;
                    }
                    n96 = (int)b3.objectFieldOffset(m);
                    n98 = char25 % 32;
                    n97 = n108;
                }
                else {
                    final int n113 = 0;
                    n97 = n81;
                    n98 = n113;
                }
                if (n82 >= 18 && n82 <= 49) {
                    a[n63] = n95;
                    ++n63;
                    n91 = n107;
                }
                else {
                    n91 = n107;
                }
            }
            final int n114 = n64 + 1;
            array[n64] = n75;
            final int n115 = n114 + 1;
            int n116;
            if ((char21 & 0x200) != 0x0) {
                n116 = 536870912;
            }
            else {
                n116 = 0;
            }
            int n117;
            if ((char21 & 0x100) != 0x0) {
                n117 = 268435456;
            }
            else {
                n117 = 0;
            }
            array[n114] = (n95 | (n116 | n117 | n82 << 20));
            n64 = n115 + 1;
            array[n115] = (n98 << 20 | n96);
            final int n118 = n80;
            final int n119 = n91;
            i = n97;
            n12 = n118;
            n67 = n119;
            n65 = n83;
        }
        return new oml(array, array2, n68, n12, omt.a, b, a, n15, n60, olx, pjf, okn, null, null);
    }
    
    private static double o(final Object o, final long n) {
        return (double)ons.h(o, n);
    }
    
    private static float p(final Object o, final long n) {
        return (float)ons.h(o, n);
    }
    
    private final int q(final Object o) {
        final Unsafe b = oml.b;
        final int n = 0;
        int i = 0;
        int n2 = 0;
        int int1 = 0;
        int n3 = 1048575;
        while (i < this.c.length) {
            final int c = this.C(i);
            final int s = this.s(i);
            final int b2 = B(c);
            int n6;
            int n7;
            if (b2 <= 17) {
                final int n4 = this.c[i + 2];
                final int n5 = n4 & 0xFFFFF;
                n6 = 1 << (n4 >>> 20);
                if (n5 != n3) {
                    int1 = b.getInt(o, (long)n5);
                    n3 = n5;
                }
                n7 = int1;
            }
            else {
                n6 = 0;
                n7 = int1;
            }
            final long d = D(c);
            int n8 = 0;
            switch (b2) {
                default: {
                    n8 = n2;
                    break;
                }
                case 68: {
                    n8 = n2;
                    if (this.U(o, s, i)) {
                        n8 = n2 + okg.K(s, (omj)b.getObject(o, d), this.G(i));
                        break;
                    }
                    break;
                }
                case 67: {
                    n8 = n2;
                    if (this.U(o, s, i)) {
                        n8 = n2 + okg.X(s, E(o, d));
                        break;
                    }
                    break;
                }
                case 66: {
                    n8 = n2;
                    if (this.U(o, s, i)) {
                        n8 = n2 + okg.V(s, t(o, d));
                        break;
                    }
                    break;
                }
                case 65: {
                    n8 = n2;
                    if (this.U(o, s, i)) {
                        n8 = n2 + okg.aB(s);
                        break;
                    }
                    break;
                }
                case 64: {
                    n8 = n2;
                    if (this.U(o, s, i)) {
                        n8 = n2 + okg.aA(s);
                        break;
                    }
                    break;
                }
                case 63: {
                    n8 = n2;
                    if (this.U(o, s, i)) {
                        n8 = n2 + okg.J(s, t(o, d));
                        break;
                    }
                    break;
                }
                case 62: {
                    n8 = n2;
                    if (this.U(o, s, i)) {
                        n8 = n2 + okg.ac(s, t(o, d));
                        break;
                    }
                    break;
                }
                case 61: {
                    n8 = n2;
                    if (this.U(o, s, i)) {
                        n8 = n2 + okg.H(s, (ojw)b.getObject(o, d));
                        break;
                    }
                    break;
                }
                case 60: {
                    n8 = n2;
                    if (this.U(o, s, i)) {
                        n8 = n2 + omz.i(s, b.getObject(o, d), this.G(i));
                        break;
                    }
                    break;
                }
                case 59: {
                    n8 = n2;
                    if (!this.U(o, s, i)) {
                        break;
                    }
                    final Object object = b.getObject(o, d);
                    if (object instanceof ojw) {
                        n8 = n2 + okg.H(s, (ojw)object);
                        break;
                    }
                    n8 = n2 + okg.Z(s, (String)object);
                    break;
                }
                case 58: {
                    n8 = n2;
                    if (this.U(o, s, i)) {
                        n8 = n2 + okg.av(s);
                        break;
                    }
                    break;
                }
                case 57: {
                    n8 = n2;
                    if (this.U(o, s, i)) {
                        n8 = n2 + okg.ax(s);
                        break;
                    }
                    break;
                }
                case 56: {
                    n8 = n2;
                    if (this.U(o, s, i)) {
                        n8 = n2 + okg.ay(s);
                        break;
                    }
                    break;
                }
                case 55: {
                    n8 = n2;
                    if (this.U(o, s, i)) {
                        n8 = n2 + okg.M(s, t(o, d));
                        break;
                    }
                    break;
                }
                case 54: {
                    n8 = n2;
                    if (this.U(o, s, i)) {
                        n8 = n2 + okg.ae(s, E(o, d));
                        break;
                    }
                    break;
                }
                case 53: {
                    n8 = n2;
                    if (this.U(o, s, i)) {
                        n8 = n2 + okg.O(s, E(o, d));
                        break;
                    }
                    break;
                }
                case 52: {
                    n8 = n2;
                    if (this.U(o, s, i)) {
                        n8 = n2 + okg.az(s);
                        break;
                    }
                    break;
                }
                case 51: {
                    n8 = n2;
                    if (this.U(o, s, i)) {
                        n8 = n2 + okg.aw(s);
                        break;
                    }
                    break;
                }
                case 50: {
                    n8 = n2 + phn.o(s, b.getObject(o, d), this.H(i));
                    break;
                }
                case 49: {
                    n8 = n2 + omz.f(s, (List)b.getObject(o, d), this.G(i));
                    break;
                }
                case 48: {
                    final int l = omz.l((List)b.getObject(o, d));
                    n8 = n2;
                    if (l > 0) {
                        n8 = n2 + (okg.ab(s) + okg.ad(l) + l);
                        break;
                    }
                    break;
                }
                case 47: {
                    final int k = omz.k((List)b.getObject(o, d));
                    n8 = n2;
                    if (k > 0) {
                        n8 = n2 + (okg.ab(s) + okg.ad(k) + k);
                        break;
                    }
                    break;
                }
                case 46: {
                    final int e = omz.e((List)b.getObject(o, d));
                    n8 = n2;
                    if (e > 0) {
                        n8 = n2 + (okg.ab(s) + okg.ad(e) + e);
                        break;
                    }
                    break;
                }
                case 45: {
                    final int d2 = omz.d((List)b.getObject(o, d));
                    n8 = n2;
                    if (d2 > 0) {
                        n8 = n2 + (okg.ab(s) + okg.ad(d2) + d2);
                        break;
                    }
                    break;
                }
                case 44: {
                    final int c2 = omz.c((List)b.getObject(o, d));
                    n8 = n2;
                    if (c2 > 0) {
                        n8 = n2 + (okg.ab(s) + okg.ad(c2) + c2);
                        break;
                    }
                    break;
                }
                case 43: {
                    final int n9 = omz.n((List)b.getObject(o, d));
                    n8 = n2;
                    if (n9 > 0) {
                        n8 = n2 + (okg.ab(s) + okg.ad(n9) + n9);
                        break;
                    }
                    break;
                }
                case 42: {
                    final int a = omz.a((List)b.getObject(o, d));
                    n8 = n2;
                    if (a > 0) {
                        n8 = n2 + (okg.ab(s) + okg.ad(a) + a);
                        break;
                    }
                    break;
                }
                case 41: {
                    final int d3 = omz.d((List)b.getObject(o, d));
                    n8 = n2;
                    if (d3 > 0) {
                        n8 = n2 + (okg.ab(s) + okg.ad(d3) + d3);
                        break;
                    }
                    break;
                }
                case 40: {
                    final int e2 = omz.e((List)b.getObject(o, d));
                    n8 = n2;
                    if (e2 > 0) {
                        n8 = n2 + (okg.ab(s) + okg.ad(e2) + e2);
                        break;
                    }
                    break;
                }
                case 39: {
                    final int g = omz.g((List)b.getObject(o, d));
                    n8 = n2;
                    if (g > 0) {
                        n8 = n2 + (okg.ab(s) + okg.ad(g) + g);
                        break;
                    }
                    break;
                }
                case 38: {
                    final int o2 = omz.o((List)b.getObject(o, d));
                    n8 = n2;
                    if (o2 > 0) {
                        n8 = n2 + (okg.ab(s) + okg.ad(o2) + o2);
                        break;
                    }
                    break;
                }
                case 37: {
                    final int h = omz.h((List)b.getObject(o, d));
                    n8 = n2;
                    if (h > 0) {
                        n8 = n2 + (okg.ab(s) + okg.ad(h) + h);
                        break;
                    }
                    break;
                }
                case 36: {
                    final int d4 = omz.d((List)b.getObject(o, d));
                    n8 = n2;
                    if (d4 > 0) {
                        n8 = n2 + (okg.ab(s) + okg.ad(d4) + d4);
                        break;
                    }
                    break;
                }
                case 35: {
                    final int e3 = omz.e((List)b.getObject(o, d));
                    n8 = n2;
                    if (e3 > 0) {
                        n8 = n2 + (okg.ab(s) + okg.ad(e3) + e3);
                        break;
                    }
                    break;
                }
                case 34: {
                    n8 = n2 + omz.y(s, (List)b.getObject(o, d));
                    break;
                }
                case 33: {
                    n8 = n2 + omz.x(s, (List)b.getObject(o, d));
                    break;
                }
                case 32: {
                    n8 = n2 + omz.u(s, (List)b.getObject(o, d));
                    break;
                }
                case 31: {
                    n8 = n2 + omz.t(s, (List)b.getObject(o, d));
                    break;
                }
                case 30: {
                    n8 = n2 + omz.s(s, (List)b.getObject(o, d));
                    break;
                }
                case 29: {
                    n8 = n2 + omz.z(s, (List)b.getObject(o, d));
                    break;
                }
                case 28: {
                    n8 = n2 + omz.b(s, (List)b.getObject(o, d));
                    break;
                }
                case 27: {
                    n8 = n2 + omz.j(s, (List)b.getObject(o, d), this.G(i));
                    break;
                }
                case 26: {
                    n8 = n2 + omz.m(s, (List)b.getObject(o, d));
                    break;
                }
                case 25: {
                    n8 = n2 + omz.r(s, (List)b.getObject(o, d));
                    break;
                }
                case 24: {
                    n8 = n2 + omz.t(s, (List)b.getObject(o, d));
                    break;
                }
                case 23: {
                    n8 = n2 + omz.u(s, (List)b.getObject(o, d));
                    break;
                }
                case 22: {
                    n8 = n2 + omz.v(s, (List)b.getObject(o, d));
                    break;
                }
                case 21: {
                    n8 = n2 + omz.A(s, (List)b.getObject(o, d));
                    break;
                }
                case 20: {
                    n8 = n2 + omz.w(s, (List)b.getObject(o, d));
                    break;
                }
                case 19: {
                    n8 = n2 + omz.t(s, (List)b.getObject(o, d));
                    break;
                }
                case 18: {
                    n8 = n2 + omz.u(s, (List)b.getObject(o, d));
                    break;
                }
                case 17: {
                    n8 = n2;
                    if ((n7 & n6) != 0x0) {
                        n8 = n2 + okg.K(s, (omj)b.getObject(o, d), this.G(i));
                        break;
                    }
                    break;
                }
                case 16: {
                    n8 = n2;
                    if ((n7 & n6) != 0x0) {
                        n8 = n2 + okg.X(s, b.getLong(o, d));
                        break;
                    }
                    break;
                }
                case 15: {
                    n8 = n2;
                    if ((n7 & n6) != 0x0) {
                        n8 = n2 + okg.V(s, b.getInt(o, d));
                        break;
                    }
                    break;
                }
                case 14: {
                    n8 = n2;
                    if ((n7 & n6) != 0x0) {
                        n8 = n2 + okg.aB(s);
                        break;
                    }
                    break;
                }
                case 13: {
                    n8 = n2;
                    if ((n7 & n6) != 0x0) {
                        n8 = n2 + okg.aA(s);
                        break;
                    }
                    break;
                }
                case 12: {
                    n8 = n2;
                    if ((n7 & n6) != 0x0) {
                        n8 = n2 + okg.J(s, b.getInt(o, d));
                        break;
                    }
                    break;
                }
                case 11: {
                    n8 = n2;
                    if ((n7 & n6) != 0x0) {
                        n8 = n2 + okg.ac(s, b.getInt(o, d));
                        break;
                    }
                    break;
                }
                case 10: {
                    n8 = n2;
                    if ((n7 & n6) != 0x0) {
                        n8 = n2 + okg.H(s, (ojw)b.getObject(o, d));
                        break;
                    }
                    break;
                }
                case 9: {
                    n8 = n2;
                    if ((n7 & n6) != 0x0) {
                        n8 = n2 + omz.i(s, b.getObject(o, d), this.G(i));
                        break;
                    }
                    break;
                }
                case 8: {
                    n8 = n2;
                    if ((n7 & n6) == 0x0) {
                        break;
                    }
                    final Object object2 = b.getObject(o, d);
                    if (object2 instanceof ojw) {
                        n8 = n2 + okg.H(s, (ojw)object2);
                        break;
                    }
                    n8 = n2 + okg.Z(s, (String)object2);
                    break;
                }
                case 7: {
                    n8 = n2;
                    if ((n7 & n6) != 0x0) {
                        n8 = n2 + okg.av(s);
                        break;
                    }
                    break;
                }
                case 6: {
                    n8 = n2;
                    if ((n7 & n6) != 0x0) {
                        n8 = n2 + okg.ax(s);
                        break;
                    }
                    break;
                }
                case 5: {
                    n8 = n2;
                    if ((n7 & n6) != 0x0) {
                        n8 = n2 + okg.ay(s);
                        break;
                    }
                    break;
                }
                case 4: {
                    n8 = n2;
                    if ((n7 & n6) != 0x0) {
                        n8 = n2 + okg.M(s, b.getInt(o, d));
                        break;
                    }
                    break;
                }
                case 3: {
                    n8 = n2;
                    if ((n7 & n6) != 0x0) {
                        n8 = n2 + okg.ae(s, b.getLong(o, d));
                        break;
                    }
                    break;
                }
                case 2: {
                    n8 = n2;
                    if ((n7 & n6) != 0x0) {
                        n8 = n2 + okg.O(s, b.getLong(o, d));
                        break;
                    }
                    break;
                }
                case 1: {
                    n8 = n2;
                    if ((n7 & n6) != 0x0) {
                        n8 = n2 + okg.az(s);
                        break;
                    }
                    break;
                }
                case 0: {
                    n8 = n2;
                    if ((n7 & n6) != 0x0) {
                        n8 = n2 + okg.aw(s);
                        break;
                    }
                    break;
                }
            }
            i += 3;
            n2 = n8;
            int1 = n7;
        }
        int n10 = n2 + ac(o);
        if (this.h) {
            final okp b3 = okn.b(o);
            int n11 = 0;
            for (int j = n; j < b3.b.a(); ++j) {
                final Map.Entry f = b3.b.f(j);
                n11 += okp.j((okx)f.getKey(), f.getValue());
            }
            for (final Map.Entry<okx, V> entry : b3.b.c()) {
                n11 += okp.j(entry.getKey(), entry.getValue());
            }
            n10 += n11;
        }
        return n10;
    }
    
    private final int r(final Object o) {
        final Unsafe b = oml.b;
        int i = 0;
        int n = 0;
        while (i < this.c.length) {
            final int c = this.C(i);
            final int b2 = B(c);
            final int s = this.s(i);
            final long d = D(c);
            if (b2 >= okq.J.Z && b2 <= okq.W.Z) {
                final int n2 = this.c[i + 2];
            }
            int n3 = 0;
            switch (b2) {
                default: {
                    n3 = n;
                    break;
                }
                case 68: {
                    n3 = n;
                    if (this.U(o, s, i)) {
                        n3 = n + okg.K(s, (omj)ons.h(o, d), this.G(i));
                        break;
                    }
                    break;
                }
                case 67: {
                    n3 = n;
                    if (this.U(o, s, i)) {
                        n3 = n + okg.X(s, E(o, d));
                        break;
                    }
                    break;
                }
                case 66: {
                    n3 = n;
                    if (this.U(o, s, i)) {
                        n3 = n + okg.V(s, t(o, d));
                        break;
                    }
                    break;
                }
                case 65: {
                    n3 = n;
                    if (this.U(o, s, i)) {
                        n3 = n + okg.aB(s);
                        break;
                    }
                    break;
                }
                case 64: {
                    n3 = n;
                    if (this.U(o, s, i)) {
                        n3 = n + okg.aA(s);
                        break;
                    }
                    break;
                }
                case 63: {
                    n3 = n;
                    if (this.U(o, s, i)) {
                        n3 = n + okg.J(s, t(o, d));
                        break;
                    }
                    break;
                }
                case 62: {
                    n3 = n;
                    if (this.U(o, s, i)) {
                        n3 = n + okg.ac(s, t(o, d));
                        break;
                    }
                    break;
                }
                case 61: {
                    n3 = n;
                    if (this.U(o, s, i)) {
                        n3 = n + okg.H(s, (ojw)ons.h(o, d));
                        break;
                    }
                    break;
                }
                case 60: {
                    n3 = n;
                    if (this.U(o, s, i)) {
                        n3 = n + omz.i(s, ons.h(o, d), this.G(i));
                        break;
                    }
                    break;
                }
                case 59: {
                    n3 = n;
                    if (!this.U(o, s, i)) {
                        break;
                    }
                    final Object h = ons.h(o, d);
                    if (h instanceof ojw) {
                        n3 = n + okg.H(s, (ojw)h);
                        break;
                    }
                    n3 = n + okg.Z(s, (String)h);
                    break;
                }
                case 58: {
                    n3 = n;
                    if (this.U(o, s, i)) {
                        n3 = n + okg.av(s);
                        break;
                    }
                    break;
                }
                case 57: {
                    n3 = n;
                    if (this.U(o, s, i)) {
                        n3 = n + okg.ax(s);
                        break;
                    }
                    break;
                }
                case 56: {
                    n3 = n;
                    if (this.U(o, s, i)) {
                        n3 = n + okg.ay(s);
                        break;
                    }
                    break;
                }
                case 55: {
                    n3 = n;
                    if (this.U(o, s, i)) {
                        n3 = n + okg.M(s, t(o, d));
                        break;
                    }
                    break;
                }
                case 54: {
                    n3 = n;
                    if (this.U(o, s, i)) {
                        n3 = n + okg.ae(s, E(o, d));
                        break;
                    }
                    break;
                }
                case 53: {
                    n3 = n;
                    if (this.U(o, s, i)) {
                        n3 = n + okg.O(s, E(o, d));
                        break;
                    }
                    break;
                }
                case 52: {
                    n3 = n;
                    if (this.U(o, s, i)) {
                        n3 = n + okg.az(s);
                        break;
                    }
                    break;
                }
                case 51: {
                    n3 = n;
                    if (this.U(o, s, i)) {
                        n3 = n + okg.aw(s);
                        break;
                    }
                    break;
                }
                case 50: {
                    n3 = n + phn.o(s, ons.h(o, d), this.H(i));
                    break;
                }
                case 49: {
                    n3 = n + omz.f(s, J(o, d), this.G(i));
                    break;
                }
                case 48: {
                    final int l = omz.l((List)b.getObject(o, d));
                    n3 = n;
                    if (l > 0) {
                        n3 = n + (okg.ab(s) + okg.ad(l) + l);
                        break;
                    }
                    break;
                }
                case 47: {
                    final int k = omz.k((List)b.getObject(o, d));
                    n3 = n;
                    if (k > 0) {
                        n3 = n + (okg.ab(s) + okg.ad(k) + k);
                        break;
                    }
                    break;
                }
                case 46: {
                    final int e = omz.e((List)b.getObject(o, d));
                    n3 = n;
                    if (e > 0) {
                        n3 = n + (okg.ab(s) + okg.ad(e) + e);
                        break;
                    }
                    break;
                }
                case 45: {
                    final int d2 = omz.d((List)b.getObject(o, d));
                    n3 = n;
                    if (d2 > 0) {
                        n3 = n + (okg.ab(s) + okg.ad(d2) + d2);
                        break;
                    }
                    break;
                }
                case 44: {
                    final int c2 = omz.c((List)b.getObject(o, d));
                    n3 = n;
                    if (c2 > 0) {
                        n3 = n + (okg.ab(s) + okg.ad(c2) + c2);
                        break;
                    }
                    break;
                }
                case 43: {
                    final int n4 = omz.n((List)b.getObject(o, d));
                    n3 = n;
                    if (n4 > 0) {
                        n3 = n + (okg.ab(s) + okg.ad(n4) + n4);
                        break;
                    }
                    break;
                }
                case 42: {
                    final int a = omz.a((List)b.getObject(o, d));
                    n3 = n;
                    if (a > 0) {
                        n3 = n + (okg.ab(s) + okg.ad(a) + a);
                        break;
                    }
                    break;
                }
                case 41: {
                    final int d3 = omz.d((List)b.getObject(o, d));
                    n3 = n;
                    if (d3 > 0) {
                        n3 = n + (okg.ab(s) + okg.ad(d3) + d3);
                        break;
                    }
                    break;
                }
                case 40: {
                    final int e2 = omz.e((List)b.getObject(o, d));
                    n3 = n;
                    if (e2 > 0) {
                        n3 = n + (okg.ab(s) + okg.ad(e2) + e2);
                        break;
                    }
                    break;
                }
                case 39: {
                    final int g = omz.g((List)b.getObject(o, d));
                    n3 = n;
                    if (g > 0) {
                        n3 = n + (okg.ab(s) + okg.ad(g) + g);
                        break;
                    }
                    break;
                }
                case 38: {
                    final int o2 = omz.o((List)b.getObject(o, d));
                    n3 = n;
                    if (o2 > 0) {
                        n3 = n + (okg.ab(s) + okg.ad(o2) + o2);
                        break;
                    }
                    break;
                }
                case 37: {
                    final int h2 = omz.h((List)b.getObject(o, d));
                    n3 = n;
                    if (h2 > 0) {
                        n3 = n + (okg.ab(s) + okg.ad(h2) + h2);
                        break;
                    }
                    break;
                }
                case 36: {
                    final int d4 = omz.d((List)b.getObject(o, d));
                    n3 = n;
                    if (d4 > 0) {
                        n3 = n + (okg.ab(s) + okg.ad(d4) + d4);
                        break;
                    }
                    break;
                }
                case 35: {
                    final int e3 = omz.e((List)b.getObject(o, d));
                    n3 = n;
                    if (e3 > 0) {
                        n3 = n + (okg.ab(s) + okg.ad(e3) + e3);
                        break;
                    }
                    break;
                }
                case 34: {
                    n3 = n + omz.y(s, J(o, d));
                    break;
                }
                case 33: {
                    n3 = n + omz.x(s, J(o, d));
                    break;
                }
                case 32: {
                    n3 = n + omz.u(s, J(o, d));
                    break;
                }
                case 31: {
                    n3 = n + omz.t(s, J(o, d));
                    break;
                }
                case 30: {
                    n3 = n + omz.s(s, J(o, d));
                    break;
                }
                case 29: {
                    n3 = n + omz.z(s, J(o, d));
                    break;
                }
                case 28: {
                    n3 = n + omz.b(s, J(o, d));
                    break;
                }
                case 27: {
                    n3 = n + omz.j(s, J(o, d), this.G(i));
                    break;
                }
                case 26: {
                    n3 = n + omz.m(s, J(o, d));
                    break;
                }
                case 25: {
                    n3 = n + omz.r(s, J(o, d));
                    break;
                }
                case 24: {
                    n3 = n + omz.t(s, J(o, d));
                    break;
                }
                case 23: {
                    n3 = n + omz.u(s, J(o, d));
                    break;
                }
                case 22: {
                    n3 = n + omz.v(s, J(o, d));
                    break;
                }
                case 21: {
                    n3 = n + omz.A(s, J(o, d));
                    break;
                }
                case 20: {
                    n3 = n + omz.w(s, J(o, d));
                    break;
                }
                case 19: {
                    n3 = n + omz.t(s, J(o, d));
                    break;
                }
                case 18: {
                    n3 = n + omz.u(s, J(o, d));
                    break;
                }
                case 17: {
                    n3 = n;
                    if (this.R(o, i)) {
                        n3 = n + okg.K(s, (omj)ons.h(o, d), this.G(i));
                        break;
                    }
                    break;
                }
                case 16: {
                    n3 = n;
                    if (this.R(o, i)) {
                        n3 = n + okg.X(s, ons.f(o, d));
                        break;
                    }
                    break;
                }
                case 15: {
                    n3 = n;
                    if (this.R(o, i)) {
                        n3 = n + okg.V(s, ons.d(o, d));
                        break;
                    }
                    break;
                }
                case 14: {
                    n3 = n;
                    if (this.R(o, i)) {
                        n3 = n + okg.aB(s);
                        break;
                    }
                    break;
                }
                case 13: {
                    n3 = n;
                    if (this.R(o, i)) {
                        n3 = n + okg.aA(s);
                        break;
                    }
                    break;
                }
                case 12: {
                    n3 = n;
                    if (this.R(o, i)) {
                        n3 = n + okg.J(s, ons.d(o, d));
                        break;
                    }
                    break;
                }
                case 11: {
                    n3 = n;
                    if (this.R(o, i)) {
                        n3 = n + okg.ac(s, ons.d(o, d));
                        break;
                    }
                    break;
                }
                case 10: {
                    n3 = n;
                    if (this.R(o, i)) {
                        n3 = n + okg.H(s, (ojw)ons.h(o, d));
                        break;
                    }
                    break;
                }
                case 9: {
                    n3 = n;
                    if (this.R(o, i)) {
                        n3 = n + omz.i(s, ons.h(o, d), this.G(i));
                        break;
                    }
                    break;
                }
                case 8: {
                    n3 = n;
                    if (!this.R(o, i)) {
                        break;
                    }
                    final Object h3 = ons.h(o, d);
                    if (h3 instanceof ojw) {
                        n3 = n + okg.H(s, (ojw)h3);
                        break;
                    }
                    n3 = n + okg.Z(s, (String)h3);
                    break;
                }
                case 7: {
                    n3 = n;
                    if (this.R(o, i)) {
                        n3 = n + okg.av(s);
                        break;
                    }
                    break;
                }
                case 6: {
                    n3 = n;
                    if (this.R(o, i)) {
                        n3 = n + okg.ax(s);
                        break;
                    }
                    break;
                }
                case 5: {
                    n3 = n;
                    if (this.R(o, i)) {
                        n3 = n + okg.ay(s);
                        break;
                    }
                    break;
                }
                case 4: {
                    n3 = n;
                    if (this.R(o, i)) {
                        n3 = n + okg.M(s, ons.d(o, d));
                        break;
                    }
                    break;
                }
                case 3: {
                    n3 = n;
                    if (this.R(o, i)) {
                        n3 = n + okg.ae(s, ons.f(o, d));
                        break;
                    }
                    break;
                }
                case 2: {
                    n3 = n;
                    if (this.R(o, i)) {
                        n3 = n + okg.O(s, ons.f(o, d));
                        break;
                    }
                    break;
                }
                case 1: {
                    n3 = n;
                    if (this.R(o, i)) {
                        n3 = n + okg.az(s);
                        break;
                    }
                    break;
                }
                case 0: {
                    n3 = n;
                    if (this.R(o, i)) {
                        n3 = n + okg.aw(s);
                        break;
                    }
                    break;
                }
            }
            i += 3;
            n = n3;
        }
        return n + ac(o);
    }
    
    private final int s(final int n) {
        return this.c[n];
    }
    
    private static int t(final Object o, final long n) {
        return (int)ons.h(o, n);
    }
    
    private final int u(Object o, final byte[] array, int i, final int n, int n2, final long n3, final ojl ojl) {
        final Unsafe b = oml.b;
        final Object h = this.H(n2);
        Object o3;
        final Object o2 = o3 = b.getObject(o, n3);
        if (phn.p(o2)) {
            o3 = phn.r();
            phn.q(o3, o2);
            b.putObject(o, n3, o3);
        }
        final omc n4 = phn.n(h);
        final ome ome = (ome)o3;
        i = okn.s(array, i, ojl);
        n2 = ojl.a;
        if (n2 < 0 || n2 > n - i) {
            throw olm.i();
        }
        final int n5 = i + n2;
        Object o4 = n4.b;
        o = n4.d;
        while (i < n5) {
            n2 = i + 1;
            i = array[i];
            if (i < 0) {
                n2 = okn.t(i, array, n2, ojl);
                i = ojl.a;
            }
            final int n6 = i & 0x7;
            switch (i >>> 3) {
                case 2: {
                    final onv c = n4.c;
                    if (n6 == c.t) {
                        i = W(array, n2, n, c, n4.d.getClass(), ojl);
                        o = ojl.c;
                        continue;
                    }
                    break;
                }
                case 1: {
                    final onv a = n4.a;
                    if (n6 == a.t) {
                        i = W(array, n2, n, a, null, ojl);
                        o4 = ojl.c;
                        continue;
                    }
                    break;
                }
            }
            i = okn.w(i, array, n2, n, ojl);
        }
        if (i == n5) {
            ome.put(o4, o);
            return n5;
        }
        throw olm.g();
    }
    
    private final int v(final Object o, final byte[] array, int n, int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final long n8, final int n9, final ojl ojl) {
        final Unsafe b = oml.b;
        final long n10 = this.c[n9 + 2] & 0xFFFFF;
        switch (n7) {
            case 68: {
                if (n5 == 3) {
                    n = okn.l(this.G(n9), array, n, n2, (n3 & 0xFFFFFFF8) | 0x4, ojl);
                    Object object;
                    if (b.getInt(o, n10) == n4) {
                        object = b.getObject(o, n8);
                    }
                    else {
                        object = null;
                    }
                    if (object == null) {
                        b.putObject(o, n8, ojl.c);
                    }
                    else {
                        b.putObject(o, n8, olk.e(object, ojl.c));
                    }
                    b.putInt(o, n10, n4);
                    break;
                }
                break;
            }
            case 67: {
                if (n5 != 0) {
                    break;
                }
                n = okn.v(array, n, ojl);
                b.putObject(o, n8, okb.G(ojl.b));
                b.putInt(o, n10, n4);
                return n;
            }
            case 66: {
                if (n5 != 0) {
                    break;
                }
                n = okn.s(array, n, ojl);
                b.putObject(o, n8, okb.F(ojl.a));
                b.putInt(o, n10, n4);
                return n;
            }
            case 63: {
                if (n5 == 0) {
                    n = okn.s(array, n, ojl);
                    n2 = ojl.a;
                    final old f = this.F(n9);
                    if (f != null && !f.a(n2)) {
                        d(o).e(n3, (long)n2);
                    }
                    else {
                        b.putObject(o, n8, n2);
                        b.putInt(o, n10, n4);
                    }
                    break;
                }
                break;
            }
            case 61: {
                if (n5 != 2) {
                    break;
                }
                n = okn.j(array, n, ojl);
                b.putObject(o, n8, ojl.c);
                b.putInt(o, n10, n4);
                return n;
            }
            case 60: {
                if (n5 == 2) {
                    n = okn.m(this.G(n9), array, n, n2, ojl);
                    Object object2;
                    if (b.getInt(o, n10) == n4) {
                        object2 = b.getObject(o, n8);
                    }
                    else {
                        object2 = null;
                    }
                    if (object2 == null) {
                        b.putObject(o, n8, ojl.c);
                    }
                    else {
                        b.putObject(o, n8, olk.e(object2, ojl.c));
                    }
                    b.putInt(o, n10, n4);
                    break;
                }
                break;
            }
            case 59: {
                if (n5 == 2) {
                    n = okn.s(array, n, ojl);
                    n2 = ojl.a;
                    if (n2 == 0) {
                        b.putObject(o, n8, "");
                    }
                    else {
                        if ((n6 & 0x20000000) != 0x0 && !onu.h(array, n, n + n2)) {
                            throw olm.d();
                        }
                        b.putObject(o, n8, new String(array, n, n2, olk.a));
                        n += n2;
                    }
                    b.putInt(o, n10, n4);
                    break;
                }
                break;
            }
            case 58: {
                if (n5 == 0) {
                    n = okn.v(array, n, ojl);
                    b.putObject(o, n8, ojl.b != 0L);
                    b.putInt(o, n10, n4);
                    return n;
                }
                break;
            }
            case 57:
            case 64: {
                if (n5 != 5) {
                    break;
                }
                b.putObject(o, n8, okn.k(array, n));
                b.putInt(o, n10, n4);
                return n + 4;
            }
            case 56:
            case 65: {
                if (n5 != 1) {
                    break;
                }
                b.putObject(o, n8, okn.x(array, n));
                b.putInt(o, n10, n4);
                return n + 8;
            }
            case 55:
            case 62: {
                if (n5 != 0) {
                    break;
                }
                n = okn.s(array, n, ojl);
                b.putObject(o, n8, ojl.a);
                b.putInt(o, n10, n4);
                return n;
            }
            case 53:
            case 54: {
                if (n5 != 0) {
                    break;
                }
                n = okn.v(array, n, ojl);
                b.putObject(o, n8, ojl.b);
                b.putInt(o, n10, n4);
                return n;
            }
            case 52: {
                if (n5 != 5) {
                    break;
                }
                b.putObject(o, n8, okn.i(array, n));
                b.putInt(o, n10, n4);
                return n + 4;
            }
            case 51: {
                if (n5 != 1) {
                    break;
                }
                b.putObject(o, n8, okn.h(array, n));
                b.putInt(o, n10, n4);
                return n + 8;
            }
        }
        return n;
    }
    
    private final int w(Object x, final byte[] array, int i, int n, final int n2, int n3, int n4, final int n5, final long n6, final int n7, final long n8, final ojl ojl) {
        final int n9 = i;
        final Unsafe b = oml.b;
        olj e = (olj)b.getObject(x, n8);
        if (!e.c()) {
            final int size = e.size();
            int n10;
            if (size == 0) {
                n10 = 10;
            }
            else {
                n10 = size + size;
            }
            e = e.e(n10);
            b.putObject(x, n8, e);
        }
        switch (n7) {
            default: {
                if (n4 == 3) {
                    final omy g = this.G(n5);
                    n3 = ((n2 & 0xFFFFFFF8) | 0x4);
                    i = okn.l(g, array, i, n, n3, ojl);
                    e.add(ojl.c);
                    while (i < n) {
                        n4 = okn.s(array, i, ojl);
                        if (n2 != ojl.a) {
                            break;
                        }
                        i = okn.l(g, array, n4, n, n3, ojl);
                        e.add(ojl.c);
                    }
                    return i;
                }
                n3 = n9;
                return n3;
            }
            case 34:
            case 48: {
                if (n4 == 2) {
                    final oly oly = (oly)e;
                    i = okn.s(array, n9, ojl);
                    n = ojl.a + i;
                    while (i < n) {
                        i = okn.v(array, i, ojl);
                        oly.d(okb.G(ojl.b));
                    }
                    if (i == n) {
                        return i;
                    }
                    throw olm.i();
                }
                else {
                    if (n4 == 0) {
                        final oly oly2 = (oly)e;
                        i = okn.v(array, n9, ojl);
                        oly2.d(okb.G(ojl.b));
                        while (i < n) {
                            n3 = okn.s(array, i, ojl);
                            if (n2 != ojl.a) {
                                break;
                            }
                            i = okn.v(array, n3, ojl);
                            oly2.d(okb.G(ojl.b));
                        }
                        return i;
                    }
                    n3 = n9;
                    return n3;
                }
                break;
            }
            case 33:
            case 47: {
                if (n4 == 2) {
                    final okz okz = (okz)e;
                    i = okn.s(array, n9, ojl);
                    n = ojl.a + i;
                    while (i < n) {
                        i = okn.s(array, i, ojl);
                        okz.g(okb.F(ojl.a));
                    }
                    if (i == n) {
                        return i;
                    }
                    throw olm.i();
                }
                else {
                    if (n4 == 0) {
                        final okz okz2 = (okz)e;
                        i = okn.s(array, n9, ojl);
                        okz2.g(okb.F(ojl.a));
                        while (i < n) {
                            n3 = okn.s(array, i, ojl);
                            if (n2 != ojl.a) {
                                break;
                            }
                            i = okn.s(array, n3, ojl);
                            okz2.g(okb.F(ojl.a));
                        }
                        return i;
                    }
                    n3 = n9;
                    return n3;
                }
                break;
            }
            case 30:
            case 44: {
                if (n4 == 2) {
                    i = okn.o(array, n9, e, ojl);
                }
                else {
                    if (n4 != 0) {
                        n3 = n9;
                        return n3;
                    }
                    i = okn.u(n2, array, i, n, e, ojl);
                }
                final oky oky = (oky)x;
                onk aa;
                if ((aa = oky.aA) == onk.a) {
                    aa = null;
                }
                x = omz.X(n3, e, this.F(n5), aa);
                if (x == null) {
                    return i;
                }
                oky.aA = (onk)x;
                return i;
            }
            case 28: {
                if (n4 != 2) {
                    break;
                }
                i = okn.s(array, n9, ojl);
                n3 = ojl.a;
                if (n3 < 0) {
                    throw olm.f();
                }
                if (n3 <= array.length - i) {
                    if (n3 == 0) {
                        e.add(ojw.b);
                    }
                    else {
                        e.add(ojw.u(array, i, n3));
                        i += n3;
                    }
                    while (i < n) {
                        n3 = okn.s(array, i, ojl);
                        if (n2 != ojl.a) {
                            break;
                        }
                        i = okn.s(array, n3, ojl);
                        n3 = ojl.a;
                        if (n3 < 0) {
                            throw olm.f();
                        }
                        if (n3 > array.length - i) {
                            throw olm.i();
                        }
                        if (n3 == 0) {
                            e.add(ojw.b);
                        }
                        else {
                            e.add(ojw.u(array, i, n3));
                            i += n3;
                        }
                    }
                    return i;
                }
                throw olm.i();
            }
            case 27: {
                if (n4 != 2) {
                    break;
                }
                return okn.n(this.G(n5), n2, array, i, n, e, ojl);
            }
            case 26: {
                if (n4 != 2) {
                    n3 = n9;
                    return n3;
                }
                if ((n6 & 0x20000000L) == 0x0L) {
                    i = okn.s(array, n9, ojl);
                    n3 = ojl.a;
                    if (n3 < 0) {
                        throw olm.f();
                    }
                    if (n3 == 0) {
                        e.add("");
                    }
                    else {
                        e.add(new String(array, i, n3, olk.a));
                        i += n3;
                    }
                    while (true) {
                        n3 = i;
                        if (i >= n) {
                            return n3;
                        }
                        n4 = okn.s(array, i, ojl);
                        n3 = i;
                        if (n2 != ojl.a) {
                            return n3;
                        }
                        i = okn.s(array, n4, ojl);
                        n3 = ojl.a;
                        if (n3 < 0) {
                            throw olm.f();
                        }
                        if (n3 == 0) {
                            e.add("");
                        }
                        else {
                            e.add(new String(array, i, n3, olk.a));
                            i += n3;
                        }
                    }
                }
                else {
                    i = okn.s(array, n9, ojl);
                    n4 = ojl.a;
                    if (n4 < 0) {
                        throw olm.f();
                    }
                    if (n4 == 0) {
                        e.add("");
                    }
                    else {
                        n3 = i + n4;
                        if (!onu.h(array, i, n3)) {
                            throw olm.d();
                        }
                        e.add(new String(array, i, n4, olk.a));
                        i = n3;
                    }
                    while (true) {
                        n3 = i;
                        if (i >= n) {
                            return n3;
                        }
                        n4 = okn.s(array, i, ojl);
                        n3 = i;
                        if (n2 != ojl.a) {
                            return n3;
                        }
                        n3 = okn.s(array, n4, ojl);
                        n4 = ojl.a;
                        if (n4 < 0) {
                            throw olm.f();
                        }
                        if (n4 == 0) {
                            e.add("");
                            i = n3;
                        }
                        else {
                            i = n3 + n4;
                            if (!onu.h(array, n3, i)) {
                                throw olm.d();
                            }
                            e.add(new String(array, n3, n4, olk.a));
                        }
                    }
                }
                break;
            }
            case 25:
            case 42: {
                if (n4 == 2) {
                    final ojo ojo = (ojo)e;
                    i = okn.s(array, n9, ojl);
                    n = ojl.a + i;
                    while (i < n) {
                        i = okn.v(array, i, ojl);
                        ojo.f(ojl.b != 0L);
                    }
                    if (i == n) {
                        return i;
                    }
                    throw olm.i();
                }
                else {
                    if (n4 == 0) {
                        final ojo ojo2 = (ojo)e;
                        i = okn.v(array, n9, ojl);
                        ojo2.f(ojl.b != 0L);
                        while (i < n) {
                            n3 = okn.s(array, i, ojl);
                            if (n2 != ojl.a) {
                                break;
                            }
                            i = okn.v(array, n3, ojl);
                            ojo2.f(ojl.b != 0L);
                        }
                        return i;
                    }
                    n3 = n9;
                    return n3;
                }
                break;
            }
            case 24:
            case 31:
            case 41:
            case 45: {
                if (n4 == 2) {
                    final okz okz3 = (okz)e;
                    for (i = okn.s(array, n9, ojl), n = ojl.a + i; i < n; i += 4) {
                        okz3.g(okn.k(array, i));
                    }
                    if (i == n) {
                        return i;
                    }
                    throw olm.i();
                }
                else {
                    if (n4 == 5) {
                        final okz okz4 = (okz)e;
                        okz4.g(okn.k(array, i));
                        for (i = n9 + 4; i < n; i = n3 + 4) {
                            n3 = okn.s(array, i, ojl);
                            if (n2 != ojl.a) {
                                break;
                            }
                            okz4.g(okn.k(array, n3));
                        }
                        return i;
                    }
                    n3 = n9;
                    return n3;
                }
                break;
            }
            case 23:
            case 32:
            case 40:
            case 46: {
                if (n4 == 2) {
                    final oly oly3 = (oly)e;
                    for (i = okn.s(array, n9, ojl), n = ojl.a + i; i < n; i += 8) {
                        oly3.d(okn.x(array, i));
                    }
                    if (i == n) {
                        return i;
                    }
                    throw olm.i();
                }
                else {
                    if (n4 == 1) {
                        final oly oly4 = (oly)e;
                        oly4.d(okn.x(array, i));
                        for (i = n9 + 8; i < n; i = n3 + 8) {
                            n3 = okn.s(array, i, ojl);
                            if (n2 != ojl.a) {
                                break;
                            }
                            oly4.d(okn.x(array, n3));
                        }
                        return i;
                    }
                    n3 = n9;
                    return n3;
                }
                break;
            }
            case 22:
            case 29:
            case 39:
            case 43: {
                if (n4 == 2) {
                    i = okn.o(array, n9, e, ojl);
                    return i;
                }
                if (n4 != 0) {
                    n3 = n9;
                    return n3;
                }
                return okn.u(n2, array, i, n, e, ojl);
            }
            case 20:
            case 21:
            case 37:
            case 38: {
                if (n4 == 2) {
                    final oly oly5 = (oly)e;
                    i = okn.s(array, n9, ojl);
                    n = ojl.a + i;
                    while (i < n) {
                        i = okn.v(array, i, ojl);
                        oly5.d(ojl.b);
                    }
                    if (i == n) {
                        return i;
                    }
                    throw olm.i();
                }
                else {
                    if (n4 == 0) {
                        final oly oly6 = (oly)e;
                        i = okn.v(array, n9, ojl);
                        oly6.d(ojl.b);
                        while (i < n) {
                            n3 = okn.s(array, i, ojl);
                            if (n2 != ojl.a) {
                                break;
                            }
                            i = okn.v(array, n3, ojl);
                            oly6.d(ojl.b);
                        }
                        return i;
                    }
                    n3 = n9;
                    return n3;
                }
                break;
            }
            case 19:
            case 36: {
                if (n4 == 2) {
                    final okr okr = (okr)e;
                    for (i = okn.s(array, n9, ojl), n = ojl.a + i; i < n; i += 4) {
                        okr.g(okn.i(array, i));
                    }
                    if (i == n) {
                        return i;
                    }
                    throw olm.i();
                }
                else {
                    if (n4 == 5) {
                        final okr okr2 = (okr)e;
                        okr2.g(okn.i(array, i));
                        for (i = n9 + 4; i < n; i = n3 + 4) {
                            n3 = okn.s(array, i, ojl);
                            if (n2 != ojl.a) {
                                break;
                            }
                            okr2.g(okn.i(array, n3));
                        }
                        return i;
                    }
                    n3 = n9;
                    return n3;
                }
                break;
            }
            case 18:
            case 35: {
                if (n4 == 2) {
                    final oki oki = (oki)e;
                    for (i = okn.s(array, n9, ojl), n = ojl.a + i; i < n; i += 8) {
                        oki.d(okn.h(array, i));
                    }
                    if (i == n) {
                        return i;
                    }
                    throw olm.i();
                }
                else {
                    if (n4 == 1) {
                        final oki oki2 = (oki)e;
                        oki2.d(okn.h(array, i));
                        for (i = n9 + 8; i < n; i = n3 + 8) {
                            n3 = okn.s(array, i, ojl);
                            if (n2 != ojl.a) {
                                break;
                            }
                            oki2.d(okn.h(array, n3));
                        }
                        return i;
                    }
                    n3 = n9;
                    return n3;
                }
                break;
            }
        }
        n3 = n9;
        i = n3;
        return i;
    }
    
    private final int x(final int n) {
        if (n >= this.e && n <= this.f) {
            return this.A(n, 0);
        }
        return -1;
    }
    
    private final int y(final int n, final int n2) {
        if (n >= this.e && n <= this.f) {
            return this.A(n, n2);
        }
        return -1;
    }
    
    private final int z(final int n) {
        return this.c[n + 2];
    }
    
    @Override
    public final int a(final Object o) {
        int n;
        if (this.j) {
            n = this.r(o);
        }
        else {
            n = this.q(o);
        }
        return n;
    }
    
    @Override
    public final int b(final Object o) {
        final int length = this.c.length;
        int i = 0;
        int n = 0;
        while (i < length) {
            final int c = this.C(i);
            final int s = this.s(i);
            final long d = D(c);
            final int b = B(c);
            int n2 = 37;
            int n3 = 0;
            switch (b) {
                default: {
                    n3 = n;
                    break;
                }
                case 68: {
                    n3 = n;
                    if (this.U(o, s, i)) {
                        n3 = n * 53 + ons.h(o, d).hashCode();
                        break;
                    }
                    break;
                }
                case 67: {
                    n3 = n;
                    if (this.U(o, s, i)) {
                        n3 = n * 53 + olk.c(E(o, d));
                        break;
                    }
                    break;
                }
                case 66: {
                    n3 = n;
                    if (this.U(o, s, i)) {
                        n3 = n * 53 + t(o, d);
                        break;
                    }
                    break;
                }
                case 65: {
                    n3 = n;
                    if (this.U(o, s, i)) {
                        n3 = n * 53 + olk.c(E(o, d));
                        break;
                    }
                    break;
                }
                case 64: {
                    n3 = n;
                    if (this.U(o, s, i)) {
                        n3 = n * 53 + t(o, d);
                        break;
                    }
                    break;
                }
                case 63: {
                    n3 = n;
                    if (this.U(o, s, i)) {
                        n3 = n * 53 + t(o, d);
                        break;
                    }
                    break;
                }
                case 62: {
                    n3 = n;
                    if (this.U(o, s, i)) {
                        n3 = n * 53 + t(o, d);
                        break;
                    }
                    break;
                }
                case 61: {
                    n3 = n;
                    if (this.U(o, s, i)) {
                        n3 = n * 53 + ons.h(o, d).hashCode();
                        break;
                    }
                    break;
                }
                case 60: {
                    n3 = n;
                    if (this.U(o, s, i)) {
                        n3 = n * 53 + ons.h(o, d).hashCode();
                        break;
                    }
                    break;
                }
                case 59: {
                    n3 = n;
                    if (this.U(o, s, i)) {
                        n3 = n * 53 + ((String)ons.h(o, d)).hashCode();
                        break;
                    }
                    break;
                }
                case 58: {
                    n3 = n;
                    if (this.U(o, s, i)) {
                        n3 = n * 53 + olk.a(V(o, d));
                        break;
                    }
                    break;
                }
                case 57: {
                    n3 = n;
                    if (this.U(o, s, i)) {
                        n3 = n * 53 + t(o, d);
                        break;
                    }
                    break;
                }
                case 56: {
                    n3 = n;
                    if (this.U(o, s, i)) {
                        n3 = n * 53 + olk.c(E(o, d));
                        break;
                    }
                    break;
                }
                case 55: {
                    n3 = n;
                    if (this.U(o, s, i)) {
                        n3 = n * 53 + t(o, d);
                        break;
                    }
                    break;
                }
                case 54: {
                    n3 = n;
                    if (this.U(o, s, i)) {
                        n3 = n * 53 + olk.c(E(o, d));
                        break;
                    }
                    break;
                }
                case 53: {
                    n3 = n;
                    if (this.U(o, s, i)) {
                        n3 = n * 53 + olk.c(E(o, d));
                        break;
                    }
                    break;
                }
                case 52: {
                    n3 = n;
                    if (this.U(o, s, i)) {
                        n3 = n * 53 + Float.floatToIntBits(p(o, d));
                        break;
                    }
                    break;
                }
                case 51: {
                    n3 = n;
                    if (this.U(o, s, i)) {
                        n3 = n * 53 + olk.c(Double.doubleToLongBits(o(o, d)));
                        break;
                    }
                    break;
                }
                case 50: {
                    n3 = n * 53 + ons.h(o, d).hashCode();
                    break;
                }
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49: {
                    n3 = n * 53 + ons.h(o, d).hashCode();
                    break;
                }
                case 17: {
                    final Object h = ons.h(o, d);
                    if (h != null) {
                        n2 = h.hashCode();
                    }
                    n3 = n * 53 + n2;
                    break;
                }
                case 16: {
                    n3 = n * 53 + olk.c(ons.f(o, d));
                    break;
                }
                case 15: {
                    n3 = n * 53 + ons.d(o, d);
                    break;
                }
                case 14: {
                    n3 = n * 53 + olk.c(ons.f(o, d));
                    break;
                }
                case 13: {
                    n3 = n * 53 + ons.d(o, d);
                    break;
                }
                case 12: {
                    n3 = n * 53 + ons.d(o, d);
                    break;
                }
                case 11: {
                    n3 = n * 53 + ons.d(o, d);
                    break;
                }
                case 10: {
                    n3 = n * 53 + ons.h(o, d).hashCode();
                    break;
                }
                case 9: {
                    final Object h2 = ons.h(o, d);
                    if (h2 != null) {
                        n2 = h2.hashCode();
                    }
                    n3 = n * 53 + n2;
                    break;
                }
                case 8: {
                    n3 = n * 53 + ((String)ons.h(o, d)).hashCode();
                    break;
                }
                case 7: {
                    n3 = n * 53 + olk.a(ons.w(o, d));
                    break;
                }
                case 6: {
                    n3 = n * 53 + ons.d(o, d);
                    break;
                }
                case 5: {
                    n3 = n * 53 + olk.c(ons.f(o, d));
                    break;
                }
                case 4: {
                    n3 = n * 53 + ons.d(o, d);
                    break;
                }
                case 3: {
                    n3 = n * 53 + olk.c(ons.f(o, d));
                    break;
                }
                case 2: {
                    n3 = n * 53 + olk.c(ons.f(o, d));
                    break;
                }
                case 1: {
                    n3 = n * 53 + Float.floatToIntBits(ons.c(o, d));
                    break;
                }
                case 0: {
                    n3 = n * 53 + olk.c(Double.doubleToLongBits(ons.b(o, d)));
                    break;
                }
            }
            i += 3;
            n = n3;
        }
        int n4 = n * 53 + pjf.D(o).hashCode();
        if (this.h) {
            n4 = n4 * 53 + okn.b(o).hashCode();
        }
        return n4;
    }
    
    final int c(Object o, final byte[] array, int i, int n, int n2, final ojl ojl) {
        Object o2 = o;
        byte[] array2 = array;
        int n3 = n;
        ojl ojl2 = ojl;
        Unsafe b = oml.b;
        int j = i;
        int a = 0;
        int n4 = -1;
        int n5 = 0;
        i = 0;
        int n6 = 1048575;
        while (true) {
            while (j < n3) {
                int t = j + 1;
                a = array2[j];
                if (a < 0) {
                    t = okn.t(a, array2, t, ojl2);
                    a = ojl2.a;
                }
                final int n7 = a >>> 3;
                final int n8 = a & 0x7;
                if (n7 > n4) {
                    n5 = this.y(n7, n5 / 3);
                }
                else {
                    n5 = this.x(n7);
                }
                int n9 = 0;
                int n10 = 0;
                Label_2062: {
                    if (n5 == -1) {
                        n9 = 0;
                        n10 = i;
                        i = t;
                    }
                    else {
                        final int n11 = this.c[n5 + 1];
                        final int b2 = B(n11);
                        final int n12 = n7;
                        final long d = D(n11);
                        if (b2 <= 17) {
                            final int n13 = this.c[n5 + 2];
                            final int n14 = 1 << (n13 >>> 20);
                            final int n15 = n13 & 0xFFFFF;
                            int n16;
                            if (n15 != n6) {
                                if (n6 != 1048575) {
                                    b.putInt(o2, (long)n6, i);
                                }
                                final int int1 = b.getInt(o2, (long)n15);
                                i = n15;
                                n16 = int1;
                            }
                            else {
                                n16 = i;
                                i = n6;
                            }
                            final int n17 = n5;
                            switch (b2) {
                                default: {
                                    n5 = n17;
                                    if (n8 == 3) {
                                        final int l = okn.l(this.G(n5), array, t, n, n12 << 3 | 0x4, ojl);
                                        if ((n16 & n14) == 0x0) {
                                            b.putObject(o2, d, ojl2.c);
                                        }
                                        else {
                                            b.putObject(o2, d, olk.e(b.getObject(o2, d), ojl2.c));
                                        }
                                        final int n18 = n16 | n14;
                                        array2 = array;
                                        n3 = n;
                                        n4 = n12;
                                        n6 = i;
                                        j = l;
                                        i = n18;
                                        continue;
                                    }
                                    break;
                                }
                                case 16: {
                                    if (n8 == 0) {
                                        final int v = okn.v(array2, t, ojl2);
                                        b.putLong(o, d, okb.G(ojl2.b));
                                        final int n19 = n16 | n14;
                                        final int n20 = v;
                                        final int n21 = n12;
                                        final int n22 = i;
                                        j = n20;
                                        n4 = n21;
                                        n5 = n17;
                                        i = n19;
                                        n6 = n22;
                                        continue;
                                    }
                                    break;
                                }
                                case 15: {
                                    if (n8 == 0) {
                                        final int s = okn.s(array2, t, ojl2);
                                        b.putInt(o2, d, okb.F(ojl2.a));
                                        final int n23 = n16 | n14;
                                        n4 = n12;
                                        final int n24 = i;
                                        j = s;
                                        n5 = n17;
                                        i = n23;
                                        n6 = n24;
                                        continue;
                                    }
                                    break;
                                }
                                case 12: {
                                    final int n25 = a;
                                    final int n26 = n17;
                                    if (n8 != 0) {
                                        break;
                                    }
                                    final int s2 = okn.s(array2, t, ojl2);
                                    final int a2 = ojl2.a;
                                    final old f = this.F(n26);
                                    if (f != null && !f.a(a2)) {
                                        d(o).e(n25, (long)a2);
                                        final int n27 = n16;
                                        a = n25;
                                        n4 = n12;
                                        final int n28 = i;
                                        j = s2;
                                        n5 = n26;
                                        i = n27;
                                        n6 = n28;
                                        continue;
                                    }
                                    b.putInt(o2, d, a2);
                                    final int n29 = n16 | n14;
                                    a = n25;
                                    n4 = n12;
                                    n6 = i;
                                    j = s2;
                                    n5 = n26;
                                    i = n29;
                                    continue;
                                }
                                case 10: {
                                    if (n8 == 2) {
                                        final int k = okn.j(array2, t, ojl2);
                                        b.putObject(o2, d, ojl2.c);
                                        final int n30 = n16 | n14;
                                        n4 = n12;
                                        final int n31 = i;
                                        j = k;
                                        n5 = n17;
                                        i = n30;
                                        n6 = n31;
                                        continue;
                                    }
                                    break;
                                }
                                case 9: {
                                    n5 = n17;
                                    if (n8 == 2) {
                                        final int m = okn.m(this.G(n5), array2, t, n3, ojl2);
                                        if ((n16 & n14) == 0x0) {
                                            b.putObject(o2, d, ojl2.c);
                                        }
                                        else {
                                            b.putObject(o2, d, olk.e(b.getObject(o2, d), ojl2.c));
                                        }
                                        final int n32 = n16 | n14;
                                        n4 = n12;
                                        n6 = i;
                                        j = m;
                                        i = n32;
                                        continue;
                                    }
                                    break;
                                }
                                case 8: {
                                    if (n8 == 2) {
                                        int n33;
                                        if ((n11 & 0x20000000) == 0x0) {
                                            n33 = okn.p(array2, t, ojl2);
                                        }
                                        else {
                                            n33 = okn.q(array2, t, ojl2);
                                        }
                                        b.putObject(o2, d, ojl2.c);
                                        final int n34 = n16 | n14;
                                        n4 = n12;
                                        final int n35 = n17;
                                        n6 = i;
                                        j = n33;
                                        n5 = n35;
                                        i = n34;
                                        continue;
                                    }
                                    break;
                                }
                                case 7: {
                                    if (n8 == 0) {
                                        final int v2 = okn.v(array2, t, ojl2);
                                        ons.m(o2, d, ojl2.b != 0L);
                                        final int n36 = n16 | n14;
                                        n4 = n12;
                                        n5 = n17;
                                        n6 = i;
                                        j = v2;
                                        i = n36;
                                        continue;
                                    }
                                    break;
                                }
                                case 6:
                                case 13: {
                                    if (n8 == 5) {
                                        b.putInt(o2, d, okn.k(array2, t));
                                        final int n37 = t + 4;
                                        final int n38 = n16 | n14;
                                        n4 = n12;
                                        final int n39 = i;
                                        j = n37;
                                        n5 = n17;
                                        i = n38;
                                        n6 = n39;
                                        continue;
                                    }
                                    break;
                                }
                                case 5:
                                case 14: {
                                    if (n8 == 1) {
                                        b.putLong(o, d, okn.x(array2, t));
                                        final int n40 = t + 8;
                                        final int n41 = n16 | n14;
                                        n4 = n12;
                                        final int n42 = i;
                                        n3 = n;
                                        j = n40;
                                        n5 = n17;
                                        i = n41;
                                        n6 = n42;
                                        continue;
                                    }
                                    break;
                                }
                                case 4:
                                case 11: {
                                    if (n8 == 0) {
                                        final int s3 = okn.s(array2, t, ojl2);
                                        b.putInt(o2, d, ojl2.a);
                                        final int n43 = n16 | n14;
                                        n4 = n12;
                                        final int n44 = i;
                                        n3 = n;
                                        j = s3;
                                        n5 = n17;
                                        i = n43;
                                        n6 = n44;
                                        continue;
                                    }
                                    break;
                                }
                                case 2:
                                case 3: {
                                    if (n8 == 0) {
                                        final int v3 = okn.v(array2, t, ojl2);
                                        b.putLong(o, d, ojl2.b);
                                        final int n45 = n16 | n14;
                                        final int n46 = v3;
                                        final int n47 = n12;
                                        final int n48 = i;
                                        n3 = n;
                                        j = n46;
                                        n4 = n47;
                                        n5 = n17;
                                        i = n45;
                                        n6 = n48;
                                        continue;
                                    }
                                    break;
                                }
                                case 1: {
                                    int n49 = t;
                                    if (n8 == 5) {
                                        ons.r(o2, d, okn.i(array2, n49));
                                        n49 += 4;
                                        final int n50 = n16 | n14;
                                        n4 = n12;
                                        final int n51 = i;
                                        n3 = n;
                                        j = n49;
                                        n5 = n17;
                                        i = n50;
                                        n6 = n51;
                                        continue;
                                    }
                                    break;
                                }
                                case 0: {
                                    int n52 = t;
                                    if (n8 == 1) {
                                        ons.q(o2, d, okn.h(array2, n52));
                                        n52 += 8;
                                        final int n53 = n16 | n14;
                                        n4 = n12;
                                        final int n54 = i;
                                        n3 = n;
                                        j = n52;
                                        n5 = n17;
                                        i = n53;
                                        n6 = n54;
                                        continue;
                                    }
                                    break;
                                }
                            }
                            n10 = n16;
                            n9 = n17;
                            n6 = i;
                            i = t;
                        }
                        else {
                            if (b2 == 27) {
                                if (n8 == 2) {
                                    olj e = (olj)b.getObject(o2, d);
                                    if (!e.c()) {
                                        final int size = e.size();
                                        int n55;
                                        if (size == 0) {
                                            n55 = 10;
                                        }
                                        else {
                                            n55 = size + size;
                                        }
                                        e = e.e(n55);
                                        b.putObject(o2, d, e);
                                    }
                                    final int n56 = okn.n(this.G(n5), a, array, t, n, e, ojl);
                                    array2 = array;
                                    n3 = n;
                                    n4 = n12;
                                    j = n56;
                                    continue;
                                }
                            }
                            else {
                                final int n57 = i;
                                final int n58 = n6;
                                if (b2 <= 49) {
                                    final long n59 = n11;
                                    final int n60 = n5;
                                    final int n61 = a;
                                    final int w = this.w(o, array, t, n, a, n12, n8, n5, n59, b2, d, ojl);
                                    if (w != t) {
                                        o2 = o;
                                        array2 = array;
                                        final int n62 = n;
                                        ojl2 = ojl;
                                        n5 = n60;
                                        i = n57;
                                        final int n63 = n12;
                                        a = n61;
                                        final int n64 = n58;
                                        j = w;
                                        n4 = n63;
                                        n6 = n64;
                                        n3 = n62;
                                        continue;
                                    }
                                    i = w;
                                    n6 = n58;
                                    n9 = n60;
                                    n10 = n57;
                                    a = n61;
                                    break Label_2062;
                                }
                                else {
                                    final int n65 = t;
                                    final int n66 = n5;
                                    final Unsafe unsafe = b;
                                    final int n67 = a;
                                    if (b2 == 50) {
                                        if (n8 == 2) {
                                            final int u = this.u(o, array, n65, n, n66, d, ojl);
                                            if (u != n65) {
                                                o2 = o;
                                                final int n68 = n;
                                                ojl2 = ojl;
                                                n5 = n66;
                                                i = n57;
                                                final int n69 = n12;
                                                a = n67;
                                                final int n70 = n58;
                                                j = u;
                                                n4 = n69;
                                                n6 = n70;
                                                b = unsafe;
                                                array2 = array;
                                                n3 = n68;
                                                continue;
                                            }
                                            i = u;
                                            n6 = n58;
                                            n9 = n66;
                                            n10 = n57;
                                            a = n67;
                                            break Label_2062;
                                        }
                                    }
                                    else {
                                        i = this.v(o, array, n65, n, n67, n12, n8, n11, b2, d, n66, ojl);
                                        if (i != n65) {
                                            o2 = o;
                                            final int n71 = n;
                                            ojl2 = ojl;
                                            n5 = n66;
                                            final int n72 = n12;
                                            a = n67;
                                            n6 = n58;
                                            j = i;
                                            n4 = n72;
                                            i = n57;
                                            b = unsafe;
                                            array2 = array;
                                            n3 = n71;
                                            continue;
                                        }
                                        n6 = n58;
                                        a = n67;
                                        n10 = n57;
                                        n9 = n66;
                                        break Label_2062;
                                    }
                                }
                            }
                            n10 = i;
                            n9 = n5;
                            i = t;
                        }
                    }
                }
                final int n73 = n7;
                final int n74 = n2;
                if (a == n74 && n74 != 0) {
                    final oml oml = this;
                    n2 = i;
                    i = n6;
                    final int n75 = n10;
                    j = n2;
                    n2 = n75;
                    if (i != 1048575) {
                        b.putInt(o, (long)i, n2);
                    }
                    i = oml.l;
                    Object ab = null;
                    while (i < oml.m) {
                        ab = oml.ab(o, oml.k[i], ab);
                        ++i;
                    }
                    if (ab != null) {
                        pjf.E(o, (onk)ab);
                    }
                    if (n74 == 0) {
                        if (j != n) {
                            throw olm.g();
                        }
                    }
                    else if (j > n || a != n74) {
                        throw olm.g();
                    }
                    return j;
                }
                if (this.h && ojl.d != okm.a()) {
                    final omj g = this.g;
                    final okm d2 = ojl.d;
                    final int n76 = n73;
                    final okk d3 = d2.d(g, n76);
                    if (d3 == null) {
                        i = okn.r(a, array, i, n, d(o), ojl);
                    }
                    else {
                        final okw okw = (okw)o;
                        okw.i();
                        final okp f2 = okw.f;
                        if (d3.b() == onv.n) {
                            okn.s(array, i, ojl);
                            throw null;
                        }
                        Object o3 = null;
                        switch (d3.b().ordinal()) {
                            default: {
                                o3 = null;
                                break;
                            }
                            case 17: {
                                i = okn.v(array, i, ojl);
                                o3 = okb.G(ojl.b);
                                break;
                            }
                            case 16: {
                                i = okn.s(array, i, ojl);
                                o3 = okb.F(ojl.a);
                                break;
                            }
                            case 13: {
                                throw new IllegalStateException("Shouldn't reach here.");
                            }
                            case 11: {
                                i = okn.j(array, i, ojl);
                                o3 = ojl.c;
                                break;
                            }
                            case 10: {
                                i = okn.m(omr.a.a(d3.c.getClass()), array, i, n, ojl);
                                o3 = ojl.c;
                                break;
                            }
                            case 9: {
                                i = okn.l(omr.a.a(d3.c.getClass()), array, i, n, n76 << 3 | 0x4, ojl);
                                o3 = ojl.c;
                                break;
                            }
                            case 8: {
                                i = okn.p(array, i, ojl);
                                o3 = ojl.c;
                                break;
                            }
                            case 7: {
                                i = okn.v(array, i, ojl);
                                o3 = (ojl.b != 0L);
                                break;
                            }
                            case 6:
                            case 14: {
                                final int k2 = okn.k(array, i);
                                i += 4;
                                o3 = k2;
                                break;
                            }
                            case 5:
                            case 15: {
                                final long x = okn.x(array, i);
                                i += 8;
                                o3 = x;
                                break;
                            }
                            case 4:
                            case 12: {
                                i = okn.s(array, i, ojl);
                                o3 = ojl.a;
                                break;
                            }
                            case 2:
                            case 3: {
                                i = okn.v(array, i, ojl);
                                o3 = ojl.b;
                                break;
                            }
                            case 1: {
                                final float i2 = okn.i(array, i);
                                i += 4;
                                o3 = i2;
                                break;
                            }
                            case 0: {
                                final double h = okn.h(array, i);
                                i += 8;
                                o3 = h;
                                break;
                            }
                        }
                        d3.c();
                        Object e2 = null;
                        switch (d3.b().ordinal()) {
                            default: {
                                e2 = o3;
                                break;
                            }
                            case 9:
                            case 10: {
                                final Object k3 = f2.k(d3.d);
                                e2 = o3;
                                if (k3 != null) {
                                    e2 = olk.e(k3, o3);
                                    break;
                                }
                                break;
                            }
                        }
                        f2.l(d3.d, e2);
                    }
                }
                else {
                    i = okn.r(a, array, i, n, d(o), ojl);
                }
                final int n77 = n73;
                o2 = o;
                array2 = array;
                n5 = n9;
                final int n78 = n10;
                n3 = n;
                ojl2 = ojl;
                j = i;
                n4 = n77;
                i = n78;
            }
            n = n3;
            o = o2;
            final oml oml = this;
            final int n74 = n2;
            n2 = i;
            i = n6;
            continue;
        }
    }
    
    @Override
    public final Object e() {
        return ((oky)this.g).H(4);
    }
    
    @Override
    public final void f(final Object o) {
        int l = this.l;
        int m;
        while (true) {
            m = this.m;
            if (l >= m) {
                break;
            }
            final long d = D(this.C(this.k[l]));
            final Object h = ons.h(o, d);
            if (h != null) {
                ((ome)h).c();
                ons.u(o, d, h);
            }
            ++l;
        }
        for (int length = this.k.length, i = m; i < length; ++i) {
            this.n.c(o, this.k[i]);
        }
        pjf.G(o);
        if (this.h) {
            okn.f(o);
        }
    }
    
    @Override
    public final void g(final Object o, final Object o2) {
        if (o2 == null) {
            throw null;
        }
        for (int i = 0; i < this.c.length; i += 3) {
            final int c = this.C(i);
            final long d = D(c);
            final int s = this.s(i);
            switch (B(c)) {
                case 68: {
                    this.L(o, o2, i);
                    break;
                }
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67: {
                    if (this.U(o2, s, i)) {
                        ons.u(o, d, ons.h(o2, d));
                        this.O(o, s, i);
                        break;
                    }
                    break;
                }
                case 60: {
                    this.L(o, o2, i);
                    break;
                }
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59: {
                    if (this.U(o2, s, i)) {
                        ons.u(o, d, ons.h(o2, d));
                        this.O(o, s, i);
                        break;
                    }
                    break;
                }
                case 50: {
                    omz.U(o, o2, d);
                    break;
                }
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49: {
                    this.n.d(o, o2, d);
                    break;
                }
                case 17: {
                    this.K(o, o2, i);
                    break;
                }
                case 16: {
                    if (this.R(o2, i)) {
                        ons.t(o, d, ons.f(o2, d));
                        this.N(o, i);
                        break;
                    }
                    break;
                }
                case 15: {
                    if (this.R(o2, i)) {
                        ons.s(o, d, ons.d(o2, d));
                        this.N(o, i);
                        break;
                    }
                    break;
                }
                case 14: {
                    if (this.R(o2, i)) {
                        ons.t(o, d, ons.f(o2, d));
                        this.N(o, i);
                        break;
                    }
                    break;
                }
                case 13: {
                    if (this.R(o2, i)) {
                        ons.s(o, d, ons.d(o2, d));
                        this.N(o, i);
                        break;
                    }
                    break;
                }
                case 12: {
                    if (this.R(o2, i)) {
                        ons.s(o, d, ons.d(o2, d));
                        this.N(o, i);
                        break;
                    }
                    break;
                }
                case 11: {
                    if (this.R(o2, i)) {
                        ons.s(o, d, ons.d(o2, d));
                        this.N(o, i);
                        break;
                    }
                    break;
                }
                case 10: {
                    if (this.R(o2, i)) {
                        ons.u(o, d, ons.h(o2, d));
                        this.N(o, i);
                        break;
                    }
                    break;
                }
                case 9: {
                    this.K(o, o2, i);
                    break;
                }
                case 8: {
                    if (this.R(o2, i)) {
                        ons.u(o, d, ons.h(o2, d));
                        this.N(o, i);
                        break;
                    }
                    break;
                }
                case 7: {
                    if (this.R(o2, i)) {
                        ons.m(o, d, ons.w(o2, d));
                        this.N(o, i);
                        break;
                    }
                    break;
                }
                case 6: {
                    if (this.R(o2, i)) {
                        ons.s(o, d, ons.d(o2, d));
                        this.N(o, i);
                        break;
                    }
                    break;
                }
                case 5: {
                    if (this.R(o2, i)) {
                        ons.t(o, d, ons.f(o2, d));
                        this.N(o, i);
                        break;
                    }
                    break;
                }
                case 4: {
                    if (this.R(o2, i)) {
                        ons.s(o, d, ons.d(o2, d));
                        this.N(o, i);
                        break;
                    }
                    break;
                }
                case 3: {
                    if (this.R(o2, i)) {
                        ons.t(o, d, ons.f(o2, d));
                        this.N(o, i);
                        break;
                    }
                    break;
                }
                case 2: {
                    if (this.R(o2, i)) {
                        ons.t(o, d, ons.f(o2, d));
                        this.N(o, i);
                        break;
                    }
                    break;
                }
                case 1: {
                    if (this.R(o2, i)) {
                        ons.r(o, d, ons.c(o2, d));
                        this.N(o, i);
                        break;
                    }
                    break;
                }
                case 0: {
                    if (this.R(o2, i)) {
                        ons.q(o, d, ons.b(o2, d));
                        this.N(o, i);
                        break;
                    }
                    break;
                }
            }
        }
        omz.V(o, o2);
        if (this.h) {
            omz.T(o, o2);
        }
    }
    
    @Override
    public final void h(final Object o, omu omu, final okm okm) {
        if (okm == null) {
            throw null;
        }
        final pjf o2 = this.o;
        okp okp;
        Object o3 = okp = null;
        Object ab3 = null;
        Label_3617: {
            try {
                Label_0608: {
                    while (true) {
                        final int c = omu.c();
                        final int x = this.x(c);
                        if (x < 0) {
                            if (c == Integer.MAX_VALUE) {
                                int i = this.l;
                                omu = (omu)o3;
                                while (i < this.m) {
                                    omu = (omu)this.ab(o, this.k[i], omu);
                                    ++i;
                                }
                                if (omu != null) {
                                    break;
                                }
                                return;
                            }
                            else {
                                okk d;
                                if (!this.h) {
                                    d = null;
                                }
                                else {
                                    d = okm.d(this.g, c);
                                }
                                if (d != null) {
                                    okp c2;
                                    if ((c2 = okp) == null) {
                                        c2 = okn.c(o);
                                    }
                                    d.a();
                                    if (d.b() != onv.n) {
                                        Object o4 = null;
                                        switch (d.b().ordinal()) {
                                            default: {
                                                o4 = null;
                                                break;
                                            }
                                            case 17: {
                                                o4 = omu.n();
                                                break;
                                            }
                                            case 16: {
                                                o4 = omu.i();
                                                break;
                                            }
                                            case 15: {
                                                o4 = omu.m();
                                                break;
                                            }
                                            case 14: {
                                                o4 = omu.h();
                                                break;
                                            }
                                            case 13: {
                                                throw new IllegalStateException("Shouldn't reach here.");
                                            }
                                            case 12: {
                                                o4 = omu.j();
                                                break;
                                            }
                                            case 11: {
                                                o4 = omu.q();
                                                break;
                                            }
                                            case 10: {
                                                o4 = omu.t(d.c.getClass(), okm);
                                                break;
                                            }
                                            case 9: {
                                                o4 = omu.r(d.c.getClass(), okm);
                                                break;
                                            }
                                            case 8: {
                                                o4 = omu.v();
                                                break;
                                            }
                                            case 7: {
                                                o4 = omu.T();
                                                break;
                                            }
                                            case 6: {
                                                o4 = omu.f();
                                                break;
                                            }
                                            case 5: {
                                                o4 = omu.k();
                                                break;
                                            }
                                            case 4: {
                                                o4 = omu.g();
                                                break;
                                            }
                                            case 3: {
                                                o4 = omu.o();
                                                break;
                                            }
                                            case 2: {
                                                o4 = omu.l();
                                                break;
                                            }
                                            case 1: {
                                                o4 = omu.b();
                                                break;
                                            }
                                            case 0: {
                                                o4 = omu.a();
                                                break;
                                            }
                                        }
                                        d.c();
                                        Object e = null;
                                        switch (d.b().ordinal()) {
                                            default: {
                                                e = o4;
                                                break;
                                            }
                                            case 9:
                                            case 10: {
                                                final Object k = c2.k(d.d);
                                                e = o4;
                                                if (k != null) {
                                                    e = olk.e(k, o4);
                                                    break;
                                                }
                                                break;
                                            }
                                        }
                                        c2.l(d.d, e);
                                        okp = c2;
                                        continue;
                                    }
                                    break Label_0608;
                                }
                                else {
                                    Object f;
                                    if ((f = o3) == null) {
                                        f = pjf.F(o);
                                    }
                                    try {
                                        final boolean a = o2.A(f, omu);
                                        o3 = f;
                                        if (a) {
                                            continue;
                                        }
                                        int j = this.l;
                                        Object ab = f;
                                        while (j < this.m) {
                                            ab = this.ab(o, this.k[j], ab);
                                            ++j;
                                        }
                                        if (ab != null) {
                                            break;
                                        }
                                        return;
                                    }
                                    finally {
                                        break Label_3617;
                                    }
                                }
                            }
                        }
                        final int c3 = this.C(x);
                        try {
                            Label_3498: {
                                Object o5 = null;
                                switch (B(c3)) {
                                    default: {
                                        o5 = o3;
                                        if (o3 == null) {
                                            o5 = onk.c();
                                            break;
                                        }
                                        break;
                                    }
                                    case 68: {
                                        ons.u(o, D(c3), omu.s(this.G(x), okm));
                                        this.O(o, c, x);
                                        o5 = o3;
                                        break Label_3498;
                                    }
                                    case 67: {
                                        ons.u(o, D(c3), omu.n());
                                        this.O(o, c, x);
                                        o5 = o3;
                                        break Label_3498;
                                    }
                                    case 66: {
                                        ons.u(o, D(c3), omu.i());
                                        this.O(o, c, x);
                                        o5 = o3;
                                        break Label_3498;
                                    }
                                    case 65: {
                                        ons.u(o, D(c3), omu.m());
                                        this.O(o, c, x);
                                        o5 = o3;
                                        break Label_3498;
                                    }
                                    case 64: {
                                        ons.u(o, D(c3), omu.h());
                                        this.O(o, c, x);
                                        o5 = o3;
                                        break Label_3498;
                                    }
                                    case 63: {
                                        final int e2 = omu.e();
                                        final old f2 = this.F(x);
                                        if (f2 != null && !f2.a(e2)) {
                                            o5 = omz.W(c, e2, o3);
                                            break Label_3498;
                                        }
                                        ons.u(o, D(c3), e2);
                                        this.O(o, c, x);
                                        o5 = o3;
                                        break Label_3498;
                                    }
                                    case 62: {
                                        ons.u(o, D(c3), omu.j());
                                        this.O(o, c, x);
                                        o5 = o3;
                                        break Label_3498;
                                    }
                                    case 61: {
                                        ons.u(o, D(c3), omu.q());
                                        this.O(o, c, x);
                                        o5 = o3;
                                        break Label_3498;
                                    }
                                    case 60: {
                                        if (this.U(o, c, x)) {
                                            ons.u(o, D(c3), olk.e(ons.h(o, D(c3)), omu.u(this.G(x), okm)));
                                        }
                                        else {
                                            ons.u(o, D(c3), omu.u(this.G(x), okm));
                                            this.N(o, x);
                                        }
                                        this.O(o, c, x);
                                        o5 = o3;
                                        break Label_3498;
                                    }
                                    case 59: {
                                        this.M(o, c3, omu);
                                        this.O(o, c, x);
                                        o5 = o3;
                                        break Label_3498;
                                    }
                                    case 58: {
                                        ons.u(o, D(c3), omu.T());
                                        this.O(o, c, x);
                                        o5 = o3;
                                        break Label_3498;
                                    }
                                    case 57: {
                                        ons.u(o, D(c3), omu.f());
                                        this.O(o, c, x);
                                        o5 = o3;
                                        break Label_3498;
                                    }
                                    case 56: {
                                        ons.u(o, D(c3), omu.k());
                                        this.O(o, c, x);
                                        o5 = o3;
                                        break Label_3498;
                                    }
                                    case 55: {
                                        ons.u(o, D(c3), omu.g());
                                        this.O(o, c, x);
                                        o5 = o3;
                                        break Label_3498;
                                    }
                                    case 54: {
                                        ons.u(o, D(c3), omu.o());
                                        this.O(o, c, x);
                                        o5 = o3;
                                        break Label_3498;
                                    }
                                    case 53: {
                                        ons.u(o, D(c3), omu.l());
                                        this.O(o, c, x);
                                        o5 = o3;
                                        break Label_3498;
                                    }
                                    case 52: {
                                        ons.u(o, D(c3), omu.b());
                                        this.O(o, c, x);
                                        o5 = o3;
                                        break Label_3498;
                                    }
                                    case 51: {
                                        ons.u(o, D(c3), omu.a());
                                        this.O(o, c, x);
                                        o5 = o3;
                                        break Label_3498;
                                    }
                                    case 50: {
                                        final Object h = this.H(x);
                                        final long d2 = D(this.C(x));
                                        final Object h2 = ons.h(o, d2);
                                        Object o6;
                                        if (h2 == null) {
                                            o6 = phn.r();
                                            ons.u(o, d2, o6);
                                        }
                                        else {
                                            o6 = h2;
                                            if (phn.p(h2)) {
                                                o6 = phn.r();
                                                phn.q(o6, h2);
                                                ons.u(o, d2, o6);
                                            }
                                        }
                                        omu.I((Map)o6, phn.n(h), okm);
                                        o5 = o3;
                                        break Label_3498;
                                    }
                                    case 49: {
                                        omu.F(this.n.b(o, D(c3)), this.G(x), okm);
                                        o5 = o3;
                                        break Label_3498;
                                    }
                                    case 48: {
                                        omu.N(this.n.b(o, D(c3)));
                                        o5 = o3;
                                        break Label_3498;
                                    }
                                    case 47: {
                                        omu.M(this.n.b(o, D(c3)));
                                        o5 = o3;
                                        break Label_3498;
                                    }
                                    case 46: {
                                        omu.L(this.n.b(o, D(c3)));
                                        o5 = o3;
                                        break Label_3498;
                                    }
                                    case 45: {
                                        omu.K(this.n.b(o, D(c3)));
                                        o5 = o3;
                                        break Label_3498;
                                    }
                                    case 44: {
                                        final List b = this.n.b(o, D(c3));
                                        omu.B(b);
                                        o5 = omz.X(c, b, this.F(x), o3);
                                        break Label_3498;
                                    }
                                    case 43: {
                                        omu.R(this.n.b(o, D(c3)));
                                        o5 = o3;
                                        break Label_3498;
                                    }
                                    case 42: {
                                        omu.y(this.n.b(o, D(c3)));
                                        o5 = o3;
                                        break Label_3498;
                                    }
                                    case 41: {
                                        omu.C(this.n.b(o, D(c3)));
                                        o5 = o3;
                                        break Label_3498;
                                    }
                                    case 40: {
                                        omu.D(this.n.b(o, D(c3)));
                                        o5 = o3;
                                        break Label_3498;
                                    }
                                    case 39: {
                                        omu.G(this.n.b(o, D(c3)));
                                        o5 = o3;
                                        break Label_3498;
                                    }
                                    case 38: {
                                        omu.S(this.n.b(o, D(c3)));
                                        o5 = o3;
                                        break Label_3498;
                                    }
                                    case 37: {
                                        omu.H(this.n.b(o, D(c3)));
                                        o5 = o3;
                                        break Label_3498;
                                    }
                                    case 36: {
                                        omu.E(this.n.b(o, D(c3)));
                                        o5 = o3;
                                        break Label_3498;
                                    }
                                    case 35: {
                                        omu.A(this.n.b(o, D(c3)));
                                        o5 = o3;
                                        break Label_3498;
                                    }
                                    case 34: {
                                        omu.N(this.n.b(o, D(c3)));
                                        o5 = o3;
                                        break Label_3498;
                                    }
                                    case 33: {
                                        omu.M(this.n.b(o, D(c3)));
                                        o5 = o3;
                                        break Label_3498;
                                    }
                                    case 32: {
                                        omu.L(this.n.b(o, D(c3)));
                                        o5 = o3;
                                        break Label_3498;
                                    }
                                    case 31: {
                                        omu.K(this.n.b(o, D(c3)));
                                        o5 = o3;
                                        break Label_3498;
                                    }
                                    case 30: {
                                        final List b2 = this.n.b(o, D(c3));
                                        omu.B(b2);
                                        o5 = omz.X(c, b2, this.F(x), o3);
                                        break Label_3498;
                                    }
                                    case 29: {
                                        omu.R(this.n.b(o, D(c3)));
                                        o5 = o3;
                                        break Label_3498;
                                    }
                                    case 28: {
                                        omu.z(this.n.b(o, D(c3)));
                                        o5 = o3;
                                        break Label_3498;
                                    }
                                    case 27: {
                                        omu.J(this.n.b(o, D(c3)), this.G(x), okm);
                                        o5 = o3;
                                        break Label_3498;
                                    }
                                    case 26: {
                                        if (Q(c3)) {
                                            omu.Q(this.n.b(o, D(c3)));
                                            o5 = o3;
                                            break Label_3498;
                                        }
                                        omu.O(this.n.b(o, D(c3)));
                                        o5 = o3;
                                        break Label_3498;
                                    }
                                    case 25: {
                                        omu.y(this.n.b(o, D(c3)));
                                        o5 = o3;
                                        break Label_3498;
                                    }
                                    case 24: {
                                        omu.C(this.n.b(o, D(c3)));
                                        o5 = o3;
                                        break Label_3498;
                                    }
                                    case 23: {
                                        omu.D(this.n.b(o, D(c3)));
                                        o5 = o3;
                                        break Label_3498;
                                    }
                                    case 22: {
                                        omu.G(this.n.b(o, D(c3)));
                                        o5 = o3;
                                        break Label_3498;
                                    }
                                    case 21: {
                                        omu.S(this.n.b(o, D(c3)));
                                        o5 = o3;
                                        break Label_3498;
                                    }
                                    case 20: {
                                        omu.H(this.n.b(o, D(c3)));
                                        o5 = o3;
                                        break Label_3498;
                                    }
                                    case 19: {
                                        omu.E(this.n.b(o, D(c3)));
                                        o5 = o3;
                                        break Label_3498;
                                    }
                                    case 18: {
                                        omu.A(this.n.b(o, D(c3)));
                                        o5 = o3;
                                        break Label_3498;
                                    }
                                    case 17: {
                                        if (this.R(o, x)) {
                                            ons.u(o, D(c3), olk.e(ons.h(o, D(c3)), omu.s(this.G(x), okm)));
                                            o5 = o3;
                                            break Label_3498;
                                        }
                                        ons.u(o, D(c3), omu.s(this.G(x), okm));
                                        this.N(o, x);
                                        o5 = o3;
                                        break Label_3498;
                                    }
                                    case 16: {
                                        ons.t(o, D(c3), omu.n());
                                        this.N(o, x);
                                        o5 = o3;
                                        break Label_3498;
                                    }
                                    case 15: {
                                        ons.s(o, D(c3), omu.i());
                                        this.N(o, x);
                                        o5 = o3;
                                        break Label_3498;
                                    }
                                    case 14: {
                                        ons.t(o, D(c3), omu.m());
                                        this.N(o, x);
                                        o5 = o3;
                                        break Label_3498;
                                    }
                                    case 13: {
                                        ons.s(o, D(c3), omu.h());
                                        this.N(o, x);
                                        o5 = o3;
                                        break Label_3498;
                                    }
                                    case 12: {
                                        final int e3 = omu.e();
                                        final old f3 = this.F(x);
                                        if (f3 != null && !f3.a(e3)) {
                                            o5 = omz.W(c, e3, o3);
                                            break Label_3498;
                                        }
                                        ons.s(o, D(c3), e3);
                                        this.N(o, x);
                                        o5 = o3;
                                        break Label_3498;
                                    }
                                    case 11: {
                                        ons.s(o, D(c3), omu.j());
                                        this.N(o, x);
                                        o5 = o3;
                                        break Label_3498;
                                    }
                                    case 10: {
                                        ons.u(o, D(c3), omu.q());
                                        this.N(o, x);
                                        o5 = o3;
                                        break Label_3498;
                                    }
                                    case 9: {
                                        if (this.R(o, x)) {
                                            ons.u(o, D(c3), olk.e(ons.h(o, D(c3)), omu.u(this.G(x), okm)));
                                            o5 = o3;
                                            break Label_3498;
                                        }
                                        ons.u(o, D(c3), omu.u(this.G(x), okm));
                                        this.N(o, x);
                                        o5 = o3;
                                        break Label_3498;
                                    }
                                    case 8: {
                                        this.M(o, c3, omu);
                                        this.N(o, x);
                                        o5 = o3;
                                        break Label_3498;
                                    }
                                    case 7: {
                                        ons.m(o, D(c3), omu.T());
                                        this.N(o, x);
                                        o5 = o3;
                                        break Label_3498;
                                    }
                                    case 6: {
                                        ons.s(o, D(c3), omu.f());
                                        this.N(o, x);
                                        o5 = o3;
                                        break Label_3498;
                                    }
                                    case 5: {
                                        ons.t(o, D(c3), omu.k());
                                        this.N(o, x);
                                        o5 = o3;
                                        break Label_3498;
                                    }
                                    case 4: {
                                        ons.s(o, D(c3), omu.g());
                                        this.N(o, x);
                                        o5 = o3;
                                        break Label_3498;
                                    }
                                    case 3: {
                                        ons.t(o, D(c3), omu.o());
                                        this.N(o, x);
                                        o5 = o3;
                                        break Label_3498;
                                    }
                                    case 2: {
                                        ons.t(o, D(c3), omu.l());
                                        this.N(o, x);
                                        o5 = o3;
                                        break Label_3498;
                                    }
                                    case 1: {
                                        ons.r(o, D(c3), omu.b());
                                        this.N(o, x);
                                        o5 = o3;
                                        break Label_3498;
                                    }
                                    case 0: {
                                        ons.q(o, D(c3), omu.a());
                                        this.N(o, x);
                                        o5 = o3;
                                        break Label_3498;
                                    }
                                }
                                try {
                                    if (o2.A(o5, omu)) {
                                        continue;
                                    }
                                    int l = this.l;
                                    omu = (omu)o5;
                                    while (l < this.m) {
                                        omu = (omu)this.ab(o, this.k[l], omu);
                                        ++l;
                                    }
                                    if (omu != null) {
                                        break;
                                    }
                                    return;
                                }
                                catch (final oll o3) {}
                            }
                        }
                        catch (final oll oll) {}
                        Object f4 = o3;
                        Label_3535: {
                            if (o3 != null) {
                                break Label_3535;
                            }
                            try {
                                f4 = pjf.F(o);
                                o3 = f4;
                                final boolean a2 = o2.A(f4, omu);
                                o3 = f4;
                                if (a2) {
                                    continue;
                                }
                                int m = this.l;
                                Object ab2 = f4;
                                while (m < this.m) {
                                    ab2 = this.ab(o, this.k[m], ab2);
                                    ++m;
                                }
                                if (ab2 != null) {
                                    break;
                                }
                                return;
                            }
                            finally {}
                        }
                    }
                    pjf.E(o, (onk)omu);
                    return;
                }
                omu.g();
                throw null;
            }
            finally {
                ab3 = o3;
            }
        }
        for (int l2 = this.l; l2 < this.m; ++l2) {
            ab3 = this.ab(o, this.k[l2], ab3);
        }
        if (ab3 != null) {
            pjf.E(o, (onk)ab3);
        }
    }
    
    @Override
    public final void i(final Object o, final byte[] array, final int n, final int n2, final ojl ojl) {
        if (this.j) {
            this.X(o, array, n, n2, ojl);
            return;
        }
        this.c(o, array, n, n2, 0, ojl);
    }
    
    @Override
    public final boolean j(final Object o, final Object o2) {
        for (int length = this.c.length, i = 0; i < length; i += 3) {
            final int c = this.C(i);
            final long d = D(c);
            boolean b = false;
            switch (B(c)) {
                default: {
                    continue;
                }
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68: {
                    final long n = this.z(i) & 0xFFFFF;
                    if (ons.d(o, n) != ons.d(o2, n)) {
                        return false;
                    }
                    if (!omz.q(ons.h(o, d), ons.h(o2, d))) {
                        return false;
                    }
                    continue;
                }
                case 50: {
                    b = omz.q(ons.h(o, d), ons.h(o2, d));
                    break;
                }
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49: {
                    b = omz.q(ons.h(o, d), ons.h(o2, d));
                    break;
                }
                case 17: {
                    if (this.P(o, o2, i) && omz.q(ons.h(o, d), ons.h(o2, d))) {
                        continue;
                    }
                    return false;
                }
                case 16: {
                    if (this.P(o, o2, i) && ons.f(o, d) == ons.f(o2, d)) {
                        continue;
                    }
                    return false;
                }
                case 15: {
                    if (this.P(o, o2, i) && ons.d(o, d) == ons.d(o2, d)) {
                        continue;
                    }
                    return false;
                }
                case 14: {
                    if (this.P(o, o2, i) && ons.f(o, d) == ons.f(o2, d)) {
                        continue;
                    }
                    return false;
                }
                case 13: {
                    if (this.P(o, o2, i) && ons.d(o, d) == ons.d(o2, d)) {
                        continue;
                    }
                    return false;
                }
                case 12: {
                    if (this.P(o, o2, i) && ons.d(o, d) == ons.d(o2, d)) {
                        continue;
                    }
                    return false;
                }
                case 11: {
                    if (this.P(o, o2, i) && ons.d(o, d) == ons.d(o2, d)) {
                        continue;
                    }
                    return false;
                }
                case 10: {
                    if (this.P(o, o2, i) && omz.q(ons.h(o, d), ons.h(o2, d))) {
                        continue;
                    }
                    return false;
                }
                case 9: {
                    if (this.P(o, o2, i) && omz.q(ons.h(o, d), ons.h(o2, d))) {
                        continue;
                    }
                    return false;
                }
                case 8: {
                    if (this.P(o, o2, i) && omz.q(ons.h(o, d), ons.h(o2, d))) {
                        continue;
                    }
                    return false;
                }
                case 7: {
                    if (this.P(o, o2, i) && ons.w(o, d) == ons.w(o2, d)) {
                        continue;
                    }
                    return false;
                }
                case 6: {
                    if (this.P(o, o2, i) && ons.d(o, d) == ons.d(o2, d)) {
                        continue;
                    }
                    return false;
                }
                case 5: {
                    if (this.P(o, o2, i) && ons.f(o, d) == ons.f(o2, d)) {
                        continue;
                    }
                    return false;
                }
                case 4: {
                    if (this.P(o, o2, i) && ons.d(o, d) == ons.d(o2, d)) {
                        continue;
                    }
                    return false;
                }
                case 3: {
                    if (this.P(o, o2, i) && ons.f(o, d) == ons.f(o2, d)) {
                        continue;
                    }
                    return false;
                }
                case 2: {
                    if (this.P(o, o2, i) && ons.f(o, d) == ons.f(o2, d)) {
                        continue;
                    }
                    return false;
                }
                case 1: {
                    if (this.P(o, o2, i) && Float.floatToIntBits(ons.c(o, d)) == Float.floatToIntBits(ons.c(o2, d))) {
                        continue;
                    }
                    return false;
                }
                case 0: {
                    if (this.P(o, o2, i) && Double.doubleToLongBits(ons.b(o, d)) == Double.doubleToLongBits(ons.b(o2, d))) {
                        continue;
                    }
                    return false;
                }
            }
            if (!b) {
                return false;
            }
        }
        return pjf.D(o).equals(pjf.D(o2)) && (!this.h || okn.b(o).equals(okn.b(o2)));
    }
    
    @Override
    public final boolean k(final Object o) {
        int n = 1048575;
        int int1 = 0;
        for (int i = 0; i < this.l; ++i) {
            final int n2 = this.k[i];
            final int s = this.s(n2);
            final int c = this.C(n2);
            final int n3 = this.c[n2 + 2];
            final int n4 = n3 & 0xFFFFF;
            final int n5 = 1 << (n3 >>> 20);
            if (n4 != n) {
                if (n4 != 1048575) {
                    int1 = oml.b.getInt(o, (long)n4);
                    n = n4;
                }
                else {
                    n = n4;
                }
            }
            if ((0x10000000 & c) != 0x0 && !this.S(o, n2, n, int1, n5)) {
                return false;
            }
            switch (B(c)) {
                case 60:
                case 68: {
                    if (this.U(o, s, n2) && !T(o, c, this.G(n2))) {
                        return false;
                    }
                    break;
                }
                case 50: {
                    final ome ome = (ome)ons.h(o, D(c));
                    if (!ome.isEmpty() && phn.n(this.H(n2)).c.s == onw.i) {
                        final Iterator<Object> iterator = ome.values().iterator();
                        omy omy = null;
                        while (iterator.hasNext()) {
                            final Object next = iterator.next();
                            omy a;
                            if ((a = omy) == null) {
                                a = omr.a.a(next.getClass());
                            }
                            omy = a;
                            if (!a.k(next)) {
                                return false;
                            }
                        }
                        break;
                    }
                    break;
                }
                case 27:
                case 49: {
                    final List list = (List)ons.h(o, D(c));
                    if (!list.isEmpty()) {
                        final omy g = this.G(n2);
                        for (int j = 0; j < list.size(); ++j) {
                            if (!g.k(list.get(j))) {
                                return false;
                            }
                        }
                        break;
                    }
                    break;
                }
                case 9:
                case 17: {
                    if (this.S(o, n2, n, int1, n5) && !T(o, c, this.G(n2))) {
                        return false;
                    }
                    break;
                }
            }
        }
        return !this.h || okn.b(o).i();
    }
    
    @Override
    public final void l(final Object o, final okh okh) {
        if (this.j) {
            Object d = null;
            Map.Entry<?, ?> entry = null;
            Label_0052: {
                if (this.h) {
                    final okp b = okn.b(o);
                    if (!b.h()) {
                        d = b.d();
                        entry = ((Iterator<Map.Entry<?, ?>>)d).next();
                        break Label_0052;
                    }
                }
                d = (entry = null);
            }
            for (int length = this.c.length, i = 0; i < length; i += 3) {
                final int c = this.C(i);
                final int s = this.s(i);
                while (entry != null && okn.a((Map.Entry)entry) <= s) {
                    okn.e(okh, (Map.Entry)entry);
                    if (((Iterator)d).hasNext()) {
                        entry = ((Iterator<Map.Entry>)d).next();
                    }
                    else {
                        entry = null;
                    }
                }
                switch (B(c)) {
                    case 68: {
                        if (this.U(o, s, i)) {
                            okh.h(s, ons.h(o, D(c)), this.G(i));
                            break;
                        }
                        break;
                    }
                    case 67: {
                        if (this.U(o, s, i)) {
                            okh.p(s, E(o, D(c)));
                            break;
                        }
                        break;
                    }
                    case 66: {
                        if (this.U(o, s, i)) {
                            okh.o(s, t(o, D(c)));
                            break;
                        }
                        break;
                    }
                    case 65: {
                        if (this.U(o, s, i)) {
                            okh.n(s, E(o, D(c)));
                            break;
                        }
                        break;
                    }
                    case 64: {
                        if (this.U(o, s, i)) {
                            okh.m(s, t(o, D(c)));
                            break;
                        }
                        break;
                    }
                    case 63: {
                        if (this.U(o, s, i)) {
                            okh.d(s, t(o, D(c)));
                            break;
                        }
                        break;
                    }
                    case 62: {
                        if (this.U(o, s, i)) {
                            okh.r(s, t(o, D(c)));
                            break;
                        }
                        break;
                    }
                    case 61: {
                        if (this.U(o, s, i)) {
                            okh.b(s, (ojw)ons.h(o, D(c)));
                            break;
                        }
                        break;
                    }
                    case 60: {
                        if (this.U(o, s, i)) {
                            okh.k(s, ons.h(o, D(c)), this.G(i));
                            break;
                        }
                        break;
                    }
                    case 59: {
                        if (this.U(o, s, i)) {
                            aa(s, ons.h(o, D(c)), okh);
                            break;
                        }
                        break;
                    }
                    case 58: {
                        if (this.U(o, s, i)) {
                            okh.a(s, V(o, D(c)));
                            break;
                        }
                        break;
                    }
                    case 57: {
                        if (this.U(o, s, i)) {
                            okh.e(s, t(o, D(c)));
                            break;
                        }
                        break;
                    }
                    case 56: {
                        if (this.U(o, s, i)) {
                            okh.f(s, E(o, D(c)));
                            break;
                        }
                        break;
                    }
                    case 55: {
                        if (this.U(o, s, i)) {
                            okh.i(s, t(o, D(c)));
                            break;
                        }
                        break;
                    }
                    case 54: {
                        if (this.U(o, s, i)) {
                            okh.s(s, E(o, D(c)));
                            break;
                        }
                        break;
                    }
                    case 53: {
                        if (this.U(o, s, i)) {
                            okh.j(s, E(o, D(c)));
                            break;
                        }
                        break;
                    }
                    case 52: {
                        if (this.U(o, s, i)) {
                            okh.g(s, p(o, D(c)));
                            break;
                        }
                        break;
                    }
                    case 51: {
                        if (this.U(o, s, i)) {
                            okh.c(s, o(o, D(c)));
                            break;
                        }
                        break;
                    }
                    case 50: {
                        this.Z(okh, s, ons.h(o, D(c)), i);
                        break;
                    }
                    case 49: {
                        omz.I(this.s(i), (List)ons.h(o, D(c)), okh, this.G(i));
                        break;
                    }
                    case 48: {
                        omz.P(this.s(i), (List)ons.h(o, D(c)), okh, true);
                        break;
                    }
                    case 47: {
                        omz.O(this.s(i), (List)ons.h(o, D(c)), okh, true);
                        break;
                    }
                    case 46: {
                        omz.N(this.s(i), (List)ons.h(o, D(c)), okh, true);
                        break;
                    }
                    case 45: {
                        omz.M(this.s(i), (List)ons.h(o, D(c)), okh, true);
                        break;
                    }
                    case 44: {
                        omz.E(this.s(i), (List)ons.h(o, D(c)), okh, true);
                        break;
                    }
                    case 43: {
                        omz.R(this.s(i), (List)ons.h(o, D(c)), okh, true);
                        break;
                    }
                    case 42: {
                        omz.B(this.s(i), (List)ons.h(o, D(c)), okh, true);
                        break;
                    }
                    case 41: {
                        omz.F(this.s(i), (List)ons.h(o, D(c)), okh, true);
                        break;
                    }
                    case 40: {
                        omz.G(this.s(i), (List)ons.h(o, D(c)), okh, true);
                        break;
                    }
                    case 39: {
                        omz.J(this.s(i), (List)ons.h(o, D(c)), okh, true);
                        break;
                    }
                    case 38: {
                        omz.S(this.s(i), (List)ons.h(o, D(c)), okh, true);
                        break;
                    }
                    case 37: {
                        omz.K(this.s(i), (List)ons.h(o, D(c)), okh, true);
                        break;
                    }
                    case 36: {
                        omz.H(this.s(i), (List)ons.h(o, D(c)), okh, true);
                        break;
                    }
                    case 35: {
                        omz.D(this.s(i), (List)ons.h(o, D(c)), okh, true);
                        break;
                    }
                    case 34: {
                        omz.P(this.s(i), (List)ons.h(o, D(c)), okh, false);
                        break;
                    }
                    case 33: {
                        omz.O(this.s(i), (List)ons.h(o, D(c)), okh, false);
                        break;
                    }
                    case 32: {
                        omz.N(this.s(i), (List)ons.h(o, D(c)), okh, false);
                        break;
                    }
                    case 31: {
                        omz.M(this.s(i), (List)ons.h(o, D(c)), okh, false);
                        break;
                    }
                    case 30: {
                        omz.E(this.s(i), (List)ons.h(o, D(c)), okh, false);
                        break;
                    }
                    case 29: {
                        omz.R(this.s(i), (List)ons.h(o, D(c)), okh, false);
                        break;
                    }
                    case 28: {
                        omz.C(this.s(i), (List)ons.h(o, D(c)), okh);
                        break;
                    }
                    case 27: {
                        omz.L(this.s(i), (List)ons.h(o, D(c)), okh, this.G(i));
                        break;
                    }
                    case 26: {
                        omz.Q(this.s(i), (List)ons.h(o, D(c)), okh);
                        break;
                    }
                    case 25: {
                        omz.B(this.s(i), (List)ons.h(o, D(c)), okh, false);
                        break;
                    }
                    case 24: {
                        omz.F(this.s(i), (List)ons.h(o, D(c)), okh, false);
                        break;
                    }
                    case 23: {
                        omz.G(this.s(i), (List)ons.h(o, D(c)), okh, false);
                        break;
                    }
                    case 22: {
                        omz.J(this.s(i), (List)ons.h(o, D(c)), okh, false);
                        break;
                    }
                    case 21: {
                        omz.S(this.s(i), (List)ons.h(o, D(c)), okh, false);
                        break;
                    }
                    case 20: {
                        omz.K(this.s(i), (List)ons.h(o, D(c)), okh, false);
                        break;
                    }
                    case 19: {
                        omz.H(this.s(i), (List)ons.h(o, D(c)), okh, false);
                        break;
                    }
                    case 18: {
                        omz.D(this.s(i), (List)ons.h(o, D(c)), okh, false);
                        break;
                    }
                    case 17: {
                        if (this.R(o, i)) {
                            okh.h(s, ons.h(o, D(c)), this.G(i));
                            break;
                        }
                        break;
                    }
                    case 16: {
                        if (this.R(o, i)) {
                            okh.p(s, ons.f(o, D(c)));
                            break;
                        }
                        break;
                    }
                    case 15: {
                        if (this.R(o, i)) {
                            okh.o(s, ons.d(o, D(c)));
                            break;
                        }
                        break;
                    }
                    case 14: {
                        if (this.R(o, i)) {
                            okh.n(s, ons.f(o, D(c)));
                            break;
                        }
                        break;
                    }
                    case 13: {
                        if (this.R(o, i)) {
                            okh.m(s, ons.d(o, D(c)));
                            break;
                        }
                        break;
                    }
                    case 12: {
                        if (this.R(o, i)) {
                            okh.d(s, ons.d(o, D(c)));
                            break;
                        }
                        break;
                    }
                    case 11: {
                        if (this.R(o, i)) {
                            okh.r(s, ons.d(o, D(c)));
                            break;
                        }
                        break;
                    }
                    case 10: {
                        if (this.R(o, i)) {
                            okh.b(s, (ojw)ons.h(o, D(c)));
                            break;
                        }
                        break;
                    }
                    case 9: {
                        if (this.R(o, i)) {
                            okh.k(s, ons.h(o, D(c)), this.G(i));
                            break;
                        }
                        break;
                    }
                    case 8: {
                        if (this.R(o, i)) {
                            aa(s, ons.h(o, D(c)), okh);
                            break;
                        }
                        break;
                    }
                    case 7: {
                        if (this.R(o, i)) {
                            okh.a(s, ons.w(o, D(c)));
                            break;
                        }
                        break;
                    }
                    case 6: {
                        if (this.R(o, i)) {
                            okh.e(s, ons.d(o, D(c)));
                            break;
                        }
                        break;
                    }
                    case 5: {
                        if (this.R(o, i)) {
                            okh.f(s, ons.f(o, D(c)));
                            break;
                        }
                        break;
                    }
                    case 4: {
                        if (this.R(o, i)) {
                            okh.i(s, ons.d(o, D(c)));
                            break;
                        }
                        break;
                    }
                    case 3: {
                        if (this.R(o, i)) {
                            okh.s(s, ons.f(o, D(c)));
                            break;
                        }
                        break;
                    }
                    case 2: {
                        if (this.R(o, i)) {
                            okh.j(s, ons.f(o, D(c)));
                            break;
                        }
                        break;
                    }
                    case 1: {
                        if (this.R(o, i)) {
                            okh.g(s, ons.c(o, D(c)));
                            break;
                        }
                        break;
                    }
                    case 0: {
                        if (this.R(o, i)) {
                            okh.c(s, ons.b(o, D(c)));
                            break;
                        }
                        break;
                    }
                }
            }
            while (entry != null) {
                okn.e(okh, (Map.Entry)entry);
                if (((Iterator)d).hasNext()) {
                    entry = ((Iterator<Map.Entry>)d).next();
                }
                else {
                    entry = null;
                }
            }
            ad(o, okh);
            return;
        }
        this.Y(o, okh);
    }
}
