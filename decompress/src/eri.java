import java.util.Map;
import com.google.android.apps.camera.ui.preference.KeyListenerPreference;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.preference.Preference$OnPreferenceChangeListener;
import android.preference.ListPreference;
import java.util.ArrayList;
import android.widget.ListAdapter;
import java.util.Iterator;
import j$.util.function.Function;
import android.widget.AdapterView;
import java.util.concurrent.Executor;
import com.google.android.apps.camera.ui.preference.StorageStatusPreference;
import android.preference.Preference$OnPreferenceClickListener;
import android.content.pm.ResolveInfo;
import java.util.List;
import android.content.res.ColorStateList;
import android.content.res.Resources$Theme;
import android.app.Activity;
import android.app.NotificationManager;
import android.view.View;
import android.graphics.drawable.Drawable;
import android.widget.ListView;
import android.preference.PreferenceCategory;
import android.os.Bundle;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.camera.legacy.app.settings.CameraSettingsActivity;
import android.preference.Preference;
import android.preference.PreferenceScreen;
import android.preference.PreferenceGroup;
import java.util.HashMap;
import com.google.android.apps.camera.ui.preference.ManagedSwitchPreference;
import android.content.SharedPreferences$OnSharedPreferenceChangeListener;
import android.preference.PreferenceFragment;

// 
// Decompiled by Procyon v0.6.0
// 

public final class eri extends PreferenceFragment implements SharedPreferences$OnSharedPreferenceChangeListener
{
    public erl a;
    public ManagedSwitchPreference b;
    private String d;
    private ManagedSwitchPreference e;
    private kjk f;
    private final HashMap g;
    
    public eri() {
        this.g = new HashMap();
    }
    
    private final PreferenceScreen c(final PreferenceGroup preferenceGroup, final String s) {
        final boolean b = preferenceGroup instanceof PreferenceScreen;
        int i = 0;
        if (b) {
            if (s.equals(preferenceGroup.getKey())) {
                return (PreferenceScreen)preferenceGroup;
            }
        }
        while (i < preferenceGroup.getPreferenceCount()) {
            final Preference preference = preferenceGroup.getPreference(i);
            if (preference instanceof PreferenceGroup) {
                final PreferenceScreen c = this.c((PreferenceGroup)preference, s);
                if (c != null) {
                    return c;
                }
            }
            ++i;
        }
        return null;
    }
    
    private final void d(final PreferenceGroup preferenceGroup) {
        for (int i = 0; i < preferenceGroup.getPreferenceCount(); ++i) {
            final Preference preference = preferenceGroup.getPreference(i);
            if (preference instanceof PreferenceGroup) {
                this.d((PreferenceGroup)preference);
            }
        }
    }
    
    private final void e(final String s) {
        final Preference preference = this.findPreference((CharSequence)s);
        if (preference == null) {
            return;
        }
        final PreferenceGroup parent = preference.getParent();
        if (parent != null && !parent.removePreference(preference)) {
            a.k(CameraSettingsActivity.o.c(), "Failed to remove preference :%s", s, '\u0562');
        }
    }
    
    private final void f(final PreferenceScreen preferenceScreen) {
        final Intent intent = new Intent((Context)this.getActivity(), (Class)CameraSettingsActivity.class);
        intent.putExtra("pref_screen_extra", preferenceScreen.getKey());
        intent.putExtra("pref_screen_title", preferenceScreen.getTitle());
        preferenceScreen.setIntent(intent);
    }
    
    private final void g(final String s) {
        final Preference preference = this.findPreference((CharSequence)s);
        if (preference instanceof PreferenceScreen) {
            this.f((PreferenceScreen)preference);
        }
    }
    
    public final void a() {
        this.a.l.l(hjq.a.b, false);
        this.b.setChecked(false);
    }
    
    public final boolean b() {
        return this.getActivity().checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") == 0 && this.getActivity().checkSelfPermission("android.permission.ACCESS_FINE_LOCATION") == 0;
    }
    
