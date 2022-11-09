import j$.util.Iterator$_CC;
import j$.util.function.Consumer;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

final class apw implements Iterator, j$.util.Iterator
{
    final /* synthetic */ Iterator a;
    
    public apw(final Iterator a) {
        this.a = a;
    }
    
    @Override
    public final boolean hasNext() {
        return this.a.hasNext();
    }
    
    @Override
    public final Object next() {
        return this.a.next();
    }
    
    @Override
    public final void remove() {
        throw new UnsupportedOperationException("remove() is not allowed due to the internal contraints");
    }
}
