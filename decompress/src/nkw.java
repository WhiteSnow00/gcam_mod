import java.util.Iterator;
import java.util.Collection;
import java.util.AbstractCollection;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nkw extends AbstractCollection
{
    final /* synthetic */ nkx a;
    
    public nkw(final nkx a) {
        this.a = a;
    }
    
    @Override
    public final void clear() {
        this.a.j();
    }
    
    @Override
    public final boolean contains(final Object o) {
        final Iterator iterator = this.a.q().values().iterator();
        while (iterator.hasNext()) {
            if (((Collection)iterator.next()).contains(o)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final Iterator iterator() {
        return this.a.f();
    }
    
    @Override
    public final int size() {
        return this.a.e();
    }
}