    public final PreferenceScreen getPreferenceScreen() {
        final PreferenceScreen preferenceScreen = super.getPreferenceScreen();
        final String d = this.d;
        if (d == null || preferenceScreen == null) {
            return preferenceScreen;
        }
        final PreferenceScreen c = this.c((PreferenceGroup)preferenceScreen, d);
        if (c != null) {
            return c;
        }
        final String d2 = this.d;
        final StringBuilder sb = new StringBuilder(String.valueOf(d2).length() + 14);
        sb.append("key ");
        sb.append(d2);
        sb.append(" not found");
        throw new RuntimeException(sb.toString());
    }
    
    public final void onActivityCreated(final Bundle bundle) {
        this.d((PreferenceGroup)this.findPreference((CharSequence)"pref_category_resolution_camera"));
        this.d((PreferenceGroup)this.findPreference((CharSequence)"pref_category_resolution_video"));
        if (!this.a.m.contains("pref_category_custom_hotkeys")) {
            final PreferenceScreen preferenceScreen = (PreferenceScreen)this.findPreference((CharSequence)"pref_category_custom_hotkeys");
            if (preferenceScreen != null) {
                for (int i = 0; i < ((PreferenceGroup)preferenceScreen).getPreferenceCount(); ++i) {
                    final Preference preference = ((PreferenceGroup)preferenceScreen).getPreference(i);
                    final String string = preference.getSharedPreferences().getString(preference.getKey(), "-1");
                    if (!this.g.containsKey(preference.getKey())) {
                        this.g.put(preference.getKey(), string);
                    }
                }
            }
        }
        final View view = this.getView();
        view.getClass();
        ((ListView)view.findViewById(16908298)).setDivider((Drawable)null);
        super.onActivityCreated(bundle);
    }
    
    public final void onActivityResult(final int n, final int n2, final Intent intent) {
        super.onActivityResult(n, n2, intent);
        if (n == 2) {
            final NotificationManager notificationManager = (NotificationManager)this.getActivity().getSystemService("notification");
            if (notificationManager != null && notificationManager.isNotificationPolicyAccessGranted()) {
                this.e("pref_dnd_access_needed");
            }
        }
    }
    
