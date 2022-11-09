import java.util.Iterator;
import java.util.Collection;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

final class nkm extends npn
{
    final /* synthetic */ nkt a;
    
    public nkm(final nkt a, final Map map) {
        this.a = a;
        super(map);
    }
    
    @Override
    public final void clear() {
        nqb.y(this.iterator());
    }
    
    @Override
    public final boolean containsAll(final Collection collection) {
        return super.b.keySet().containsAll(collection);
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || super.b.keySet().equals(o);
    }
    
    @Override
    public final int hashCode() {
        return super.b.keySet().hashCode();
    }
    
    @Override
    public final Iterator iterator() {
        return new nkl(this, super.b.entrySet().iterator());
    }
    
    @Override
    public final boolean remove(final Object o) {
        final Collection collection = super.b.remove(o);
        if (collection != null) {
            final int size = collection.size();
            collection.clear();
            nkt.o(this.a, size);
            if (size > 0) {
                return true;
            }
        }
        return false;
    }
}
