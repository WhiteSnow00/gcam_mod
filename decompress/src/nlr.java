import java.util.LinkedHashMap;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.io.ObjectOutputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Collection;
import java.util.Set;
import java.io.Serializable;
import java.util.AbstractMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nlr extends AbstractMap implements Serializable
{
    public static final Object a;
    public transient Object b;
    transient int[] c;
    transient Object[] d;
    transient Object[] e;
    public transient int f;
    public transient int g;
    private transient Set h;
    private transient Set i;
    private transient Collection j;
    
    static {
        a = new Object();
    }
    
    public nlr() {
        this.j(3);
    }
    
    public nlr(final int n) {
        this.j(n);
    }
    
    public static nlr e(final int n) {
        return new nlr(n);
    }
    
    private final int m(final int n, int i, int j, int n2) {
        final Object s = nov.s(i);
        final int n3 = i - 1;
        if (n2 != 0) {
            nov.u(s, j & n3, n2 + 1);
        }
        final Object b = this.b;
        final int[] c = this.c;
        int n4;
        int n5;
        int n6;
        int q;
        for (i = 0; i <= n; ++i) {
            for (j = nov.q(b, i); j != 0; j = (n5 & n)) {
                n4 = j - 1;
                n5 = c[n4];
                n6 = (nov.m(n5, n) | i);
                n2 = (n6 & n3);
                q = nov.q(s, n2);
                nov.u(s, n2, j);
                c[n4] = nov.n(n6, q, n3);
            }
        }
        this.b = s;
        this.n(n3);
        return n3;
    }
    
    private final void n(int numberOfLeadingZeros) {
        numberOfLeadingZeros = Integer.numberOfLeadingZeros(numberOfLeadingZeros);
        this.f = nov.n(this.f, 32 - numberOfLeadingZeros, 31);
    }
    
    private void readObject(final ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        final int int1 = objectInputStream.readInt();
        if (int1 >= 0) {
            this.j(int1);
            for (int i = 0; i < int1; ++i) {
                this.put(objectInputStream.readObject(), objectInputStream.readObject());
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
        final Iterator g = this.g();
        while (g.hasNext()) {
            final Map.Entry<Object, V> entry = g.next();
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }
    
    final int a() {
        if (this.isEmpty()) {
            return -1;
        }
        return 0;
    }
    
    final int b(int n) {
        if (++n < this.g) {
            return n;
        }
        return -1;
    }
    
    public final int c() {
        return (1 << (this.f & 0x1F)) - 1;
    }
    
    @Override
    public final void clear() {
        if (this.l()) {
            return;
        }
        this.i();
        final Map h = this.h();
        if (h != null) {
            this.f = ofi.y(this.size(), 3, 1073741823);
            h.clear();
            this.b = null;
            this.g = 0;
            return;
        }
        Arrays.fill(this.d, 0, this.g, null);
        Arrays.fill(this.e, 0, this.g, null);
        nov.t(this.b);
        Arrays.fill(this.c, 0, this.g, 0);
        this.g = 0;
    }
    
    @Override
    public final boolean containsKey(final Object o) {
        final Map h = this.h();
        boolean containsKey;
        if (h != null) {
            containsKey = h.containsKey(o);
        }
        else {
            if (this.d(o) != -1) {
                return true;
            }
            containsKey = false;
        }
        return containsKey;
    }
    
    @Override
    public final boolean containsValue(final Object o) {
        final Map h = this.h();
        if (h == null) {
            for (int i = 0; i < this.g; ++i) {
                if (nqb.E(o, this.e[i])) {
                    return true;
                }
            }
            return false;
        }
        return h.containsValue(o);
    }
    
    public final int d(final Object o) {
        if (this.l()) {
            return -1;
        }
        final int k = nov.k(o);
        final int c = this.c();
        int q = nov.q(this.b, k & c);
        if (q == 0) {
            return -1;
        }
        final int m = nov.m(k, c);
        int n;
        do {
            --q;
            n = this.c[q];
            if (nov.m(n, c) == m && nqb.E(o, this.d[q])) {
                return q;
            }
        } while ((q = (n & c)) != 0);
        return -1;
    }
    
    @Override
    public final Set entrySet() {
        Set i;
        if ((i = this.i) == null) {
            i = new nlm(this);
            this.i = i;
        }
        return i;
    }
    
    public final Object f(Object o) {
        if (this.l()) {
            return nlr.a;
        }
        final int c = this.c();
        final int p = nov.p(o, null, c, this.b, this.c, this.d, null);
        if (p == -1) {
            return nlr.a;
        }
        o = this.e[p];
        this.k(p, c);
        --this.g;
        this.i();
        return o;
    }
    
    final Iterator g() {
        final Map h = this.h();
        if (h != null) {
            return h.entrySet().iterator();
        }
        return new nlk(this);
    }
    
    @Override
    public final Object get(final Object o) {
        final Map h = this.h();
        if (h != null) {
            return h.get(o);
        }
        final int d = this.d(o);
        if (d == -1) {
            return null;
        }
        return this.e[d];
    }
    
    final Map h() {
        final Object b = this.b;
        if (b instanceof Map) {
            return (Map)b;
        }
        return null;
    }
    
    final void i() {
        this.f += 32;
    }
    
    @Override
    public final boolean isEmpty() {
        return this.size() == 0;
    }
    
    final void j(final int n) {
        njo.e(n >= 0, "Expected size must be >= 0");
        this.f = ofi.y(n, 1, 1073741823);
    }
    
    final void k(final int n, final int n2) {
        int n3 = this.size() - 1;
        if (n >= n3) {
            this.d[n] = null;
            this.e[n] = null;
            this.c[n] = 0;
            return;
        }
        final Object[] d = this.d;
        final Object o = d[n3];
        d[n] = o;
        final Object[] e = this.e;
        e[n] = e[n3];
        e[n3] = (d[n3] = null);
        final int[] c = this.c;
        c[n] = c[n3];
        c[n3] = 0;
        final int n4 = nov.k(o) & n2;
        int q = nov.q(this.b, n4);
        ++n3;
        if (q != n3) {
            int n5;
            int[] c2;
            int n6;
            do {
                n5 = q - 1;
                c2 = this.c;
                n6 = c2[n5];
                q = (n6 & n2);
            } while (q != n3);
            c2[n5] = nov.n(n6, n + 1, n2);
            return;
        }
        nov.u(this.b, n4, n + 1);
    }
    
    @Override
    public final Set keySet() {
        Set h;
        if ((h = this.h) == null) {
            h = new nlo(this);
            this.h = h;
        }
        return h;
    }
    
    final boolean l() {
        return this.b == null;
    }
    
    @Override
    public final Object put(Object o, final Object o2) {
        if (this.l()) {
            njo.p(this.l(), "Arrays already allocated");
            final int f = this.f;
            final int r = nov.r(f);
            this.b = nov.s(r);
            this.n(r - 1);
            this.c = new int[f];
            this.d = new Object[f];
            this.e = new Object[f];
        }
        final Map h = this.h();
        if (h != null) {
            return h.put(o, o2);
        }
        final int[] c = this.c;
        final Object[] d = this.d;
        final Object[] e = this.e;
        final int g = this.g;
        final int g2 = g + 1;
        final int k = nov.k(o);
        final int c2 = this.c();
        final int n = k & c2;
        int q = nov.q(this.b, n);
        int n2;
        if (q == 0) {
            if (g2 > c2) {
                n2 = this.m(c2, nov.o(c2), k, g);
            }
            else {
                nov.u(this.b, n, g2);
                n2 = c2;
            }
        }
        else {
            final int m = nov.m(k, c2);
            int n3 = 0;
            while (true) {
                final int n4 = q - 1;
                final int n5 = c[n4];
                if (nov.m(n5, c2) == m && nqb.E(o, d[n4])) {
                    o = e[n4];
                    e[n4] = o2;
                    return o;
                }
                q = (n5 & c2);
                ++n3;
                if (q != 0) {
                    continue;
                }
                if (n3 >= 9) {
                    final LinkedHashMap b = new LinkedHashMap(this.c() + 1, 1.0f);
                    for (int i = this.a(); i >= 0; i = this.b(i)) {
                        b.put(this.d[i], this.e[i]);
                    }
                    this.b = b;
                    this.c = null;
                    this.d = null;
                    this.e = null;
                    this.i();
                    return b.put(o, o2);
                }
                if (g2 > c2) {
                    n2 = this.m(c2, nov.o(c2), k, g);
                    break;
                }
                c[n4] = nov.n(n5, g2, c2);
                n2 = c2;
                break;
            }
        }
        final int length = this.c.length;
        if (g2 > length) {
            final int min = Math.min(1073741823, Math.max(1, length >>> 1) + length | 0x1);
            if (min != length) {
                this.c = Arrays.copyOf(this.c, min);
                this.d = Arrays.copyOf(this.d, min);
                this.e = Arrays.copyOf(this.e, min);
            }
        }
        this.c[g] = nov.n(k, 0, n2);
        this.d[g] = o;
        this.e[g] = o2;
        this.g = g2;
        this.i();
        return null;
    }
    
    @Override
    public final Object remove(Object f) {
        final Map h = this.h();
        if (h != null) {
            return h.remove(f);
        }
        if ((f = this.f(f)) == nlr.a) {
            f = null;
        }
        return f;
    }
    
    @Override
    public final int size() {
        final Map h = this.h();
        int n;
        if (h != null) {
            n = h.size();
        }
        else {
            n = this.g;
        }
        return n;
    }
    
    @Override
    public final Collection values() {
        Collection j;
        if ((j = this.j) == null) {
            j = new nlq(this);
            this.j = j;
        }
        return j;
    }
}