    public final void onCreate(final Bundle bundle) {
        final ela d = ((emg)this.getActivity().getApplication()).d();
        super.onCreate(bundle);
        this.f = new kjk();
        (this.a = d.i(new erm((Activity)this.getContext())).a()).a(this.getContext());
        final List m = this.a.m;
        final Bundle arguments = this.getArguments();
        if (arguments != null) {
            this.d = arguments.getString("pref_screen_extra");
        }
        this.addPreferencesFromResource(2132148224);
        final PreferenceScreen preferenceScreen = (PreferenceScreen)this.findPreference((CharSequence)"prefscreen_top");
        final nrv bn = ((nqr)this.a.d).bN();
        while (true) {
            final boolean hasNext = bn.hasNext();
            final int n = 0;
            if (!hasNext) {
                break;
            }
            final hkx hkx = bn.next();
            final erg erg = new erg(preferenceScreen.getContext());
            erg.setTitle(hkx.b());
            erg.setKey(hkx.c());
            erg.setOrder(hkx.a());
            final boolean p = CameraSettingsActivity.p;
            final int n2 = 2131624098;
            int layoutResource;
            if (!p) {
                layoutResource = 2131624098;
            }
            else {
                layoutResource = 2131624097;
            }
            erg.setLayoutResource(layoutResource);
            erg.setOrderingAsAdded(true);
            preferenceScreen.addPreference((Preference)erg);
            if (hkx.a() < 0) {
                final Preference preference = this.findPreference((CharSequence)"pref_category_general");
                int layoutResource2;
                if (!CameraSettingsActivity.p) {
                    layoutResource2 = n2;
                }
                else {
                    layoutResource2 = 2131624097;
                }
                preference.setLayoutResource(layoutResource2);
            }
            final int size = hkx.d().size();
            final Iterator iterator = hkx.d().iterator();
            int n3 = n;
            while (iterator.hasNext()) {
                final hky hky = (hky)iterator.next();
                final erh erh = new erh(erg.getContext(), n3, size - 1);
                ++n3;
                erh.setTitle(hky.b());
                erh.setKey(hky.d());
                erh.setSummary((CharSequence)hky.e());
                erh.setIcon(hky.a());
                final Intent c = hky.c();
                if (c != null) {
                    erh.setIntent(c);
                }
                erh.setLayoutResource(2131624119);
                erg.addPreference((Preference)erh);
            }
        }
        final Iterator iterator2 = this.a.n.iterator();
        while (iterator2.hasNext()) {
            this.f.c((krc)iterator2.next());
        }
        if (!m.contains("pref_audio_zoom_key")) {
            final ManagedSwitchPreference managedSwitchPreference = (ManagedSwitchPreference)this.findPreference((CharSequence)"pref_audio_zoom_key");
            managedSwitchPreference.c = (Preference$OnPreferenceChangeListener)new erc(this, managedSwitchPreference);
        }
        if (!m.contains("pref_camera_enable_iris")) {
            final ManagedSwitchPreference managedSwitchPreference2 = (ManagedSwitchPreference)this.findPreference((CharSequence)"pref_camera_enable_iris");
            String summary = this.getString(2131952459);
            if (!CameraSettingsActivity.q) {
                summary = this.getString(2131952460);
            }
            managedSwitchPreference2.setSummary((CharSequence)summary);
        }
        final ManagedSwitchPreference b = (ManagedSwitchPreference)this.findPreference((CharSequence)hjq.a.b);
        this.b = b;
        b.c = (Preference$OnPreferenceChangeListener)new erb(this, 1);
        final Iterator iterator3 = m.iterator();
        while (iterator3.hasNext()) {
            this.e((String)iterator3.next());
        }
        if (!m.contains("pref_category_developer")) {
            this.a.a.a((PreferenceScreen)this.findPreference((CharSequence)"pref_category_developer"));
        }
        if (!m.contains("pref_category_social_share")) {
            final PreferenceScreen i = (PreferenceScreen)this.findPreference((CharSequence)"pref_category_social_share");
            final hru b2 = this.a.b;
            b2.m = i;
            b2.e.f();
            if (!(boolean)b2.c.c(hjq.z) && !(boolean)b2.c.c(hjq.A)) {
                Label_0875: {
                    Label_0858: {
                        if (b2.g.k(cxr.aD)) {
                            if (b2.e.j("image/*") || b2.e.j("video/*")) {
                                break Label_0858;
                            }
                        }
                        else if (b2.e.j("image/*")) {
                            break Label_0858;
                        }
                        b2.d.d(hjq.x, false);
                        break Label_0875;
                    }
                    b2.d.d(hjq.x, true);
                }
                b2.c.c(hjq.x);
            }
            final boolean booleanValue = (boolean)b2.c.c(hjq.x);
            final ManagedSwitchPreference managedSwitchPreference3 = (ManagedSwitchPreference)i.findPreference((CharSequence)hjq.x.b);
            if (managedSwitchPreference3 != null) {
                managedSwitchPreference3.setTitle((CharSequence)b2.e(booleanValue));
                int n4;
                if (b2.g.k(cxr.at)) {
                    n4 = neq.c(b2.a, 2130968856, -1);
                }
                else {
                    n4 = -1;
                }
                managedSwitchPreference3.g = n4;
                int color;
                if (b2.g.k(cxr.at)) {
                    color = n4;
                }
                else {
                    color = b2.a.getResources().getColor(2131101435, (Resources$Theme)null);
                }
                managedSwitchPreference3.d = new ColorStateList(new int[][] { { -16842912 }, { 16842912 } }, new int[] { color, color });
                int color2;
                if (b2.g.k(cxr.at)) {
                    color2 = n4;
                }
                else {
                    color2 = b2.a.getResources().getColor(2131101437, (Resources$Theme)null);
                }
                if (!b2.g.k(cxr.at)) {
                    n4 = b2.a.getResources().getColor(2131101436, (Resources$Theme)null);
                }
                managedSwitchPreference3.e = new ColorStateList(new int[][] { { -16842912 }, { 16842912 } }, new int[] { color2, n4 });
                managedSwitchPreference3.f = b2.b(booleanValue);
                managedSwitchPreference3.setChecked(booleanValue);
                managedSwitchPreference3.c = (Preference$OnPreferenceChangeListener)new hro(b2, managedSwitchPreference3);
            }
            final Preference preference2 = i.findPreference((CharSequence)"key_social_share_info");
            if (preference2 != null) {
                preference2.setSummary((CharSequence)jwn.ae(2131820550, 3, 3).a(b2.a.getResources()));
            }
            nns l;
            if (b2.g.k(cxr.aD)) {
                l = b2.c(b2.e.c("image/*"), b2.e.c("video/*"));
            }
            else {
                l = b2.d(b2.e.c("image/*"));
            }
            b2.l = l;
            b2.e.h(b2.l);
            b2.e.e(b2.l);
            final nns j = b2.l;
            final nnx a = b2.e.a();
            for (final ResolveInfo resolveInfo : j) {
                final hrm hrm = a.get(resolveInfo.activityInfo.packageName);
                hrm.getClass();
                final ManagedSwitchPreference managedSwitchPreference4 = new ManagedSwitchPreference(b2.a);
                final String string = resolveInfo.activityInfo.applicationInfo.loadLabel(b2.k).toString();
                final String string2 = resolveInfo.loadLabel(b2.k).toString();
                managedSwitchPreference4.setTitle((CharSequence)string);
                if (!string.equals(string2)) {
                    managedSwitchPreference4.setSummary((CharSequence)string2);
                }
                managedSwitchPreference4.setKey(hrm.b());
                managedSwitchPreference4.setDefaultValue((Object)b2.b.m(hrm.b()));
                managedSwitchPreference4.setPersistent(true);
                final int dimensionPixelSize = b2.a.getResources().getDimensionPixelSize(2131165334);
                ((auw)auf.c(b2.a).c().d(resolveInfo.loadIcon(b2.k)).b(bho.a()).t(dimensionPixelSize, dimensionPixelSize)).k(new hrs(managedSwitchPreference4));
                int layoutResource3;
                if (!b2.g.k(cxr.at)) {
                    layoutResource3 = 2131624122;
                }
                else {
                    layoutResource3 = 2131624121;
                }
                managedSwitchPreference4.setLayoutResource(layoutResource3);
                managedSwitchPreference4.c = (Preference$OnPreferenceChangeListener)new hrt(b2);
                i.addPreference((Preference)managedSwitchPreference4);
                b2.h.g(managedSwitchPreference4);
                b2.i.put(managedSwitchPreference4.getKey(), b2.b.m(hrm.b()));
            }
            b2.h();
        }
        if (!m.contains("pref_category_frequent_faces")) {
            final PreferenceScreen preferenceScreen2 = (PreferenceScreen)this.findPreference((CharSequence)"pref_category_frequent_faces");
            final dqj e = this.a.e;
            final Activity activity = this.getActivity();
            final ManagedSwitchPreference managedSwitchPreference5 = (ManagedSwitchPreference)preferenceScreen2.findPreference((CharSequence)"key_ff_opt_in");
            if (managedSwitchPreference5 != null) {
                managedSwitchPreference5.setChecked((boolean)e.b.aQ());
                managedSwitchPreference5.c = (Preference$OnPreferenceChangeListener)new dqh(e);
                managedSwitchPreference5.b(e.a.getResources().getString(2131952033), new dqi(activity));
            }
        }
        if (!m.contains("pref_category_storage")) {
            final PreferenceScreen preferenceScreen3 = (PreferenceScreen)this.findPreference((CharSequence)"pref_category_storage");
            preferenceScreen3.setOnPreferenceClickListener((Preference$OnPreferenceClickListener)new ere(this, 1));
            final hxy f = this.a.f;
            final Activity activity2 = this.getActivity();
            f.f = (StorageStatusPreference)preferenceScreen3.findPreference((CharSequence)"pref_storage_status");
            final StorageStatusPreference f2 = f.f;
            f2.e = f.e;
            int layoutResource4;
            if (!f.e) {
                layoutResource4 = 2131624111;
            }
            else {
                layoutResource4 = 2131624110;
            }
            f2.setLayoutResource(layoutResource4);
            final ManagedSwitchPreference managedSwitchPreference6 = (ManagedSwitchPreference)preferenceScreen3.findPreference((CharSequence)hjq.D.b);
            final ManagedSwitchPreference managedSwitchPreference7 = (ManagedSwitchPreference)preferenceScreen3.findPreference((CharSequence)hjq.E.b);
            managedSwitchPreference7.setSummary((CharSequence)activity2.getResources().getString(2131952507, new Object[] { 1 }));
            managedSwitchPreference7.setEnabled(managedSwitchPreference6.isChecked());
            managedSwitchPreference6.c = (Preference$OnPreferenceChangeListener)new hxw(f, managedSwitchPreference7, managedSwitchPreference6);
            final String string3 = activity2.getResources().getString(2131952624);
            final hxs k = new hxs((Context)activity2);
            managedSwitchPreference6.j = string3;
            managedSwitchPreference6.l = (View)k;
            preferenceScreen3.findPreference((CharSequence)"pref_free_up_space").setOnPreferenceClickListener((Preference$OnPreferenceClickListener)new erd(activity2, 2));
            ofi.w(f.h.b(f.b), new hxx(f), f.c);
        }
        final PreferenceScreen preferenceScreen4 = (PreferenceScreen)this.findPreference((CharSequence)"pref_category_advanced");
        if (preferenceScreen4.getPreferenceCount() <= 0) {
            this.e("pref_category_advanced");
        }
        else {
            final ManagedSwitchPreference managedSwitchPreference8 = (ManagedSwitchPreference)preferenceScreen4.findPreference((CharSequence)"pref_camera_raw_output_option_available_key");
            if (managedSwitchPreference8 != null) {
                final Intent intent = new Intent("android.intent.action.VIEW");
                intent.setPackage("com.google.android.apps.photos");
                intent.putExtra("android.intent.extra.FROM_STORAGE", true);
                intent.setType("image/*");
                managedSwitchPreference8.b(this.getString(2131952515), new erf(this, intent));
                managedSwitchPreference8.c = (Preference$OnPreferenceChangeListener)new erb(this);
            }
        }
        if (!m.contains(hjq.q.b)) {
            this.e = (ManagedSwitchPreference)this.findPreference((CharSequence)hjq.q.b);
        }
        final niz i2 = this.a.i;
        if (!m.contains("pref_camera_kepler_enabled_key") && i2.g()) {
            final ManagedSwitchPreference managedSwitchPreference9 = (ManagedSwitchPreference)this.findPreference((CharSequence)"pref_camera_kepler_enabled_key");
            final fbo fbo = (fbo)i2.c();
            managedSwitchPreference9.setTitle(2131952504);
            final fbo fbo2 = (fbo)i2.c();
            managedSwitchPreference9.setSummary(2131952503);
        }
        if (arguments != null) {
            final String string4 = arguments.getString("pref_open_setting_page");
            if (string4 != null) {
                final PreferenceScreen preferenceScreen5 = (PreferenceScreen)this.findPreference((CharSequence)"prefscreen_top");
                final Preference preference3 = this.findPreference((CharSequence)string4);
                Label_2533: {
                    if (preference3 != null) {
                        final ListAdapter rootAdapter = this.getPreferenceScreen().getRootAdapter();
                        int n5 = 0;
                        while (true) {
                            while (n5 < rootAdapter.getCount()) {
                                if (!((Preference)rootAdapter.getItem(n5)).getKey().equals(string4)) {
                                    ++n5;
                                }
                                else {
                                    if (n5 != -1) {
                                        final PreferenceScreen preferenceScreen6 = (PreferenceScreen)preference3;
                                        this.f(preferenceScreen6);
                                        final Intent intent2 = preferenceScreen6.getIntent();
                                        if (this.getActivity().getCallingActivity() != null) {
                                            intent2.setFlags(33554432);
                                        }
                                        preferenceScreen6.setIntent(intent2);
                                        preferenceScreen5.onItemClick((AdapterView)null, (View)null, n5, 0L);
                                    }
                                    break Label_2533;
                                }
                            }
                            n5 = -1;
                            continue;
                        }
                    }
                }
                if (arguments.getBoolean("pref_make_setting_page_root")) {
                    this.getActivity().finish();
                }
            }
        }
        final npq o = this.a.o;
        for (final String s : o.r()) {
            final PreferenceGroup preferenceGroup = (PreferenceGroup)this.findPreference((CharSequence)s);
            for (final Preference preference4 : ((nlb)o).d(s)) {
                if (!preferenceGroup.addPreference(preference4)) {
                    a.k(CameraSettingsActivity.o.c(), "Could not add %s", preference4.getTitle(), '\u0561');
                }
                else {
                    preference4.getTitle();
                }
            }
        }
        final Iterator iterator7 = this.a.g.iterator();
        while (iterator7.hasNext()) {
            final isi isi = (isi)this.findPreference((CharSequence)iterator7.next());
            if (isi != null) {
                isi.a((Function)new erk(this.a));
            }
        }
        CameraSettingsActivity.p(this.a.j, (Preference)this.getPreferenceScreen());
    }
    
