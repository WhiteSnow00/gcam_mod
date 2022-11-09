import android.content.pm.ShortcutManager;
import android.content.res.Configuration;
import com.google.android.apps.camera.bottombar.RoundedThumbnailView;
import android.provider.MediaStore$Video$Media;
import android.provider.MediaStore$Images$Media;
import com.google.android.apps.camera.legacy.app.settings.CameraSettingsActivity;
import com.google.android.apps.camera.debugui.DebugCanvasView;
import android.database.ContentObserver;
import com.google.android.apps.camera.ui.wirers.PreviewOverlay;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import android.content.Intent;
import android.content.res.Resources;
import com.google.android.apps.camera.stats.timing.CameraActivityTiming;
import android.os.Handler;
import com.google.android.apps.camera.bottombar.BottomBarController;
import android.view.Window;
import java.util.concurrent.Executor;
import android.content.Context;
import android.content.ContentResolver;
import com.google.android.apps.camera.ui.views.ViewfinderCover;
import java.io.Serializable;
import android.os.Parcelable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ekw implements bqm, exn, exb, exe, exl, exj, exh, exm, evw, ewb, evx, ewi, iqe, iqf
{
    public static final nsd a;
    public Parcelable A;
    public Serializable B;
    public boolean C;
    public boolean D;
    public boolean E;
    public krc F;
    public final att G;
    public final iqg H;
    public final klv I;
    public final klv J;
    public final klv K;
    public final klv L;
    public final pii M;
    public final oui N;
    public final jjb O;
    public final ViewfinderCover P;
    public final oui Q;
    public final ofn R;
    public final niz S;
    public final boolean T;
    public final bmz U;
    private final ega V;
    private final bnv W;
    private final hkw X;
    private final oey Y;
    private final ioe Z;
    private final hlb aA;
    private boolean aB;
    private boolean aC;
    private boolean aD;
    private boolean aE;
    private boolean aF;
    private boolean aG;
    private final hhu aH;
    private final crg aI;
    private final iph aJ;
    private final klv aK;
    private final niz aL;
    private final eip aM;
    private final hrk aN;
    private final hhz aO;
    private final ats aP;
    private final bmq aQ;
    private final fnc aR;
    private final erp aS;
    private final jcd aT;
    private final eks aU;
    private final lfw aV;
    private final ContentResolver aa;
    private final Context ab;
    private final kjm ac;
    private final Executor ad;
    private final hwc ae;
    private final eya af;
    private final gkw ag;
    private final hjx ah;
    private final hkd ai;
    private final Window aj;
    private final ewy ak;
    private final hdo al;
    private final pii am;
    private final boolean an;
    private final cxl ao;
    private final oui ap;
    private czp aq;
    private czp ar;
    private niz as;
    private bqv at;
    private final ijj au;
    private final ijx av;
    private final jaq aw;
    private final eiq ax;
    private final klj ay;
    private final klv az;
    public final BottomBarController b;
    public final Context c;
    public final dfz d;
    public final Handler e;
    public final CameraActivityTiming f;
    public final ktc g;
    public final ixn h;
    public final Resources i;
    public final hkc j;
    public final kse k;
    public final pii l;
    public final ixx m;
    public bqo n;
    public bqw o;
    public final niz p;
    public final oui q;
    public hvz r;
    public final eyt s;
    public final gjj t;
    public boolean u;
    public jbm v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;
    
    static {
        a = nsd.g("com/google/android/apps/camera/legacy/app/app/CameraActivityControllerImpl");
    }
    
    public ekw(final Context c, final Context ab, final Resources i, final Window aj, final ContentResolver aa, final Handler e, final bmq aq, final ewy ak, final kf kf, final bmz u, final bnv w, final kjm ac, final Executor ad, final fnc ar, final boolean an, final gkw ag, final lfw av, final oey y, final ktc g, final eya af, final hjx ah, final hkc j, final hkd ai, final ioe z, final ixn h, final ixx m, final oui ap, final hkw x, final dfz d, final hdo al, final pii am, final ega v, final kse k, final hwc ae, final CameraActivityTiming f, final pii l, final ijj au, final ijx av2, final erp as, final jaq aw, final Intent intent, final BottomBarController b, final cxl ao, final eiq ax, final eyt s, final iqg h2, final gjj t, final klv i2, final klv k2, final klv j2, final klv l2, final pii m2, final hhu ah2, final oui n, final crg ai2, final jjb o, final iph aj2, final klj ay, final klv az, final niz p69, final oui q, final oui q2, final hlb aa2, final ofn r, final klv ak2, final jcd at, final niz s2, final boolean t2, final niz al2) {
        this.r = new hvz(new lmm(), new ksb());
        this.u = false;
        this.aB = false;
        this.w = false;
        this.x = false;
        final boolean b2 = true;
        this.aC = true;
        this.aD = false;
        this.aG = false;
        this.aM = new ekm(this);
        this.aN = new ekr(this);
        this.aU = new eks(this);
        this.aO = new eku(this);
        final ekv ap2 = new ekv(this);
        this.aP = ap2;
        this.c = c;
        this.ab = ab;
        this.i = i;
        this.aj = aj;
        this.b = b;
        this.aa = aa;
        ac.getClass();
        this.ac = ac;
        ad.getClass();
        this.ad = ad;
        this.e = e;
        e.getLooper().getClass();
        this.aQ = aq;
        ar.getClass();
        this.aR = ar;
        this.U = u;
        this.ak = ak;
        w.getClass();
        this.W = w;
        this.an = an;
        ag.getClass();
        this.ag = ag;
        av.getClass();
        this.aV = av;
        this.Y = y;
        g.getClass();
        this.g = g;
        af.getClass();
        this.af = af;
        ah.getClass();
        this.ah = ah;
        this.j = j;
        this.ai = ai;
        z.getClass();
        this.Z = z;
        h.getClass();
        this.h = h;
        x.getClass();
        this.X = x;
        d.getClass();
        this.d = d;
        this.m = m;
        this.ap = ap;
        au.getClass();
        this.au = au;
        av2.getClass();
        this.av = av2;
        as.getClass();
        this.aS = as;
        this.aw = aw;
        al.getClass();
        this.al = al;
        am.getClass();
        this.am = am;
        k.getClass();
        this.k = k;
        this.ae = ae;
        v.getClass();
        this.V = v;
        this.f = f;
        l.getClass();
        this.l = l;
        this.ao = ao;
        ax.getClass();
        this.ax = ax;
        this.s = s;
        this.H = h2;
        this.t = t;
        this.I = i2;
        this.K = k2;
        this.J = j2;
        this.L = l2;
        this.M = m2;
        this.N = n;
        this.aH = ah2;
        this.aI = ai2;
        this.O = o;
        this.aJ = aj2;
        this.P = m.e;
        this.ay = ay;
        this.az = az;
        this.p = p69;
        this.q = q;
        this.Q = q2;
        this.aA = aa2;
        this.R = r;
        this.aK = ak2;
        this.aT = at;
        this.S = s2;
        this.T = t2;
        this.aL = al2;
        final boolean u2 = bmx.u(aq);
        final boolean c2 = intent.getBooleanExtra("open_socialshare", false) && !an && !u2;
        this.C = c2;
        if (c2) {
            final Parcelable parcelableExtra = intent.getParcelableExtra("filmstrip_item_data");
            parcelableExtra.getClass();
            this.A = parcelableExtra;
            final Serializable serializableExtra = intent.getSerializableExtra("filmstrip_item_type");
            serializableExtra.getClass();
            this.B = serializableExtra;
        }
        this.D = (intent.getBooleanExtra("open_filmstrip", false) && !an && !u2);
        this.aE = (intent.getBooleanExtra("open_empty_vault", false) && !an && !u2 && b2);
        this.aF = intent.getBooleanExtra("open_mars", false);
        ak2.a(new eki(this), ac);
        new WeakReference(kf);
        this.G = new att(ap2, e);
        h2.i(this);
        h2.k(this);
    }
    
    private final int H() {
        if (this.x) {
            return 2;
        }
        return 0;
    }
    
    private final void I(final boolean b) {
        final bqi bqi = (bqi)knf.d(this.Y);
        if (bqi == null) {
            return;
        }
        synchronized (bqi) {
            final lfj e = bqi.e;
            if (e != null) {
                bqi.g(e.a());
            }
            monitorexit(bqi);
            bqi.m(b);
            bqi.d = null;
        }
    }
    
    private final void J(final jbm jbm, final Executor executor, final Executor executor2) {
        if (!this.aB && this.v == jbm) {
            return;
        }
        this.aB = false;
        final kse k = this.k;
        final String value = String.valueOf(jbm);
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 13);
        sb.append("doSelectMode ");
        sb.append(value);
        k.f(sb.toString());
        if (!this.f.d()) {
            this.f.c();
        }
        final hvz r = (hvz)this.ae.a();
        this.r = r;
        final String name = jbm.name();
        final hzu n = r.n;
        String.valueOf(name).length();
        final bqw o = this.o;
        o.bv();
        o.p();
        final bsa bsa = (bsa)this.n;
        final FrameLayout g = bsa.g;
        if (g != null) {
            g.removeAllViews();
        }
        bsa.k(true);
        bsa.o = null;
        final PreviewOverlay n2 = bsa.n;
        n2.a = null;
        n2.b = null;
        final ofn f = ofn.f();
        if (!this.R(this.v) && this.R(jbm)) {
            executor.execute(new ekc(this, jbm, f));
        }
        else {
            f.o(null);
        }
        ofi.w(f, new ekq(this, jbm), executor2);
        this.k.g();
    }
    
    private final void K(final int n, final Intent intent) {
        final bmq aq = this.aQ;
        intent.getClass();
        aq.a.setResult(n, intent);
        this.v("CameraActivityController: Intent completed with a valid result. Closing activity.");
    }
    
    private final void L() {
        this.k.f("resetSettingsOnModeChange");
        this.t.o();
        this.k.g();
    }
    
    private final void M() {
        this.k.f("resetStartupSettingsForAllModules");
        final crg ai = this.aI;
        ai.h(ai.a);
        this.az.aR(hjg.e);
        final cxl ao = this.ao;
        final cxo a = cwv.a;
        ao.e();
        final gjj t = this.t;
        t.ax = false;
        t.o();
        if (this.S.g()) {
            final bvb bvb = (bvb)this.S.c();
        }
        if (this.aL.g()) {
            ((hyo)this.aL.c()).c();
        }
        if (this.j.c(hjq.R)) {
            this.aJ.f(false);
            ((ihp)this.l.get()).g();
        }
        this.k.g();
    }
    
    private final void N(final jbm jbm) {
        final jbm a = jbm.a;
        switch (jbm.ordinal()) {
            default: {
                return;
            }
            case 17: {
                this.av.m();
                return;
            }
            case 15: {
                this.av.d();
                return;
            }
            case 13: {
                this.av.o();
                return;
            }
            case 12: {
                this.av.c();
                return;
            }
            case 11: {
                this.av.i();
                return;
            }
            case 6: {
                this.av.l();
                return;
            }
            case 5: {
                this.av.n();
                return;
            }
            case 4: {
                this.av.b();
                return;
            }
            case 3: {
                this.av.j();
                return;
            }
            case 2: {
                this.av.p();
                return;
            }
            case 1: {
                this.av.k();
            }
        }
    }
    
    private final void O(final int n) {
        if (n == 2) {
            ((bsa)this.n).c.setVisibility(4);
            return;
        }
        ((bsa)this.n).c.setVisibility(0);
    }
    
    private final boolean P() {
        return bmx.u(this.aQ);
    }
    
    private final boolean Q() {
        return ((doc)this.q.get()).f();
    }
    
    private final boolean R(final jbm jbm) {
        return this.aR.a(jbm).b.a();
    }
    
    private final void S() {
        synchronized (this) {
            if (this.as == null) {
                final Context c = this.c;
                final niz h = niz.h(c.getPackageManager().getLaunchIntentForPackage("com.google.android.apps.photos"));
                niz as;
                if (!h.g()) {
                    as = nii.a;
                }
                else {
                    as = h;
                    if (c.getPackageManager().queryIntentActivities((Intent)h.c(), 65536).size() == 0) {
                        as = nii.a;
                    }
                }
                this.as = as;
            }
        }
    }
    
    private final void T() {
        this.k.f("setupCameraFacingFromIntent");
        if (!bmx.i(this.aQ.a())) {
            this.k.g();
            return;
        }
        lfj e;
        if (bmx.m(this.aQ.a())) {
            e = this.aV.e(lfu.a);
        }
        else {
            e = null;
        }
        lfj e2 = e;
        if (e == null) {
            e2 = this.aV.e(lfu.b);
        }
        lfj b;
        if ((b = e2) == null) {
            b = this.aV.b();
        }
        b.getClass();
        final crg ai = this.aI;
        lfu lfu;
        if (b.a.equals("0")) {
            lfu = lfu.b;
        }
        else {
            lfu = lfu.a;
        }
        ai.h(lfu);
        this.k.g();
    }
    
    @Override
    public final void A() {
        final bqw o = this.o;
        if (o == null) {
            return;
        }
        o.n();
        this.o.l();
    }
    
    @Override
    public final void B() {
        final bqw o = this.o;
        if (o == null) {
            return;
        }
        o.bv();
        this.o.p();
        if (this.aR.a(this.v).b.a()) {
            this.I(true);
            return;
        }
        this.g.b();
    }
    
    @Override
    public final void C(final boolean b) {
        final bqw o = this.o;
        if (o != null) {
            o.bq(b);
        }
    }
    
    public final void D(final jbm v) {
        final kse k = this.k;
        final String value = String.valueOf(v);
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 18);
        sb.append("setModuleFromMode ");
        sb.append(value);
        k.f(sb.toString());
        kjm.a();
        if (!this.w()) {
            this.k.g();
            return;
        }
        final fnd a = this.aR.a(v);
        if (!this.R(v)) {
            this.I(true);
        }
        this.N(this.v = v);
        this.aK.aR(fnf.a);
        final kjk i = this.U.i();
        final bqw o = (bqw)a.a.get();
        i.c(o);
        (this.o = o).br();
        this.r.c();
        this.k.g();
        ((jgv)this.Q.get()).b();
        if (this.o.s()) {
            ((jgv)this.Q.get()).c(v.name());
        }
    }
    
    public final void E() {
        if (this.o == null) {
            return;
        }
        final int h = this.H();
        this.O(h);
        this.o.f(h);
    }
    
    @Override
    public final void F() {
    }
    
    public final int G() {
        int f = jbk.f(this.v);
        if (this.Q()) {
            f = 3;
        }
        return f;
    }
    
    @Override
    public final void a(final int n) {
        ekw.a.c().E(1274).p("Camera disabled: %d", n);
        this.d.a();
    }
    
    @Override
    public final void b(final asx asx) {
        if (this.z) {
            this.I(false);
            return;
        }
        if (!this.aR.a(this.v).b.a()) {
            this.I(false);
            ekw.a.c().E(1278).v("Camera opened but the module shouldn't be requesting. Close & return. mode=%s camera=%s", this.v, asx.a());
            return;
        }
        if (this.o != null) {
            final atu f = asx.f();
            f.q = 0;
            asx.o(f);
            try {
                this.o.bu(asx);
            }
            catch (final RuntimeException ex) {
                a.m(ekw.a.b(), "Error connecting to camera", '\u04fd', ex);
                this.d.c(ex);
            }
        }
    }
    
    @Override
    public final void bh() {
        this.aa.unregisterContentObserver((ContentObserver)this.aq);
        this.aa.unregisterContentObserver((ContentObserver)this.ar);
        this.aH.i(this.aO);
        final bsa bsa = (bsa)this.n;
        bsa.w.unregisterDisplayListener(bsa.l);
        bsa.j.b(null);
    }
    
    @Override
    public final void bi() {
        this.k.f("CameraActivityController.onPause");
        this.y = true;
        if (!this.Q() && !this.Z.b() && !this.an && !this.o.t()) {
            final bsa bsa = (bsa)this.n;
            final iqc i = bsa.e.i;
            final int r = i.r;
            if (r != -1) {
                i.s.aR(r);
                i.r = -1;
            }
            i.c.cancel();
            i.f.cancel();
            i.d.cancel();
            i.u = jbm.a;
            i.k = nii.a;
            i.F = 1;
            i.h();
            bsa.e.l();
            this.aG = true;
            this.k.i();
        }
        this.ax.b(this.aM);
        final czp aq = this.aq;
        aq.b = null;
        aq.a(true);
        this.ar.a(true);
        this.o.bv();
        if (((doc)this.q.get()).f()) {
            a.l(ekw.a.c(), "Disconnecting the camera device because filmstrip was launched.", '\u0506');
            this.g.a();
            this.E = true;
            this.o.p();
        }
        if (bmx.a(this.aQ.a()) >= 0.0f) {
            this.aT.a();
        }
        this.k.g();
    }
    
    @Override
    public final void bj() {
        this.k.f("CameraActivityController.onResume");
        this.y = false;
        this.ax.a(this.aM);
        this.au.b();
        if (!this.Q()) {
            if (this.E) {
                this.o.n();
            }
            this.o.l();
        }
        this.E = false;
        if (this.m.l.getVisibility() != 0) {
            this.f.c();
        }
        if (this.aG) {
            this.n.h(this.v == jbm.p || this.v == jbm.k);
            this.aG = false;
        }
        this.aC = false;
        if ((this.ar.a || this.aq.a) && !this.U.g() && !this.an) {
            this.at.g();
        }
        this.aq.a(false);
        this.ar.a(false);
        final float a = bmx.a(this.aQ.a());
        if (a >= 0.0f && a <= 1.0f) {
            final jcd at = this.aT;
            if (a >= 0.0f && a <= 1.0f) {
                at.d(a);
                ++at.a;
            }
        }
        this.k.g();
    }
    
    @Override
    public final void bk() {
        this.k.f("CameraActivityController.onStart");
        this.z = false;
        if (!this.w()) {
            return;
        }
        if (this.aF && !this.an) {
            this.aJ.f(true);
            this.aF = false;
        }
        if (this.u) {
            this.H.d(false);
            this.D(jbm.b);
            this.av.a();
            this.u = false;
            this.H.j(jbm.b, false);
        }
        if (this.aC || !this.Q()) {
            this.n.j();
        }
        final cxl ao = this.ao;
        final cxo a = cxr.a;
        ao.b();
        this.ao.b();
        this.ao.c();
        this.k.f("CameraActivityController.start");
        this.S();
        this.k.i();
        this.au.b();
        this.o.n();
        this.s.S(this.G(), 2);
        this.k.i();
        if (!this.an) {
            this.aq.b = new fkx();
        }
        this.O(this.H());
        this.al.c(this);
        this.k.g();
        this.k.g();
    }
    
    @Override
    public final boolean bl() {
        if (this.H() == 2) {
            return false;
        }
        if (this.n.bl()) {
            return true;
        }
        if (this.v == jbm.b) {
            return false;
        }
        if (this.H.a().contains(this.v)) {
            this.H.f(jbm.b);
        }
        else {
            this.n.d();
        }
        return true;
    }
    
    @Override
    public final void c(final int n, final String s) {
        a.k(ekw.a.c(), "Camera open failure: %s", s, '\u0500');
        this.d.c(null);
    }
    
    @Override
    public final void d(final int n, final String s) {
        ekw.a.c().E(1281).t("Camera open already: %d,%s", n, s);
        this.d.e();
    }
    
    @Override
    public final void e() {
        this.k.f("CameraActivityController.onStop");
        this.aG = false;
        this.z = true;
        this.k.i();
        this.o.p();
        this.E = false;
        this.k.i();
        ((bsa)this.n).r();
        this.al.a();
        if (this.w) {
            this.v("CameraActivityController: Fatal error during onPause!");
        }
        else {
            this.I(true);
            this.k.i();
        }
        final cxl ao = this.ao;
        final cxo a = cxr.a;
        ao.b();
        this.ao.b();
        this.k.i();
        this.k.g();
    }
    
    @Override
    public final Context f() {
        return this.c;
    }
    
    @Override
    public final bqo g() {
        return this.n;
    }
    
    @Override
    public final bqw h() {
        return this.o;
    }
    
    @Override
    public final eya i() {
        return this.af;
    }
    
    @Override
    public final gkw j() {
        return this.ag;
    }
    
    @Override
    public final hjx k() {
        return this.ah;
    }
    
    @Override
    public final jbm l() {
        return this.v;
    }
    
    @Override
    public final void m() {
        this.K(0, new Intent());
    }
    
    @Override
    public final void n(final Intent intent) {
        this.K(-1, intent);
    }
    
    @Override
    public final void o(final Intent intent) {
        this.aC = false;
        intent.addFlags(524288);
        this.al.g(intent);
    }
    
    @Override
    public final void p(final jbm jbm) {
        if (this.y) {
            return;
        }
        final kse k = this.k;
        final String value = String.valueOf(jbm);
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 15);
        sb.append("onModeSelected ");
        sb.append(value);
        k.f(sb.toString());
        final boolean d = this.O.D(this.v);
        try {
            this.N(jbm);
            this.J(jbm, this.ad, this.ac);
        }
        finally {
            this.L();
            this.O.G(jbm, d);
            this.k.g();
        }
    }
    
    @Override
    public final void q() {
        this.s.U(6);
        this.al.g(new Intent(this.c, (Class)CameraSettingsActivity.class));
    }
    
    @Override
    public final void r(final isx isx, final boolean b) {
        if (b && isx.d()) {
            this.n.p(2, isx);
            return;
        }
        this.n.p(3, isx);
    }
    
    @Override
    public final Context s() {
        return this.ab;
    }
    
    @Override
    public final Window t() {
        return this.aj;
    }
    
    @Override
    public final ega u() {
        return this.V;
    }
    
    @Override
    public final void v(final String s) {
        this.W.a(s);
    }
    
    @Override
    public final boolean w() {
        this.k.f("initialize");
        kjm.a();
        if (!this.aD && !this.U.g()) {
            this.aD = true;
            this.k.f("CameraActivityController#init");
            this.k.f("CameraActivityUi#inflate");
            this.k.h("AppUpgrader#upgrade");
            this.X.d(this.ah);
            this.aA.b(lfu.a);
            this.aA.b(lfu.b);
            this.k.h("UiWirer#wire");
            final jaq aw = this.aw;
            aw.a.a();
            aw.b.a();
            this.k.h("UiControllerInitializer#init");
            final erp as = this.aS;
            final jbm a = jbm.a;
            switch (as.d.ordinal()) {
                default: {
                    ((iin)as.a.get()).f();
                    break;
                }
                case 8: {
                    ((ilz)as.c.get()).f();
                    break;
                }
                case 7: {
                    ((iln)as.b.get()).f();
                    break;
                }
            }
            knf.f(this.Y, new ekg(this), odx.a);
            this.k.h("FilmstripData#init");
            this.at = (bqv)this.am.get();
            final doc doc = (doc)this.q.get();
            this.k.h("FilmstripUi#init");
            final RoundedThumbnailView g = this.m.g;
            doc.a.d(this);
            egz.d(this.ac, this.ak, doc);
            this.k.h("Filmstrip#observers");
            this.aq = new czp();
            this.ar = new czp();
            this.aa.registerContentObserver(MediaStore$Images$Media.EXTERNAL_CONTENT_URI, true, (ContentObserver)this.aq);
            this.aa.registerContentObserver(MediaStore$Video$Media.EXTERNAL_CONTENT_URI, true, (ContentObserver)this.ar);
            this.k.h("CameraAppUI#init");
            this.m.c.j = niz.i(new ekf(this));
            final ViewfinderCover p = this.P;
            p.i.q = this.ay;
            p.i.s = this.ai.b(hjq.c);
            this.P.h = new ekd(this);
            this.P.i.A = niz.i(this.ag);
            this.P.i.B = new eka(this);
            this.P.i.C = this.aI;
            this.h.f = niz.i(new eke(this));
            this.n = ((bqn)this.ap.get()).a(this.P());
            this.aH.a(this.aO);
            if (this.p.g()) {
                ((hrj)this.p.c()).b(this.aN);
            }
            doc.c = this.aU;
            this.k.h("CameraFacing#config");
            this.U.i().c(this.aI.a(new eki(this, 1), odx.a));
            this.M();
            this.T();
            this.k.g();
            this.D(this.x());
            this.k.f("CameraUi#prepareModuleUi");
            final bsa bsa = (bsa)this.n;
            bsa.c.getClass();
            bsa.r.h(bsa.p);
            if (bsa.d.s(bsa.b.l())) {
                bsa.d.l(true);
            }
            else {
                bsa.d.l(false);
            }
            if (!bsa.d.s(bsa.b.l())) {
                bsa.q(bsa.b.l());
            }
            if (!this.an && !this.P() && !this.U.g()) {
                this.at.bb();
            }
            else {
                this.at.bc();
            }
            if (this.p.g()) {
                ((hrj)this.p.c()).b(new eko(this));
            }
            knf.f(((ihp)this.l.get()).c(), new ekg(this, 1), odx.a);
            if (this.aE) {
                this.aE = false;
                final Handler e = this.e;
                final doc doc2 = (doc)this.q.get();
                doc2.getClass();
                e.post((Runnable)new ekk(doc2));
            }
            this.k.h("ActivityUi#initCallbacks");
            this.m.l.setOnDrawListener(new ekp(this));
            this.k.h("ActivityLifecycle#observe");
            this.ak.c(this);
            this.k.g();
            this.k.g();
            this.f.j(hvu.k, CameraActivityTiming.a);
        }
        this.k.g();
        return this.aD;
    }
    
    public final jbm x() {
        return bmx.d(this.aQ.a());
    }
    
    @Override
    public final void y(final Configuration configuration) {
        this.o.e(configuration);
    }
    
    @Override
    public final void z(final Intent intent) {
        final bmq aq = this.aQ;
        intent.getClass();
        aq.a.setIntent(intent);
        final String action = intent.getAction();
        this.aC = true;
        this.au.g();
        huf.a(this.au);
        this.au.f();
        if (this.aI.k() != bmx.m(intent)) {
            this.aB = true;
        }
        if (bmx.l(intent)) {
            this.ai.d(hjq.v, this.ao.a(cxr.q).c());
        }
        final jbm x = this.x();
        if (this.H.s(x)) {
            this.H.l(true);
        }
        if (!x.equals(jbm.b)) {
            x.name();
            this.aB = true;
            this.u = false;
        }
        this.M();
        this.T();
        this.J(x, odx.a, odx.a);
        this.O.p(bmx.t(this.aQ.a()));
        final jjb o = this.O;
        if (!((jjq)o).L) {
            o.g();
        }
        else {
            o.h();
        }
        if (!this.z && this.aC) {
            this.n.j();
            this.aC = false;
        }
        final ShortcutManager shortcutManager = (ShortcutManager)this.ab.getSystemService((Class)ShortcutManager.class);
        if (bmx.m(this.aQ.a())) {
            shortcutManager.reportShortcutUsed("selfie");
        }
        if (action != null && action.equals("android.media.action.VIDEO_CAMERA")) {
            shortcutManager.reportShortcutUsed("video");
        }
    }
}
