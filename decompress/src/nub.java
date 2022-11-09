import j$.util.Iterator$_CC;
import j$.util.function.Consumer;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

final class nub implements Iterator, j$.util.Iterator
{
    final /* synthetic */ nuc a;
    private int b;
    
    public nub(final nuc a) {
        this.a = a;
        this.b = 0;
    }
    
    @Override
    public final boolean hasNext() {
        return this.b < this.a.a.b;
    }
    
    @Override
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
