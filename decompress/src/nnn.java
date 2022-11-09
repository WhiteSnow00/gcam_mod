import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nnn extends nni
{
    public nnn() {
        super(4);
    }
    
    public nnn(final int n) {
        super(n);
    }
    
    public final nns f() {
        this.c = true;
        return nns.h(this.a, this.b);
    }
    
    public final void g(final Object o) {
        super.c(o);
    }
    
    public final void h(final Iterable iterable) {
        super.e(iterable);
    }
    
    public final void i(final Iterator iterator) {
        while (iterator.hasNext()) {
            super.c(iterator.next());
        }
    }
}
