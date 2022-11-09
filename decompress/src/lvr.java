import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

final class lvr implements lvs
{
    private final lwl a;
    
    public lvr(final lwl a) {
        this.a = a;
    }
    
    @Override
    public final void a(final Object o, final Executor executor, final lxh lxh) {
        ofi.w(this.a.a(o, executor).d(), new lvq(lxh), odx.a);
    }
    
    @Override
    public final String toString() {
        return this.a.toString();
    }
}
