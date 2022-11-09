import java.util.Set;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Iterator;
import java.io.ObjectOutputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractSet;

// 
// Decompiled by Procyon v0.6.0
// 

final class nlt extends AbstractSet implements Serializable
{
    transient Object[] a;
    public transient int b;
    private transient Object c;
    private transient int[] d;
    private transient int e;
    
    nlt() {
        this.e(3);
    }
    
    public nlt(final int n) {
        this.e(n);
    }
    
    private final int g() {
        return (1 << (this.b & 0x1F)) - 1;
    }
    
    private final int h(final int n, int i, int j, int n2) {
        final Object s = nov.s(i);
        final int n3 = i - 1;
        if (n2 != 0) {
            nov.u(s, j & n3, n2 + 1);
        }
        final Object c = this.c;
        final int[] d = this.d;
        int n4;
        int n5;
        int n6;
        int q;
        for (i = 0; i <= n; ++i) {
            for (j = nov.q(c, i); j != 0; j = (n4 & n)) {
                n2 = j - 1;
                n4 = d[n2];
                n5 = (nov.m(n4, n) | i);
                n6 = (n5 & n3);
                q = nov.q(s, n6);
                nov.u(s, n6, j);
                d[n2] = nov.n(n5, q, n3);
            }
        }
        this.c = s;
        this.i(n3);
        return n3;
    }
    
    private final void i(int numberOfLeadingZeros) {
        numberOfLeadingZeros = Integer.numberOfLeadingZeros(numberOfLeadingZeros);
        this.b = nov.n(this.b, 32 - numberOfLeadingZeros, 31);
    }
    
    private void readObject(final ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        final int int1 = objectInputStream.readInt();
        if (int1 >= 0) {
            this.e(int1);
            for (int i = 0; i < int1; ++i) {
                this.add(objectInputStream.readObject());
            }
            return;
        }
        final StringBuilder sb = new StringBuilder(25);
        sb.append("Invalid size: ");
        sb.append(int1);
        throw new InvalidObjectException(sb.toString());
    }
    
    private void writeObject(final ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(this.size());
        final Iterator iterator = this.iterator();
        while (iterator.hasNext()) {
            objectOutputStream.writeObject(iterator.next());
        }
    }
    
    final int a() {
        if (this.isEmpty()) {
            return -1;
        }
        return 0;
    }
    
    @Override
    public final boolean add(final Object o) {
        if (this.f()) {
            njo.p(this.f(), "Arrays already allocated");
            final int b = this.b;
            final int r = nov.r(b);
            this.c = nov.s(r);
            this.i(r - 1);
            this.d = new int[b];
            this.a = new Object[b];
        }
        final Set c = this.c();
        if (c != null) {
            return c.add(o);
        }
        final int[] d = this.d;
        final Object[] a = this.a;
        final int e = this.e;
        final int e2 = e + 1;
        final int k = nov.k(o);
        final int g = this.g();
        final int n = k & g;
        int q = nov.q(this.c, n);
        int n2;
        if (q == 0) {
            if (e2 > g) {
                n2 = this.h(g, nov.o(g), k, e);
            }
            else {
                nov.u(this.c, n, e2);
                n2 = g;
            }
        }
        else {
            final int m = nov.m(k, g);
            int n3 = 0;
            while (true) {
                final int n4 = q - 1;
                final int n5 = d[n4];
                if (nov.m(n5, g) == m && nqb.E(o, a[n4])) {
                    return false;
                }
                q = (n5 & g);
                ++n3;
                if (q != 0) {
                    continue;
                }
                if (n3 >= 9) {
                    final LinkedHashSet c2 = new LinkedHashSet(this.g() + 1, 1.0f);
                    for (int i = this.a(); i >= 0; i = this.b(i)) {
                        c2.add(this.a[i]);
                    }
                    this.c = c2;
                    this.d = null;
                    this.a = null;
                    this.d();
                    return c2.add(o);
                }
                if (e2 > g) {
                    n2 = this.h(g, nov.o(g), k, e);
                    break;
                }
                d[n4] = nov.n(n5, e2, g);
                n2 = g;
                break;
            }
        }
        final int length = this.d.length;
        if (e2 > length) {
            final int min = Math.min(1073741823, Math.max(1, length >>> 1) + length | 0x1);
            if (min != length) {
                this.d = Arrays.copyOf(this.d, min);
                this.a = Arrays.copyOf(this.a, min);
            }
        }
        this.d[e] = nov.n(k, 0, n2);
        this.a[e] = o;
        this.e = e2;
        this.d();
        return true;
    }
    
