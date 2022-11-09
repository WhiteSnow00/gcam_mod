import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

final class nlc extends nmd
{
    final /* synthetic */ nld a;
    
    public nlc(final nld a) {
        this.a = a;
    }
    
    @Override
    public final nra c() {
        return this.a;
    }
    
    @Override
    public final Iterator e() {
        return this.a.o();
    }
    
    @Override
    public final Iterator iterator() {
        return nqb.c(this.a.n());
    }
}
