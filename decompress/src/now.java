import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

final class now extends nrv
{
    final /* synthetic */ Iterator a;
    
    public now(final Iterator a) {
        this.a = a;
    }
    
    @Override
    public final boolean hasNext() {
        return this.a.hasNext();
    }
    
    @Override
    public final Object next() {
        return this.a.next();
    }
}
