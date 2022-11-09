import java.util.Map;
import j$.util.Iterator$_CC;
import j$.util.function.Consumer;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

final class olq implements Iterator, j$.util.Iterator
{
    private final Iterator a;
    
    public olq(final Iterator a) {
        this.a = a;
    }
    
    @Override
    public final boolean hasNext() {
        return this.a.hasNext();
    }
    
    @Override
    public final void remove() {
        this.a.remove();
    }
}
