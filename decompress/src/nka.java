import java.util.Iterator;
import java.util.Set;
import java.util.Collection;

// 
// Decompiled by Procyon v0.6.0
// 

final class nka extends nms
{
    final /* synthetic */ nkc a;
    
    public nka(final nkc a) {
        this.a = a;
    }
    
    @Override
    protected final Set c() {
        return this.a.a.keySet();
    }
    
    @Override
    public final void clear() {
        this.a.clear();
    }
    
    @Override
    public final Iterator iterator() {
        return nqb.i(this.a.entrySet().iterator());
    }
    
    @Override
    public final boolean remove(final Object o) {
        if (!this.contains(o)) {
            return false;
        }
        this.a.f(o);
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
}
