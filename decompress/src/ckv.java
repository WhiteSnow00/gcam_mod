import j$.util.function.Consumer;
import j$.util.DesugarArrays;
import java.util.EnumMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ckv
{
    public final Map a;
    
    public ckv() {
        final EnumMap a = new EnumMap((Class<K>)clp.class);
        this.a = a;
        DesugarArrays.stream((Object[])clp.values()).forEach((Consumer)new cku(this));
        a.put((Object)clp.d, 2.0f);
    }
    
    public final float a() {
        return 1.0f / this.a.get(clp.e);
    }
    
    public final float b(final clp clp) {
        final Float n = this.a.get(clp);
        n.getClass();
        return n;
    }
}
