import j$.util.Iterator$_CC;
import j$.util.function.Consumer;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

abstract class nrn implements Iterator, j$.util.Iterator
{
    final Iterator b;
    
    public nrn(final Iterator b) {
        b.getClass();
        this.b = b;
    }
    
    public abstract Object a(final Object p0);
    
    @Override
    public final boolean hasNext() {
        return this.b.hasNext();
    }
    
    @Override
    public final Object next() {
        return this.a(this.b.next());
    }
    
    @Override
    public final void remove() {
        this.b.remove();
    }
}
