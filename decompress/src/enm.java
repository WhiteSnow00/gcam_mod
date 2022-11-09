import android.content.res.Configuration;
import android.os.SystemClock;
import com.google.android.apps.camera.ui.views.CaptureAnimationOverlay;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import android.content.Context;
import com.google.android.apps.camera.bottombar.BottomBarListener;
import com.google.android.apps.camera.bottombar.BottomBarController;
import android.content.res.Resources;
import android.view.accessibility.AccessibilityManager;

// 
// Decompiled by Procyon v0.6.0
// 

public final class enm extends bqw implements imc, fvo
{
    public static final nsd b;
    public final fme A;
    public final dho B;
    public final AccessibilityManager C;
    public flq D;
    public oey E;
    public fvp F;
    public fxu G;
    public fmk H;
    public hwe I;
    public final oey J;
    public final klv K;
    public boolean L;
    public boolean M;
    public final kjk N;
    public final bvq O;
    public final iim P;
    public final flz Q;
    public kjk R;
    public final niz S;
    public final iit T;
    public final eyt U;
    public final kkz V;
    public final gjj W;
    public final cxl X;
    public final ezv Y;
    public final kkz Z;
    private boolean aA;
    private kjk aB;
    private final bwc aC;
    private final emh aD;
    private final ihp aE;
    private final ixn aF;
    private final ezx aG;
    private final eiq aH;
    private final eip aI;
    private final kri aJ;
    private final irf aK;
    private final cud aL;
    private final cuw aM;
    private final isx aN;
    private final bmq aO;
    private final ine aP;
    private final lfw aQ;
    public int aa;
    public final duq ab;
    public final bjx ac;
    public final efm ad;
    public final fah ae;
    public final cro af;
    public final niz ag;
    public final grh ah;
    public final bmz ai;
    public final jbj aj;
    public final gzc ak;
    public final crv al;
    private final fxr am;
    private final Resources an;
    private final hwc ao;
    private final itn ap;
    private final BottomBarController aq;
    private final BottomBarListener ar;
    private final fnb as;
    private final bmv at;
    private final hwc au;
    private final fmb av;
    private final hew aw;
    private fmf ax;
    private final hkc ay;
    private final ikb az;
    public final gha c;
    public final kjm d;
    public final gkw e;
    public final kse f;
    public final eis g;
    public final ivj h;
    public final ivq i;
    public final jjb j;
    public final dgn k;
    public final imk l;
    public final crg m;
    public final irr n;
    public final iru o;
    public final fmd p;
    public final eir q;
    public final fmz r;
    public final iqg s;
    public final niz t;
    public final niz u;
    public final imb v;
    public final oui w;
    public final niz x;
    public final bqm y;
    public final htm z;
    
    static {
        b = nsd.g("com/google/android/apps/camera/legacy/app/module/capture/CaptureModule");
    }
    
