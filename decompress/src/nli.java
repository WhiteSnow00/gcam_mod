import java.util.Iterator;
import java.util.Collection;
import java.util.AbstractCollection;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nli extends AbstractCollection
{
    final Collection a;
    final nir b;
    
    public nli(final Collection a, final nir b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void clear() {
        this.a.clear();
    }
    
    @Override
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }
    
    @Override
    public final Iterator iterator() {
        final Iterator iterator = this.a.iterator();
        final nir b = this.b;
        b.getClass();
        return new nox(iterator, b);
    }
    
    @Override
    public final int size() {
        return this.a.size();
    }
}
