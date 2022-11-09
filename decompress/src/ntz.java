import java.util.Iterator;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ntz
{
    private static final ntv a;
    private static final ntu b;
    
    static {
        a = new ntx();
        b = new nty();
    }
    
    public static ntw a(final Set set) {
        final nts nts = new nts(ntz.a);
        nts.f = ntz.b;
        for (final nsx nsx : set) {
            oce.g(nsx, "key");
            if (nsx.b) {
                final ntu b = nts.b;
                oce.g(nsx, "key");
                oce.h(nsx.b, "key must be repeating");
                nts.c.remove(nsx);
                nts.d.put(nsx, b);
            }
            else {
                final ntv a = nts.a;
                oce.g(nsx, "key");
                nts.d.remove(nsx);
                nts.c.put(nsx, a);
            }
        }
        return new ntt(nts);
    }
}
