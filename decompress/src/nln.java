import java.util.NoSuchElementException;
import j$.util.Iterator$_CC;
import j$.util.function.Consumer;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

abstract class nln implements Iterator, j$.util.Iterator
{
    int b;
    int c;
    int d;
    final /* synthetic */ nlr e;
    
    public nln(final nlr e) {
        this.e = e;
        this.b = e.f;
        this.c = e.a();
        this.d = -1;
    }
    
    private final void b() {
        if (this.e.f == this.b) {
            return;
        }
        throw new ConcurrentModificationException();
    }
    
    public abstract Object a(final int p0);
    
    @Override
    public final boolean hasNext() {
        return this.c >= 0;
    }
    
    @Override
    public final Object next() {
        this.b();
        if (this.hasNext()) {
            final int c = this.c;
            this.d = c;
            final Object a = this.a(c);
            this.c = this.e.b(this.c);
            return a;
        }
        throw new NoSuchElementException();
    }
    
    @Override
    public final void remove() {
        this.b();
        nqb.B(this.d >= 0);
        this.b += 32;
        final nlr e = this.e;
        e.remove(e.d[this.d]);
        --this.c;
        this.d = -1;
    }
}
