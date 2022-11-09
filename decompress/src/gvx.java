import java.util.Map;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gvx
{
    public static int a(final int n) {
        return n - 1;
    }
    
    public static kxb b(final lfg lfg, final fvr fvr, final jbm jbm, final cxl cxl, final niz niz) {
        lgg d;
        if (jbm == jbm.g && cxl.k(cyc.u)) {
            d = new lgg(37, new kre((int)cxl.a(cyc.c).c(), (int)cxl.a(cyc.d).c()));
        }
        else {
            d = d(lfg, 37, 38, 32);
        }
        d.getClass();
        return c(lfg.j(), d, fvr.b, true, false, (Long)niz.f());
    }
    
    public static kxb c(final lfj lfj, final lgg lgg, final int n, final boolean b, final boolean b2, final Long n2) {
        final kxa a = kxb.a();
        a.b(lfj);
        a.g(lgg.b);
        a.f(lgg.a);
        a.c(n);
        a.h(kxd.a);
        a.e(b2);
        a.d(b);
        if (n2 != null) {
            a.i(n2);
        }
        return a.a();
    }
    
    public static lgg d(final lfg lfg, final int... array) {
        for (final int n : array) {
            final List v = lfg.v(n);
            if (!v.isEmpty()) {
                return new lgg(n, krf.c(v));
            }
        }
        return null;
    }
    
    public static void e(final Map map, final pii pii, final pii pii2, final pii pii3, final pii pii4, final fxu fxu, final cxl cxl) {
        if (fxu.I() && cxl.k(cxr.aN) && !f(fxu.l(), cxl)) {
            map.put(gti.c, pii2.get());
            if (((niz)pii3.get()).g()) {
                map.put(gti.d, ((niz)pii3.get()).c());
            }
            if (((niz)pii4.get()).g()) {
                map.put(gti.b, ((niz)pii4.get()).c());
            }
            return;
        }
        map.put(gti.a, pii.get());
    }
    
    public static boolean f(final lfu lfu, final cxl cxl) {
        return lfu == lfu.a && cxl.k(cxr.S);
    }
    
    public static kxb g(final lfj lfj, final lgg lgg, final int n) {
        return c(lfj, lgg, n, true, false, null);
    }
}