    public enm(final Context e, final bqm y, final bmz ai, final kjm d, final kse f, final hwc ao, final lfw aq, final gkw e2, final fmb av, final htm z, final fxr am, final klv k, final gha c, final hkc ay, final ihp ae, final iit t, final eiq ah, final ixx ixx, final ixn af, final AccessibilityManager c2, final dho b, final ikb az, final fah ae2, final oey j, final pii pii, final bmq ao2, final itn ap, final BottomBarController aq2, final ivj h, final jjb i, final dgn l, final gjj w, final imk m, final gzc ak, final eyt u, final bjx ac, final crg m2, final irr n, final iru o, final fnb as, final fmd p74, final fmz r, final cxl x, final fme a, final imb v, final iqg s, final jbj aj, final niz u2, final hew aw, final bmv at, final iim p75, final bvq o2, final bwc ac2, final hwc au, final oui w2, final hzg hzg, final dzn dzn, final hzk hzk, final niz t2, final efm ad, final niz x2, final duq ab, final ezv y2, final ezx ag, final cro af2, final crv al, final ine ap2, final hbd hbd, final niz ag2, final cud al2, final grh ah2, final cuw am2, final AtomicBoolean atomicBoolean, final niz s2) {
        this.aA = false;
        this.L = false;
        this.M = false;
        this.aB = new kjk();
        this.aD = new emh();
        this.V = new kkz(true);
        this.aI = new end(this);
        this.aN = new iss();
        this.y = y;
        aq.getClass();
        this.aQ = aq;
        this.av = av;
        this.ai = ai;
        this.d = d;
        final Resources resources = e.getResources();
        this.an = resources;
        this.f = f;
        this.ao = ao;
        this.e = e2;
        this.z = z;
        this.ae = ae2;
        this.am = am;
        this.K = k;
        this.ay = ay;
        this.c = c;
        this.aE = ae;
        this.T = t;
        this.aH = ah;
        this.aF = af;
        this.C = c2;
        this.B = b;
        this.az = az;
        this.J = j;
        this.aO = ao2;
        this.ap = ap;
        this.aq = aq2;
        this.h = h;
        this.j = i;
        this.k = l;
        this.l = m;
        this.W = w;
        this.ak = ak;
        this.U = u;
        this.ac = ac;
        this.m = m2;
        this.n = n;
        this.o = o;
        this.as = as;
        this.p = p74;
        this.r = r;
        this.ag = ag2;
        this.ah = ah2;
        this.Z = new kkz(false);
        final kjk n2 = new kjk();
        this.N = n2;
        final flz q = new flz();
        this.Q = q;
        this.R = new kjk();
        this.X = x;
        this.A = a;
        this.v = v;
        this.s = s;
        this.u = u2;
        this.aw = aw;
        this.at = at;
        this.P = p75;
        this.O = o2;
        this.aC = ac2;
        this.au = au;
        this.I = (hwe)au.a();
        this.w = w2;
        this.t = t2;
        this.ad = ad;
        this.x = x2;
        this.ab = ab;
        this.Y = y2;
        this.aG = ag;
        this.af = af2;
        this.al = al;
        this.aP = ap2;
        this.aL = al2;
        this.aM = am2;
        this.S = s2;
        this.aa = (int)ay.c(hjq.d);
        this.aJ = new emr(this, ixx);
        n2.c(q);
        n2.c(q.a(new emq(this, 3), d));
        q.b.execute(new fly(q, ((enq)p74).b));
        final irg irg = new irg();
        irg.d = resources.getString(2131952038);
        irg.e = e;
        irg.a = true;
        irg.h = 9;
        irg.g = x.k(cxr.at);
        this.aK = irg.a();
        this.ar = new enf(this, aj, m2);
        this.aj = aj;
        final enh q2 = new enh(this, u, p74, aj, h, atomicBoolean);
        this.q = q2;
        this.i = new enj(this);
        this.g = new eis(q2);
        n2.c(hzg.d(dzn));
        n2.c(hzg.d(hzk));
        n2.c(hzg.d(hbd));
        knf.e(j, new ena(this, pii));
        final CaptureAnimationOverlay captureAnimationOverlay = (CaptureAnimationOverlay)ixx.k.c(2131427483);
    }
    
    private final void M(final boolean b) {
        this.A.a();
        this.Y.d();
        this.aL.b();
        if (!this.O.e()) {
            this.y.g().n();
        }
        this.O(false);
        this.h.r();
        if (!b && (boolean)this.ab.a().aQ()) {
            this.h.p();
        }
    }
    
    private final void N() {
        this.d.execute(new emu(this));
    }
    
    private final void O(final boolean b) {
        if (this.c.aQ() == ggz.a && b) {
            this.ad.e(this.aK);
            return;
        }
        this.ad.h(this.aK);
    }
    
    private final void P() {
        njo.o(super.a);
        final fxr am = this.am;
        final lfu e = this.m.e();
        final lfj b = der.b(this.aQ, this.X, e);
        b.getClass();
        final Integer n = (Integer)this.X.a(cxr.w).c();
        final Integer n2 = (Integer)this.X.a(cxr.x).c();
        final int intValue = n;
        final lfj lfj = null;
        lfj b2;
        if (intValue != -1 && e.equals(lfu.b)) {
            b2 = lfj.b(n.toString());
        }
        else {
            b2 = null;
        }
        lfj b3 = b2;
        if (n2 != -1) {
            b3 = b2;
            if (e.equals(lfu.a)) {
                b3 = lfj.b(n2.toString());
            }
        }
        lfj lfj2;
        if (b3 == null) {
            lfj2 = lfj;
        }
        else if (!this.aQ.h(e).contains(b3)) {
            a.k(enm.b.c(), "TestOnly Camera id %s is not supported", b3, '\u051d');
            lfj2 = lfj;
        }
        else {
            lfj2 = b3;
        }
        if (lfj2 != null) {
            enm.b.c().E(1308).x("Set TestOnly camera id (%s => %s)", b, lfj2);
        }
        else {
            lfj2 = b;
        }
        this.j.m();
        final fmf a = am.a(this.av.a(lfj2, jbm.b));
        njo.o(super.a);
        final fmf ax = this.ax;
        Label_0554: {
            if (ax != null) {
                if (ax.b.equals(a.b) && this.E != null && !this.R.a()) {
                    final fvp f = this.F;
                    if (f == null || !f.g()) {
                        this.N();
                        this.x();
                        break Label_0554;
                    }
                }
            }
            this.f.f("CaptureModule#startCamera");
            this.y.g().c();
            this.n.a();
            this.R.close();
            this.R = new kjk();
            final flq a2 = a.a;
            this.D = a2;
            this.G = this.aQ.f(a2.a);
            this.N();
            this.G.getClass();
            this.y.g().getClass();
            final kjk r = this.R;
            final btf btf = new btf();
            r.c(btf);
            final oey c = this.am.c(a, ofi.n(this.aF));
            ofi.w(c, new enl(this, btf, r), this.d);
            this.E = c;
            this.ax = a;
            this.f.g();
        }
        this.j.j();
        this.j.p(bmx.t(this.aO.a()));
        this.j.h();
    }
    
