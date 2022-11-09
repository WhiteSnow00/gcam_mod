import java.util.RandomAccess;
import java.util.Iterator;
import java.util.Map;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

final class omz
{
    public static final pjf a;
    public static final pjf b;
    public static final pjf c;
    private static final Class d;
    
    static {
        Class d2;
        try {
            Class.forName("com.google.protobuf.GeneratedMessage");
        }
        finally {
            d2 = null;
        }
        d = d2;
        a = Y(false);
        b = Y(true);
        c = new pjf();
    }
    
    static int A(final int n, final List list) {
        final int size = list.size();
        if (size == 0) {
            return 0;
        }
        return o(list) + size * okg.ab(n);
    }
    
    public static void B(int i, final List list, final okh okh, final boolean b) {
        if (list != null && !list.isEmpty()) {
            int j = 0;
            final int n = 0;
            if (b) {
                okh.a.A(i, 2);
                int k = 0;
                i = 0;
                while (k < list.size()) {
                    ((Boolean)list.get(k)).booleanValue();
                    ++i;
                    ++k;
                }
                okh.a.C(i);
                for (i = n; i < list.size(); ++i) {
                    okh.a.j((byte)(((boolean)list.get(i)) ? 1 : 0));
                }
            }
            else {
                while (j < list.size()) {
                    okh.a.l(i, (boolean)list.get(j));
                    ++j;
                }
            }
        }
    }
    
