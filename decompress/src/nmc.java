import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

final class nmc extends npx
{
    final /* synthetic */ nmd a;
    
    public nmc(final nmd a) {
        this.a = a;
    }
    
    @Override
    public final npt a() {
        return this.a;
    }
    
    @Override
    public final Iterator iterator() {
        return this.a.e();
    }
    
    @Override
    public final int size() {
        return this.a.c().g().size();
    }
}
