import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gsj
{
    public static niz a(final kwd kwd, final Set set, final niz niz, final niz niz2, final niz niz3, final pii pii) {
        if (set.isEmpty()) {
            return nii.a;
        }
        final nog nog = new nog();
        nog.i(set);
        if (niz.g()) {
            nog.g(niz.c());
        }
        if (niz3.g()) {
            nog.g(niz3.c());
        }
        final nog nog2 = new nog();
        nog2.i(((ous)pii).a());
        if (niz2.g()) {
            nog.g(niz2.c());
            if (jlh.b != null) {
                nog2.g(kxc.p(jlh.b, 1));
            }
        }
        return niz.i(kwd.v(nog.f(), nog2.f()));
    }
    
    public static void b(final jbm jbm, final cxl cxl) {
        if (jbm == jbm.b) {
            final cxo a = cyj.a;
            cxl.e();
        }
    }
}
