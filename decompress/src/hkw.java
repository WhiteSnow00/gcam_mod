import java.util.Map;
import android.content.SharedPreferences;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hkw extends hld
{
    private static final nsd b;
    private final Context c;
    private final cxl d;
    private final hko e;
    private final lfw f;
    
    static {
        b = nsd.g("com/google/android/apps/camera/settings/app/upgrader/AppUpgrader");
    }
    
    public hkw(final Context c, final lfw f, final hko e, final cxl d) {
        super("pref_upgrade_version", 22);
        this.c = c;
        this.f = f;
        this.d = d;
        this.e = e;
    }
    
    private final void e(final lfu lfu, final hjx hjx) {
        String s;
        if (lfu == lfu.a) {
            s = "pref_camera_picturesize_front_key";
        }
        else {
            if (lfu != lfu.b) {
                a.l(hkw.b.c(), "Ignoring attempt to upgrade size of unhandled camera facing direction", '\u0923');
                return;
            }
            s = "pref_camera_picturesize_back_key";
        }
        final kre b = krf.b(hjx.e(s));
        final lfj e = this.f.e(lfu);
        if (b != null && e != null) {
            if (kqp.g(b).j(kqp.a)) {
                final fxu f = this.f.f(e);
                final kre a = hlh.a(null, f.v(256), f.l());
                if (a != null) {
                    hjx.k(s, krf.d(a));
                }
            }
        }
    }
    
    private final void f(final hjx hjx, final String s) {
        if (hjx.n(s)) {
            hjx.k(s, this.c.getString(2131952482));
        }
    }
    
    private final void g(final hjx hjx, final lfu lfu) {
        hjx.getClass();
        lfu.getClass();
        String s;
        if (lfu == lfu.a) {
            s = "pref_camera_picturesize_front_key";
        }
        else {
            if (lfu != lfu.b) {
                a.l(hkw.b.c(), "Ignoring attempt to upgrade size of unhandled camera facing direction", '\u0924');
                return;
            }
            s = "pref_camera_picturesize_back_key";
        }
        final lfj e = this.f.e(lfu);
        if (e == null) {
            a.k(hkw.b.c(), "Failed to retrieve a camera id for facing: %s", lfu, '\u0926');
            hjx.g(s);
            return;
        }
        final fxu f = this.f.f(e);
        final kre a = hlh.a(hjx.e(s), f.v(256), f.l());
        if (a != null) {
            hjx.k(s, krf.d(a));
        }
    }
    
    public final void a(final hjx hjx, final int n) {
        final Context c = this.c;
        if (n < 5) {
            final SharedPreferences d = hjx.d();
            final SharedPreferences p2 = hjx.p();
            if (d.contains(hjq.a.b)) {
                final String b = hjq.a.b;
                final Map all = d.getAll();
                if (all.containsKey(b) && !(all.get(b) instanceof String)) {
                    final String b2 = hjq.a.b;
                    boolean boolean1;
                    try {
                        boolean1 = d.getBoolean(b2, false);
                    }
                    catch (final ClassCastException ex) {
                        a.m(hld.a.b(), "error reading old value, removing and returning default", '\u092d', ex);
                        boolean1 = false;
                    }
                    d.edit().remove(b2).apply();
                    hjx.l(hjq.a.b, boolean1);
                }
            }
            if (p2.contains("pref_camera_hdr_plus_key") && "on".equals(hld.c(p2, "pref_camera_hdr_plus_key"))) {
                hjx.l("pref_camera_hdr_plus_key", true);
            }
        }
        if (n < 2) {
            final SharedPreferences p3 = hjx.p();
            if (hjx.n(hjq.a.b)) {
                if (!hjx.m(hjq.a.b)) {
                    hjx.g(hjq.a.b);
                }
            }
            else if (p3.contains(hjq.a.b) && "on".equals(hld.c(p3, hjq.a.b))) {
                hjx.l(hjq.a.b, true);
            }
        }
        if (n < 3) {
            this.g(hjx, lfu.a);
            this.g(hjx, lfu.b);
        }
        if (n < 8 && hjx.n("pref_camera_hdr_plus_key")) {
            final String e = hjx.e("pref_camera_hdr_plus_key");
            Boolean b3;
            if ("1".equals(e)) {
                b3 = Boolean.TRUE;
            }
            else if ("0".equals(e)) {
                b3 = Boolean.FALSE;
            }
            else {
                b3 = null;
            }
            if (b3 != null) {
                String s;
                if (!b3) {
                    s = "off";
                }
                else {
                    s = "on";
                }
                hjx.k("pref_camera_hdr_plus_key", s);
            }
        }
        if (n < 9 && hjx.n("pref_camera_hdr_plus_key")) {
            final String e2 = hjx.e("pref_camera_hdr_plus_key");
            if (e2 != null && !e2.equals("on") && !e2.equals("off") && !e2.equals("auto")) {
                hjx.g("pref_camera_hdr_plus_key");
            }
        }
        if (n < 12) {
            this.e(lfu.a, hjx);
            this.e(lfu.b, hjx);
        }
        if (n < 13 && hjx.n("pref_camera_flashmode_key")) {
            final String e3 = hjx.e("pref_camera_flashmode_key");
            hjx.k(hjq.i.b, e3);
            hjx.k(hjq.j.b, e3);
            hjx.g("pref_camera_flashmode_key");
        }
        if (n < 14) {
            if (hjx.n("pref_camera_video_flashmode_key")) {
                final String e4 = hjx.e("pref_camera_video_flashmode_key");
                hjx.k(hjq.l.b, e4);
                hjx.k(hjq.m.b, e4);
                hjx.g("pref_camera_video_flashmode_key");
            }
            final String b4 = hjq.o.b;
            if (hjx.n("pref_camera_video_flashmode_thermally_disabled_key")) {
                hjx.k(b4, hjx.e("pref_camera_video_flashmode_thermally_disabled_key"));
                hjx.g("pref_camera_video_flashmode_thermally_disabled_key");
            }
        }
        if (n < 16 && this.d.k(cxr.M)) {
            final String b5 = hjq.i.b;
            if (hjx.n(b5)) {
                hjx.k(b5, this.c.getString(2131952482));
            }
        }
        if (n < 17) {
            this.f(hjx, hjq.j.b);
            this.f(hjx, hjq.i.b);
        }
        if (n < 18 && !this.d.j(cya.c) && ggv.a.d.equals(hjx.e(hjq.j.b))) {
            this.f(hjx, hjq.j.b);
        }
        if (n < 19 && hjx.n("pref_camera_dynamic_depth_enabled_key")) {
            hjx.l("pref_camera_dynamic_depth_enabled_key", false);
        }
        if (n < 20) {
            final String b6 = hjq.s.b;
            final String e5 = hjx.e("pref_video_quality_back_key");
            if (e5 != null && e5.contentEquals(c.getString(2131952533)) && !hjx.n(b6)) {
                hjx.l(b6, true);
            }
        }
        if (n < 21) {
            final String b7 = hjq.s.b;
            final boolean m = hjx.m(b7);
            hjx.g(b7);
            if (m) {
                this.e.aR(hjh.b);
            }
        }
        if (n < 22 && this.d.k(cxs.W)) {
            hjx.k(hjq.j.b, "ns");
            hjx.k(hjq.i.b, "ns");
        }
    }
    
    @Override
    protected final int b(final hjx hjx) {
        final SharedPreferences d = hjx.d();
        if (d.contains("pref_strict_upgrade_version")) {
            final Object value = d.getAll().get("pref_strict_upgrade_version");
            d.edit().remove("pref_strict_upgrade_version").apply();
            if (value instanceof Integer) {
                return (int)value;
            }
            if (value instanceof String) {
                return Integer.parseInt((String)value);
            }
        }
        return super.b(hjx);
    }
}
