import java.util.Iterator;
import java.util.Map;
import java.util.Collection;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

final class njy extends nms
{
    final Set a;
    final /* synthetic */ nkc b;
    
    public njy(final nkc b) {
        this.b = b;
        this.a = b.a.entrySet();
    }
    
    @Override
    protected final Set c() {
        return this.a;
    }
    
    @Override
    public final void clear() {
        this.b.clear();
    }
    
    @Override
    public final boolean contains(final Object o) {
        final Set a = this.a;
        return o instanceof Map.Entry && a.contains(nqb.l((Map.Entry)o));
    }
    
    @Override
    public final boolean containsAll(final Collection collection) {
        return nov.x(this, collection);
    }
    
    @Override
    public final Iterator iterator() {
        final nkc b = this.b;
        return new njw(b, b.a.entrySet().iterator());
    }
    
    @Override
    public final boolean remove(final Object o) {
        if (!this.a.contains(o)) {
            return false;
        }
        final Map.Entry entry = (Map.Entry)o;
        this.b.b.a.remove(entry.getValue());
        this.a.remove(entry);
        return true;
    }
    
    @Override
    public final boolean removeAll(final Collection collection) {
        return this.d(collection);
    }
    
    @Override
    public final boolean retainAll(final Collection collection) {
        return this.t(collection);
    }
    
    @Override
    public final Object[] toArray() {
        return this.u();
    }
    
    @Override
    public final Object[] toArray(final Object[] array) {
        return nrr.x(this, array);
    }
}
