import java.util.Iterator;
import java.util.Collection;

// 
// Decompiled by Procyon v0.6.0
// 

final class ys implements Collection
{
    final /* synthetic */ yu a;
    
    public ys(final yu a) {
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
        return this.a.e(o) >= 0;
    }
    
    @Override
    public final boolean containsAll(final Collection collection) {
        final Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            if (!this.contains(iterator.next())) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }
    
    @Override
    public final Iterator iterator() {
        return new yt(this.a);
    }
    
    @Override
    public final boolean remove(final Object o) {
        final int e = this.a.e(o);
        if (e >= 0) {
            this.a.g(e);
            return true;
        }
        return false;
    }
    
    @Override
    public final boolean removeAll(final Collection collection) {
        int j = this.a.j;
        int i = 0;
        boolean b = false;
        while (i < j) {
            if (collection.contains(this.a.i(i))) {
                this.a.g(i);
                --i;
                --j;
                b = true;
            }
            ++i;
        }
        return b;
    }
    
    @Override
    public final boolean retainAll(final Collection collection) {
        int j = this.a.j;
        int i = 0;
        boolean b = false;
        while (i < j) {
            if (!collection.contains(this.a.i(i))) {
                this.a.g(i);
                --i;
                --j;
                b = true;
            }
            ++i;
        }
        return b;
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
            array[i] = this.a.i(i);
        }
        return array;
    }
    
    @Override
    public final Object[] toArray(final Object[] array) {
        return this.a.a(array, 1);
    }
}
