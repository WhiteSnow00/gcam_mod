import java.util.NoSuchElementException;
import j$.util.Iterator$_CC;
import j$.util.function.Consumer;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class plk implements Iterator, j$.util.Iterator
{
    private int a;
    private final Object[] b;
    
    public plk(final Object[] b) {
        this.b = b;
    }
    
    @Override
    public final boolean hasNext() {
        return this.a < this.b.length;
    }
    
    @Override
    public final Object next() {
        try {
            return this.b[this.a++];
        }
        catch (final ArrayIndexOutOfBoundsException ex) {
            --this.a;
            throw new NoSuchElementException(ex.getMessage());
        }
    }
    
    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
