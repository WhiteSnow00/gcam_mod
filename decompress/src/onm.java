import j$.util.Iterator$_CC;
import j$.util.function.Consumer;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

final class onm implements Iterator, j$.util.Iterator
{
    final Iterator a;
    final /* synthetic */ onn b;
    
    public onm(final onn b) {
        this.b = b;
        this.a = b.a.iterator();
    }
    
    @Override
    public final boolean hasNext() {
        return this.a.hasNext();
    }
    
    @Override
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
