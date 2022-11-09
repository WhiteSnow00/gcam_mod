import j$.util.Iterator$_CC;
import j$.util.function.Consumer;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pmv implements Iterator, j$.util.Iterator
{
    final /* synthetic */ pmw a;
    private final Iterator b;
    
    public pmv(final pmw a) {
        this.a = a;
        this.b = a.a.a();
    }
    
    @Override
    public final boolean hasNext() {
        return this.b.hasNext();
    }
    
    @Override
    public final Object next() {
        return this.a.b.a(this.b.next());
    }
    
    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
