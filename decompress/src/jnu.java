import android.util.Log;
import android.content.Intent;
import android.content.pm.ServiceInfo;
import android.content.pm.PackageManager$NameNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jnu
{
    private static Boolean c;
    public final Handler a;
    public final Context b;
    
    public jnu(final Context b) {
        this.b = b;
        this.a = new kax();
    }
    
    public static boolean d(final Context context) {
        jvu.a(context);
        final Boolean c = jnu.c;
        if (c != null) {
            return c;
        }
        boolean b = false;
        try {
            final ServiceInfo serviceInfo = context.getPackageManager().getServiceInfo(new ComponentName(context, "com.google.android.gms.analytics.AnalyticsService"), 0);
            if (serviceInfo != null && serviceInfo.enabled) {
                b = true;
            }
        }
        catch (final PackageManager$NameNotFoundException ex) {}
        jnu.c = b;
        return b;
    }
    
    public final void a() {
        final jmf c = jmf.c(this.b);
        final jnj d = c.d();
        final jmv c2 = c.c;
        d.q("Local AnalyticsService is starting up");
    }
    
    public final void b() {
        final jmf c = jmf.c(this.b);
        final jnj d = c.d();
        final jmv c2 = c.c;
        d.q("Local AnalyticsService is shutting down");
    }
    
    public final void c(final Runnable runnable) {
        jmf.c(this.b).b().b(new jns(this, runnable));
    }
    
    public final void e(final Intent intent, final int n) {
        try {
            synchronized (jnp.a) {
                final kdp b = jnp.b;
                if (b != null && b.b()) {
                    if (b.m.decrementAndGet() < 0) {
                        Log.e("WakeLock", b.j.concat(" release without a matched acquire!"));
                    }
                    synchronized (b.b) {
                        b.c();
                        if (b.l.containsKey(null)) {
                            final kdo kdo = b.l.get(null);
                            if (kdo != null && --kdo.a == 0) {
                                b.l.remove(null);
                            }
                        }
                        else {
                            Log.w("WakeLock", b.j.concat(" counter does not exist"));
                        }
                        b.d();
                    }
                }
            }
        }
        catch (final SecurityException ex) {}
        final jmf c = jmf.c(this.b);
        final jnj d = c.d();
        if (intent == null) {
            d.t("AnalyticsService started with null intent");
            return;
        }
        final String action = intent.getAction();
        final jmv c2 = c.c;
        d.s("Local AnalyticsService called. startId, action", n, action);
        if ("com.google.android.gms.analytics.ANALYTICS_DISPATCH".equals(action)) {
            this.c(new jnq(this, n, d));
        }
    }
}
