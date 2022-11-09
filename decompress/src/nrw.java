import java.util.NoSuchElementException;
import j$.util.Iterator;
import java.util.ListIterator;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class nrw extends nrv implements ListIterator, j$.util.Iterator
{
    private final int a;
    private int b;
    
    protected nrw(final int a, final int b) {
        njo.w(b, a);
        this.a = a;
        this.b = b;
    }
    
    protected abstract Object a(final int p0);
    
    @Deprecated
    @Override
    public final void add(final Object o) {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public final boolean hasNext() {
        return this.b < this.a;
    }
    
    @Override
    public final boolean hasPrevious() {
        return this.b > 0;
    }
    
    @Override
    public final Object next() {
        if (this.hasNext()) {
            return this.a(this.b++);
        }
        throw new NoSuchElementException();
    }
    
    @Override
    public final int nextIndex() {
        return this.b;
    }
    
    @Override
    public final Object previous() {
        if (this.hasPrevious()) {
            final int b = this.b - 1;
            this.b = b;
            return this.a(b);
        }
        throw new NoSuchElementException();
    }
    
    @Override
    public final int previousIndex() {
        return this.b - 1;
    }
    
    @Deprecated
    @Override
    public final void set(final Object o) {
        throw new UnsupportedOperationException();
    }
}
