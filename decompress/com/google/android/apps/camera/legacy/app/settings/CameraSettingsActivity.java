// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.camera.legacy.app.settings;

import android.view.MenuItem;
import android.graphics.drawable.Drawable;
import android.app.Fragment;
import android.graphics.PorterDuff$Mode;
import android.util.TypedValue;
import android.view.Window$Callback;
import android.support.v7.widget.Toolbar;
import android.app.Activity;
import com.google.android.apps.camera.legacy.app.app.CameraApp;
import android.os.Bundle;
import java.io.Serializable;
import android.preference.Preference$OnPreferenceChangeListener;
import android.preference.ListPreference;
import android.preference.TwoStatePreference;
import android.preference.PreferenceGroup;
import android.preference.Preference;

public class CameraSettingsActivity extends ejm
{
    public static final nsd o;
    public static boolean p;
    public static boolean q;
    public cxl r;
    private final Object u;
    private eri v;
    private boolean w;
    
    static {
        o = nsd.g("com/google/android/apps/camera/legacy/app/settings/CameraSettingsActivity");
    }
    
    public CameraSettingsActivity() {
        this.u = new Object();
    }
    
    public static void p(final eyt eyt, final Preference preference) {
        if (preference.getKey().equals("pref_category_developer")) {
            return;
        }
        if (preference instanceof PreferenceGroup) {
            final PreferenceGroup preferenceGroup = (PreferenceGroup)preference;
            for (int i = 0; i < preferenceGroup.getPreferenceCount(); ++i) {
                p(eyt, preferenceGroup.getPreference(i));
            }
        }
        else if (preference.getOnPreferenceChangeListener() == null) {
            Serializable s;
            if (preference instanceof TwoStatePreference) {
                s = ((TwoStatePreference)preference).isChecked();
            }
            else {
                if (!(preference instanceof ListPreference)) {
                    return;
                }
                s = ((ListPreference)preference).getValue();
            }
            preference.setOnPreferenceChangeListener((Preference$OnPreferenceChangeListener)new era(eyt, s));
        }
    }
    
    @Override
    public final void onBackPressed() {
        if ((this.getIntent().getFlags() & 0x2000000) != 0x0) {
            this.setResult(-1);
        }
        super.onBackPressed();
    }
    
    public final void onCreate(final Bundle bundle) {
        if (!this.w) {
            synchronized (this.u) {
                if (!this.w) {
                    final ela d = ((CameraApp)this.getApplicationContext()).d();
                    super.k = (kse)((emf)d).o.get();
                    super.n = (bqz)((emf)d).t.get();
                    super.l = ewv.b(((emf)d).c);
                    super.m = (cxl)((emf)d).j.get();
                    this.r = (cxl)((emf)d).j.get();
                    this.w = true;
                }
            }
        }
        super.onCreate(bundle);
        CameraSettingsActivity.q = (this.r.k(cxu.d) ^ true);
        if (CameraSettingsActivity.p = this.r.k(cxr.at)) {
            lry.a(this);
            this.setContentView(2131624142);
        }
        else {
            this.setTheme(2132017877);
            this.setContentView(2131624143);
        }
        final String stringExtra = this.getIntent().getStringExtra("pref_screen_title");
        final Toolbar toolbar = (Toolbar)this.findViewById(2131428084);
        final kw kw = (kw)this.i();
        if (kw.e instanceof Activity) {
            final ju a = kw.a();
            if (a instanceof ln) {
                throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
            }
            kw.j = null;
            if (a != null) {
                a.e();
            }
            if (toolbar != null) {
                final lf i = new lf(toolbar, kw.w(), (Window$Callback)kw.h);
                kw.i = i;
                kw.g.setCallback(i.c);
            }
            else {
                kw.i = null;
                kw.g.setCallback((Window$Callback)kw.h);
            }
            kw.e();
        }
        final ju h = this.h();
        h.getClass();
        h.g(true);
        h.s();
        if (stringExtra == null) {
            this.setTitle(2131952475);
            h.u();
        }
        else {
            this.setTitle((CharSequence)stringExtra);
            h.i(stringExtra);
        }
        if (!CameraSettingsActivity.p) {
            final TypedValue typedValue = new TypedValue();
            this.getTheme().resolveAttribute(16842806, typedValue, true);
            final Drawable e = toolbar.e();
            e.getClass();
            e.setColorFilter(typedValue.data, PorterDuff$Mode.SRC_ATOP);
        }
        final String stringExtra2 = this.getIntent().getStringExtra("pref_screen_extra");
        final String stringExtra3 = this.getIntent().getStringExtra("pref_open_setting_page");
        final boolean booleanExtra = this.getIntent().getBooleanExtra("pref_make_setting_page_root", false);
        this.v = new eri();
        final Bundle arguments = new Bundle(1);
        arguments.putString("pref_screen_extra", stringExtra2);
        arguments.putString("pref_open_setting_page", stringExtra3);
        arguments.putBoolean("pref_make_setting_page_root", booleanExtra);
        this.v.setArguments(arguments);
        this.getFragmentManager().beginTransaction().replace(2131427936, (Fragment)this.v).commit();
    }
    
    @Override
    public final boolean onOptionsItemSelected(final MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            if ((this.getIntent().getFlags() & 0x2000000) != 0x0) {
                this.setResult(-1);
            }
            this.finish();
        }
        return true;
    }
    
    @Override
    public final void onRequestPermissionsResult(int c, final String[] array, final int[] array2) {
        super.onRequestPermissionsResult(c, array, array2);
        if (c == 1 && array2[0] != 0) {
            final eri v = this.v;
            c = eri.c;
            v.a();
        }
    }
}
