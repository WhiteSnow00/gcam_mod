// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.analytics;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import android.os.SystemClock;
import android.content.ComponentName;
import android.content.Intent;
import android.content.Context;
import android.content.BroadcastReceiver;

public final class AnalyticsReceiver extends BroadcastReceiver
{
    private jnp a;
    
    public final void onReceive(final Context context, Intent intent) {
        if (this.a == null) {
            this.a = new jnp();
        }
        final jmf c = jmf.c(context);
        final jnj d = c.d();
        if (intent == null) {
            d.t("AnalyticsReceiver called with null intent");
            return;
        }
        final String action = intent.getAction();
        final jmv c2 = c.c;
        d.r("Local AnalyticsReceiver got", action);
        if ("com.google.android.gms.analytics.ANALYTICS_DISPATCH".equals(action)) {
            final boolean d2 = jnu.d(context);
            intent = new Intent("com.google.android.gms.analytics.ANALYTICS_DISPATCH");
            intent.setComponent(new ComponentName(context, "com.google.android.gms.analytics.AnalyticsService"));
            intent.setAction("com.google.android.gms.analytics.ANALYTICS_DISPATCH");
            synchronized (jnp.a) {
                context.startService(intent);
                if (!d2) {
                    return;
                }
                try {
                    if (jnp.b == null) {
                        jnp.b = new kdp(context);
                        final kdp b = jnp.b;
                        synchronized (b.b) {
                            b.g = false;
                        }
                    }
                    final kdp b2 = jnp.b;
                    b2.m.incrementAndGet();
                    final String k = b2.k;
                    final lwt p2 = kdp.p;
                    final long a = kdp.a;
                    long f = Long.MAX_VALUE;
                    final long min = Math.min(1000L, Math.max(Math.min(Long.MAX_VALUE, a), 1L));
                    synchronized (b2.b) {
                        if (!b2.b()) {
                            final lwt p3 = kdp.p;
                            final lwt p4 = kdp.p;
                            b2.i = kat.a;
                            b2.c.acquire();
                            final jwm o = b2.o;
                            SystemClock.elapsedRealtime();
                        }
                        ++b2.d;
                        ++b2.h;
                        b2.c();
                        kdo kdo;
                        if ((kdo = b2.l.get(null)) == null) {
                            kdo = new kdo();
                            b2.l.put(null, kdo);
                        }
                        final lwt p5 = kdp.p;
                        final String j = b2.j;
                        ++kdo.a;
                        final jwm o2 = b2.o;
                        final long elapsedRealtime = SystemClock.elapsedRealtime();
                        if (Long.MAX_VALUE - elapsedRealtime > min) {
                            f = elapsedRealtime + min;
                        }
                        if (f > b2.f) {
                            b2.f = f;
                            final Future e = b2.e;
                            if (e != null) {
                                e.cancel(false);
                            }
                            b2.e = b2.n.schedule(new kdn(b2), min, TimeUnit.MILLISECONDS);
                        }
                    }
                }
                catch (final SecurityException ex) {
                    d.t("Analytics service at risk of not starting. For more reliable analytics, add the WAKE_LOCK permission to your manifest. See http://goo.gl/8Rd3yj for instructions.");
                }
            }
        }
    }
}
