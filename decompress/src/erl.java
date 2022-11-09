import android.content.pm.PackageManager;
import com.google.android.apps.camera.ui.preference.ManagedSwitchPreference;
import android.preference.SwitchPreference;
import android.preference.ListPreference;
import android.app.NotificationManager;
import java.util.concurrent.Executor;
import android.content.Context;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class erl
{
    public final dds a;
    public final hru b;
    public final gha c;
    public final Set d;
    public final dqj e;
    public final hxy f;
    public final Set g;
    public final oui h;
    public final niz i;
    public final eyt j;
    public final klv k;
    public final hjx l;
    public final List m;
    public final List n;
    public final npq o;
    private final cxl p;
    private final kjm q;
    private final Set r;
    private final Set s;
    private final hkd t;
    private final klv u;
    private final klv v;
    private final boolean w;
    private final kmw x;
    private final lfw y;
    
    public erl(final lfw y, final cxl p21, final dds a, final hru b, final kjm q, final gha c, final Set r, final Set s, final Set d, final klv u, final eyt j, final klv k, final klv v, final dqj e, final hxy f, final oui h, final kmw x, final hjx l, final hkd t, final boolean w, final niz i) {
        this.y = y;
        this.p = p21;
        this.a = a;
        this.b = b;
        this.q = q;
        this.c = c;
        this.r = r;
        this.s = s;
        this.u = u;
        this.j = j;
        this.k = k;
        this.d = d;
        this.v = v;
        this.e = e;
        this.f = f;
        this.h = h;
        this.x = x;
        this.l = l;
        this.t = t;
        this.w = w;
        this.i = i;
        this.o = nnc.v();
        this.m = new ArrayList(10);
        this.n = new ArrayList(10);
        this.g = new HashSet();
    }
    
    public final void a(final Context context) {
        final lfu[] values = lfu.values();
        final int length = values.length;
        int i = 0;
        int n = 0;
        while (i < length) {
            final lfu lfu = values[i];
            int n2 = n;
            if (this.y.j(lfu)) {
                final lfj e = this.y.e(lfu);
                e.getClass();
                final fxu f = this.y.f(e);
                if (n == 0 && !f.J()) {
                    n2 = 0;
                }
                else {
                    n2 = 1;
                }
            }
            ++i;
            n = n2;
        }
        if (this.p.k(cxs.T)) {
            this.m.add("pref_camera_hdrplus_option_available_key");
        }
        else {
            this.n.add(this.u.a(new erj(this), this.q));
        }
        if (!this.p.k(cxz.r)) {
            this.m.add("pref_camera_raw_output_option_available_key");
        }
        if (!this.p.k(cww.b)) {
            this.m.add("pref_camera_coach_key");
        }
        final cxl p = this.p;
        final cxo a = cwt.a;
        p.f();
        if (!this.p.k(cxr.aM)) {
            this.m.add("pref_camera_selfie_mirror_key");
        }
        this.p.d();
        this.m.add("pref_category_developer");
        if (n == 0) {
            this.m.add(hjq.q.b);
        }
        if (!this.p.k(cwv.o) || !this.x.a()) {
            this.m.add(hjq.r.b);
        }
        if (!this.y.i()) {
            this.t.d(hjq.g, true);
            this.m.add(hjq.g.b);
        }
        this.p.b();
        this.m.add("pref_category_custom_hotkeys");
        if (!this.p.k(cxr.aR) && !this.p.k(cxr.aS)) {
            this.m.add("pref_camera_dynamic_depth_enabled_key");
        }
        if (!this.p.k(cxj.a)) {
            this.m.add("pref_category_frequent_faces");
        }
        if (!this.p.k(cxs.af)) {
            this.m.add("pref_camera_kepler_enabled_key");
        }
        final PackageManager packageManager = context.getPackageManager();
        if (packageManager.isPermissionRevokedByPolicy("android.permission.ACCESS_COARSE_LOCATION", context.getPackageName()) || packageManager.isPermissionRevokedByPolicy("android.permission.ACCESS_FINE_LOCATION", context.getPackageName())) {
            this.m.add(hjq.a.b);
        }
        if (!this.p.k(cxr.aC)) {
            this.m.add("pref_category_social_share");
        }
        final NotificationManager notificationManager = (NotificationManager)context.getSystemService("notification");
        if (this.w || (notificationManager != null && notificationManager.isNotificationPolicyAccessGranted())) {
            this.m.add("pref_dnd_access_needed");
        }
        if (!this.p.k(cxr.H)) {
            this.v.aR(false);
            this.m.add("pref_audio_zoom_key");
        }
        this.g.add("pref_camera_resolution");
        this.g.add("pref_camera_dynamic_depth_enabled_key");
        this.g.add(hjq.r.b);
        if (!this.p.k(cxr.bh)) {
            final cxl p2 = this.p;
            final cxm a2 = cxx.a;
            p2.b();
            this.m.add(hjq.e.b);
        }
        final nrv bn = ((nqr)this.r).bN();
        while (bn.hasNext()) {
            final hkz hkz = bn.next();
            if (((String)hkz.h().get(0)).equals("PhotoResolution")) {
                final ListPreference listPreference = new ListPreference(context);
                listPreference.setTitle(hkz.e());
                listPreference.setEntries(hkz.a());
                listPreference.setEntryValues(hkz.b());
                listPreference.setKey(hkz.g());
                listPreference.setDefaultValue(hkz.f());
                listPreference.setIcon(hkz.c());
                listPreference.setSummary(hkz.d());
                listPreference.setLayoutResource(2131624119);
                listPreference.setOrder(3);
                this.o.p("pref_category_resolution_camera", listPreference);
            }
        }
        final nrv bn2 = ((nqr)this.s).bN();
        while (bn2.hasNext()) {
            final hla hla = bn2.next();
            if (((String)hla.e().get(0)).equals("Advanced")) {
                final SwitchPreference switchPreference = new SwitchPreference(context);
                switchPreference.setTitle(hla.b());
                switchPreference.setSummary(hla.a());
                switchPreference.setKey(hla.d());
                switchPreference.setDefaultValue(hla.c());
                final ManagedSwitchPreference managedSwitchPreference = new ManagedSwitchPreference(context);
                managedSwitchPreference.setDefaultValue((Object)true);
                managedSwitchPreference.setKey(switchPreference.getKey());
                managedSwitchPreference.setSummary(switchPreference.getSummary());
                managedSwitchPreference.setTitle(switchPreference.getTitle());
                managedSwitchPreference.setIcon(switchPreference.getIcon());
                managedSwitchPreference.c = switchPreference.getOnPreferenceChangeListener();
                managedSwitchPreference.setOrder(switchPreference.getOrder());
                managedSwitchPreference.setLayoutResource(2131624119);
                this.o.p("pref_category_advanced", managedSwitchPreference);
            }
        }
    }
}
