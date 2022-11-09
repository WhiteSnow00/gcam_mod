import java.util.Collection;
import java.io.ObjectOutputStream;
import java.util.Map;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Set;
import java.io.Serializable;
import java.util.AbstractMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nnb extends AbstractMap implements Serializable, nlf
{
    transient Object[] a;
    transient Object[] b;
    transient int c;
    transient int d;
    public transient int e;
    public transient int[] f;
    private transient int[] g;
    private transient int[] h;
    private transient int[] i;
    private transient int[] j;
    private transient int k;
    private transient int[] l;
    private transient Set m;
    private transient Set n;
    private transient Set o;
    
    public nnb() {
        this.l();
    }
    
    private final int m(final int n) {
        return n & this.g.length - 1;
    }
    
    private final void n(final int n, int i) {
        njo.d(n != -1);
        i = this.m(i);
        final int[] h = this.h;
        int n2 = h[i];
        if (n2 == n) {
            final int[] j = this.j;
            h[i] = j[n];
            j[n] = -1;
            return;
        }
        int[] k;
        int n3;
        for (i = this.j[n2]; i != -1; i = n3) {
            if (i == n) {
                k = this.j;
                k[n2] = k[n];
                k[n] = -1;
                return;
            }
            n3 = this.j[i];
            n2 = i;
        }
        final String value = String.valueOf(this.b[n]);
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 34);
        sb.append("Expected to find entry with value ");
        sb.append(value);
        throw new AssertionError((Object)sb.toString());
    }
    
    private final void o(final int n, int m) {
        njo.d(n != -1);
        m = this.m(m);
        final int[] j = this.j;
        final int[] h = this.h;
        j[n] = h[m];
        h[m] = n;
    }
    
    private final void p(int c, int i, int n) {
        final boolean b = false;
        njo.d(c != -1);
        njo.d(c != -1 || b);
        i = this.m(i);
        final int[] g = this.g;
        int n2 = g[i];
        Label_0126: {
            if (n2 != c) {
                int[] j;
                int n3;
                for (i = this.i[n2]; i != -1; i = n3) {
                    if (i == c) {
                        j = this.i;
                        j[n2] = j[c];
                        j[c] = -1;
                        break Label_0126;
                    }
                    n3 = this.i[i];
                    n2 = i;
                }
                final String value = String.valueOf(this.a[c]);
                final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 32);
                sb.append("Expected to find entry with key ");
                sb.append(value);
                throw new AssertionError((Object)sb.toString());
            }
            final int[] k = this.i;
            g[i] = k[c];
            k[c] = -1;
        }
        this.n(c, n);
        this.q(this.l[c], this.f[c]);
        final int n4 = this.c - 1;
        if (n4 != c) {
            i = this.l[n4];
            n = this.f[n4];
            this.q(i, c);
            this.q(c, n);
            final Object[] a = this.a;
            final Object o = a[n4];
            final Object[] b2 = this.b;
            final Object o2 = b2[n4];
            a[c] = o;
            b2[c] = o2;
            i = this.m(nov.k(o));
            final int[] g2 = this.g;
            n = g2[i];
            if (n == n4) {
                g2[i] = c;
            }
            else {
                int n5;
                for (i = this.i[n]; i != n4; i = n5) {
                    n5 = this.i[i];
                    n = i;
                }
                this.i[n] = c;
            }
            final int[] l = this.i;
            l[c] = l[n4];
            l[n4] = -1;
            i = this.m(nov.k(o2));
            final int[] h = this.h;
            n = h[i];
            if (n == n4) {
                h[i] = c;
            }
            else {
                int n6;
                for (i = this.j[n]; i != n4; i = n6) {
                    n6 = this.j[i];
                    n = i;
                }
                this.j[n] = c;
            }
            final int[] m = this.j;
            m[c] = m[n4];
            m[n4] = -1;
        }
        final Object[] a2 = this.a;
        c = this.c - 1;
        a2[c] = null;
        this.b[c] = null;
        this.c = c;
        ++this.d;
    }
    
    private final void q(final int k, final int e) {
        if (k == -2) {
            this.e = e;
        }
        else {
            this.f[k] = e;
        }
        if (e == -2) {
            this.k = k;
            return;
        }
        this.l[e] = k;
    }
    
    private static int[] r(final int n) {
        final int[] array = new int[n];
        Arrays.fill(array, -1);
        return array;
    }
    
    private void readObject(final ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        final int int1 = objectInputStream.readInt();
        this.l();
        nrr.s(this, objectInputStream, int1);
    }
    
    private static int[] s(int[] copy, final int n) {
        final int length = copy.length;
        copy = Arrays.copyOf(copy, n);
        Arrays.fill(copy, length, n, -1);
        return copy;
    }
    
    private void writeObject(final ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        nrr.u(this, objectOutputStream);
    }
    
    final int a(final Object o, int i, final int[] array, final int[] array2, final Object[] array3) {
        for (i = array[this.m(i)]; i != -1; i = array2[i]) {
            if (nqb.E(array3[i], o)) {
                return i;
            }
        }
        return -1;
    }
    
    final int b(final Object o) {
        return this.c(o, nov.k(o));
    }
    
    final int c(final Object o, final int n) {
        return this.a(o, n, this.g, this.i, this.a);
    }
    
    @Override
    public final void clear() {
        Arrays.fill(this.a, 0, this.c, null);
        Arrays.fill(this.b, 0, this.c, null);
        Arrays.fill(this.g, -1);
        Arrays.fill(this.h, -1);
        Arrays.fill(this.i, 0, this.c, -1);
        Arrays.fill(this.j, 0, this.c, -1);
        Arrays.fill(this.l, 0, this.c, -1);
        Arrays.fill(this.f, 0, this.c, -1);
        this.c = 0;
        this.e = -2;
        this.k = -2;
        ++this.d;
    }
    
    @Override
    public final boolean containsKey(final Object o) {
        return this.b(o) != -1;
    }
    
    @Override
    public final boolean containsValue(final Object o) {
        return this.d(o, nov.k(o)) != -1;
    }
    
    final int d(final Object o, final int n) {
        return this.a(o, n, this.h, this.j, this.b);
    }
    
    @Override
    public final nlf e() {
        throw null;
    }
    
    @Override
    public final Set entrySet() {
        Set o;
        if ((o = this.o) == null) {
            o = new nmw(this);
            this.o = o;
        }
        return o;
    }
    
    final Object f(Object o, final Object o2, final boolean b) {
        final int k = nov.k(o);
        final int c = this.c(o, k);
        if (c == -1) {
            final int i = nov.k(o2);
            final int d = this.d(o2, i);
            final boolean b2 = false;
            if (b) {
                if (d != -1) {
                    this.i(d, i);
                }
            }
            else {
                njo.i(d == -1, "Value already present: %s", o2);
            }
            final int n = this.c + 1;
            final int length = this.i.length;
            if (length < n) {
                final int a = nni.a(length, n);
                this.a = Arrays.copyOf(this.a, a);
                this.b = Arrays.copyOf(this.b, a);
                this.i = s(this.i, a);
                this.j = s(this.j, a);
                this.l = s(this.l, a);
                this.f = s(this.f, a);
            }
            if (this.g.length < n) {
                final int l = nov.l(n);
                this.g = r(l);
                this.h = r(l);
                for (int j = 0; j < this.c; ++j) {
                    final int m = this.m(nov.k(this.a[j]));
                    final int[] i2 = this.i;
                    final int[] g = this.g;
                    i2[j] = g[m];
                    g[m] = j;
                    final int m2 = this.m(nov.k(this.b[j]));
                    final int[] j2 = this.j;
                    final int[] h = this.h;
                    j2[j] = h[m2];
                    h[m2] = j;
                }
            }
            final Object[] a2 = this.a;
            final int c2 = this.c;
            a2[c2] = o;
            this.b[c2] = o2;
            njo.d(c2 != -1 || b2);
            final int m3 = this.m(k);
            final int[] i3 = this.i;
            final int[] g2 = this.g;
            i3[c2] = g2[m3];
            g2[m3] = c2;
            this.o(this.c, i);
            this.q(this.k, this.c);
            this.q(this.c, -2);
            ++this.c;
            ++this.d;
            return null;
        }
        o = this.b[c];
        if (nqb.E(o, o2)) {
            return o2;
        }
        this.j(c, o2, b);
        return o;
    }
    
    @Override
    public final Set g() {
        throw null;
    }
    
    @Override
    public final Object get(final Object o) {
        final int b = this.b(o);
        if (b == -1) {
            return null;
        }
        return this.b[b];
    }
    
    final void h(final int n, final int n2) {
        this.p(n, n2, nov.k(this.b[n]));
    }
    
    final void i(final int n, final int n2) {
        this.p(n, nov.k(this.a[n]), n2);
    }
    
    public final void j(final int n, final Object o, final boolean b) {
        njo.d(n != -1);
        final int k = nov.k(o);
        final int d = this.d(o, k);
        int n2 = n;
        if (d != -1) {
            if (!b) {
                final String value = String.valueOf(o);
                final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 30);
                sb.append("Value already present in map: ");
                sb.append(value);
                throw new IllegalArgumentException(sb.toString());
            }
            this.i(d, k);
            if ((n2 = n) == this.c) {
                n2 = d;
            }
        }
        this.n(n2, nov.k(this.b[n2]));
        this.b[n2] = o;
        this.o(n2, k);
    }
    
    @Override
    public final void k(final Object o, final Object o2) {
        this.f(o, o2, true);
    }
    
    @Override
    public final Set keySet() {
        Set m;
        if ((m = this.m) == null) {
            m = new nmx(this);
            this.m = m;
        }
        return m;
    }
    
    final void l() {
        nqb.C(16, "expectedSize");
        final int l = nov.l(16);
        this.c = 0;
        this.a = new Object[16];
        this.b = new Object[16];
        this.g = r(l);
        this.h = r(l);
        this.i = r(16);
        this.j = r(16);
        this.e = -2;
        this.k = -2;
        this.l = r(16);
        this.f = r(16);
    }
    
    @Override
    public final Object put(final Object o, final Object o2) {
        return this.f(o, o2, false);
    }
    
    @Override
    public final Object remove(Object o) {
        final int k = nov.k(o);
        final int c = this.c(o, k);
        if (c == -1) {
            return null;
        }
        o = this.b[c];
        this.h(c, k);
        return o;
    }
    
    @Override
    public final int size() {
        return this.c;
    }
}