    public final void onDestroy() {
        super.onDestroy();
        this.f.close();
    }
    
    public final void onPause() {
        super.onPause();
        this.getPreferenceScreen().getSharedPreferences().unregisterOnSharedPreferenceChangeListener((SharedPreferences$OnSharedPreferenceChangeListener)this);
    }
    
    public final void onResume() {
        super.onResume();
        final Activity activity = this.getActivity();
        this.g("pref_category_advanced");
        this.g("pref_category_gestures");
        this.g("pref_category_developer");
        this.g("pref_category_social_share");
        this.g("pref_category_frequent_faces");
        this.g("pref_category_storage");
        final PreferenceScreen preferenceScreen = (PreferenceScreen)this.findPreference((CharSequence)"pref_category_social_share");
        if (preferenceScreen != null) {
            final hru b = this.a.b;
            String string;
            if (b.c.c(hjq.x)) {
                final ArrayList list = new ArrayList();
                nns nns;
                if (b.g.k(cxr.aD)) {
                    nns = b.c(b.e.d("image/*"), b.e.d("video/*"));
                }
                else {
                    nns = b.d(b.e.d("image/*"));
                }
                for (int size = nns.size(), i = 0; i < size; ++i) {
                    list.add(((ResolveInfo)nns.get(i)).activityInfo.applicationInfo.loadLabel(b.k).toString());
                }
                final Iterator iterator = list.iterator();
                String concat = "";
                int n = 0;
                while (true) {
                    string = concat;
                    if (!iterator.hasNext()) {
                        break;
                    }
                    final String s = (String)iterator.next();
                    String concat2 = concat;
                    if (n != 0) {
                        concat2 = String.valueOf(concat).concat(", ");
                    }
                    final String value = String.valueOf(concat2);
                    final String value2 = String.valueOf(s);
                    if (value2.length() != 0) {
                        concat = value.concat(value2);
                    }
                    else {
                        concat = new String(value);
                    }
                    n = 1;
                }
            }
            else {
                string = b.a.getResources().getString(2131952645);
            }
            preferenceScreen.setSummary((CharSequence)string);
        }
        final PreferenceScreen preferenceScreen2 = (PreferenceScreen)this.findPreference((CharSequence)"pref_category_frequent_faces");
        if (preferenceScreen2 != null) {
            final dqj e = this.a.e;
            final Resources resources = e.a.getResources();
            int n2;
            if (!(boolean)e.b.aQ()) {
                n2 = 2131952034;
            }
            else {
                n2 = 2131952035;
            }
            preferenceScreen2.setSummary((CharSequence)resources.getString(n2));
        }
        if (!this.a.m.contains("pref_category_custom_hotkeys")) {
            this.g("pref_category_custom_hotkeys");
        }
        final Preference preference = this.findPreference((CharSequence)"pref_category_gestures");
        String summary;
        if (this.findPreference((CharSequence)hjq.e.b) != null) {
            summary = this.getResources().getString(2131952499, new Object[] { this.getResources().getString(2131952484), this.getResources().getString(2131952441) });
        }
        else {
            summary = this.getResources().getString(2131952484);
        }
        preference.setSummary((CharSequence)summary);
        final Preference preference2 = this.findPreference((CharSequence)"pref_category_storage");
        if (preference2 != null) {
            preference2.setSummary((CharSequence)this.getResources().getString(2131952518, new Object[] { this.getResources().getString(2131952505), this.getResources().getString(2131952497) }));
        }
        final ListPreference listPreference = (ListPreference)this.findPreference((CharSequence)hjq.c.b);
        listPreference.setSummary(listPreference.getEntries()[listPreference.findIndexOfValue(listPreference.getValue())]);
        listPreference.setOnPreferenceChangeListener((Preference$OnPreferenceChangeListener)new erb(this, 2));
        this.findPreference((CharSequence)"pref_launch_help").setOnPreferenceClickListener((Preference$OnPreferenceClickListener)new erd(activity, 1));
        this.findPreference((CharSequence)"pref_launch_feedback").setOnPreferenceClickListener((Preference$OnPreferenceClickListener)new erd(activity));
        final Preference preference3 = this.findPreference((CharSequence)"pref_dnd_access_needed");
        if (preference3 != null) {
            preference3.setOnPreferenceClickListener((Preference$OnPreferenceClickListener)new ere(this));
        }
        final PreferenceCategory preferenceCategory = (PreferenceCategory)this.findPreference((CharSequence)"pref_category_resolution_camera");
        if (preferenceCategory != null) {
            final Preference preference4 = preferenceCategory.findPreference((CharSequence)"pref_camera_resolution");
            final Preference preference5 = preferenceCategory.findPreference((CharSequence)"pref_camera_selfie_mirror_key");
            preferenceCategory.removeAll();
            if (preference4 != null) {
                preferenceCategory.addPreference(preference4);
            }
            if (preference5 != null) {
                preferenceCategory.addPreference(preference5);
            }
        }
        this.getPreferenceScreen().getSharedPreferences().registerOnSharedPreferenceChangeListener((SharedPreferences$OnSharedPreferenceChangeListener)this);
        if (!this.b()) {
            this.a();
        }
        final ManagedSwitchPreference e2 = this.e;
        if (e2 != null) {
            e2.setEnabled(true);
        }
    }
    
