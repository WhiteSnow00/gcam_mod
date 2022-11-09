import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

final class nnr extends nns
{
    final transient int a;
    final transient int b;
    final /* synthetic */ nns c;
    
    public nnr(final nns c, final int a, final int b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final Object[] A() {
        return this.c.A();
    }
    
    @Override
    public final nns b(final int n, final int n2) {
        njo.n(n, n2, this.b);
        final nns c = this.c;
        final int a = this.a;
        return c.b(n + a, n2 + a);
    }
    
    @Override
    public final boolean bO() {
        return true;
    }
    
    @Override
    public final Object get(final int n) {
        njo.v(n, this.b);
        return this.c.get(n + this.a);
    }
    
    @Override
    public final int size() {
        return this.b;
    }
    
    @Override
    public final int y() {
        return this.c.z() + this.a + this.b;
    }
    
    @Override
    public final int z() {
        return this.c.z() + this.a;
    }
}
