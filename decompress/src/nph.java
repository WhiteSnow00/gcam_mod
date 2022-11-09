import java.util.ListIterator;
import java.util.List;
import java.io.Serializable;
import java.util.AbstractSequentialList;

// 
// Decompiled by Procyon v0.6.0
// 

final class nph extends AbstractSequentialList implements Serializable
{
    private static final long serialVersionUID = 0L;
    final List a;
    final nir b;
    
    public nph(final List a, final nir b) {
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
    public final ListIterator listIterator(final int n) {
        return new npg(this, this.a.listIterator(n));
    }
    
    @Override
    public final int size() {
        return this.a.size();
    }
}
