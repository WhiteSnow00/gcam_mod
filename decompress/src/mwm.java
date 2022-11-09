import java.util.List;
import java.io.File;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mwm
{
    public final mws a;
    public final File b;
    public final mza c;
    
    public mwm(final mws a, final File b, final neq neq, final mza c, final byte[] array, final byte[] array2) {
        a.getClass();
        b.getClass();
        neq.getClass();
        c.getClass();
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final oxk a(final myz myz, final List list) {
        list.getClass();
        return mws.f(this.a, myz, list, mwi.b).h(new mwl(this, list, myz));
    }
}
