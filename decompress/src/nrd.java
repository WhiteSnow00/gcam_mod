import java.util.Iterator;
import java.util.Collection;

// 
// Decompiled by Procyon v0.6.0
// 

class nrd extends nri implements Collection
{
    private static final long serialVersionUID = 0L;
    
    public nrd(final Collection collection, final Object o) {
        super(collection, o);
    }
    
    public Collection a() {
        return (Collection)super.g;
    }
    
    @Override
    public final boolean add(final Object o) {
        synchronized (this.h) {
            return this.a().add(o);
        }
    }
    
    @Override
    public final boolean addAll(final Collection collection) {
        synchronized (this.h) {
            return this.a().addAll(collection);
        }
    }
    
    @Override
    public final void clear() {
        synchronized (this.h) {
            this.a().clear();
        }
    }
    
    @Override
    public final boolean contains(final Object o) {
        synchronized (this.h) {
            return this.a().contains(o);
        }
    }
    
    @Override
    public final boolean containsAll(final Collection collection) {
        synchronized (this.h) {
            return this.a().containsAll(collection);
        }
    }
    
    @Override
    public final boolean isEmpty() {
        synchronized (this.h) {
            return this.a().isEmpty();
        }
    }
    
    @Override
    public final Iterator iterator() {
        return this.a().iterator();
    }
    
    @Override
    public final boolean remove(final Object o) {
        synchronized (this.h) {
            return this.a().remove(o);
        }
    }
    
    @Override
    public final boolean removeAll(final Collection collection) {
        synchronized (this.h) {
            return this.a().removeAll(collection);
        }
    }
    
    @Override
    public final boolean retainAll(final Collection collection) {
        synchronized (this.h) {
            return this.a().retainAll(collection);
        }
    }
    
    @Override
    public final int size() {
        synchronized (this.h) {
            return this.a().size();
        }
    }
    
    @Override
    public final Object[] toArray() {
        synchronized (this.h) {
            return this.a().toArray();
        }
    }
    
    @Override
    public final Object[] toArray(Object[] array) {
        synchronized (this.h) {
            array = this.a().toArray(array);
            return array;
        }
    }
}
