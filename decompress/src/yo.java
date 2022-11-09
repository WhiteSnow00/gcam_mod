import java.util.Iterator;
import java.util.AbstractSet;

// 
// Decompiled by Procyon v0.6.0
// 

final class yo extends AbstractSet
{
    final /* synthetic */ yu a;
    
    public yo(final yu a) {
        this.a = a;
    }
    
    @Override
    public final Iterator iterator() {
        return new yr(this.a);
    }
    
    @Override
    public final int size() {
        return this.a.j;
    }
}
