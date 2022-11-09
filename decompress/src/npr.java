import java.util.Iterator;
import java.util.Map;
import java.util.AbstractCollection;

// 
// Decompiled by Procyon v0.6.0
// 

final class npr extends AbstractCollection
{
    final /* synthetic */ nkx a;
    
    public npr() {
    }
    
    public npr(final nkx a) {
        this.a = a;
    }
    
    @Override
    public final void clear() {
        this.a.j();
    }
    
    @Override
    public final boolean contains(final Object o) {
        if (o instanceof Map.Entry) {
            final Map.Entry entry = (Map.Entry)o;
            return this.a.s(entry.getKey(), entry.getValue());
        }
        return false;
    }
    
    @Override
    public final Iterator iterator() {
        return new nkg((nkt)this.a);
    }
    
    @Override
    public final boolean remove(final Object o) {
        if (o instanceof Map.Entry) {
            final Map.Entry entry = (Map.Entry)o;
            return this.a.u(entry.getKey(), entry.getValue());
        }
        return false;
    }
    
    @Override
    public final int size() {
        return ((nkt)this.a).b;
    }
}