    @Override
    public final void A() {
        this.M(false);
    }
    
    @Override
    public final void B() {
        this.d.execute(new emu(this, 3));
    }
    
    @Override
    public final void C(final int n) {
        if (n == 1) {
            this.z.c(2131886102);
            return;
        }
        if (n != 2 && n != 3) {
            return;
        }
        this.z.c(2131886103);
    }
    
    @Override
    public final void D(final float n) {
        this.F(n, -1L);
    }
    
    @Override
    public final void E(final float n, final int n2) {
    }
    
    @Override
    public final void F(final float n, final long n2) {
        if (this.ab.a().aQ()) {
            if (this.X.k(cww.p)) {
                if (n == 0.0f) {
                    this.aM.f(new emv(this));
                }
                if (this.aM.j()) {
                    this.Y.e(n);
                }
            }
            else {
                this.Y.e(n);
            }
            this.h.E((int)(100.0f * n), n2, false);
            if (n == 1.0f) {
                this.aG.a(n2);
                this.h.p();
                this.aM.e();
            }
        }
        else {
            this.A.f((int)(100.0f * n));
            if (n == 0.0f) {
                if (!this.O.e()) {
                    this.y.g().m();
                }
                this.O(true);
            }
            else if (n == 1.0f) {
                if (!this.O.e()) {
                    this.y.g().n();
                }
                this.O(false);
            }
        }
        if (n == 1.0f) {
            this.z.b(2131886084);
        }
    }
    
    public final void G(final boolean b) {
        if (b) {
            this.v();
        }
        if (!super.a) {
            return;
        }
        this.P();
    }
    
    public final void H(final boolean b) {
        if (!super.a) {
            return;
        }
        this.y.g().i(b);
        this.y.g().k(b);
    }
    
    public final void I(final int n) {
        final imb v = this.v;
        v.f = this;
        v.b(n);
    }
    
    public final void J() {
        this.K(false);
    }
    
    public final void K(final boolean b) {
        this.f.f("CaptureModule#takePictureNow");
        if (this.F == null) {
            a.l(enm.b.c(), "Not taking picture since Camera is closed.", '\u052f');
            this.f.g();
            return;
        }
        this.ap.a();
        this.ae.d();
        final fvp f = this.F;
        f.getClass();
        if (!(boolean)f.h().a.aQ()) {
            a.l(enm.b.c(), "Not taking picture since the Camera is not ready to take a picture.", '\u052e');
            this.f.g();
            return;
        }
        final emh ad = this.aD;
        if (ad.a == 0L) {
            ad.a = SystemClock.elapsedRealtime();
        }
        else {
            SystemClock.elapsedRealtime();
            ad.a = SystemClock.elapsedRealtime();
        }
        this.H(false);
        this.V.aR(true);
        this.A.b();
        this.W.j();
        this.s.l(false);
        this.y.g().e();
        this.j.g();
        if (this.x.g()) {
            ((bvb)this.x.c()).b();
        }
        this.ab.j(true);
        if ((boolean)this.ab.a().aQ() && !b) {
            this.z.b(2131886096);
            this.ae.e();
            this.j.v(false);
            this.h.W();
        }
        final fmg fmg = new fmg(this);
        this.N.c(fmg);
        if (!b) {
            this.aP.a();
        }
        final fnb as = this.as;
        final fvp f2 = this.F;
        f2.getClass();
        final flq d = this.D;
        d.getClass();
        as.a(f2, d, fmg, this.G, this.L, b, this.I).d(new emw(this, b), this.d);
        this.L = false;
        this.I = (hwe)this.au.a();
        this.f.g();
    }
    
    public final boolean L() {
        return this.Q.c() && !this.v.c();
    }
    
    @Override
    public final niz be() {
        return niz.h(this.F);
    }
    
    @Override
    public final void br() {
        if (this.aA) {
            return;
        }
        this.aA = true;
        this.f.f("CaptureModule#initialize");
        this.N.c(this.aE.a(new emx(this)));
        if (this.S.g()) {
            ((hyo)this.S.c()).b();
        }
        this.f.g();
    }
    
    public final void bs() {
        this.p.c();
        this.v();
        if (this.O.e()) {
            this.P.b();
        }
        this.o.d();
    }
    
