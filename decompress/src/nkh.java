import java.util.Iterator;
import java.util.Collection;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

final class nkh extends npm
{
    final /* synthetic */ nkj a;
    
    public nkh(final nkj a) {
        this.a = a;
    }
    
    @Override
    public final Map a() {
        return this.a;
    }
    
    @Override
    public final boolean contains(final Object o) {
        return nov.y(this.a.a.entrySet(), o);
    }
    
    @Override
    public final Iterator iterator() {
        return new nki(this.a);
    }
    
    @Override
    public final boolean remove(Object o) {
        if (!this.contains(o)) {
            return false;
        }
        final Map.Entry entry = (Map.Entry)o;
        entry.getClass();
        final nkt b = this.a.b;
        o = entry.getKey();
        final Map a = b.a;
        a.getClass();
        Label_0063: {
            try {
                o = a.remove(o);
                break Label_0063;
            }
            catch (final NullPointerException ex) {}
            catch (final ClassCastException ex2) {}
            o = null;
        }
        final Collection collection = (Collection)o;
        if (collection != null) {
            final int size = collection.size();
            collection.clear();
            b.b -= size;
        }
        return true;
    }
}
