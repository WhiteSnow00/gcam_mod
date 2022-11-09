import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

final class nqo extends noi
{
    private final transient nnx a;
    private final transient nns b;
    
    public nqo(final nnx a, final nns b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final nrv bN() {
        return this.b.t();
    }
    
    @Override
    public final boolean bO() {
        return true;
    }
    
    @Override
    public final boolean contains(final Object o) {
        return this.a.get(o) != null;
    }
    
    @Override
    public final int size() {
        return this.a.size();
    }
    
    @Override
    public final nns v() {
        return this.b;
    }
    
    @Override
    public final int x(final Object[] array, final int n) {
        return this.b.x(array, n);
    }
}
