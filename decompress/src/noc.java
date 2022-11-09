import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

final class noc extends nrv
{
    final nrv a;
    final /* synthetic */ nof b;
    
    public noc(final nof b) {
        this.b = b;
        this.a = b.a.s().bN();
    }
    
    @Override
    public final boolean hasNext() {
        return this.a.hasNext();
    }
    
    @Override
    public final Object next() {
        return this.a.next().getValue();
    }
}