    public final void onSharedPreferenceChanged(final SharedPreferences sharedPreferences, final String s) {
        if (!this.a.m.contains("pref_category_custom_hotkeys")) {
            if (this.g.containsKey(s)) {
                final String string = this.findPreference((CharSequence)s).getSharedPreferences().getString(s, "-1");
                this.g.put(s, string);
                final int int1 = Integer.parseInt(string);
                if (int1 == 24 || int1 == 25) {
                    ((ListPreference)this.findPreference((CharSequence)hjq.f.b)).setValue(this.getResources().getString(2131952543));
                }
                if (!string.equals("-1") && this.g.containsValue(string)) {
                    final HashMap hashMap = new HashMap();
                    for (final String s2 : this.g.keySet()) {
                        if (!s2.equals(s) && ((String)this.g.get(s2)).equals(string)) {
                            hashMap.put(s2, "-1");
                            ((KeyListenerPreference)this.findPreference((CharSequence)s2)).b("-1");
                        }
                    }
                    this.g.putAll(hashMap);
                }
            }
            if (s.equals(hjq.f.b) && !((ListPreference)this.findPreference((CharSequence)s)).getValue().equals(this.getResources().getString(2131952543))) {
                final HashMap<String, String> hashMap2 = new HashMap<String, String>();
                for (final String s3 : this.g.keySet()) {
                    final int int2 = Integer.parseInt(this.g.get(s3));
                    if (int2 == 25 || int2 == 24) {
                        hashMap2.put(s3, "-1");
                        ((KeyListenerPreference)this.findPreference((CharSequence)s3)).b("-1");
                    }
                }
                this.g.putAll(hashMap2);
            }
        }
    }
}
