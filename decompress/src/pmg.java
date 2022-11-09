import java.util.NoSuchElementException;
import j$.util.Iterator$_CC;
import j$.util.function.Consumer;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pmg implements Iterator, j$.util.Iterator
{
    final /* synthetic */ pmw a;
    private final Iterator b;
    private int c;
    private Object d;
    
    public pmg(final pmw a, final byte[] array) {
        this.a = a;
        this.b = a.a.a();
        this.c = -1;
    }
    
    private final void a() {
        while (this.b.hasNext()) {
            final Object next = this.b.next();
            if (this.a.b.a(next)) {
                this.d = next;
                this.c = 1;
                return;
            }
        }
        this.c = 0;
    }
    
    @Override
    public final boolean hasNext() {
        if (this.c == -1) {
            this.a();
        }
        return this.c == 1;
    }
    
    @Override
    public final Object next() {
        if (this.c == -1) {
            this.a();
        }
        if (this.c != 0) {
            final Object d = this.d;
            this.d = null;
            this.c = -1;
            return d;
        }
        throw new NoSuchElementException();
    }
    
    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
