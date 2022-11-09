import java.util.NoSuchElementException;
import j$.util.Iterator$_CC;
import j$.util.function.Consumer;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

final class nvg implements Iterator, j$.util.Iterator
{
    final /* synthetic */ nvh a;
    private int b;
    
    public nvg(final nvh a) {
        this.a = a;
        this.b = 0;
    }
    
    @Override
    public final boolean hasNext() {
        return this.b < this.a.size();
    }
    
    @Override
    public final Object next() {
        final int b = this.b;
        if (b < this.a.size()) {
            final nvh a = this.a;
            final Object o = a.b.b[a.b() + b];
            this.b = b + 1;
            return o;
        }
        throw new NoSuchElementException();
    }
    
    @Override
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
