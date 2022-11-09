// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.camera.legacy.app.activity.main;

import java.lang.reflect.Method;
import android.view.WindowManager$LayoutParams;
import android.view.Window;
import com.google.android.apps.camera.stats.Instrumentation;
import java.lang.reflect.InvocationTargetException;
import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.content.Intent;
import com.google.android.apps.camera.stats.timing.TimingSession;
import com.google.android.apps.camera.legacy.app.app.CameraApp;
import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.apps.camera.stats.timing.CameraActivityTiming;

public class CameraActivity extends ejm implements egq, bmp
{
    private static final nsd u;
    public cxl o;
    public bty p;
    public dej q;
    public hvs r;
    private ejt v;
    private ejw w;
    private CameraActivityTiming x;
    private boolean y;
    
    static {
        final mkk a = mkk.a;
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        if (mrm.f() && a.c > 0L && elapsedRealtime <= SystemClock.elapsedRealtime() && (a.m.b == null || elapsedRealtime <= a.m.b) && a.f == 0L) {
            a.f = elapsedRealtime;
            a.l.f = true;
        }
        u = nsd.g("com/google/android/apps/camera/legacy/app/activity/main/CameraActivity");
    }
    
    @Override
    public final cxl a() {
        return this.o;
    }
    
    @Override
    public final egr b(final Class clazz) {
        return clazz.cast(this.v);
    }
    
    @Override
    protected void onCreate(final Bundle bundle) {
        this.o().f("CameraActivity#onCreate");
        final long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        this.y = false;
        super.onCreate(bundle);
        final emf emf = (emf)((CameraApp)this.getApplicationContext()).d();
        super.k = (kse)emf.o.get();
        super.n = (bqz)emf.t.get();
        super.l = ewv.b(emf.c);
        super.m = (cxl)emf.j.get();
        this.r = (hvs)emf.w.get();
        this.o = (cxl)emf.j.get();
        this.p = (bty)emf.y.get();
        this.q = new dej((kue)emf.E.get(), dzg.b());
        final hvs r = this.r;
        final hvn a = r.a;
        final Instrumentation d = r.d;
        final lmm b = r.b;
        final kse c = r.c;
        final hvp hvp = new hvp(a.a++, a.b);
        long l;
        if (hvp.a()) {
            l = hwn.e().l;
        }
        else {
            l = elapsedRealtimeNanos;
        }
        final CameraActivityTiming x = new CameraActivityTiming(l, b, hvp, c);
        d.f(x);
        (this.x = x).recordActivityOnCreateStart(elapsedRealtimeNanos);
        final dej q = this.q;
        final String string = this.toString();
        kjm.a();
        if (q.d == null) {
            final kue a2 = q.a;
            final String value = String.valueOf(string);
            String concat;
            if (value.length() != 0) {
                concat = "CameraActivity onCreate: ".concat(value);
            }
            else {
                concat = new String("CameraActivity onCreate: ");
            }
            q.d = a2.b(concat);
        }
        q.b.postDelayed((Runnable)new dei(q), 3000L);
        final cxl o = this.o;
        final cxo a3 = cxr.a;
        o.b();
        final CameraActivityTiming x2 = this.x;
        this.o().f("setupDefaultActivity#init");
        final ejn n = this.n();
        final efs m = this.m();
        final hus hus = new hus(x2);
        n.getClass();
        m.getClass();
        n.getClass();
        m.getClass();
        this.v = new elr(emf.e, n, m, hus);
        this.o().h("activityInitializer#get");
        final eju eju = (eju)((elr)this.v).P.get();
        this.o().h("activityInitializer#start");
        eju.aP();
        if (this.isVoiceInteractionRoot()) {
            final Intent intent = new Intent(this.getIntent());
            final elr elr = (elr)this.v;
            final boolean t = elr.b.t();
            final boolean r2 = elr.b.r();
            final boolean s = elr.b.s();
            final iov iov = (iov)elr.S.get();
            final pii u = elr.U;
            final isa a4 = hzw.a((cxl)elr.b.j.get());
            final Activity a5 = elr.a.a;
            final eyt eyt = (eyt)elr.b.N.get();
            final egb egb = (egb)elr.b.bX.get();
            final lae lae = (lae)elr.b.bu.get();
            final hkd hkd = (hkd)elr.b.as.get();
            final njp f = nov.F(new egs(t, r2, s, a4, a5));
            final niz a6 = egt.a(egt.c(intent, a5, f, lae), intent, iov, u, a4, a5, eyt, egb, f, hkd, lae);
            egt.b(intent, a6.g() ^ true, a5, hkd);
            a5.setIntent(intent);
            if (a6.g() && egt.d((jbm)a6.c(), iov, u, a4, a5, eyt, egb)) {
                a.l(CameraActivity.u.c(), "Warning: have Launched outside activity and coming soon finish activity.", '\u04f0');
                this.y = true;
            }
        }
        this.o().h("#cameraUiModule#inflate");
        final elr elr2 = (elr)this.v;
        final kf a7 = efv.a(elr2.a);
        final jdx jdx = new jdx(elr2.a.a);
        final liz liz = (liz)elr2.b.f.get();
        final Window b2 = efw.b(elr2.a);
        a7.getLayoutInflater();
        kjm.a();
        final WindowManager$LayoutParams attributes = b2.getAttributes();
        attributes.rotationAnimation = 3;
        if (liz.b) {
            attributes.layoutInDisplayCutoutMode = 0;
        }
        else {
            attributes.layoutInDisplayCutoutMode = 1;
        }
        b2.setAttributes(attributes);
        b2.requestFeature(8);
        b2.addFlags(Integer.MIN_VALUE);
        b2.setBackgroundDrawable((Drawable)null);
        b2.getDecorView().setPadding(0, 0, 0, 0);
        b2.getDecorView().setSystemUiVisibility(1797);
        b2.setNavigationBarContrastEnforced(false);
        jdx.a.setContentView(2131623968);
        final ixz ixz = new ixz(new ixx(jea.b(jdx)));
        this.o().h("activityUiInitializer#get");
        final elr elr3 = (elr)this.v;
        final elq w = new elq(elr3.b, elr3.c, ixz);
        this.w = w;
        final ejz ejz = (ejz)w.I.get();
        this.o().h("#activityUiInitializer#start");
        ejz.aP();
        this.o().g();
        if (!this.p() && !this.isVoiceInteractionRoot()) {
            bmx.f(this.getIntent());
        }
        this.o().f("CameraActivity#disablePreviewScreenshots");
        Label_1258: {
            try {
                final Method method = Activity.class.getMethod("setDisablePreviewScreenshots", Boolean.TYPE);
                method.setAccessible(true);
                method.invoke(this, true);
                break Label_1258;
            }
            catch (final IllegalAccessException ex) {}
            catch (final NoSuchMethodException ex2) {}
            catch (final InvocationTargetException ex3) {}
            a.l(CameraActivity.u.c(), "Could not find method: setDisablePreviewScreenshots", '\u04ee');
        }
        this.o().g();
        this.x.j(hvu.b, CameraActivityTiming.b);
        this.o().g();
    }
    
