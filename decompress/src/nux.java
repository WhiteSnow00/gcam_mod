import java.util.logging.Level;
import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class nux extends nvb
{
    public static final nux a;
    private static final AtomicReference b;
    
    static {
        a = new nux();
        b = new AtomicReference((V)nvd.a);
    }
    
    public nux() {
    }
    
    @Override
    public final ntp a() {
        return nux.b.get().a();
    }
    
    @Override
    public final nvk b() {
        return nux.b.get().b();
    }
    
    @Override
    public final void c(final String s, final Level level, final boolean b) {
        nux.b.get().c(s, level, b);
    }
}
