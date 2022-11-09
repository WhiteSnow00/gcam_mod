import java.util.Collection;
import java.util.SortedMap;
import java.util.List;
import java.util.Collections;
import java.util.Set;
import java.util.NavigableSet;
import java.util.Comparator;
import j$.util.Map;
import java.util.NavigableMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class non extends noo implements NavigableMap, j$.util.Map
{
    private static final non c;
    private static final long serialVersionUID = 0L;
    public final transient nqs a;
    public final transient nns b;
    private transient non d;
    
    static {
        c = new non(noq.Q(nqc.a), nns.l());
    }
    
    public non(final nqs nqs, final nns nns) {
        this(nqs, nns, null);
    }
    
    public non(final nqs a, final nns b, final non d) {
        this.a = a;
        this.b = b;
        this.d = d;
    }
    
    public static nol a() {
        return new nol(nqc.a);
    }
    
    static non f(final Comparator comparator) {
        if (nqc.a.equals(comparator)) {
            return non.c;
        }
        return new non(noq.Q(comparator), nns.l());
    }
    
    private final non u(final int n, final int n2) {
        int n3 = n;
        if (n == 0) {
            if (n2 == this.size()) {
                return this;
            }
            n3 = 0;
        }
        if (n3 == n2) {
            return f(this.comparator());
        }
        return new non(this.a.g(n3, n2), this.b.b(n3, n2));
    }
    
    public final noi bP() {
        noi a;
        if (this.isEmpty()) {
            a = nqr.a;
        }
        else {
            a = new nok(this);
        }
        return a;
    }
    
    public final noi bQ() {
        throw new AssertionError((Object)"should never be called");
    }
    
    public final boolean bS() {
        return this.a.bO() || this.b.bO();
    }
    
    @Override
    public final Entry ceilingEntry(final Object o) {
        return this.k(o, true).firstEntry();
    }
    
    @Override
    public final Object ceilingKey(final Object o) {
        return nqb.f(this.ceilingEntry(o));
    }
    
    public final Comparator comparator() {
        return this.a.b;
    }
    
    @Override
    public final Entry firstEntry() {
        if (this.isEmpty()) {
            return null;
        }
        return (Entry)this.s().v().get(0);
    }
    
    public final Object firstKey() {
        return this.a.first();
    }
    
    @Override
    public final Entry floorEntry(final Object o) {
        return this.g(o, true).lastEntry();
    }
    
    @Override
    public final Object floorKey(final Object o) {
        return nqb.f(this.floorEntry(o));
    }
    
    public final non g(final Object o, final boolean b) {
        final nqs a = this.a;
        o.getClass();
        return this.u(0, a.e(o, b));
    }
    
    public final Object get(final Object o) {
        final nqs a = this.a;
        int binarySearch = 0;
        Label_0042: {
            if (o == null) {
                binarySearch = -1;
            }
            else {
                try {
                    if ((binarySearch = Collections.binarySearch(a.d, o, a.b)) >= 0) {
                        break Label_0042;
                    }
                }
                catch (final ClassCastException ex) {}
                binarySearch = -1;
            }
        }
        if (binarySearch == -1) {
            return null;
        }
        return this.b.get(binarySearch);
    }
    
    public final nnj h() {
        throw new AssertionError((Object)"should never be called");
    }
    
    @Override
    public final Entry higherEntry(final Object o) {
        return this.k(o, false).firstEntry();
    }
    
    @Override
    public final Object higherKey(final Object o) {
        return nqb.f(this.higherEntry(o));
    }
    
    public final nnj i() {
        return this.b;
    }
    
    public final non j(final Object o, final boolean b, final Object o2, final boolean b2) {
        o.getClass();
        o2.getClass();
        njo.l(this.comparator().compare(o, o2) <= 0, "expected fromKey <= toKey but %s > %s", o, o2);
        return this.g(o2, b2).k(o, b);
    }
    
    public final non k(final Object o, final boolean b) {
        final nqs a = this.a;
        o.getClass();
        return this.u(a.f(o, b), this.size());
    }
    
    @Override
    public final Entry lastEntry() {
        if (this.isEmpty()) {
            return null;
        }
        return (Entry)this.s().v().get(this.size() - 1);
    }
    
    public final Object lastKey() {
        return this.a.last();
    }
    
    @Override
    public final Entry lowerEntry(final Object o) {
        return this.g(o, false).lastEntry();
    }
    
    @Override
    public final Object lowerKey(final Object o) {
        return nqb.f(this.lowerEntry(o));
    }
    
    @Deprecated
    @Override
    public final Entry pollFirstEntry() {
        throw new UnsupportedOperationException();
    }
    
    @Deprecated
    @Override
    public final Entry pollLastEntry() {
        throw new UnsupportedOperationException();
    }
    
    public final int size() {
        return this.b.size();
    }
    
    Object writeReplace() {
        return new nom(this);
    }
}
