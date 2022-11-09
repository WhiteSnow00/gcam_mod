import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

final class nky extends npx
{
    final /* synthetic */ nkz a;
    
    public nky(final nkz a) {
        this.a = a;
    }
    
    @Override
    public final npt a() {
        return this.a;
    }
    
    @Override
    public final Iterator iterator() {
        return this.a.c();
    }
    
    @Override
    public final int size() {
        return this.a.b();
    }
}
