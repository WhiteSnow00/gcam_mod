import java.util.NoSuchElementException;
import java.util.Set;
import java.util.Iterator;
import java.util.Collection;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;

// 
// Decompiled by Procyon v0.6.0
// 

final class nqs extends noq
{
    static final nqs a;
    final transient nns d;
    
    static {
        a = new nqs(nns.l(), nqc.a);
    }
    
    public nqs(final nns d, final Comparator comparator) {
        super(comparator);
        this.d = d;
    }
    
    @Override
    public final Object[] A() {
        return this.d.A();
    }
    
    @Override
    public final nrv bM() {
        return this.d.a().t();
    }
    
    @Override
    public final nrv bN() {
        return this.d.t();
    }
    
    @Override
    public final boolean bO() {
        return this.d.bO();
    }
    
    @Override
    public final Object ceiling(final Object o) {
        final int f = this.f(o, true);
        if (f == this.size()) {
            return null;
        }
        return this.d.get(f);
    }
    
    @Override
    public final boolean contains(final Object o) {
        if (o != null) {
            try {
                if (Collections.binarySearch(this.d, o, this.b) >= 0) {
                    return true;
                }
            }
            catch (final ClassCastException ex) {}
        }
        return false;
    }
    
    @Override
    public final boolean containsAll(final Collection collection) {
        Object f = collection;
        if (collection instanceof npt) {
            f = ((npt)collection).f();
        }
        if (!nrr.k(super.b, (Iterable)f) || ((Collection)f).size() <= 1) {
            return super.containsAll((Collection<?>)f);
        }
        final nrv bn = this.bN();
        final Iterator iterator = ((Collection)f).iterator();
        if (!bn.hasNext()) {
            return false;
        }
        Object o = iterator.next();
        Object o2 = bn.next();
        try {
            while (true) {
                final int o3 = this.O(o2, o);
                if (o3 < 0) {
                    if (!bn.hasNext()) {
                        return false;
                    }
                    o2 = bn.next();
                }
                else {
                    if (o3 != 0) {
                        return false;
                    }
                    if (!iterator.hasNext()) {
                        return true;
                    }
                    o = iterator.next();
                }
            }
        }
        catch (final ClassCastException ex) {}
        catch (final NullPointerException ex2) {}
        return false;
    }
    
    final int e(final Object o, final boolean b) {
        final nns d = this.d;
        o.getClass();
        final int binarySearch = Collections.binarySearch(d, o, super.b);
        if (binarySearch >= 0) {
            int n = binarySearch;
            if (b) {
                n = binarySearch + 1;
            }
            return n;
        }
        return ~binarySearch;
    }
    
    @Override
    public final boolean equals(Object next) {
        if (next == this) {
            return true;
        }
        if (!(next instanceof Set)) {
            return false;
        }
        final Set set = (Set)next;
        if (this.size() != set.size()) {
            return false;
        }
        if (this.isEmpty()) {
            return true;
        }
        if (nrr.k(this.b, set)) {
            final Iterator iterator = set.iterator();
            try {
                final nrv bn = this.bN();
                while (bn.hasNext()) {
                    next = bn.next();
                    final Object next2 = iterator.next();
                    if (next2 == null || this.O(next, next2) != 0) {
                        return false;
                    }
                }
                return true;
            }
            catch (final NoSuchElementException ex) {
                return false;
            }
            catch (final ClassCastException ex2) {
                return false;
            }
        }
        return this.containsAll(set);
    }
    
    final int f(final Object o, final boolean b) {
        final nns d = this.d;
        o.getClass();
        final int binarySearch = Collections.binarySearch(d, o, super.b);
        if (binarySearch < 0) {
            return ~binarySearch;
        }
        if (b) {
            return binarySearch;
        }
        return binarySearch + 1;
    }
    
    @Override
    public final Object first() {
        if (!this.isEmpty()) {
            return this.d.get(0);
        }
        throw new NoSuchElementException();
    }
    
    @Override
    public final Object floor(final Object o) {
        final int n = this.e(o, true) - 1;
        if (n == -1) {
            return null;
        }
        return this.d.get(n);
    }
    
    final nqs g(final int n, final int n2) {
        int n3 = n;
        if (n == 0) {
            if (n2 == this.size()) {
                return this;
            }
            n3 = 0;
        }
        if (n3 < n2) {
            return new nqs(this.d.b(n3, n2), this.b);
        }
        return noq.Q(this.b);
    }
    
    @Override
    public final Object higher(final Object o) {
        final int f = this.f(o, false);
        if (f == this.size()) {
            return null;
        }
        return this.d.get(f);
    }
    
    @Override
    public final noq k() {
        final Comparator<Object> reverseOrder = Collections.reverseOrder((Comparator<Object>)this.b);
        nqs q;
        if (this.isEmpty()) {
            q = noq.Q(reverseOrder);
        }
        else {
            q = new nqs(this.d.a(), reverseOrder);
        }
        return q;
    }
    
    @Override
    public final Object last() {
        if (!this.isEmpty()) {
            return this.d.get(this.size() - 1);
        }
        throw new NoSuchElementException();
    }
    
    @Override
    public final Object lower(final Object o) {
        final int n = this.e(o, false) - 1;
        if (n == -1) {
            return null;
        }
        return this.d.get(n);
    }
    
    @Override
    public final noq n(final Object o, final boolean b) {
        return this.g(0, this.e(o, b));
    }
    
    @Override
    public final noq q(final Object o, final boolean b, final Object o2, final boolean b2) {
        return this.t(o, b).n(o2, b2);
    }
    
    @Override
    public final int size() {
        return this.d.size();
    }
    
    @Override
    public final noq t(final Object o, final boolean b) {
        return this.g(this.f(o, b), this.size());
    }
    
    @Override
    public final nns v() {
        return this.d;
    }
    
    @Override
    public final int x(final Object[] array, final int n) {
        return this.d.x(array, n);
    }
    
    @Override
    public final int y() {
        return this.d.y();
    }
    
    @Override
    public final int z() {
        return this.d.z();
    }
}
