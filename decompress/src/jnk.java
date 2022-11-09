import android.content.ComponentName;
import android.content.Intent;
import android.net.NetworkInfo;
import android.net.ConnectivityManager;
import android.content.Context;
import android.content.BroadcastReceiver;

// 
// Decompiled by Procyon v0.6.0
// 

final class jnk extends BroadcastReceiver
{
    static final String a;
    public final jmf b;
    public boolean c;
    public boolean d;
    
    static {
        a = jnk.class.getName();
    }
    
    public jnk(final jmf b) {
        this.b = b;
    }
    
    private final jma e() {
        return this.b.b();
    }
    
    private final jnj f() {
        return this.b.d();
    }
    
    public final Context a() {
        return this.b.a;
    }
    
    public final void b() {
        this.f();
        this.e();
    }
    
    public final void c() {
        if (!this.c) {
            return;
        }
        this.b.d().q("Unregistering connectivity change receiver");
        this.c = false;
        this.d = false;
        final Context a = this.a();
        try {
            a.unregisterReceiver((BroadcastReceiver)this);
        }
        catch (final IllegalArgumentException ex) {
            this.f().o("Failed to unregister the network broadcast receiver", ex);
        }
    }
    
    protected final boolean d() {
        final ConnectivityManager connectivityManager = (ConnectivityManager)this.a().getSystemService("connectivity");
        try {
            final NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            return activeNetworkInfo != null && activeNetworkInfo.isConnected();
        }
        catch (final SecurityException ex) {
            return false;
        }
    }
    
    public final void onReceive(Context d, Intent intent) {
        this.b();
        final String action = intent.getAction();
        this.b.d().r("NetworkBroadcastReceiver received action", action);
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            final boolean d2 = this.d();
            if (this.d != d2) {
                this.d = d2;
                final jma e = this.e();
                e.r("Network connectivity status changed", d2);
                e.e().b(new jly(e));
            }
            return;
        }
        if ("com.google.analytics.RADIO_POWERED".equals(action)) {
            if (!intent.hasExtra(jnk.a)) {
                final jma e2 = this.e();
                e2.q("Radio powered up");
                e2.z();
                d = e2.d();
                if (jnp.a(d) && jnu.d(d)) {
                    intent = new Intent("com.google.android.gms.analytics.ANALYTICS_DISPATCH");
                    intent.setComponent(new ComponentName(d, "com.google.android.gms.analytics.AnalyticsService"));
                    d.startService(intent);
                    return;
                }
                e2.b(null);
            }
            return;
        }
        this.b.d().u("NetworkBroadcastReceiver received unknown action", action);
    }
}
