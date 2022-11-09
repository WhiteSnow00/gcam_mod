import j$.util.Iterator$_CC;
import j$.util.function.Consumer;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

final class mdl implements Iterator, j$.util.Iterator
{
    final /* synthetic */ mdm a;
    private int b;
    
    public mdl(final mdm a) {
        this.a = a;
        this.b = 0;
    }
    
    @Override
    public final boolean hasNext() {
        return this.b < this.a.a.length;
    }
    
    @Override
    public final void remove() {
        throw new UnsupportedOperationException("IntSets are immutable!");
    }
}
