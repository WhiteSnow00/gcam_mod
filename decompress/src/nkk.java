import java.util.Map;
import j$.util.Iterator$_CC;
import j$.util.function.Consumer;
import java.util.Collection;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

abstract class nkk implements Iterator, j$.util.Iterator
{
    final Iterator a;
    Object b;
    Collection c;
    Iterator d;
    final /* synthetic */ nkt e;
    
    public nkk(final nkt e) {
        this.e = e;
        this.a = e.a.entrySet().iterator();
        this.b = null;
        this.c = null;
        this.d = npa.a;
    }
    
    public abstract Object a(final Object p0, final Object p1);
    
    @Override
    public final boolean hasNext() {
        return this.a.hasNext() || this.d.hasNext();
    }
    
    @Override
    public final Object next() {
        if (!this.d.hasNext()) {
            final Map.Entry<Object, V> entry = this.a.next();
            this.b = entry.getKey();
            final Collection c = (Collection)entry.getValue();
            this.c = c;
            this.d = c.iterator();
        }
        return this.a(this.b, this.d.next());
    }
    
    @Override
    public final void remove() {
        this.d.remove();
        final Collection c = this.c;
        c.getClass();
        if (c.isEmpty()) {
            this.a.remove();
        }
        nkt.m(this.e);
    }
}
