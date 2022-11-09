import java.util.Iterator;
import java.util.AbstractSet;

// 
// Decompiled by Procyon v0.6.0
// 

final class nuc extends AbstractSet
{
    final /* synthetic */ nue a;
    
    public nuc(final nue a) {
        this.a = a;
    }
    
    @Override
    public final Iterator iterator() {
        return new nub(this);
    }
    
    @Override
    public final int size() {
        return this.a.b;
    }
}
