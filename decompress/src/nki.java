import java.util.Map;
import j$.util.Iterator$_CC;
import j$.util.function.Consumer;
import java.util.Collection;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

final class nki implements Iterator, j$.util.Iterator
{
    final Iterator a;
    Collection b;
    final /* synthetic */ nkj c;
    
    public nki(final nkj c) {
        this.c = c;
        this.a = c.a.entrySet().iterator();
    }
    
    @Override
    public final boolean hasNext() {
        return this.a.hasNext();
    }
    
    @Override
    public final void remove() {
        njo.p(this.b != null, "no calls to next() since the last call to remove()");
        this.a.remove();
        nkt.o(this.c.b, this.b.size());
        this.b.clear();
        this.b = null;
    }
}
