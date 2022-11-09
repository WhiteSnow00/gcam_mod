// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.camera.legacy.app.app;

import android.content.ContentResolver;
import android.app.Application$ActivityLifecycleCallbacks;
import android.content.Context;
import java.util.logging.Handler;
import java.util.concurrent.Executor;
import android.app.Application;
import android.os.Trace;
import java.util.Locale;
import android.os.SystemClock;
import android.app.NotificationManager;
import com.google.android.apps.camera.contentprovider.HasCameraContentProviderComponent;

public class CameraApp extends exs implements HasCameraContentProviderComponent, emg, hzp, egp, aik, brp
{
    ddj a;
    NotificationManager b;
    brn c;
    pii d;
    pii e;
    mdz f;
    ajk g;
    public volatile eaa h;
    brk i;
    private volatile ela l;
    private volatile elc m;
    
    static {
        final mkk a = mkk.a;
        if (a.c == 0L) {
            a.c = SystemClock.elapsedRealtime();
            a.l.a = true;
        }
        hwn.d(CameraApp.j);
        final nns a2 = ehh.a;
        final Object a3 = krk.a;
        monitorenter(a3);
        try {
            final nrw t = a2.t();
            while (t.hasNext()) {
                final Class clazz = t.next();
                final String s = krk.c.put(clazz, "gcastartup");
                if (s != null && !s.equals("gcastartup")) {
                    final String value = String.valueOf(clazz);
                    final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 56 + s.length());
                    sb.append("Could not register ");
                    sb.append(value);
                    sb.append(". It was previously registered with: ");
                    sb.append(s);
                    throw new UnsatisfiedLinkError(sb.toString());
                }
                final krj krj = krk.b.get("gcastartup");
                if (krj == null) {
                    krk.b.put("gcastartup", new krj("gcastartup"));
                }
                else {
                    if (!krj.a()) {
                        continue;
                    }
                    throw new UnsatisfiedLinkError(String.format(null, "Registering \"%s\" after \"%s\" was loaded is racy.", clazz.getSimpleName(), "gcastartup"));
                }
            }
            monitorexit(a3);
        }
        finally {
            monitorexit(a3);
            while (true) {}
        }
    }
    
    @Override
    public final ail a() {
        final aij aij = new aij();
        aij.a = this.g;
        return new ail(aij);
    }
    
    @Override
    public final bro b() {
        final elc m = this.m;
        if (!m.c.getAndSet(true)) {
            elc.a.execute(aas.i);
            elc.a.execute(new elb(m, 1));
            elc.a.execute(new elb(m));
            elc.a.execute(new elb(m, 2));
            elc.a.execute(aas.h);
        }
        return this.d().b();
    }
    
    @Override
    public final egr c(final Class clazz) {
        return clazz.cast(this.d());
    }
    
    @Override
    public final cyz cameraContentProviderComponent(final cze cze) {
        nov.E(this.l, "initAppComponent needs to be called on main thread¬", new Object[0]);
        final ela l = this.l;
        cze.getClass();
        return new els(((emf)l).e, cze);
    }
    
    @Override
    public final ela d() {
        if (this.l == null) {
            synchronized (this) {
                if (this.l == null) {
                    Trace.beginSection("GCA_App#component");
                    Trace.beginSection("GCA_App#buildComponent");
                    final elf k = emf.k();
                    k.c = new egc(this, this.getApplicationContext());
                    k.d = new ewu(super.k);
                    k.f = new eab(new ekz(this));
                    if (k.i == null) {
                        k.i = new ccr();
                    }
                    if (k.a == null) {
                        k.a = new cyw();
                    }
                    if (k.j == null) {
                        k.j = new dkf();
                    }
                    if (k.b == null) {
                        k.b = new guw();
                    }
                    pqf.j(k.c, egc.class);
                    pqf.j(k.d, ewu.class);
                    if (k.k == null) {
                        k.k = new fzo();
                    }
                    if (k.l == null) {
                        k.l = new dij();
                    }
                    if (k.e == null) {
                        k.e = new bsy();
                    }
                    pqf.j(k.f, eab.class);
                    if (k.o == null) {
                        k.o = new igu();
                    }
                    if (k.m == null) {
                        k.m = new grd();
                    }
                    if (k.g == null) {
                        k.g = new hzm();
                    }
                    if (k.p == null) {
                        k.p = new jxc();
                    }
                    if (k.n == null) {
                        k.n = new lpy();
                    }
                    if (k.h == null) {
                        k.h = new dzc();
                    }
                    this.l = new emf(k.a, k.j, k.b, k.c, k.d, k.k, k.l, k.e, k.f, k.o, k.g, k.p, k.h, null, null, null);
                    Trace.endSection();
                    Trace.beginSection("GCA_App#initialize");
                    final ela l = this.l;
                    Trace.beginSection("GCA_App#inject");
                    final cxl cxl = (cxl)((emf)l).j.get();
                    final dkc dkc = (dkc)((emf)l).z.get();
                    final krq b = dak.b(krp.b(niz.i(((emf)l).C.get())));
                    final kjm kjm = (kjm)((emf)l).B.get();
                    final Executor executor = (Executor)((emf)l).I.get();
                    this.a = new ddj(cxl, b);
                    this.b = ((emf)l).j();
                    this.c = new brn((cxl)((emf)l).j.get(), ((emf)l).O, ((emf)l).P, ((emf)l).Q, ((emf)l).R);
                    this.d = ((emf)l).S;
                    this.e = ((emf)l).N;
                    this.f = (mdz)((emf)l).T.get();
                    this.g = (ajk)((emf)l).U.get();
                    this.i = (brk)((emf)l).A.get();
                    Trace.endSection();
                    Trace.beginSection("GCA_App#PrimesMemoryMonitor");
                    this.f.b.b();
                    Trace.endSection();
                    Trace.beginSection("GCA_App#strictMode");
                    final cxl a = this.a.a;
                    final cxo a2 = cxr.a;
                    a.c();
                    Trace.endSection();
                    Trace.beginSection("GCA_App#startAsync");
                    final brn c = this.c;
                    Trace.beginSection("appStartup.start");
                    final nns o = nns.o(c.d, c.b, c.e);
                    for (int c2 = ((nql)o).c, i = 0; i < c2; ++i) {
                        ((hub)((pii)o.get(i)).get()).run();
                    }
                    c.a.b();
                    ((glf)c.c.get()).run();
                    Trace.endSection();
                    Trace.endSection();
                    Trace.beginSection("GCA_App#cancelNotifications");
                    this.b.cancelAll();
                    Trace.endSection();
                    Trace.beginSection("GCA_App#setDefaultUncaughtExceptionHandler");
                    this.i.a(new brb(this.getApplicationContext()));
                    this.i.a(new brm(this.e, this.d));
                    Thread.setDefaultUncaughtExceptionHandler((Thread.UncaughtExceptionHandler)new brf(this.i, Thread.getDefaultUncaughtExceptionHandler()));
                    this.f.b.a();
                    kro.b.addHandler(kru.a);
                    kro.a.addHandler(kru.a);
                    kro.c.addHandler(kru.a);
                    kro.d.addHandler(kru.a);
                    Trace.endSection();
                    Trace.endSection();
                    Trace.endSection();
                }
            }
        }
        return this.l;
    }
    
    @Override
    public final eme e(final nrr nrr) {
        return this.d().e(nrr);
    }
    
    @Override
    public final void initAppComponent() {
        kjm.a();
        this.d();
    }
    
    @Override
    public final void onCreate() {
        Trace.beginSection("GCA_App#onCreate");
        Object o = jyu.a;
        synchronized (o) {
            final boolean b = jyu.b;
            monitorexit(o);
            if (!b) {
                o = jyv.a;
                monitorenter(o);
                try {
                    jyv.b = true;
                    monitorexit(o);
                    o = hwn.e();
                    ((hwh)o).i(hvv.a);
                    Trace.beginSection("#floggerConfig");
                    if (cyn.d.a(cyn.c)) {
                        final nup a = nup.a();
                        final nuy nuy = new nuy();
                        final nuy nuy2 = new nuy("CAM_", nuy.b, nuy.c, nuy.d);
                        final nuy nuy3 = new nuy(nuy2.a, nuy2.b, nuy2.c, true);
                        a.a = new nuy(nuy3.a, false, nuy3.c, nuy3.d);
                        nuq.a(a);
                    }
                    else {
                        final nup a2 = nup.a();
                        a2.a = new nun(new nun("CAM_", new nun().b).a, false);
                        nuq.a(a2);
                    }
                    Trace.endSection();
                    final ContentResolver contentResolver = this.getContentResolver();
                    contentResolver.getClass();
                    dam.a = kir.a(contentResolver, "camera:logging_override_level", 0);
                    Trace.beginSection("PhenotypeHelper#init");
                    glc.b((Context)this);
                    Trace.endSection();
                    this.registerActivityLifecycleCallbacks((Application$ActivityLifecycleCallbacks)new brq(new eky(this)));
                    super.onCreate();
                    if (this.getPackageManager().hasSystemFeature("com.google.android.feature.PIXEL_2018_EXPERIENCE")) {
                        final mkk a3 = mkk.a;
                        if (mrm.f() && a3.c > 0L && a3.d == 0L) {
                            a3.d = SystemClock.elapsedRealtime();
                            a3.l.b = true;
                            mrm.e(new mkb(a3));
                            this.registerActivityLifecycleCallbacks((Application$ActivityLifecycleCallbacks)new mki(a3, this));
                            new mka(a3);
                        }
                        this.h = new eaa((Context)this);
                        this.m = new elc((Context)this);
                        ((hwh)o).i(hvv.b);
                        Trace.endSection();
                        return;
                    }
                    throw new IllegalStateException("Cannot start the Google Camera on an unsupported device");
                }
                finally {}
            }
        }
    }
}
