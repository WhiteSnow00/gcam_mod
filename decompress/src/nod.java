import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

final class nod extends nns
{
    final /* synthetic */ nns a;
    
    public nod(final nns a) {
        this.a = a;
    }
    
    @Override
    public final boolean bO() {
        return true;
    }
    
    @Override
    public final Object get(final int n) {
        return this.a.get(n).getValue();
    }
    
    @Override
    public final int size() {
        return this.a.size();
    }
}
