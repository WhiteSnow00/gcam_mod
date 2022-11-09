import java.util.Map;
import java.util.Iterator;
import java.util.AbstractCollection;

// 
// Decompiled by Procyon v0.6.0
// 

final class nlq extends AbstractCollection
{
    final /* synthetic */ nlr a;
    
    public nlq(final nlr a) {
        this.a = a;
    }
    
    @Override
    public final void clear() {
        this.a.clear();
    }
    
    @Override
    public final Iterator iterator() {
        final nlr a = this.a;
        final Map h = a.h();
        Iterator iterator;
        if (h != null) {
            iterator = h.values().iterator();
        }
        else {
            iterator = new nll(a);
        }
        return iterator;
    }
    
    @Override
    public final int size() {
        return this.a.size();
    }
}
