import java.util.Collection;
import j$.util.Iterator$_CC;
import j$.util.function.Consumer;
import java.util.Map;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

final class nkl implements Iterator, j$.util.Iterator
{
    Map.Entry a;
    final /* synthetic */ Iterator b;
    final /* synthetic */ nkm c;
    
    public nkl(final nkm c, final Iterator b) {
        this.c = c;
        this.b = b;
    }
    
    @Override
    public final boolean hasNext() {
        return this.b.hasNext();
    }
    
    @Override
    public final Object next() {
        final Map.Entry<Object, V> a = this.b.next();
        this.a = (Map.Entry)a;
        return a.getKey();
    }
    
    @Override
    public final void remove() {
        njo.p(this.a != null, "no calls to next() since the last call to remove()");
        final Collection collection = this.a.getValue();
        this.b.remove();
        nkt.o(this.c.a, collection.size());
        collection.clear();
        this.a = null;
    }
}
