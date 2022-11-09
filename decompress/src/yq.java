import java.util.Iterator;
import java.util.Collection;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

final class yq implements Set
{
    final /* synthetic */ yu a;
    
    public yq(final yu a) {
        this.a = a;
    }
    
    @Override
    public final boolean add(final Object o) {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public final boolean addAll(final Collection collection) {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public final void clear() {
        this.a.clear();
    }
    
    @Override
    public final boolean contains(final Object o) {
        return this.a.containsKey(o);
    }
    
    @Override
    public final boolean containsAll(final Collection collection) {
        final yu a = this.a;
        final Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            if (!a.containsKey(iterator.next())) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this != o) {
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
    public final int hashCode() {
        int i = this.a.j - 1;
        int n = 0;
        while (i >= 0) {
            final Object f = this.a.f(i);
            int hashCode;
            if (f == null) {
                hashCode = 0;
            }
            else {
                hashCode = f.hashCode();
            }
            n += hashCode;
            --i;
        }
        return n;
    }
    
    @Override
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }
    
    @Override
    public final Iterator iterator() {
        return new yp(this.a);
    }
    
    @Override
    public final boolean remove(final Object o) {
        final int c = this.a.c(o);
        if (c >= 0) {
            this.a.g(c);
            return true;
        }
        return false;
    }
    
    @Override
    public final boolean removeAll(final Collection collection) {
        final yu a = this.a;
        final int j = a.j;
        final Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            a.remove(iterator.next());
        }
        return j != a.j;
    }
    
    @Override
    public final boolean retainAll(final Collection collection) {
        final yu a = this.a;
        final int j = a.j;
        for (int i = j - 1; i >= 0; --i) {
            if (!collection.contains(a.f(i))) {
                a.g(i);
            }
        }
        return j != a.j;
    }
    
    @Override
    public final int size() {
        return this.a.j;
    }
    
    @Override
    public final Object[] toArray() {
        final int j = this.a.j;
        final Object[] array = new Object[j];
        for (int i = 0; i < j; ++i) {
            array[i] = this.a.f(i);
        }
        return array;
    }
    
    @Override
    public final Object[] toArray(final Object[] array) {
        return this.a.a(array, 0);
    }
}
