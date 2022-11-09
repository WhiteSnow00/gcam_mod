import java.util.Set;
import java.util.Collection;
import android.hardware.camera2.CaptureRequest;
import java.util.HashSet;
import java.util.Iterator;
import android.hardware.camera2.CaptureRequest$Key;

// 
// Decompiled by Procyon v0.6.0
// 

public final class grd
{
    public static nns a(final lfg lfg) {
        final Iterator iterator = lfg.y().iterator();
        while (iterator.hasNext()) {
            if (((CaptureRequest$Key)iterator.next()).getName().equals(fxw.a.getName())) {
                return nns.m(kxc.p(fxw.a, 1));
            }
        }
        return nns.l();
    }
    
    public static noi b(final jbm jbm) {
        final HashSet set = new HashSet();
        if (jlj.o != null) {
            int n;
            if (jbm == jbm.n) {
                n = 100;
            }
            else if (jbm == jbm.d) {
                n = 101;
            }
            else if (jbm == jbm.g) {
                n = 3;
            }
            else {
                if (jbm != jbm.m) {
                    return nqr.a;
                }
                n = 5;
            }
            set.add(kxc.p(jlj.o, true));
            set.add(kxc.p(CaptureRequest.CONTROL_SCENE_MODE, n));
        }
        return noi.F(set);
    }
    
    public static noi c(final jbm jbm, final lfg lfg) {
        final nog d = noi.D();
        d.i(a(lfg));
        d.i(b(jbm));
        return d.f();
    }
    
    public static void d(final Set set, final kwf kwf, final lfg lfg) {
        if (!set.isEmpty()) {
            final Set q = kxc.q(lfg.y());
            for (final kws kws : set) {
                if (q.contains(kws.a.getName())) {
                    kwf.b().g(kws);
                }
            }
        }
    }
    
    public static void e(final kwd kwd, final kvw kvw) {
        final Iterator<Object> iterator = kvw.q().c.iterator();
        while (iterator.hasNext()) {
            kwd.d(iterator.next());
        }
    }
    
    public static boolean f(final kwz kwz) {
        final long n = kwz.a();
        return n == 257L || n == 4098L || n == 4099L;
    }
    
    public static boolean g(final kwz kwz) {
        final long n = kwz.a();
        return n == 37L || n == 38L;
    }
    
    public static fxu h(fxu fxu, final lfw lfw) {
        final Iterator iterator = fxu.z().iterator();
        while (iterator.hasNext()) {
            final fxu f = lfw.f((lfj)iterator.next());
            if (f.h().width() > fxu.h().width()) {
                fxu = f;
            }
        }
        return fxu;
    }
    
    public static lfj i(final kzl kzl) {
        for (final kwz kwz : kzl.c) {
            if (kwz.a() == 37) {
                return kwz.c();
            }
        }
        return null;
    }
}
