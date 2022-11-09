import android.content.res.Configuration;
import java.util.concurrent.Executor;
import java.util.ArrayList;
import com.google.android.apps.camera.bottombar.BottomBarController;
import android.view.accessibility.AccessibilityManager;
import com.google.android.apps.camera.bottombar.BottomBarListener;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class equ extends bqw implements imc
{
    public static final nsd b;
    public final iqg A;
    public final gjj B;
    public final efm C;
    public final niz D;
    public final fah E;
    public final duq F;
    public final ezv G;
    public final ezx H;
    public final niz I;
    public final grh J;
    public final kkz K;
    public boolean L;
    public kjk M;
    public final gvu N;
    public fmk O;
    public klj P;
    public int Q;
    public hwe R;
    public int S;
    public final List T;
    public final BottomBarListener U;
    public final kri V;
    public final eip W;
    public flv X;
    private final kse Y;
    private final fxc Z;
    private final fnb aa;
    private final gvy ab;
    private final klv ac;
    private final ikb ad;
    private final bmv ae;
    private final hwc af;
    private final hzg ag;
    private final hzk ah;
    private final hkc ai;
    private final kri aj;
    private flu ak;
    private final hbd al;
    private final fvo am;
    private final bmq an;
    private final ine ao;
    private final lfw ap;
    public final crg c;
    public final bql d;
    public final kjm e;
    public final fxr f;
    public final ivq g;
    public final htm h;
    public final bjx i;
    public final fmz j;
    public final eiq k;
    public final irr l;
    public final iit m;
    public final gkw n;
    public final AccessibilityManager o;
    public final dho p;
    public final djf q;
    public final gvr r;
    public final jjb s;
    public final cxl t;
    public final jda u;
    public final fme v;
    public final BottomBarController w;
    public final ivj x;
    public final imb y;
    public final klv z;
    
    static {
        b = nsd.g("com/google/android/apps/camera/legacy/app/module/portrait/PortraitModule");
    }
    
    public equ(final kse y, final crg c, final fxc z, final bqm d, final fxr f, final kjm e, final fnb aa, final htm h, final niz niz, final gvu n, final bjx i, final eiq k, final irr l, final iit m, final gkw n2, final AccessibilityManager o, final dho p49, final djf q, final gvr r, final jjb s, final iqg a, final klv ac, final klv z2, final ixx ixx, final fme v, final imb y2, final ikb ad, final fmz j, final lfw ap, final cxl t, final bmq an, final BottomBarController w, final ivj x, final bmv ae, final hwc af, final hzg ag, final hzk ah, final efm c2, final gjj b, final niz d2, final duq f2, final fah e2, final ezv g, final ezx h2, final hkc ai, final ine ao, final hbd al, final niz i2, final grh j2) {
        this.u = new jda(5);
        this.K = new kkz(false);
        this.U = new eqm(this);
        this.am = new eqo(this);
        this.V = new eqi(this, 1);
        this.W = new eqp(this);
        this.Y = y;
        this.Z = z;
        this.c = c;
        this.d = d;
        this.f = f;
        this.e = e;
        this.aa = aa;
        this.h = h;
        this.N = n;
        this.i = i;
        this.k = k;
        this.l = l;
        this.m = m;
        this.n = n2;
        this.o = o;
        this.p = p49;
        this.q = q;
        this.r = r;
        this.s = s;
        this.A = a;
        this.ac = ac;
        this.z = z2;
        this.v = v;
        this.y = y2;
        this.ad = ad;
        this.ap = ap;
        this.t = t;
        this.an = an;
        this.w = w;
        this.x = x;
        this.j = j;
        this.ae = ae;
        this.af = af;
        this.R = (hwe)af.a();
        this.ag = ag;
        this.ah = ah;
        this.C = c2;
        this.B = b;
        this.D = d2;
        this.F = f2;
        this.E = e2;
        this.ai = ai;
        this.G = g;
        this.H = h2;
        this.I = i2;
        this.al = al;
        this.ao = ao;
        this.J = j2;
        njo.d(niz.g());
        this.ab = (gvy)niz.c();
        this.S = (int)ai.c(hjq.d);
        this.aj = new eqj(this, ixx);
        this.g = new eqq(this, f2);
        this.T = new ArrayList();
    }
    
    public final void A() {
        this.Y.f("PortraitModule#takePictureNow");
        final flv x = this.X;
        if (x == null) {
            a.l(equ.b.c(), "Not taking picture since Camera is closed.", '\u0557');
            return;
        }
        if (!(boolean)x.b().aQ()) {
            a.l(equ.b.c(), "Not taking picture since the Camera is not ready to take a picture.", '\u0556');
            return;
        }
        this.v(false);
        this.v.b();
        this.E.d();
        this.B.j();
        this.A.l(false);
        this.d.g().e();
        this.s.g();
        if (this.D.g()) {
            ((bvb)this.D.c()).b();
        }
        this.F.j(true);
        if (this.F.a().aQ()) {
            this.h.b(2131886096);
            this.s.v(false);
            this.x.X();
            this.E.e();
        }
        this.ao.a();
        final oey d = this.aa.d(x, this.am, this.L, this.R);
        synchronized (this.T) {
            this.T.add(d);
            monitorexit(this.T);
            d.d(new eqg(this, d), this.e);
            this.R = (hwe)this.af.a();
            this.Y.g();
        }
    }
    
    @Override
    public final void C(final int n) {
        if (n == 1) {
            this.h.c(2131886102);
            return;
        }
        if (n != 2 && n != 3) {
            return;
        }
        this.h.c(2131886103);
    }
    
    @Override
    public final niz be() {
        return niz.h(this.X);
    }
    
    @Override
    public final void br() {
        this.ab.c();
    }
    
    public final void bs() {
        this.u();
    }
    
    public final void bt() {
    }
    
    @Override
    public final void close() {
        this.v(false);
    }
    
    @Override
    public final void e(final Configuration configuration) {
        this.ab.e();
    }
    
    public final void m() {
        this.ac.aR(true);
        (this.M = new kjk()).c(this.ag.d(this.ah));
        this.M.c(this.ah.a.a(new eqi(this, 2), this.e));
        this.M.c(this.ag.d(this.al));
        this.Y.f("PortraitModule#start");
        this.w();
        final duq f = this.F;
        final boolean k = this.t.k(cxs.X);
        boolean b = false;
        if (k && this.t.k(cxs.W)) {
            b = true;
        }
        f.i(b);
        this.v(true);
        this.w.addListener(this.U);
        this.M.c(new eqh(this, 1));
        this.M.c(this.x.d(this.g));
        this.M.c(this.z.a(new eqi(this), this.e));
        this.M.c(this.ai.a(hjq.d).a(this.aj, this.e));
        this.q.a();
        this.v.d();
        this.M.c(this.N);
        this.k.a(this.W);
        this.M.c(new eqh(this));
        this.E.b();
        if (this.t.k(cxs.X)) {
            this.G.c();
            this.M.c(this.G);
            this.M.c(this.F.a().a(new eqi(this, 3), this.e));
        }
        if (bmx.v(this.an)) {
            this.ae.a();
            this.x(bmx.b(this.an.a()));
            bmx.f(this.an.a());
        }
        this.j.b();
        this.j.a();
        this.Y.g();
    }
    
    public final void o() {
        if (this.ak.isDone()) {
            final flv x = this.X;
            if (x != null) {
                x.close();
                this.X = null;
            }
        }
        else {
            this.ak.cancel(true);
        }
        this.f.d();
        this.l.a();
        this.E.a();
        this.q.b();
        this.Q = 0;
        this.s.o();
        this.M.close();
        this.F.i(false);
    }
    
    @Override
    public final boolean q() {
        kjm.a();
        if (this.y.c()) {
            this.ad.b();
            this.y.a();
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
        if (this.y.c()) {
            this.ad.b();
            this.y.a();
        }
    }
    
    public final void v(final boolean b) {
        if (!super.a) {
            return;
        }
        this.d.g().i(b);
        this.d.g().k(b);
    }
    
    public final void w() {
        final lfj b = der.b(this.ap, this.t, this.c.e());
        b.getClass();
        final fxu f = this.ap.f(b);
        if (this.t.k(cxr.T) || (this.c.k() && f.A())) {
            this.s.h();
        }
        this.s.m();
        this.s.u();
        final gvu n = this.N;
        if (n != null) {
            n.a();
        }
        this.l.a();
        this.X = null;
        final flu ak = this.ak;
        if (ak != null && !ak.isDone()) {
            this.ak.cancel(true);
        }
        ofi.w(this.ak = this.Z.a(this.c, this.f, jbm.g), new eqt(this), this.e);
    }
    
    public final void x(final int n) {
        final imb y = this.y;
        y.f = this;
        y.b(n);
    }
    
    @Override
    public final void y() {
        if (!super.a) {
            return;
        }
        this.ad.b();
        this.A();
    }
    
    @Override
    public final void z() {
        if (!super.a) {
            return;
        }
        this.ad.a();
        this.h.c(2131886104);
    }
}
