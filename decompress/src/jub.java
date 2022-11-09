import java.util.NoSuchElementException;
import j$.util.Iterator$_CC;
import j$.util.function.Consumer;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jub implements Iterator, j$.util.Iterator
{
    protected final jua a;
    protected int b;
    
    public jub(final jua a) {
        this.a = a;
        this.b = -1;
    }
    
    @Override
    public final boolean hasNext() {
        return this.b < this.a.c() - 1;
    }
    
    @Override
    public final Object next() {
        if (this.hasNext()) {
            final jua a = this.a;
            final int b = this.b + 1;
            this.b = b;
            return a.d(b);
        }
        final int b2 = this.b;
        final StringBuilder sb = new StringBuilder(46);
        sb.append("Cannot advance the iterator beyond ");
        sb.append(b2);
        throw new NoSuchElementException(sb.toString());
    }
    
    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Cannot remove elements from a DataBufferIterator");
    }
}
