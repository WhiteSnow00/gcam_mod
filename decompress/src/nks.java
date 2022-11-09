import java.util.Collection;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

final class nks extends nkp implements Set
{
    final /* synthetic */ nkt f;
    
    public nks(final nkt f, final Object o, final Set set) {
        this.f = f;
        super(f, o, set, null);
    }
    
    @Override
    public final boolean removeAll(final Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        final int size = this.size();
        final boolean p = nrr.p((Set)this.b, collection);
        if (p) {
            nkt.n(this.f, this.b.size() - size);
            this.c();
        }
        return p;
    }
}