    public static void C(final int n, final List list, final okh okh) {
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < list.size(); ++i) {
                okh.a.m(n, (ojw)list.get(i));
            }
        }
    }
    
    public static void D(int i, final List list, final okh okh, final boolean b) {
        if (list != null && !list.isEmpty()) {
            int j = 0;
            final int n = 0;
            if (b) {
                okh.a.A(i, 2);
                int k = 0;
                i = 0;
                while (k < list.size()) {
                    ((Double)list.get(k)).doubleValue();
                    i += 8;
                    ++k;
                }
                okh.a.C(i);
                for (i = n; i < list.size(); ++i) {
                    okh.a.an(list.get(i));
                }
            }
            else {
                while (j < list.size()) {
                    okh.a.am(i, (double)list.get(j));
                    ++j;
                }
            }
        }
    }
    
    public static void E(int i, final List list, final okh okh, final boolean b) {
        if (list != null && !list.isEmpty()) {
            int j = 0;
            final int n = 0;
            if (b) {
                okh.a.A(i, 2);
                i = 0;
                int n2 = 0;
                while (i < list.size()) {
                    n2 += okg.N(list.get(i));
                    ++i;
                }
                okh.a.C(n2);
                for (i = n; i < list.size(); ++i) {
                    okh.a.t(list.get(i));
                }
            }
            else {
                while (j < list.size()) {
                    okh.a.s(i, (int)list.get(j));
                    ++j;
                }
            }
        }
    }
    
    public static void F(int i, final List list, final okh okh, final boolean b) {
        if (list != null && !list.isEmpty()) {
            int j = 0;
            final int n = 0;
            if (b) {
                okh.a.A(i, 2);
                i = 0;
                int n2 = 0;
                while (i < list.size()) {
                    list.get(i).intValue();
                    n2 += 4;
                    ++i;
                }
                okh.a.C(n2);
                for (i = n; i < list.size(); ++i) {
                    okh.a.p(list.get(i));
                }
            }
            else {
                while (j < list.size()) {
                    okh.a.o(i, (int)list.get(j));
                    ++j;
                }
            }
        }
    }
    
    public static void G(int i, final List list, final okh okh, final boolean b) {
        if (list != null && !list.isEmpty()) {
            int j = 0;
            final int n = 0;
            if (b) {
                okh.a.A(i, 2);
                i = 0;
                int n2 = 0;
                while (i < list.size()) {
                    list.get(i).longValue();
                    n2 += 8;
                    ++i;
                }
                okh.a.C(n2);
                for (i = n; i < list.size(); ++i) {
                    okh.a.r(list.get(i));
                }
            }
            else {
                while (j < list.size()) {
                    okh.a.q(i, (long)list.get(j));
                    ++j;
                }
            }
        }
    }
    
    public static void H(int i, final List list, final okh okh, final boolean b) {
        if (list != null && !list.isEmpty()) {
            int j = 0;
            final int n = 0;
            if (b) {
                okh.a.A(i, 2);
                i = 0;
                int n2 = 0;
                while (i < list.size()) {
                    list.get(i).floatValue();
                    n2 += 4;
                    ++i;
                }
                okh.a.C(n2);
                for (i = n; i < list.size(); ++i) {
                    okh.a.ap(list.get(i));
                }
            }
            else {
                while (j < list.size()) {
                    okh.a.ao(i, (float)list.get(j));
                    ++j;
                }
            }
        }
    }
    
    public static void I(final int n, final List list, final okh okh, final omy omy) {
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < list.size(); ++i) {
                okh.h(n, list.get(i), omy);
            }
        }
    }
    
    public static void J(int i, final List list, final okh okh, final boolean b) {
        if (list != null && !list.isEmpty()) {
            int j = 0;
            final int n = 0;
            if (b) {
                okh.a.A(i, 2);
                int k = 0;
                i = 0;
                while (k < list.size()) {
                    i += okg.N((int)list.get(k));
                    ++k;
                }
                okh.a.C(i);
                for (i = n; i < list.size(); ++i) {
                    okh.a.t(list.get(i));
                }
            }
            else {
                while (j < list.size()) {
                    okh.a.s(i, (int)list.get(j));
                    ++j;
                }
            }
        }
    }
    
    public static void K(int i, final List list, final okh okh, final boolean b) {
        if (list != null && !list.isEmpty()) {
            int j = 0;
            final int n = 0;
            if (b) {
                okh.a.A(i, 2);
                i = 0;
                int n2 = 0;
                while (i < list.size()) {
                    n2 += okg.af(list.get(i));
                    ++i;
                }
                okh.a.C(n2);
                for (i = n; i < list.size(); ++i) {
                    okh.a.E(list.get(i));
                }
            }
            else {
                while (j < list.size()) {
                    okh.a.D(i, (long)list.get(j));
                    ++j;
                }
            }
        }
    }
    
    public static void L(final int n, final List list, final okh okh, final omy omy) {
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < list.size(); ++i) {
                okh.k(n, list.get(i), omy);
            }
        }
    }
    
    public static void M(int i, final List list, final okh okh, final boolean b) {
        if (list != null && !list.isEmpty()) {
            int j = 0;
            final int n = 0;
            if (b) {
                okh.a.A(i, 2);
                i = 0;
                int n2 = 0;
                while (i < list.size()) {
                    list.get(i).intValue();
                    n2 += 4;
                    ++i;
                }
                okh.a.C(n2);
                for (i = n; i < list.size(); ++i) {
                    okh.a.p(list.get(i));
                }
            }
            else {
                while (j < list.size()) {
                    okh.a.o(i, (int)list.get(j));
                    ++j;
                }
            }
        }
    }
    
    public static void N(int i, final List list, final okh okh, final boolean b) {
        if (list != null && !list.isEmpty()) {
            int j = 0;
            final int n = 0;
            if (b) {
                okh.a.A(i, 2);
                i = 0;
                int n2 = 0;
                while (i < list.size()) {
                    list.get(i).longValue();
                    n2 += 8;
                    ++i;
                }
                okh.a.C(n2);
                for (i = n; i < list.size(); ++i) {
                    okh.a.r(list.get(i));
                }
            }
            else {
                while (j < list.size()) {
                    okh.a.q(i, (long)list.get(j));
                    ++j;
                }
            }
        }
    }
    
    public static void O(int i, final List list, final okh okh, final boolean b) {
        if (list != null && !list.isEmpty()) {
            int j = 0;
            final int n = 0;
            if (b) {
                okh.a.A(i, 2);
                int k = 0;
                i = 0;
                while (k < list.size()) {
                    i += okg.W((int)list.get(k));
                    ++k;
                }
                okh.a.C(i);
                for (i = n; i < list.size(); ++i) {
                    okh.a.as(list.get(i));
                }
            }
            else {
                while (j < list.size()) {
                    okh.a.ar(i, (int)list.get(j));
                    ++j;
                }
            }
        }
    }
    
    public static void P(int i, final List list, final okh okh, final boolean b) {
        if (list != null && !list.isEmpty()) {
            int j = 0;
            final int n = 0;
            if (b) {
                okh.a.A(i, 2);
                int k = 0;
                i = 0;
                while (k < list.size()) {
                    i += okg.Y((long)list.get(k));
                    ++k;
                }
                okh.a.C(i);
                for (i = n; i < list.size(); ++i) {
                    okh.a.au(list.get(i));
                }
            }
            else {
                while (j < list.size()) {
                    okh.a.at(i, (long)list.get(j));
                    ++j;
                }
            }
        }
    }
    
    public static void Q(final int n, final List list, final okh okh) {
        if (list != null && !list.isEmpty()) {
            final boolean b = list instanceof olu;
            final int n2 = 0;
            int i = 0;
            if (b) {
                final olu olu = (olu)list;
                while (i < list.size()) {
                    final Object f = olu.f(i);
                    if (f instanceof String) {
                        okh.a.y(n, (String)f);
                    }
                    else {
                        okh.a.m(n, (ojw)f);
                    }
                    ++i;
                }
            }
            else {
                for (int j = n2; j < list.size(); ++j) {
                    okh.a.y(n, (String)list.get(j));
                }
            }
        }
    }
    
    public static void R(int i, final List list, final okh okh, final boolean b) {
        if (list != null && !list.isEmpty()) {
            int j = 0;
            final int n = 0;
            if (b) {
                okh.a.A(i, 2);
                i = 0;
                int n2 = 0;
                while (i < list.size()) {
                    n2 += okg.ad(list.get(i));
                    ++i;
                }
                okh.a.C(n2);
                for (i = n; i < list.size(); ++i) {
                    okh.a.C(list.get(i));
                }
            }
            else {
                while (j < list.size()) {
                    okh.a.B(i, (int)list.get(j));
                    ++j;
                }
            }
        }
    }
    
    public static void S(int i, final List list, final okh okh, final boolean b) {
        if (list != null && !list.isEmpty()) {
            int j = 0;
            final int n = 0;
            if (b) {
                okh.a.A(i, 2);
                i = 0;
                int n2 = 0;
                while (i < list.size()) {
                    n2 += okg.af(list.get(i));
                    ++i;
                }
                okh.a.C(n2);
                for (i = n; i < list.size(); ++i) {
                    okh.a.E(list.get(i));
                }
            }
            else {
                while (j < list.size()) {
                    okh.a.D(i, (long)list.get(j));
                    ++j;
                }
            }
        }
    }
    
    static void T(final Object o, final Object o2) {
        final okp b = okn.b(o2);
        if (!b.h()) {
            final okp c = okn.c(o);
            for (int i = 0; i < b.b.a(); ++i) {
                c.f(b.b.f(i));
            }
            final Iterator iterator = b.b.c().iterator();
            while (iterator.hasNext()) {
                c.f((Map.Entry)iterator.next());
            }
        }
    }
    
    static void U(final Object o, final Object o2, final long n) {
        ons.u(o, n, phn.q(ons.h(o, n), ons.h(o2, n)));
    }
    
    static void V(final Object o, final Object o2) {
        final onk d = pjf.D(o);
        final onk d2 = pjf.D(o2);
        onk b;
        if (d2.equals(onk.a)) {
            b = d;
        }
        else {
            b = onk.b(d, d2);
        }
        pjf.E(o, b);
    }
    
    static Object W(final int n, final int n2, final Object o) {
        Object c = o;
        if (o == null) {
            c = onk.c();
        }
        pjf.C(c, n, (long)n2);
        return c;
    }
    
    static Object X(final int n, final List list, final old old, Object o) {
        if (old == null) {
            return o;
        }
        if (list instanceof RandomAccess) {
            final int size = list.size();
            int i = 0;
            int n2 = 0;
            while (i < size) {
                final int intValue = list.get(i);
                if (old.a(intValue)) {
                    if (i != n2) {
                        list.set(n2, intValue);
                    }
                    ++n2;
                }
                else {
                    o = W(n, intValue, o);
                }
                ++i;
            }
            if (n2 != size) {
                list.subList(n2, size).clear();
                return o;
            }
        }
        else {
            final Iterator iterator = list.iterator();
            while (iterator.hasNext()) {
                final int intValue2 = (int)iterator.next();
                if (!old.a(intValue2)) {
                    o = W(n, intValue2, o);
                    iterator.remove();
                }
            }
        }
        return o;
    }
    
    private static pjf Y(final boolean b) {
        Class clazz;
        try {
            Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        }
        finally {
            clazz = null;
        }
        if (clazz == null) {
            return null;
        }
        try {
            return (pjf)clazz.getConstructor(Boolean.TYPE).newInstance(b);
        }
        finally {
            return null;
        }
    }
    
    static int a(final List list) {
        return list.size();
    }
    
    static int b(int i, final List list) {
        final int size = list.size();
        final int n = 0;
        if (size == 0) {
            return 0;
        }
        final int n2 = size * okg.ab(i);
        i = n;
        int n3 = n2;
        while (i < list.size()) {
            n3 += okg.I(list.get(i));
            ++i;
        }
        return n3;
    }
    
    static int c(final List list) {
        final int size = list.size();
        final int n = 0;
        int n2 = 0;
        if (size == 0) {
            return 0;
        }
        int n4;
        if (list instanceof okz) {
            final okz okz = (okz)list;
            int n3 = 0;
            while (true) {
                n4 = n3;
                if (n2 >= size) {
                    break;
                }
                n3 += okg.N(okz.d(n2));
                ++n2;
            }
        }
        else {
            int n5 = 0;
            for (int i = n; i < size; ++i) {
                n5 += okg.N((int)list.get(i));
            }
            n4 = n5;
        }
        return n4;
    }
    
    static int d(final List list) {
        return list.size() * 4;
    }
    
    static int e(final List list) {
        return list.size() * 8;
    }
    
    static int f(final int n, final List list, final omy omy) {
        final int size = list.size();
        int i = 0;
        if (size != 0) {
            int n2 = 0;
            while (i < size) {
                n2 += okg.K(n, list.get(i), omy);
                ++i;
            }
            return n2;
        }
        return 0;
    }
    
    static int g(final List list) {
        final int size = list.size();
        final int n = 0;
        int n2 = 0;
        if (size == 0) {
            return 0;
        }
        int n4;
        if (list instanceof okz) {
            final okz okz = (okz)list;
            int n3 = 0;
            while (true) {
                n4 = n3;
                if (n2 >= size) {
                    break;
                }
                n3 += okg.N(okz.d(n2));
                ++n2;
            }
        }
        else {
            int n5 = 0;
            for (int i = n; i < size; ++i) {
                n5 += okg.N((int)list.get(i));
            }
            n4 = n5;
        }
        return n4;
    }
    
    static int h(final List list) {
        final int size = list.size();
        final int n = 0;
        int n2 = 0;
        if (size == 0) {
            return 0;
        }
        int n4;
        if (list instanceof oly) {
            final oly oly = (oly)list;
            int n3 = 0;
            while (true) {
                n4 = n3;
                if (n2 >= size) {
                    break;
                }
                n3 += okg.af(oly.f(n2));
                ++n2;
            }
        }
        else {
            int n5 = 0;
            for (int i = n; i < size; ++i) {
                n5 += okg.af((long)list.get(i));
            }
            n4 = n5;
        }
        return n4;
    }
    
    static int i(final int n, final Object o, final omy omy) {
        if (o instanceof ols) {
            return okg.P(n, (ols)o);
        }
        return okg.ab(n) + okg.T((omj)o, omy);
    }
    
    static int j(int n, final List list, final omy omy) {
        final int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        n = okg.ab(n) * size;
        while (i < size) {
            final Object value = list.get(i);
            if (value instanceof ols) {
                n += okg.Q((ols)value);
            }
            else {
                n += okg.T((omj)value, omy);
            }
            ++i;
        }
        return n;
    }
    
    static int k(final List list) {
        final int size = list.size();
        final int n = 0;
        int n2 = 0;
        if (size == 0) {
            return 0;
        }
        int n4;
        if (list instanceof okz) {
            final okz okz = (okz)list;
            int n3 = 0;
            while (true) {
                n4 = n3;
                if (n2 >= size) {
                    break;
                }
                n3 += okg.W(okz.d(n2));
                ++n2;
            }
        }
        else {
            int n5 = 0;
            for (int i = n; i < size; ++i) {
                n5 += okg.W((int)list.get(i));
            }
            n4 = n5;
        }
        return n4;
    }
    
    static int l(final List list) {
        final int size = list.size();
        final int n = 0;
        int n2 = 0;
        if (size == 0) {
            return 0;
        }
        int n4;
        if (list instanceof oly) {
            final oly oly = (oly)list;
            int n3 = 0;
            while (true) {
                n4 = n3;
                if (n2 >= size) {
                    break;
                }
                n3 += okg.Y(oly.f(n2));
                ++n2;
            }
        }
        else {
            int n5 = 0;
            for (int i = n; i < size; ++i) {
                n5 += okg.Y((long)list.get(i));
            }
            n4 = n5;
        }
        return n4;
    }
    
    static int m(int n, final List list) {
        final int size = list.size();
        final int n2 = 0;
        int n3 = 0;
        if (size == 0) {
            return 0;
        }
        n = okg.ab(n) * size;
        int n4;
        if (list instanceof olu) {
            final olu olu = (olu)list;
            while (true) {
                n4 = n;
                if (n3 >= size) {
                    break;
                }
                final Object f = olu.f(n3);
                if (f instanceof ojw) {
                    n += okg.I((ojw)f);
                }
                else {
                    n += okg.aa((String)f);
                }
                ++n3;
            }
        }
        else {
            int n5 = n2;
            while (true) {
                n4 = n;
                if (n5 >= size) {
                    break;
                }
                final Object value = list.get(n5);
                if (value instanceof ojw) {
                    n += okg.I((ojw)value);
                }
                else {
                    n += okg.aa((String)value);
                }
                ++n5;
            }
        }
        return n4;
    }
    
    static int n(final List list) {
        final int size = list.size();
        final int n = 0;
        int n2 = 0;
        if (size == 0) {
            return 0;
        }
        int n4;
        if (list instanceof okz) {
            final okz okz = (okz)list;
            int n3 = 0;
            while (true) {
                n4 = n3;
                if (n2 >= size) {
                    break;
                }
                n3 += okg.ad(okz.d(n2));
                ++n2;
            }
        }
        else {
            int n5 = 0;
            for (int i = n; i < size; ++i) {
                n5 += okg.ad((int)list.get(i));
            }
            n4 = n5;
        }
        return n4;
    }
    
    static int o(final List list) {
        final int size = list.size();
        final int n = 0;
        int n2 = 0;
        if (size == 0) {
            return 0;
        }
        int n4;
        if (list instanceof oly) {
            final oly oly = (oly)list;
            int n3 = 0;
            while (true) {
                n4 = n3;
                if (n2 >= size) {
                    break;
                }
                n3 += okg.af(oly.f(n2));
                ++n2;
            }
        }
        else {
            int n5 = 0;
            for (int i = n; i < size; ++i) {
                n5 += okg.af((long)list.get(i));
            }
            n4 = n5;
        }
        return n4;
    }
    
    public static void p(final Class clazz) {
        if (!oky.class.isAssignableFrom(clazz)) {
            final Class d = omz.d;
            if (d != null) {
                if (!d.isAssignableFrom(clazz)) {
                    throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
                }
            }
        }
    }
    
    static boolean q(final Object o, final Object o2) {
        boolean b = false;
        if (o != o2) {
            if (o == null) {
                return b;
            }
            if (!o.equals(o2)) {
                return false;
            }
        }
        b = true;
        return b;
    }
    
    static int r(final int n, final List list) {
        final int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * okg.av(n);
    }
    
    static int s(final int n, final List list) {
        final int size = list.size();
        if (size == 0) {
            return 0;
        }
        return c(list) + size * okg.ab(n);
    }
    
    static int t(final int n, final List list) {
        final int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * okg.ax(n);
    }
    
    static int u(final int n, final List list) {
        final int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * okg.ay(n);
    }
    
    static int v(final int n, final List list) {
        final int size = list.size();
        if (size == 0) {
            return 0;
        }
        return g(list) + size * okg.ab(n);
    }
    
    static int w(final int n, final List list) {
        if (list.size() == 0) {
            return 0;
        }
        return h(list) + list.size() * okg.ab(n);
    }
    
    static int x(final int n, final List list) {
        final int size = list.size();
        if (size == 0) {
            return 0;
        }
        return k(list) + size * okg.ab(n);
    }
    
    static int y(final int n, final List list) {
        final int size = list.size();
        if (size == 0) {
            return 0;
        }
        return l(list) + size * okg.ab(n);
    }
    
    static int z(final int n, final List list) {
        final int size = list.size();
        if (size == 0) {
            return 0;
        }
        return n(list) + size * okg.ab(n);
    }
}
