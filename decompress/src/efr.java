import java.util.HashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class efr implements egi
{
    final /* synthetic */ HashMap a;
    final /* synthetic */ egi b;
    
    public efr(final HashMap a, final egi b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final Object a(final egh egh) {
        Object o;
        if ((o = egh.a.cast(this.a.get(egh.b))) == null) {
            o = this.b.a(egh);
            this.a.put(egh.b, o);
        }
        return o;
    }
}
