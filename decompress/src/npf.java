import java.util.ListIterator;
import java.util.Iterator;
import java.util.List;
import java.io.Serializable;
import java.util.RandomAccess;
import java.util.AbstractList;

// 
// Decompiled by Procyon v0.6.0
// 

final class npf extends AbstractList implements RandomAccess, Serializable
{
    private static final long serialVersionUID = 0L;
    final List a;
    final nir b;
    
    public npf(final List a, final nir b) {
        a.getClass();
        this.a = a;
        b.getClass();
        this.b = b;
    }
    
    @Override
    public final void clear() {
        this.a.clear();
    }
    
    @Override
    public final Object get(final int n) {
        return this.b.a(this.a.get(n));
    }
    
    @Override
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }
    
    @Override
    public final Iterator iterator() {
        return this.listIterator();
    }
    
    @Override
    public final ListIterator listIterator(final int n) {
        return new npe(this, this.a.listIterator(n));
    }
    
    @Override
    public final Object remove(final int n) {
        return this.b.a(this.a.remove(n));
    }
    
    @Override
    public final int size() {
        return this.a.size();
    }
}
