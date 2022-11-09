import j$.util.Iterator$_CC;
import j$.util.function.Consumer;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pmj implements Iterator, j$.util.Iterator
{
    private final Iterator a;
    private int b;
    
    public pmj(final pmk pmk) {
        this.a = pmk.a.a();
    }
    
    @Override
    public final boolean hasNext() {
        return this.a.hasNext();
    }
    
    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
