import java.util.Map;
import java.util.ConcurrentModificationException;

// 
// Decompiled by Procyon v0.6.0
// 

public class zb
{
    static Object[] d;
    static int e;
    static Object[] f;
    static int g;
    public int[] h;
    public Object[] i;
    public int j;
    
    public zb() {
        this.h = yx.a;
        this.i = yx.b;
        this.j = 0;
    }
    
    public zb(final int n) {
        if (n == 0) {
            this.h = yx.a;
            this.i = yx.b;
        }
        else {
            this.l(n);
        }
        this.j = 0;
    }
    
    private static int a(final int[] array, int a, final int n) {
        try {
            a = yx.a(array, a, n);
            return a;
        }
        catch (final ArrayIndexOutOfBoundsException ex) {
            throw new ConcurrentModificationException();
        }
    }
    
    private final void l(final int n) {
        int n2 = 0;
        Label_0151: {
            if (n == 8) {
                synchronized (zb.class) {
                    final Object[] f = zb.f;
                    if (f != null) {
                        this.i = f;
                        zb.f = (Object[])f[0];
                        this.h = (int[])f[1];
                        f[0] = (f[1] = null);
                        --zb.g;
                        return;
                    }
                    monitorexit(zb.class);
                    n2 = n;
                    break Label_0151;
                }
            }
            if ((n2 = n) == 4) {
                synchronized (zb.class) {
                    final Object[] d = zb.d;
                    if (d != null) {
                        this.i = d;
                        zb.d = (Object[])d[0];
                        this.h = (int[])d[1];
                        d[0] = (d[1] = null);
                        --zb.e;
                        return;
                    }
                    monitorexit(zb.class);
                    n2 = 4;
                }
            }
        }
        this.h = new int[n2];
        this.i = new Object[n2 + n2];
    }
    
    private static void m(final int[] array, final Object[] array2, int i) {
        final int length = array.length;
        if (length == 8) {
            synchronized (zb.class) {
                if (zb.g < 10) {
                    array2[0] = zb.f;
                    array2[1] = array;
                    for (i = i + i - 1; i >= 2; --i) {
                        array2[i] = null;
                    }
                    zb.f = array2;
                    ++zb.g;
                }
                return;
            }
        }
        if (length == 4) {
            synchronized (zb.class) {
                if (zb.e < 10) {
                    array2[0] = zb.d;
                    array2[1] = array;
                    for (i = i + i - 1; i >= 2; --i) {
                        array2[i] = null;
                    }
                    zb.d = array2;
                    ++zb.e;
                }
            }
        }
    }
    
    final int b(final Object o, final int n) {
        final int j = this.j;
        if (j == 0) {
            return -1;
        }
        int a = a(this.h, j, n);
        if (a < 0) {
            return a;
        }
        if (o.equals(this.i[a + a])) {
            return a;
        }
        int n2;
        for (n2 = a + 1; n2 < j && this.h[n2] == n; ++n2) {
            if (o.equals(this.i[n2 + n2])) {
                return n2;
            }
        }
        --a;
        while (a >= 0 && this.h[a] == n) {
            if (o.equals(this.i[a + a])) {
                return a;
            }
            --a;
        }
        return ~n2;
    }
    
    public final int c(final Object o) {
        int n;
        if (o == null) {
            n = this.d();
        }
        else {
            n = this.b(o, o.hashCode());
        }
        return n;
    }
    
    public void clear() {
        final int j = this.j;
        if (j > 0) {
            final int[] h = this.h;
            final Object[] i = this.i;
            this.h = yx.a;
            this.i = yx.b;
            this.j = 0;
            m(h, i, j);
        }
        if (this.j <= 0) {
            return;
        }
        throw new ConcurrentModificationException();
    }
    
    public final boolean containsKey(final Object o) {
        return this.c(o) >= 0;
    }
    
    public final boolean containsValue(final Object o) {
        return this.e(o) >= 0;
    }
    
    final int d() {
        final int j = this.j;
        if (j == 0) {
            return -1;
        }
        int a = a(this.h, j, 0);
        if (a < 0) {
            return a;
        }
        if (this.i[a + a] == null) {
            return a;
        }
        int n;
        for (n = a + 1; n < j && this.h[n] == 0; ++n) {
            if (this.i[n + n] == null) {
                return n;
            }
        }
        --a;
        while (a >= 0 && this.h[a] == 0) {
            if (this.i[a + a] == null) {
                return a;
            }
            --a;
        }
        return ~n;
    }
    
