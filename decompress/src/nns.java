import java.util.ListIterator;
import java.util.Arrays;
import java.util.Comparator;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Iterator;
import java.util.Collection;
import java.util.RandomAccess;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class nns extends nnj implements List, RandomAccess
{
    private static final nrw a;
    
    static {
        a = new nno(nql.a, 0);
    }
    
    public static nnn e() {
        return new nnn();
    }
    
    public static nnn f(final int n) {
        nqb.C(n, "expectedSize");
        return new nnn(n);
    }
    
    static nns g(final Object[] array) {
        return h(array, array.length);
    }
    
    static nns h(final Object[] array, final int n) {
        if (n == 0) {
            return nql.a;
        }
        return new nql(array, n);
    }
    
    public static nns i(final Iterable iterable) {
        iterable.getClass();
        nns nns;
        if (iterable instanceof Collection) {
            nns = j((Collection)iterable);
        }
        else {
            final Iterator iterator = iterable.iterator();
            if (!iterator.hasNext()) {
                nns = nql.a;
            }
            else {
                final Object next = iterator.next();
                if (!iterator.hasNext()) {
                    nns = m(next);
                }
                else {
                    final nnn nnn = new nnn();
                    nnn.g(next);
                    nnn.i(iterator);
                    nns = nnn.f();
                }
            }
        }
        return nns;
    }
    
    public static nns j(final Collection collection) {
        if (collection instanceof nnj) {
            nns nns2;
            final nns nns = nns2 = ((nnj)collection).v();
            if (nns.bO()) {
                nns2 = g(nns.toArray());
            }
            return nns2;
        }
        return w(collection.toArray());
    }
    
    public static nns k(final Object[] array) {
        nns nns;
        if (array.length == 0) {
            nns = nql.a;
        }
        else {
            nns = w((Object[])array.clone());
        }
        return nns;
    }
    
    public static nns l() {
        return nql.a;
    }
    
    public static nns m(final Object o) {
        return w(o);
    }
    
    public static nns n(final Object o, final Object o2) {
        return w(o, o2);
    }
    
    public static nns o(final Object o, final Object o2, final Object o3) {
        return w(o, o2, o3);
    }
    
    public static nns p(final Object o, final Object o2, final Object o3, final Object o4) {
        return w(o, o2, o3, o4);
    }
    
    public static nns q(final Object o, final Object o2, final Object o3, final Object o4, final Object o5) {
        return w(o, o2, o3, o4, o5);
    }
    
    @SafeVarargs
    public static nns r(final Object o, final Object o2, final Object o3, final Object o4, final Object o5, final Object o6, final Object o7, final Object o8, final Object o9, final Object o10, final Object o11, final Object o12, final Object... array) {
        njo.e(true, "the total number of elements must fit in an int");
        final int length = array.length;
        final Object[] array2 = new Object[length + 12];
        array2[0] = o;
        array2[1] = o2;
        array2[2] = o3;
        array2[3] = o4;
        array2[4] = o5;
        array2[5] = o6;
        array2[6] = o7;
        array2[7] = o8;
        array2[8] = o9;
        array2[9] = o10;
        array2[10] = o11;
        array2[11] = o12;
        System.arraycopy(array, 0, array2, 12, length);
        return w(array2);
    }
    
    private void readObject(final ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }
    
    public static nns s(final Comparator comparator, final Iterable iterable) {
        comparator.getClass();
        final Object[] g = nov.g(iterable);
        nrr.A(g);
        Arrays.sort(g, comparator);
        return g(g);
    }
    
    private static nns w(final Object... array) {
        nrr.A(array);
        return g(array);
    }
    
    public nns a() {
        if (this.size() <= 1) {
            return this;
        }
        return new nnp(this);
    }
    
    @Deprecated
    @Override
    public final void add(final int n, final Object o) {
        throw new UnsupportedOperationException();
    }
    
    @Deprecated
    @Override
    public final boolean addAll(final int n, final Collection collection) {
        throw new UnsupportedOperationException();
    }
    
    public nns b(final int n, int n2) {
        njo.n(n, n2, this.size());
        n2 -= n;
        if (n2 == this.size()) {
            return this;
        }
        if (n2 == 0) {
            return nql.a;
        }
        return new nnr(this, n, n2);
    }
    
    @Override
    public final nrv bN() {
        return this.t();
    }
    
    @Override
    public boolean contains(final Object o) {
        return this.indexOf(o) >= 0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return nqb.t(this, o);
    }
    
    @Override
    public final int hashCode() {
        final int size = this.size();
        int n = 1;
        for (int i = 0; i < size; ++i) {
            n = n * 31 + this.get(i).hashCode();
        }
        return n;
    }
    
    @Override
    public int indexOf(final Object o) {
        final int n = -1;
        if (o == null) {
            return -1;
        }
        for (int size = this.size(), i = 0; i < size; ++i) {
            if (o.equals(this.get(i))) {
                return i;
            }
        }
        return n;
    }
    
    @Override
    public int lastIndexOf(final Object o) {
        final int n = -1;
        if (o == null) {
            return -1;
        }
        for (int i = this.size() - 1; i >= 0; --i) {
            if (o.equals(this.get(i))) {
                return i;
            }
        }
        return n;
    }
    
    @Deprecated
    @Override
    public final Object remove(final int n) {
        throw new UnsupportedOperationException();
    }
    
    @Deprecated
    @Override
    public final Object set(final int n, final Object o) {
        throw new UnsupportedOperationException();
    }
    
    public final nrw t() {
        return this.u(0);
    }
    
    public final nrw u(final int n) {
        njo.w(n, this.size());
        if (this.isEmpty()) {
            return nns.a;
        }
        return new nno(this, n);
    }
    
    @Deprecated
    @Override
    public final nns v() {
        return this;
    }
    
    @Override
    Object writeReplace() {
        return new nnq(this.toArray());
    }
    
    @Override
    public int x(final Object[] array, final int n) {
        final int size = this.size();
        for (int i = 0; i < size; ++i) {
            array[n + i] = this.get(i);
        }
        return n + size;
    }
}
