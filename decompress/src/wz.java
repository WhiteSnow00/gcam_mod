import java.util.HashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class wz extends xg
{
    public final HashMap a;
    
    public wz() {
        this.a = new HashMap();
    }
    
    public final xc a(final Object o) {
        return this.a.get(o);
    }
    
    @Override
    public final Object b(final Object o) {
        final Object b = super.b(o);
        this.a.remove(o);
        return b;
    }
    
    public final boolean c(final Object o) {
        return this.a.containsKey(o);
    }
}
