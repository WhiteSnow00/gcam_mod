import j$.util.Iterator$_CC;
import j$.util.function.Consumer;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

final class nou implements Iterator, j$.util.Iterator
{
    boolean a;
    final /* synthetic */ Iterator b;
    
    public nou(final Iterator b) {
        this.b = b;
        this.a = true;
    }
    
    @Override
    public final boolean hasNext() {
        return this.b.hasNext();
    }
    
    @Override
    public final Object next() {
        final Object next = this.b.next();
        this.a = false;
        return next;
    }
    
    @Override
    public final void remove() {
        nqb.B(this.a ^ true);
        this.b.remove();
    }
}
