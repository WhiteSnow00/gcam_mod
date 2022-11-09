import j$.util.Iterator;
import java.util.ListIterator;

// 
// Decompiled by Procyon v0.6.0
// 

abstract class nro extends nrn implements ListIterator, j$.util.Iterator
{
    public nro(final ListIterator listIterator) {
        super(listIterator);
    }
    
    private final ListIterator b() {
        return (ListIterator)this.b;
    }
    
    @Override
    public final void add(final Object o) {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public final boolean hasPrevious() {
        return this.b().hasPrevious();
    }
    
    @Override
    public final int nextIndex() {
        return this.b().nextIndex();
    }
    
    @Override
    public final Object previous() {
        return this.a(this.b().previous());
    }
    
    @Override
    public final int previousIndex() {
        return this.b().previousIndex();
    }
    
    @Override
    public final void set(final Object o) {
        throw new UnsupportedOperationException();
    }
}
