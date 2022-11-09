import android.content.SharedPreferences$Editor;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

final class jmr implements Runnable
{
    final /* synthetic */ jmt a;
    
    public jmr(final jmt a) {
        this.a = a;
    }
    
    @Override
    public final void run() {
        final jmt a = this.a;
        a.z();
        jlw.a();
        final Context a2 = a.b.a;
        if (!jnp.a(a2)) {
            a.t("AnalyticsReceiver is not registered or is disabled. Register the receiver for reliable dispatching on non-Google Play devices. See http://goo.gl/8Rd3yj for instructions.");
        }
        else if (!jnu.d(a2)) {
            a.n("AnalyticsService is not registered or is disabled. Analytics service at risk of not starting. See http://goo.gl/8Rd3yj for instructions.");
        }
        jvu.a(a2);
        boolean b;
        if (jln.a != null) {
            b = jln.a;
        }
        else {
            b = lfe.i(a2, "com.google.android.gms.analytics.CampaignTrackingReceiver", true);
            jln.a = b;
        }
        if (!b) {
            a.t("CampaignTrackingReceiver is not registered, not exported or is disabled. Installation campaign tracking is not possible. See http://goo.gl/8Rd3yj for instructions.");
        }
        final jno j = a.j();
        jlw.a();
        j.z();
        if (j.c == 0L) {
            final long long1 = j.a.getLong("first_run", 0L);
            if (long1 != 0L) {
                j.c = long1;
            }
            else {
                j.y();
                final long currentTimeMillis = System.currentTimeMillis();
                final SharedPreferences$Editor edit = j.a.edit();
                edit.putLong("first_run", currentTimeMillis);
                if (!edit.commit()) {
                    j.t("Failed to commit first run time");
                }
                j.c = currentTimeMillis;
            }
        }
        if (!a.G("android.permission.ACCESS_NETWORK_STATE")) {
            a.n("Missing required android.permission.ACCESS_NETWORK_STATE. Google Analytics disabled. See http://goo.gl/8Rd3yj for instructions");
            a.E();
        }
        if (!a.G("android.permission.INTERNET")) {
            a.n("Missing required android.permission.INTERNET. Google Analytics disabled. See http://goo.gl/8Rd3yj for instructions");
            a.E();
        }
        if (jnu.d(a.d())) {
            a.q("AnalyticsService registered in the app manifest and enabled");
        }
        else {
            a.t("AnalyticsService not registered in the app manifest. Hits might not be delivered reliably. See http://goo.gl/8Rd3yj for instructions.");
        }
        if (!a.f && !a.c.H()) {
            a.C();
        }
        a.F();
    }
}
