import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Collection;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

abstract class npm extends nqw
{
    public npm() {
    }
    
    public abstract Map a();
    
    @Override
    public final void clear() {
        this.a().clear();
    }
    
    @Override
    public boolean contains(Object key) {
        final boolean b = key instanceof Map.Entry;
        boolean b3;
        final boolean b2 = b3 = false;
        if (b) {
            final Map.Entry entry = (Map.Entry)key;
            key = entry.getKey();
            final Object g = nqb.g(this.a(), key);
            b3 = b2;
            if (nqb.E(g, entry.getValue())) {
                if (g == null) {
                    if (this.a().containsKey(key)) {
                        return true;
                    }
                    b3 = b2;
                }
                else {
                    b3 = true;
                }
            }
        }
        return b3;
    }
    
    @Override
    public final boolean isEmpty() {
        return this.a().isEmpty();
    }
    
    @Override
    public boolean remove(final Object o) {
        return this.contains(o) && this.a().keySet().remove(((Map.Entry)o).getKey());
    }
    
    @Override
    public final boolean removeAll(final Collection collection) {
        try {
            collection.getClass();
            return nrr.p(this, collection);
        }
        catch (final UnsupportedOperationException ex) {
            return nrr.q(this, collection.iterator());
        }
    }
    
    @Override
    public final boolean retainAll(final Collection collection) {
        try {
            collection.getClass();
            return super.retainAll(collection);
        }
        catch (final UnsupportedOperationException ex) {
            final HashSet set = new HashSet(nqb.d(collection.size()));
            for (final Object next : collection) {
                if (this.contains(next)) {
                    set.add(((Map.Entry<Object, V>)next).getKey());
                }
            }
            return this.a().keySet().retainAll(set);
        }
    }
    
    @Override
    public final int size() {
        return this.a().size();
    }
}
