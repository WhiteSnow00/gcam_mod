import java.util.Iterator;
import java.util.Collection;
import java.util.AbstractCollection;

// 
// Decompiled by Procyon v0.6.0
// 

final class nlh extends AbstractCollection
{
    final Collection a;
    final njc b;
    
    public nlh(final Collection a, final njc b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean add(final Object o) {
        njo.d(this.b.a(o));
        return this.a.add(o);
    }
    
    @Override
    public final boolean addAll(final Collection collection) {
        final Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            njo.d(this.b.a(iterator.next()));
        }
        return this.a.addAll(collection);
    }
    
    @Override
    public final void clear() {
        nov.i(this.a, this.b);
    }
    
    @Override
    public final boolean contains(final Object o) {
        return nov.y(this.a, o) && this.b.a(o);
    }
    
    @Override
    public final boolean containsAll(final Collection collection) {
        return nov.x(this, collection);
    }
    
    @Override
    public final boolean isEmpty() {
        final Collection a = this.a;
        final njc b = this.b;
        final Iterator iterator = a.iterator();
        b.getClass();
        int n = 0;
        while (iterator.hasNext()) {
            if (b.a(iterator.next())) {
                if (n != -1) {
                    return false;
                }
                break;
            }
            else {
                ++n;
            }
        }
        return true;
    }
    
    @Override
    public final Iterator iterator() {
        final Iterator iterator = this.a.iterator();
        final njc b = this.b;
        iterator.getClass();
        b.getClass();
        return new nkd(iterator, b);
    }
    
    @Override
    public final boolean remove(final Object o) {
        return this.contains(o) && this.a.remove(o);
    }
    
    @Override
    public final boolean removeAll(final Collection collection) {
        final Iterator iterator = this.a.iterator();
        boolean b = false;
        while (iterator.hasNext()) {
            final Object next = iterator.next();
            if (this.b.a(next) && collection.contains(next)) {
                iterator.remove();
                b = true;
            }
        }
        return b;
    }
    
    @Override
    public final boolean retainAll(final Collection collection) {
        final Iterator iterator = this.a.iterator();
        boolean b = false;
        while (iterator.hasNext()) {
            final Object next = iterator.next();
            if (this.b.a(next) && !collection.contains(next)) {
                iterator.remove();
                b = true;
            }
        }
        return b;
    }
    
    @Override
    public final int size() {
        final Iterator iterator = this.a.iterator();
        int n = 0;
        while (iterator.hasNext()) {
            if (this.b.a(iterator.next())) {
                ++n;
            }
        }
        return n;
    }
    
    @Override
    public final Object[] toArray() {
        return nqb.o(this.iterator()).toArray();
    }
    
    @Override
    public final Object[] toArray(final Object[] array) {
        return nqb.o(this.iterator()).toArray(array);
    }
}
