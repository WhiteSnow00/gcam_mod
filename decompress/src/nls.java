import java.util.NoSuchElementException;
import j$.util.Iterator$_CC;
import j$.util.function.Consumer;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

final class nls implements Iterator, j$.util.Iterator
{
    int a;
    int b;
    int c;
    final /* synthetic */ nlt d;
    
    public nls(final nlt d) {
        this.d = d;
        this.a = d.b;
        this.b = d.a();
        this.c = -1;
    }
    
    private final void a() {
        if (this.d.b == this.a) {
            return;
        }
        throw new ConcurrentModificationException();
    }
    
    @Override
    public final boolean hasNext() {
        return this.b >= 0;
    }
    
    @Override
    public final Object next() {
        this.a();
        if (this.hasNext()) {
            final int b = this.b;
            this.c = b;
            final nlt d = this.d;
            final Object o = d.a[b];
            this.b = d.b(b);
            return o;
        }
        throw new NoSuchElementException();
    }
    
    @Override
    public final void remove() {
        this.a();
        nqb.B(this.c >= 0);
        this.a += 32;
        final nlt d = this.d;
        d.remove(d.a[this.c]);
        --this.b;
        this.c = -1;
    }
}
