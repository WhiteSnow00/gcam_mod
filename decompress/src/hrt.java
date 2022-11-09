import com.google.android.apps.camera.ui.preference.ManagedSwitchPreference;
import android.widget.Toast;
import android.preference.Preference;
import android.preference.Preference$OnPreferenceChangeListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hrt implements Preference$OnPreferenceChangeListener
{
    final /* synthetic */ hru a;
    
    public hrt(final hru a) {
        this.a = a;
    }
    
    public final boolean onPreferenceChange(final Preference preference, final Object o) {
        final int a = this.a.a();
        final hkd d = this.a.d;
        final hki b = hjq.B;
        boolean b2 = true;
        d.d(b, true);
        if (this.a.c.c(hjq.x)) {
            final Boolean b3 = (Boolean)o;
            if (b3 && a > 3) {
                final hru a2 = this.a;
                final Toast n = a2.n;
                if (n != null) {
                    n.cancel();
                }
                (a2.n = Toast.makeText(a2.a, (CharSequence)jwn.ae(2131820551, 3, 3).a(a2.a.getResources()), 0)).show();
                this.a.f((ManagedSwitchPreference)preference, false);
                b2 = false;
            }
            else if (!b3 && a <= 0) {
                this.a.g(false);
            }
        }
        else {
            this.a.g(true);
        }
        if (b2) {
            preference.getKey();
            this.a.b.m(preference.getKey());
            this.a.h();
            this.a.f.o(preference.getKey(), this.a.b.m(preference.getKey()), o);
        }
        return b2;
    }
}
