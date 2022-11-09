import java.util.List;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hlb
{
    private static final nsd a;
    private final hjx b;
    private final String c;
    private final String d;
    private final lfw e;
    
    static {
        a = nsd.g("com/google/android/apps/camera/settings/resolution/ResolutionSetting");
    }
    
    public hlb(final hjx b, final lfw e, final cxl cxl) {
        this.b = b;
        this.e = e;
        final String i = cxl.i(cxr.N);
        i.getClass();
        this.c = i;
        final String j = cxl.i(cxr.O);
        j.getClass();
        this.d = j;
    }
    
    public final kre a(final lfj lfj, final lfu lfu) {
        String s;
        if (lfu == lfu.a) {
            s = "pref_camera_picturesize_front_key";
        }
        else {
            s = "pref_camera_picturesize_back_key";
        }
        String s2;
        if (lfu == lfu.b) {
            s2 = this.c;
        }
        else if (lfu == lfu.a) {
            s2 = this.d;
        }
        else {
            s2 = "";
        }
        final boolean n = this.b.n(s);
        boolean b = true;
        kre kre;
        boolean b2 = false;
        if (n) {
            kre = krf.b(this.b.e(s));
            Label_0137: {
                if (kre != null) {
                    final String[] split = s2.split(",");
                    if (split.length == 0) {
                        b2 = false;
                        break Label_0137;
                    }
                    if (!hny.c(kre, new HashSet(nqb.p((Object[])split)))) {
                        b2 = false;
                        break Label_0137;
                    }
                }
                b2 = true;
            }
        }
        else {
            kre = null;
            b2 = false;
        }
        final List v = this.e.f(lfj).v(256);
        if (kre == null || kre.a <= 0 || kre.b <= 0 || !v.contains(kre)) {
            b = false;
        }
        if (!n || b2 || !b) {
            kre = krf.c(hny.b(v, s2));
            this.b.k(s, krf.d(kre));
            a.k(hlb.a.c(), "Picture size setting is not set. Selecting fallback: %s", kre, '\u0927');
        }
        kre.getClass();
        return kre;
    }
    
    public final void b(final lfu lfu) {
        String s;
        if (lfu == lfu.a) {
            s = "pref_camera_picturesize_front_key";
        }
        else {
            if (lfu != lfu.b) {
                a.k(hlb.a.c(), "Unsupported facing value: %s", lfu, '\u0928');
                return;
            }
            s = "pref_camera_picturesize_back_key";
        }
        if (this.b.n(s)) {
            return;
        }
        final lfj e = this.e.e(lfu);
        if (e == null) {
            a.k(hlb.a.c(), "Failed to retrieve a camera id for facing: %s", lfu, '\u092a');
            return;
        }
        final fxu f = this.e.f(e);
        String s2;
        if (lfu == lfu.b) {
            s2 = this.c;
        }
        else if (lfu == lfu.a) {
            s2 = this.d;
        }
        else {
            s2 = "";
        }
        this.b.k(s, krf.d(krf.c(hny.b(f.v(256), s2))));
    }
}
