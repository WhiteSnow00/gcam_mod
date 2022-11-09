import java.util.Map;
import java.util.Iterator;
import java.util.AbstractSet;

// 
// Decompiled by Procyon v0.6.0
// 

final class nlo extends AbstractSet
{
    final /* synthetic */ nlr a;
    
    public nlo(final nlr a) {
        this.a = a;
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
    public final Iterator iterator() {
        final nlr a = this.a;
        final Map h = a.h();
        Iterator iterator;
        if (h != null) {
            iterator = h.keySet().iterator();
        }
        else {
            iterator = new nlj(a);
        }
        return iterator;
    }
    
    @Override
    public final boolean remove(final Object o) {
        final Map h = this.a.h();
        boolean remove;
        if (h != null) {
            remove = h.keySet().remove(o);
        }
        else {
            if (this.a.f(o) != nlr.a) {
                return true;
            }
            remove = false;
        }
        return remove;
    }
    
    @Override
    public final int size() {
        return this.a.size();
    }
}
