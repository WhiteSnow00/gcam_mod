import java.util.Iterator;
import java.util.Collection;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class nml extends nmq implements Collection
{
    protected nml() {
    }
    
    @Override
    public boolean add(final Object o) {
        return this.b().add(o);
    }
    
    @Override
    public boolean addAll(final Collection collection) {
        return this.b().addAll(collection);
    }
    
    protected abstract Collection b();
    
    @Override
    public void clear() {
        this.b().clear();
    }
    
    @Override
    public boolean contains(final Object o) {
        return this.b().contains(o);
    }
    
    @Override
    public boolean containsAll(final Collection collection) {
        return this.b().containsAll(collection);
    }
    
    @Override
    public final boolean isEmpty() {
        return this.b().isEmpty();
    }
    
    @Override
    public Iterator iterator() {
        return this.b().iterator();
    }
    
    @Override
    public boolean remove(final Object o) {
        return this.b().remove(o);
    }
    
    @Override
    public boolean removeAll(final Collection collection) {
        return this.b().removeAll(collection);
    }
    
    @Override
    public boolean retainAll(final Collection collection) {
        return this.b().retainAll(collection);
    }
    
    @Override
    public final int size() {
        return this.b().size();
    }
    
    protected final boolean t(final Collection collection) {
        final Iterator iterator = this.iterator();
        collection.getClass();
        boolean b = false;
        while (iterator.hasNext()) {
            if (!collection.contains(iterator.next())) {
                iterator.remove();
                b = true;
            }
        }
        return b;
    }
    
    @Override
    public Object[] toArray() {
        return this.b().toArray();
    }
    
    @Override
    public Object[] toArray(final Object[] array) {
        return this.b().toArray(array);
    }
    
    protected final Object[] u() {
        return this.toArray(new Object[this.size()]);
    }
}
