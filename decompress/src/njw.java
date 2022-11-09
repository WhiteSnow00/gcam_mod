import j$.util.Iterator$_CC;
import j$.util.function.Consumer;
import java.util.Map;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

final class njw implements Iterator, j$.util.Iterator
{
    Map.Entry a;
    final /* synthetic */ Iterator b;
    final /* synthetic */ nkc c;
    
    public njw(final nkc c, final Iterator b) {
        this.c = c;
        this.b = b;
    }
    
    @Override
    public final boolean hasNext() {
        return this.b.hasNext();
    }
    
    @Override
    public final void remove() {
        nqb.B(this.a != null);
        final Object value = this.a.getValue();
        this.b.remove();
        this.c.h(value);
        this.a = null;
    }
}