    public final void bt() {
        final kkz v = this.V;
        boolean b = false;
        v.aR(false);
        if (this.F != null && bmx.v(this.aO)) {
            if (this.G.l() == lfu.a) {
                b = true;
            }
            if (b != bmx.m(this.aO.a())) {
                this.G(true);
            }
            else {
                this.u();
            }
        }
        final fvp f = this.F;
        if (f != null && f.g()) {
            this.G(true);
        }
        this.r.b();
        this.r.a();
        this.l.d(true);
        this.W.h();
        knf.e(this.J, new emy(this, 1));
    }
    
    @Override
    public final void bu(final asx asx) {
    }
    
    @Override
    public final String c() {
        return this.an.getString(2131952397);
    }
    
    @Override
    public final void close() {
        this.N.close();
    }
    
    @Override
    public final void e(final Configuration configuration) {
    }
    
    public final void m() {
        (this.aB = new kjk()).c(this.h.d(this.i));
        this.aB.c(this.K.a(new emq(this, 1), this.d));
        this.aB.c(this.ay.a(hjq.d).a(this.aJ, this.d));
        this.aq.addListener(this.ar);
        this.H(true);
        final kjk ab = this.aB;
        final bwc ac = this.aC;
        final emp emp = new emp(this);
        Object o = ac.a;
        synchronized (o) {
            ac.a.add(emp);
            monitorexit(o);
            ab.c(new bwb(ac, emp));
            if (this.X.k(cxs.W)) {
                this.Y.c();
                this.aB.c(this.Y);
                this.aB.c(this.ab.a().a(new emq(this, 2), this.d));
            }
            this.f.f("CaptureModule#resume");
            this.P();
            this.f.f("CaptureModule#ui-resume");
            this.ae.b();
            this.ak.b();
            this.A.d();
            this.f.g();
            this.ab.i(this.X.k(cxs.W));
            this.f.f("Setup CameraAppUI");
            ((bsa)this.y.g()).k.a();
            this.f.g();
            this.y.r(this.aN, true);
            o = this.aw;
            ((hew)o).e.execute(new hev((hew)o, 1));
            this.aH.a(this.aI);
            this.z.e();
            this.f.g();
        }
    }
    
    public final void o() {
        this.f.f("CaptureModule#stop");
        this.aB.close();
        final duq ab = this.ab;
        final Boolean value = false;
        ab.i(false);
        this.aq.removeListener(this.ar);
        if (this.V.d) {
            this.V.aR(value);
            this.M(true);
        }
        this.W.q(false);
        this.ak.a();
        this.ae.a();
        this.L = false;
        this.v();
        final hew aw = this.aw;
        aw.e.execute(new hev(aw));
        this.f.f("CaptureModule#closeCamera");
        final oey e = this.E;
        if (e != null) {
            e.cancel(false);
            this.E = null;
        }
        this.F = null;
        this.am.d();
        this.Q.d(klq.g(value));
        this.f.f("CameraLifetime#close");
        this.R.close();
        this.f.g();
        this.n.a();
        this.f.g();
        ((bsa)this.y.g()).k.b();
        this.z.a();
        this.aH.b(this.aI);
        this.f.g();
    }
    
    @Override
    public final boolean q() {
        if (this.v.c()) {
            this.az.b();
            this.v.a();
            return true;
        }
        if (this.O.e()) {
            this.P.b();
            return true;
        }
        return false;
    }
    
    @Override
    public final boolean r() {
        return true;
    }
    
    @Override
    public final boolean s() {
        return true;
    }
    
    public final void u() {
        if (!bmx.v(this.aO)) {
            return;
        }
        this.at.a();
        this.I(bmx.b(this.aO.a()));
        bmx.f(this.aO.a());
    }
    
    public final void v() {
        if (this.v.c()) {
            this.az.b();
            this.v.a();
        }
    }
    
    public final void w(final boolean b) {
        if (!super.a) {
            return;
        }
        final boolean j = this.m.j();
        final hwh hwh = (hwh)this.ao.a();
        final boolean i = this.m.j();
        final fmk h = this.H;
        if (h != null) {
            h.b(i ^ true);
        }
        this.m.e();
        this.G(true);
        nov.E(this.R, "cameraLifetime", new Object[0]);
        nov.E(this.E, "openingCamera", new Object[0]);
        knf.f(odg.i(this.E, emt.a, odx.a), new enb(this, b, hwh, j, i), this.d);
    }
    
    public final void x() {
        this.y.g().o();
    }
    
    @Override
    public final void y() {
        if (!super.a) {
            return;
        }
        this.az.b();
        this.J();
    }
    
    @Override
    public final void z() {
        if (!super.a) {
            return;
        }
        this.az.a();
        this.z.c(2131886104);
    }
}