    final int b(int n) {
        if (++n < this.e) {
            return n;
        }
        return -1;
    }
    
    final Set c() {
        final Object c = this.c;
        if (c instanceof Set) {
            return (Set)c;
        }
        return null;
    }
    
    @Override
    public final void clear() {
        if (this.f()) {
            return;
        }
        this.d();
        final Set c = this.c();
        if (c != null) {
            this.b = ofi.y(this.size(), 3, 1073741823);
            c.clear();
            this.c = null;
            this.e = 0;
            return;
        }
        Arrays.fill(this.a, 0, this.e, null);
        nov.t(this.c);
        Arrays.fill(this.d, 0, this.e, 0);
        this.e = 0;
    }
    
    @Override
    public final boolean contains(final Object o) {
        if (this.f()) {
            return false;
        }
        final Set c = this.c();
        if (c != null) {
            return c.contains(o);
        }
        final int k = nov.k(o);
        final int g = this.g();
        int q = nov.q(this.c, k & g);
        if (q == 0) {
            return false;
        }
        final int m = nov.m(k, g);
        int n;
        do {
            --q;
            n = this.d[q];
            if (nov.m(n, g) == m && nqb.E(o, this.a[q])) {
                return true;
            }
        } while ((q = (n & g)) != 0);
        return false;
    }
    
    final void d() {
        this.b += 32;
    }
    
    final void e(final int n) {
        njo.e(true, "Expected size must be >= 0");
        this.b = ofi.y(n, 1, 1073741823);
    }
    
    final boolean f() {
        return this.c == null;
    }
    
    @Override
    public final boolean isEmpty() {
        return this.size() == 0;
    }
    
    @Override
    public final Iterator iterator() {
        final Set c = this.c();
        if (c != null) {
            return c.iterator();
        }
        return new nls(this);
    }
    
    @Override
    public final boolean remove(Object o) {
        if (this.f()) {
            return false;
        }
        final Set c = this.c();
        if (c != null) {
            return c.remove(o);
        }
        final int g = this.g();
        final int p = nov.p(o, null, g, this.c, this.d, this.a, null);
        if (p != -1) {
            int n = this.size() - 1;
            if (p < n) {
                final Object[] a = this.a;
                o = a[n];
                a[p] = o;
                a[n] = null;
                final int[] d = this.d;
                d[p] = d[n];
                d[n] = 0;
                final int n2 = nov.k(o) & g;
                int q = nov.q(this.c, n2);
                ++n;
                if (q == n) {
                    nov.u(this.c, n2, p + 1);
                }
                else {
                    int n3;
                    int[] d2;
                    int n4;
                    do {
                        n3 = q - 1;
                        d2 = this.d;
                        n4 = d2[n3];
                        q = (n4 & g);
                    } while (q != n);
                    d2[n3] = nov.n(n4, p + 1, g);
                }
            }
            else {
                this.a[p] = null;
                this.d[p] = 0;
            }
            --this.e;
            this.d();
            return true;
        }
        return false;
    }
    
    @Override
    public final int size() {
        final Set c = this.c();
        int n;
        if (c != null) {
            n = c.size();
        }
        else {
            n = this.e;
        }
        return n;
    }
    
    @Override
    public final Object[] toArray() {
        if (this.f()) {
            return new Object[0];
        }
        final Set c = this.c();
        Object[] array;
        if (c != null) {
            array = c.toArray();
        }
        else {
            array = Arrays.copyOf(this.a, this.e);
        }
        return array;
    }
    
    @Override
    public final Object[] toArray(Object[] array) {
        if (this.f()) {
            if (array.length > 0) {
                array[0] = null;
            }
            return array;
        }
        final Set c = this.c();
        if (c != null) {
            array = c.toArray(array);
        }
        else {
            final Object[] a = this.a;
            final int e = this.e;
            njo.n(0, e, a.length);
            final int length = array.length;
            if (length < e) {
                array = nrr.w(array, e);
            }
            else if (length > e) {
                array[e] = null;
            }
            System.arraycopy(a, 0, array, 0, e);
        }
        return array;
    }
}
