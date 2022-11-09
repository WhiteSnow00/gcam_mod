import java.util.NoSuchElementException;
import j$.util.Iterator$_CC;
import j$.util.function.Consumer;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pmh implements Iterator, j$.util.Iterator
{
    final /* synthetic */ pmi a;
    private final Iterator b;
    private Iterator c;
    
    public pmh(final pmi a) {
        this.a = a;
        this.b = a.a.a();
    }
    
    private final boolean a() {
        final Iterator c = this.c;
        if (c != null) {
            if (!c.hasNext()) {
                this.c = null;
            }
        }
        while (this.c == null) {
            if (!this.b.hasNext()) {
                return false;
            }
            final Object next = this.b.next();
            final pmi a = this.a;
            final Iterator c2 = (Iterator)a.c.a(a.b.a(next));
            if (c2.hasNext()) {
                this.c = c2;
                break;
            }
        }
        return true;
    }
    
    @Override
    public final boolean hasNext() {
        return this.a();
    }
    
    @Override
    public final Object next() {
        if (this.a()) {
            final Iterator c = this.c;
            c.getClass();
            return c.next();
        }
        throw new NoSuchElementException();
    }
    
    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
