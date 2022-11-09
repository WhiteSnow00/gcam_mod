import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dkl
{
    private static final noi b;
    
    static {
        b = noi.J(jbm.b, jbm.g, jbm.m);
    }
    
    public static Set a(final cxl cxl, final pii pii, final pii pii2, final pii pii3) {
        if (!cxl.k(cxr.aw)) {
            return nqr.a;
        }
        final jbm jbm = ((dkj)pii.get()).c.get();
        if (jbm != jbm.b && !cxl.k(cxr.ax)) {
            return nqr.a;
        }
        if (!dkl.b.contains(jbm)) {
            return nqr.a;
        }
        return noi.H(bsp.c(new dkk(pii, pii2, pii3)));
    }
}
