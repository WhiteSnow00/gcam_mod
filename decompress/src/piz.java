import java.util.NoSuchElementException;
import j$.util.Iterator$_CC;
import j$.util.function.Consumer;
import j$.util.Iterator;
import java.util.ListIterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class piz implements ListIterator, j$.util.Iterator
{
    public static final piz a;
    
    static {
        a = new piz();
    }
    
    private piz() {
    }
    
    @Override
    public final boolean hasNext() {
        return false;
    }
    
    @Override
    public final boolean hasPrevious() {
        return false;
    }
    
    @Override
    public final int nextIndex() {
        return 0;
    }
    
    @Override
    public final int previousIndex() {
        return -1;
    }
    
    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