    final int e(final Object o) {
        final int j = this.j;
        final int n = j + j;
        final Object[] i = this.i;
        if (o == null) {
            for (int k = 1; k < n; k += 2) {
                if (i[k] == null) {
                    return k >> 1;
                }
            }
        }
        else {
            for (int l = 1; l < n; l += 2) {
                if (o.equals(i[l])) {
                    return l >> 1;
                }
            }
        }
        return -1;
    }
    
    @Override
    public final boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        try {
            if (o instanceof zb) {
                final zb zb = (zb)o;
                if (this.j == zb.j) {
                    for (int i = 0; i < this.j; ++i) {
                        final Object f = this.f(i);
                        o = this.i(i);
                        final Object value = zb.get(f);
                        if (o == null) {
                            if (value != null || !zb.containsKey(f)) {
                                return false;
                            }
                        }
                        else if (!o.equals(value)) {
                            return false;
                        }
                    }
                    return true;
                }
                return false;
            }
            else if (o instanceof Map) {
                final Map map = (Map)o;
                if (this.j == map.size()) {
                    for (int j = 0; j < this.j; ++j) {
                        final Object f2 = this.f(j);
                        o = this.i(j);
                        final Object value2 = map.get(f2);
                        if (o == null) {
                            if (value2 != null || !map.containsKey(f2)) {
                                return false;
                            }
                        }
                        else if (!o.equals(value2)) {
                            return false;
                        }
                    }
                    return true;
                }
                return false;
            }
        }
        catch (final ClassCastException ex) {}
        catch (final NullPointerException ex2) {}
        return false;
    }
    
    public final Object f(final int n) {
        return this.i[n + n];
    }
    
    public Object g(int n) {
        final Object[] i = this.i;
        final int n2 = n + n;
        final Object o = i[n2 + 1];
        final int j = this.j;
        if (j <= 1) {
            this.clear();
        }
        else {
            final int k = j - 1;
            final int[] h = this.h;
            final int length = h.length;
            int n3 = 8;
            if (length > 8 && j < length / 3) {
                if (j > 8) {
                    n3 = j + (j >> 1);
                }
                this.l(n3);
                if (j != this.j) {
                    throw new ConcurrentModificationException();
                }
                if (n > 0) {
                    System.arraycopy(h, 0, this.h, 0, n);
                    System.arraycopy(i, 0, this.i, 0, n2);
                }
                if (n < k) {
                    final int n4 = n + 1;
                    final int n5 = k - n;
                    System.arraycopy(h, n4, this.h, n, n5);
                    System.arraycopy(i, n4 + n4, this.i, n2, n5 + n5);
                }
            }
            else {
                if (n < k) {
                    final int n6 = n + 1;
                    final int n7 = k - n;
                    System.arraycopy(h, n6, h, n, n7);
                    final Object[] l = this.i;
                    System.arraycopy(l, n6 + n6, l, n2, n7 + n7);
                }
                final Object[] m = this.i;
                n = k + k;
                m[n + 1] = (m[n] = null);
            }
            if (j != this.j) {
                throw new ConcurrentModificationException();
            }
            this.j = k;
        }
        return o;
    }
    
    public final Object get(final Object o) {
        return this.getOrDefault(o, null);
    }
    
    public final Object getOrDefault(final Object o, final Object o2) {
        final int c = this.c(o);
        if (c >= 0) {
            return this.i[c + c + 1];
        }
        return o2;
    }
    
    public Object h(int n, final Object o) {
        n = n + n + 1;
        final Object[] i = this.i;
        final Object o2 = i[n];
        i[n] = o;
        return o2;
    }
    
    @Override
    public int hashCode() {
        final int[] h = this.h;
        final Object[] i = this.i;
        final int j = this.j;
        int n = 1;
        int k = 0;
        int n2 = 0;
        while (k < j) {
            final Object o = i[n];
            final int n3 = h[k];
            int hashCode;
            if (o == null) {
                hashCode = 0;
            }
            else {
                hashCode = o.hashCode();
            }
            n2 += (hashCode ^ n3);
            ++k;
            n += 2;
        }
        return n2;
    }
    
    public final Object i(final int n) {
        return this.i[n + n + 1];
    }
    
    public final boolean isEmpty() {
        return this.j <= 0;
    }
    
    public final void j(final int n) {
        final int j = this.j;
        final int[] h = this.h;
        if (h.length < n) {
            final Object[] i = this.i;
            this.l(n);
            if (this.j > 0) {
                System.arraycopy(h, 0, this.h, 0, j);
                System.arraycopy(i, 0, this.i, 0, j + j);
            }
            m(h, i, j);
        }
        if (this.j == j) {
            return;
        }
        throw new ConcurrentModificationException();
    }
    
    public void k(final zb zb) {
        throw null;
    }
    
    public Object put(Object o, final Object o2) {
        final int j = this.j;
        int n;
        int hashCode;
        if (o == null) {
            n = this.d();
            hashCode = 0;
        }
        else {
            hashCode = o.hashCode();
            n = this.b(o, hashCode);
        }
        if (n >= 0) {
            final int n2 = n + n + 1;
            final Object[] i = this.i;
            o = i[n2];
            i[n2] = o2;
            return o;
        }
        final int n3 = ~n;
        final int[] h = this.h;
        final int length = h.length;
        if (j >= length) {
            int n4 = 4;
            if (j >= 8) {
                n4 = (j >> 1) + j;
            }
            else if (j >= 4) {
                n4 = 8;
            }
            final Object[] k = this.i;
            this.l(n4);
            if (j != this.j) {
                throw new ConcurrentModificationException();
            }
            final int[] h2 = this.h;
            if (h2.length > 0) {
                System.arraycopy(h, 0, h2, 0, length);
                System.arraycopy(k, 0, this.i, 0, k.length);
            }
            m(h, k, j);
        }
        if (n3 < j) {
            final int[] h3 = this.h;
            final int n5 = n3 + 1;
            System.arraycopy(h3, n3, h3, n5, j - n3);
            final Object[] l = this.i;
            final int n6 = this.j - n3;
            System.arraycopy(l, n3 + n3, l, n5 + n5, n6 + n6);
        }
        final int m = this.j;
        if (j == m) {
            final int[] h4 = this.h;
            if (n3 < h4.length) {
                h4[n3] = hashCode;
                final Object[] i2 = this.i;
                final int n7 = n3 + n3;
                i2[n7] = o;
                i2[n7 + 1] = o2;
                this.j = m + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }
    
    public final Object putIfAbsent(final Object o, final Object o2) {
        final Object value = this.get(o);
        if (value == null) {
            return this.put(o, o2);
        }
        return value;
    }
    
    public final Object remove(final Object o) {
        final int c = this.c(o);
        if (c >= 0) {
            return this.g(c);
        }
        return null;
    }
    
    public final boolean remove(Object i, final Object o) {
        final int c = this.c(i);
        if (c >= 0) {
            i = this.i(c);
            if (o == i || (o != null && o.equals(i))) {
                this.g(c);
                return true;
            }
        }
        return false;
    }
    
    public final Object replace(final Object o, final Object o2) {
        final int c = this.c(o);
        if (c >= 0) {
            return this.h(c, o2);
        }
        return null;
    }
    
    public final boolean replace(Object i, final Object o, final Object o2) {
        final int c = this.c(i);
        if (c >= 0) {
            i = this.i(c);
            if (i == o || (o != null && o.equals(i))) {
                this.h(c, o2);
                return true;
            }
        }
        return false;
    }
    
    public final int size() {
        return this.j;
    }
    
    @Override
    public final String toString() {
        if (this.isEmpty()) {
            return "{}";
        }
        final StringBuilder sb = new StringBuilder(this.j * 28);
        sb.append('{');
        for (int i = 0; i < this.j; ++i) {
            if (i > 0) {
                sb.append(", ");
            }
            final Object f = this.f(i);
            if (f != this) {
                sb.append(f);
            }
            else {
                sb.append("(this Map)");
            }
            sb.append('=');
            final Object j = this.i(i);
            if (j != this) {
                sb.append(j);
            }
            else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