    @Override
    protected final void onDestroy() {
        final dej q = this.q;
        kjm.a();
        q.a();
        super.onDestroy();
    }
    
    @Override
    protected final void onResume() {
        this.x.j(hvu.h, CameraActivityTiming.a);
        super.onResume();
        this.x.j(hvu.i, CameraActivityTiming.b);
        eym.a(this.o);
        if (this.y) {
            this.finish();
        }
    }
    
    @Override
    protected final void onStart() {
        final CameraActivityTiming x = this.x;
        final long a = x.k.a();
        final hvp d = x.d;
        ++d.a;
        int b;
        if ((b = d.b()) == 3) {
            x.a();
            x.f = x.e.a("FirstPreviewFrame");
            x.g = x.e.a("ShutterButtonEnabled");
            for (final hvu hvu : hvu.values()) {
                if (hvu.r) {
                    x.k(hvu, a, CameraActivityTiming.j);
                }
            }
            b = 3;
        }
        if (b != 1) {
            final hzu n = x.n;
            String s = null;
            switch (b) {
                default: {
                    s = "NONE";
                    break;
                }
                case 3: {
                    s = "HOT";
                    break;
                }
                case 2: {
                    s = "WARM";
                    break;
                }
            }
            s.length();
        }
        x.k(hvu.g, a, CameraActivityTiming.a);
        final krc b2 = this.p.b();
        final dej q = this.q;
        final String string = this.toString();
        kjm.a();
        if (q.c == null) {
            final kue a2 = q.a;
            final String value = String.valueOf(string);
            String concat;
            if (value.length() != 0) {
                concat = "CameraActivity onStart: ".concat(value);
            }
            else {
                concat = new String("CameraActivity onStart: ");
            }
            q.c = a2.b(concat);
        }
        q.a();
        super.onStart();
        b2.close();
    }
    
    @Override
    protected final void onStop() {
        super.onStop();
        final dej q = this.q;
        kjm.a();
        final krc c = q.c;
        if (c != null) {
            c.close();
            q.c = null;
        }
        q.a();
    }
    
    protected boolean p() {
        return false;
    }
}
