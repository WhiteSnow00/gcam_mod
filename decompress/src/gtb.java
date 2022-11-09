import android.hardware.camera2.CaptureRequest$Key;
import android.hardware.camera2.CaptureRequest;
import java.util.Iterator;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gtb
{
    public static Set a(final fzr fzr) {
        final nog d = noi.D();
        final Iterator iterator = fzr.a.iterator();
        while (iterator.hasNext()) {
            d.g(iterator.next());
        }
        return d.f();
    }
    
    public static void b(final kwd kwd, final Set set) {
        final nog d = noi.D();
        final kvq a = kwd.a();
        final Iterator iterator = set.iterator();
        boolean b = false;
        while (iterator.hasNext()) {
            final kws kws = (kws)iterator.next();
            final CaptureRequest$Key a2 = kws.a;
            if (!a2.equals((Object)CaptureRequest.CONTROL_AF_REGIONS) && !a2.equals((Object)CaptureRequest.CONTROL_AE_REGIONS) && !a2.equals((Object)CaptureRequest.CONTROL_AWB_REGIONS) && !a2.equals((Object)CaptureRequest.CONTROL_AF_TRIGGER) && !a2.equals((Object)CaptureRequest.CONTROL_AE_LOCK) && !a2.equals((Object)CaptureRequest.CONTROL_AWB_LOCK)) {
                final Object b2 = kws.b;
                final CaptureRequest$Key a3 = kws.a;
                if (a3.equals((Object)CaptureRequest.CONTROL_AE_MODE)) {
                    ((kxn)a).e = (Integer)b2;
                }
                else if (a3.equals((Object)CaptureRequest.CONTROL_AF_MODE)) {
                    ((kxn)a).d = (Integer)b2;
                }
                else if (a3.equals((Object)CaptureRequest.CONTROL_AWB_MODE)) {
                    ((kxn)a).f = (Integer)b2;
                }
                else if (a3.equals((Object)CaptureRequest.CONTROL_MODE)) {
                    ((kxn)a).c = (Integer)b2;
                }
                else {
                    if (!a3.equals((Object)CaptureRequest.FLASH_MODE)) {
                        d.g(kws);
                        continue;
                    }
                    ((kxn)a).g = (Integer)b2;
                }
                b = true;
            }
        }
        if (b) {
            kwd.m(a.a());
        }
        final noi f = d.f();
        if (!f.isEmpty()) {
            kwd.h(f);
        }
    }
}
