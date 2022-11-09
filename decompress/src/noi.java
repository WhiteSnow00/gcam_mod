import java.util.Iterator;
import java.util.SortedSet;
import java.util.Collection;
import java.util.Arrays;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class noi extends nnj implements Set
{
    private transient nns a;
    
    static int B(int highestOneBit) {
        final int max = Math.max(highestOneBit, 2);
        if (max < 751619276) {
            highestOneBit = Integer.highestOneBit(max - 1);
            double n;
            do {
                highestOneBit += highestOneBit;
                n = highestOneBit;
                Double.isNaN(n);
            } while (n * 0.7 < max);
            return highestOneBit;
        }
        njo.e(max < 1073741824, "collection too large");
        return 1073741824;
    }
    
    public static nog D() {
        return new nog();
    }
    
    public static noi E(final int n, Object... copy) {
        switch (n) {
            default: {
                final int b = B(n);
                final Object[] array = new Object[b];
                final int n2 = b - 1;
                int i = 0;
                int n3 = 0;
                int n4 = 0;
                while (i < n) {
                    final Object o = copy[i];
                    nrr.y(o, i);
                    final int hashCode = o.hashCode();
                    int j = nov.j(hashCode);
                    while (true) {
                        final int n5 = j & n2;
                        final Object o2 = array[n5];
                        if (o2 == null) {
                            array[n5] = (copy[n4] = o);
                            n3 += hashCode;
                            ++n4;
                            break;
                        }
                        if (o2.equals(o)) {
                            break;
                        }
                        ++j;
                    }
                    ++i;
                }
                Arrays.fill(copy, n4, n, null);
                if (n4 == 1) {
                    final Object o3 = copy[0];
                    o3.getClass();
                    return new nqy(o3, n3);
                }
                if (B(n4) < b / 2) {
                    return E(n4, copy);
                }
                if (N(n4, copy.length)) {
                    copy = Arrays.copyOf(copy, n4);
                }
                return new nqr(copy, n3, array, n2, n4);
            }
            case 1: {
                final Object o4 = copy[0];
                o4.getClass();
                return H(o4);
            }
            case 0: {
                return nqr.a;
            }
        }
    }
    
    public static noi F(final Collection collection) {
        if (collection instanceof noi && !(collection instanceof SortedSet)) {
            final noi noi = (noi)collection;
            if (!noi.bO()) {
                return noi;
            }
        }
        final Object[] array = collection.toArray();
        return E(array.length, array);
    }
    
    public static noi G(final Object[] array) {
        final int length = array.length;
        switch (length) {
            default: {
                return E(length, (Object[])array.clone());
            }
            case 1: {
                return H(array[0]);
            }
            case 0: {
                return nqr.a;
            }
        }
    }
    
    public static noi H(final Object o) {
        return new nqy(o);
    }
    
    public static noi I(final Object o, final Object o2) {
        return E(2, o, o2);
    }
    
    public static noi J(final Object o, final Object o2, final Object o3) {
        return E(3, o, o2, o3);
    }
    
    public static noi K(final Object o, final Object o2, final Object o3, final Object o4) {
        return E(4, o, o2, o3, o4);
    }
    
    public static noi L(final Object o, final Object o2, final Object o3, final Object o4, final Object o5) {
        return E(5, o, o2, o3, o4, o5);
    }
    
    @SafeVarargs
    public static noi M(final Object o, final Object o2, final Object o3, final Object o4, final Object o5, final Object o6, final Object... array) {
        njo.e(true, "the total number of elements must fit in an int");
        final int length = array.length;
        final int n = length + 6;
        final Object[] array2 = new Object[n];
        array2[0] = o;
        array2[1] = o2;
        array2[2] = o3;
        array2[3] = o4;
        array2[4] = o5;
        array2[5] = o6;
        System.arraycopy(array, 0, array2, 6, length);
        return E(n, array2);
    }
    
    public static boolean N(final int n, final int n2) {
        return n < (n2 >> 1) + (n2 >> 2);
    }
    
    public nns C() {
        return nns.g(this.toArray());
    }
    
    @Override
    public abstract nrv bN();
    
    @Override
    public boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (o instanceof noi && this.w() && ((noi)o).w() && this.hashCode() != o.hashCode()) {
            return false;
        }
        if (o != this) {
            if (o instanceof Set) {
                final Set set = (Set)o;
                try {
                    if (this.size() == set.size()) {
                        if (this.containsAll(set)) {
                            return true;
                        }
                    }
                }
                catch (final ClassCastException ex) {}
                catch (final NullPointerException ex2) {}
            }
            b = false;
        }
        return b;
    }
    
    @Override
    public int hashCode() {
        return nrr.l(this);
    }
    
    @Override
    public nns v() {
        nns a;
        if ((a = this.a) == null) {
            a = this.C();
            this.a = a;
        }
        return a;
    }
    
    public boolean w() {
        return false;
    }
    
    @Override
    Object writeReplace() {
        return new noh(this.toArray());
    }
}
