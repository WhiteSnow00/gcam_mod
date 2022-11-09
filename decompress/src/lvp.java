import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

final class lvp implements lvs
{
    private final lva a;
    
    public lvp(final lva a) {
        this.a = a;
    }
    
    @Override
    public final void a(final Object o, final Executor executor, final lxh lxh) {
        lxh.k(this.a.a(o));
    }
    
    @Override
    public final String toString() {
        return this.a.toString();
    }
}
