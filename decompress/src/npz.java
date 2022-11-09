import java.util.NoSuchElementException;
import j$.util.Iterator$_CC;
import j$.util.function.Consumer;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

final class npz implements Iterator, j$.util.Iterator
{
    private final npt a;
    private final Iterator b;
    private nps c;
    private int d;
    private int e;
    private boolean f;
    
    public npz(final npt a, final Iterator b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean hasNext() {
        return this.d > 0 || this.b.hasNext();
    }
    
    @Override
    public final Object next() {
        if (this.hasNext()) {
            int e;
            if ((e = this.d) == 0) {
                final nps c = this.b.next();
                this.c = c;
                e = c.a();
                this.e = e;
            }
            this.d = e - 1;
            this.f = true;
            final nps c2 = this.c;
            c2.getClass();
            return c2.b();
        }
        throw new NoSuchElementException();
    }
    
    @Override
    public final void remove() {
        nqb.B(this.f);
        if (this.e == 1) {
            this.b.remove();
        }
        else {
            final npt a = this.a;
            final nps c = this.c;
            c.getClass();
            a.remove(c.b());
        }
        --this.e;
        this.f = false;
    }
}
