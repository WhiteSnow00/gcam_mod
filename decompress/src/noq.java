import java.util.SortedSet;
import java.util.Iterator;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.NavigableSet;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class noq extends nor implements NavigableSet, nqz
{
    final transient Comparator b;
    transient noq c;
    
    public noq(final Comparator b) {
        this.b = b;
    }
    
    public static noq P(final Comparator comparator, final int n, Object... copy) {
        if (n == 0) {
            return Q(comparator);
        }
        nrr.z(copy, n);
        Arrays.sort(copy, 0, n, comparator);
        int i = 1;
        int n2 = 1;
        while (i < n) {
            final Object o = copy[i];
            int n3 = n2;
            if (comparator.compare(o, copy[n2 - 1]) != 0) {
                copy[n2] = o;
                n3 = n2 + 1;
            }
            ++i;
            n2 = n3;
        }
        Arrays.fill(copy, n2, n, null);
        if (n2 < copy.length >> 1) {
            copy = Arrays.copyOf(copy, n2);
        }
        return new nqs(nns.h(copy, n2), comparator);
    }
    
    static nqs Q(final Comparator comparator) {
        if (nqc.a.equals(comparator)) {
            return nqs.a;
        }
        return new nqs(nns.l(), comparator);
    }
    
    private void readObject(final ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }
    
    final int O(final Object o, final Object o2) {
        return this.b.compare(o, o2);
    }
    
    public noq bL() {
        noq c;
        if ((c = this.c) == null) {
            c = this.k();
            this.c = c;
            c.c = this;
        }
        return c;
    }
    
    public abstract nrv bM();
    
    @Override
    public abstract nrv bN();
    
    @Override
    public Object ceiling(final Object o) {
        return nov.c(this.s(o, true), null);
    }
    
    @Override
    public final Comparator comparator() {
        return this.b;
    }
    
    @Override
    public Object first() {
        return this.bN().next();
    }
    
    @Override
    public Object floor(final Object o) {
        return nqb.x(this.m(o, true).bM(), null);
    }
    
    @Override
    public Object higher(final Object o) {
        return nov.c(this.s(o, false), null);
    }
    
    public abstract noq k();
    
    public noq l(final Object o) {
        return this.m(o, false);
    }
    
    @Override
    public Object last() {
        return this.bM().next();
    }
    
    @Override
    public Object lower(final Object o) {
        return nqb.x(this.m(o, false).bM(), null);
    }
    
    public noq m(final Object o, final boolean b) {
        o.getClass();
        return this.n(o, b);
    }
    
    public abstract noq n(final Object p0, final boolean p1);
    
    public noq o(final Object o, final Object o2) {
        return this.p(o, true, o2, false);
    }
    
    public noq p(final Object o, final boolean b, final Object o2, final boolean b2) {
        o.getClass();
        o2.getClass();
        njo.d(this.b.compare(o, o2) <= 0);
        return this.q(o, b, o2, b2);
    }
    
    @Deprecated
    @Override
    public final Object pollFirst() {
        throw new UnsupportedOperationException();
    }
    
    @Deprecated
    @Override
    public final Object pollLast() {
        throw new UnsupportedOperationException();
    }
    
    public abstract noq q(final Object p0, final boolean p1, final Object p2, final boolean p3);
    
    public noq r(final Object o) {
        return this.s(o, true);
    }
    
    public noq s(final Object o, final boolean b) {
        o.getClass();
        return this.t(o, b);
    }
    
    public abstract noq t(final Object p0, final boolean p1);
    
    @Override
    Object writeReplace() {
        return new nop(this.b, this.toArray());
    }
}
