import android.os.health.HealthStats;
import java.util.List;
import java.util.Collections;
import j$.util.Objects;
import java.io.IOException;
import android.os.health.SystemHealthManager;
import android.util.Base64;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.app.Activity;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mgc extends mga implements mfe, mfm, mfl, mgx
{
    private static final nsd b;
    final AtomicBoolean a;
    private final Context c;
    private final mfp d;
    private final ofb e;
    private final mgl f;
    private final mfv g;
    private final mgu h;
    private final AtomicBoolean i;
    
    static {
        b = nsd.g("com/google/android/libraries/performance/primes/metrics/battery/BatteryMetricServiceImpl");
    }
    
    public mgc(final mgv mgv, final Context c, final mfp d, final ofb e, final oui oui, final mgl f, final mfv g, final pii pii, final Executor executor) {
        this.a = new AtomicBoolean();
        new ConcurrentHashMap();
        this.i = new AtomicBoolean(false);
        this.h = mgv.a(executor, oui, pii);
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    private final oey l(final pqz pqz) {
        return ofi.r(new mgb(this, pqz), this.e);
    }
    
    @Override
    public void a(final Activity activity, final Bundle bundle) {
        if (!this.i.getAndSet(true)) {
            this.b(null);
        }
    }
    
    @Override
    public void b(final Activity activity) {
        if (!this.a.get()) {
            this.j();
        }
    }
    
    @Override
    public void c(final Activity activity) {
        this.i();
    }
    
    public oey i() {
        if (!loq.c(this.c)) {
            return oev.a;
        }
        try {
            njo.o(this.a.getAndSet(false));
            return this.l(pqz.b);
        }
        catch (final Exception ex) {
            return ofi.m(ex);
        }
    }
    
    public oey j() {
        if (!loq.c(this.c)) {
            return oev.a;
        }
        if (this.a.getAndSet(true)) {
            a.l(mgc.b.c(), "App is already in the foreground.", '\u0c0f');
            return ofi.l();
        }
        return this.l(pqz.c);
    }
    
    @Override
    public void k() {
        this.d.a(this);
    }
}
