import android.widget.SearchView$OnQueryTextListener;
import java.util.Iterator;
import android.widget.SearchView;
import java.util.Comparator;
import java.util.Collections;
import android.preference.PreferenceCategory;
import android.preference.Preference$OnPreferenceChangeListener;
import android.preference.EditTextPreference;
import android.preference.Preference$OnPreferenceClickListener;
import android.preference.Preference;
import android.preference.PreferenceManager;
import java.util.ArrayList;
import java.util.List;
import android.preference.PreferenceScreen;
import android.content.SharedPreferences;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dds
{
    public final Context a;
    public final SharedPreferences b;
    public PreferenceScreen c;
    public final List d;
    private final boolean e;
    
    public dds(final Context context, final cxl cxl) {
        this.d = new ArrayList();
        final lv a = new lv(context, 2132017876);
        this.a = (Context)a;
        this.b = PreferenceManager.getDefaultSharedPreferences((Context)a);
        this.e = cxl.k(cxr.at);
    }
    
    public final void a(final PreferenceScreen c) {
        this.c = c;
        final Preference preference = new Preference(this.a);
        preference.setTitle((CharSequence)"Reset to default values");
        preference.setOnPreferenceClickListener((Preference$OnPreferenceClickListener)new ddp(this));
        this.c.addPreference(preference);
        final Preference preference2 = new Preference(this.a);
        preference2.setTitle((CharSequence)"Primes Log");
        preference2.setOnPreferenceClickListener((Preference$OnPreferenceClickListener)new ddp(this, 1));
        this.c.addPreference(preference2);
        final String string = this.b.getString("dev_setting_filter_key", "");
        final ddv ddv = new ddv(this.c.getContext());
        ddv.c = string;
        final SearchView a = ddv.a;
        if (a != null) {
            a.setQuery((CharSequence)string, true);
        }
        ddv.b = (SearchView$OnQueryTextListener)new ddq(this);
        this.c.addPreference((Preference)ddv);
        this.d.clear();
        final EditTextPreference editTextPreference = new EditTextPreference(this.c.getContext());
        editTextPreference.setTitle((CharSequence)"camera.onscreen_logcat_filter");
        editTextPreference.setLayoutResource(2131624119);
        this.d.add(new ddr((Preference)editTextPreference));
        String string2 = "Gca";
        if (this.b.contains("camera.onscreen_logcat_filter")) {
            string2 = this.b.getString("camera.onscreen_logcat_filter", "Gca");
        }
        editTextPreference.setText(string2);
        editTextPreference.setSummary((CharSequence)string2);
        editTextPreference.setOnPreferenceChangeListener((Preference$OnPreferenceChangeListener)new ddo(this));
        final PreferenceCategory preferenceCategory = new PreferenceCategory(this.a);
        int layoutResource;
        if (!this.e) {
            layoutResource = 2131624098;
        }
        else {
            layoutResource = 2131624097;
        }
        preferenceCategory.setLayoutResource(layoutResource);
        c.addPreference((Preference)preferenceCategory);
        Collections.sort((List<Object>)this.d, bzj.c);
        final String[] split = this.b.getString("dev_setting_filter_key", "").split("(,|\\s)+", -1);
        for (final ddr ddr : this.d) {
            for (int length = split.length, i = 0; i < length; ++i) {
                if (ddr.a.contains(split[i])) {
                    preferenceCategory.addPreference(ddr.b);
                    break;
                }
            }
        }
        final Preference preference3 = this.c.findPreference((CharSequence)cxr.aq.a);
        final Preference preference4 = this.c.findPreference((CharSequence)cxr.ap.a);
        if (preference4 != null && preference3 != null) {
            preference4.setDependency(cxr.aq.a);
        }
        final Preference preference5 = this.c.findPreference((CharSequence)"camera.onscreen_logcat_filter");
        if (preference5 != null && preference4 != null) {
            preference5.setDependency(cxr.ap.a);
        }
    }
    
    public final void b(final String s) {
        this.b.edit().putString("dev_setting_filter_key", s).apply();
        this.c.removeAll();
        this.a(this.c);
    }
}
