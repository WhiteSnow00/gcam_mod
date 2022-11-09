import java.io.File;
import java.util.concurrent.Executor;
import android.view.accessibility.AccessibilityManager;
import com.google.android.apps.camera.bottombar.BottomBarController;
import com.google.android.apps.camera.progressoverlay.ProgressOverlay;
import com.google.android.apps.camera.bottombar.BottomBarListener;
import android.os.CountDownTimer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class eok extends bqw implements imc
{
    public static final nsd b;
    public static final Float c;
    public final fah A;
    public final niz B;
    public final grh C;
    public final cuw D;
    public final gjj E;
    public final cud F;
    public boolean G;
    public boolean H;
    public kjk I;
    public fmk J;
    public boolean K;
    public int L;
    public CountDownTimer M;
    public hwe N;
    public final ezv O;
    public final ezx P;
    public final BottomBarListener Q;
    public final eip R;
    public final gzc S;
    public flv T;
    private final kse U;
    private final fxc V;
    private final fxr W;
    private final htm X;
    private final pii Y;
    private final ikb Z;
    private final klv aa;
    private final klv ab;
    private final klv ac;
    private final hwc ad;
    private final dzn ae;
    private final hzg af;
    private final pii ag;
    private final hkc ah;
    private flu ai;
    private ProgressOverlay aj;
    private final hbd ak;
    private final niz al;
    private final ezj am;
    private final kri an;
    private final fvo ao;
    private final duo ap;
    private final bmq aq;
    private final ine ar;
    public final crg d;
    public final bql e;
    public final kjm f;
    public final ivq g;
    public final fmm h;
    public final eiq i;
    public final iit j;
    public final jjb k;
    public final bjx l;
    public final fmz m;
    public final niz n;
    public final fme o;
    public final imb p;
    public final klv q;
    public final fbb r;
    public final cxl s;
    public final hkg t;
    public final BottomBarController u;
    public final ivj v;
    public final AccessibilityManager w;
    public final dho x;
    public final gkw y;
    public final duq z;
    
    static {
        b = nsd.g("com/google/android/apps/camera/legacy/app/module/longexposure/LongExposureMode");
        c = 1.0f;
    }
    
    public eok(final kse u, final crg d, final fxc v, final bqm e, final fxr w, final kjm f, final fmm h, final htm x, final eiq i, final iit j, final jjb k, final niz n, final klv q, final ixx ixx, final pii y, final fme o, final imb p51, final ikb z, final fbb r, final hkc ah, final klv aa, final klv ab, final klv ac, final bjx l, final gzc s, final fmz m, final cxl s2, final duq z2, final bmq aq, final hkg t, final BottomBarController u2, final ivj v2, final AccessibilityManager w2, final dho x2, final gkw y2, final hwc ad, final ezv o2, final fah a, final ezx p52, final dzn ae, final hzg af, final pii ag, final ine ar, final niz b, final grh c, final hbd ak, final niz al, final ezj am, final cuw d2, final gjj e2, final cud f2) {
        boolean k2 = false;
        this.G = false;
        this.Q = new enx(this);
        this.ao = new eoa(this);
        this.R = new eob(this);
        this.ap = new eoe(this);
        this.U = u;
        this.V = v;
        this.d = d;
        this.e = e;
        this.W = w;
        this.f = f;
        this.h = h;
        this.X = x;
        this.i = i;
        this.j = j;
        this.k = k;
        this.n = n;
        this.q = q;
        this.o = o;
        this.p = p51;
        this.Y = y;
        this.Z = z;
        this.r = r;
        this.ah = ah;
        this.aa = aa;
        this.ab = ab;
        this.ac = ac;
        this.l = l;
        this.S = s;
        this.s = s2;
        this.aq = aq;
        this.t = t;
        this.u = u2;
        this.v = v2;
        this.z = z2;
        this.m = m;
        this.w = w2;
        this.x = x2;
        this.y = y2;
        this.ad = ad;
        this.N = (hwe)ad.a();
        this.O = o2;
        this.A = a;
        this.P = p52;
        this.ae = ae;
        this.af = af;
        this.ag = ag;
        this.ar = ar;
        this.B = b;
        this.C = c;
        this.ak = ak;
        this.al = al;
        this.am = am;
        this.D = d2;
        this.E = e2;
        this.F = f2;
        this.g = new eof(this, z2, h, r, a, s2, s, o2);
        if (t.a("cuttlefish_steady_advice") == 0) {
            k2 = true;
        }
        this.K = k2;
        this.L = (int)ah.c(hjq.d);
        this.an = new enu(this, ixx);
    }
    
    private final void I(final boolean b) {
        if (b) {
            this.aj.a();
        }
        else {
            this.aj.b();
        }
        this.S.d(this.aj);
    }
    
    public final void A() {
        this.T = null;
        final flu ai = this.ai;
        if (ai != null && !ai.isDone()) {
            this.ai.cancel(true);
        }
        this.ai = this.V.a(this.d, this.W, jbm.m);
        this.k.m();
        this.k.j();
        if (this.k.E() || !this.k.D(jbm.m) || ((jjq)this.k).L) {
            this.k.p(false);
            this.k.h();
        }
        ofi.w(this.ai, new eoj(this), this.f);
    }
    
    public final void B(final boolean b) {
        if (b) {
            this.O.d();
            this.e.g().m();
            this.e.g().c();
        }
    }
    
    @Override
    public final void C(final int n) {
        if (n == 1) {
            this.X.c(2131886102);
            return;
        }
        if (n != 2 && n != 3) {
            return;
        }
        this.X.c(2131886103);
    }
    
    public final void D(final int n) {
        final imb p = this.p;
        p.f = this;
        p.b(n);
    }
    
    public final void E(final boolean b) {
        this.O.d();
        if (b) {
            this.X.b(2131886081);
            this.e.g().n();
            return;
        }
        this.X.b(2131886084);
    }
    
    public final void F() {
        this.U.f("CuttlefishModule#takePictureNow");
        final flv t = this.T;
        if (t == null) {
            a.l(eok.b.c(), "Not taking picture since Camera is closed.", '\u053c');
            return;
        }
        if (!(boolean)t.b().aQ()) {
            a.l(eok.b.c(), "Not taking picture since the Camera is not ready to take a picture.", '\u053b');
            return;
        }
        this.x(false);
        this.X.b(2131886096);
        this.z.k(true);
        this.o.b();
        this.A.d();
        if (!this.z.n()) {
            this.A.e();
        }
        this.r.i();
        this.ar.a();
        final fmm h = this.h;
        final fvo ao = this.ao;
        final boolean h2 = this.H;
        h.s = this.N;
        final flq b = t.b;
        final long currentTimeMillis = System.currentTimeMillis();
        final hie c = h.r.c(currentTimeMillis);
        final hgl v = h.v;
        final String a = h.w.a(currentTimeMillis);
        final btl c2 = h.a.c();
        final niz i = niz.i(h.s);
        final Object value = v.a.get();
        final kse kse = (kse)v.b.get();
        kse.getClass();
        final dyy dyy = (dyy)v.c.get();
        dyy.getClass();
        final klj klj = (klj)v.d.get();
        klj.getClass();
        final gxa gxa = (gxa)v.e.get();
        gxa.getClass();
        a.getClass();
        final hgk u = new hgk((hfk)value, kse, dyy, klj, gxa, a, c2, c, i);
        final kre a2 = b.d.a;
        kre kre;
        if (gko.b(h.c.l())) {
            kre = a2.d();
        }
        else {
            kre = a2.e();
        }
        h.b.e(u);
        h.q.a(u);
        u.P(kre);
        h.u = u;
        final int e = h.c.c().e;
        boolean b2 = false;
        Label_0570: {
            if (h.o.k(cxz.r) && (boolean)h.h.aQ() && (boolean)h.i.aQ()) {
                if (t.c.H()) {
                    if (h.p.aQ() == jbm.h) {
                        b2 = !h.o.k(cxz.q);
                        break Label_0570;
                    }
                    h.o.b();
                }
                b2 = true;
            }
            else {
                b2 = false;
            }
        }
        final fvn fvn = new fvn(e, ao, h.d.a, t.c.l(), t.c.K(), klu.a(false), b2, false);
        final hhy u2 = h.u;
        u2.getClass();
        final fxu c3 = t.c;
        final boolean b3 = c3.l() == lfu.a;
        String k;
        if (b3) {
            k = (String)h.n.c(hjq.n);
        }
        else {
            k = h.k;
        }
        final boolean equals = k.equals(h.j);
        final boolean b4 = (int)h.n.c(hjq.c) != inp.a.e;
        klv klv;
        if (b3) {
            klv = h.m;
        }
        else {
            klv = h.l;
        }
        final hjb a3 = hjb.a((int)klv.aQ());
        final huz j = u2.k();
        final ezc a4 = ezd.a();
        a4.b = 29;
        final String s = u2.s();
        final String l = llk.c.j;
        final StringBuilder sb = new StringBuilder(s.length() + 1 + String.valueOf(l).length());
        sb.append(s);
        sb.append(".");
        sb.append(l);
        a4.d(sb.toString());
        a4.g(b3);
        a4.n((float)h.g.aQ());
        a4.e(k);
        a4.h(b4);
        a4.m((float)((hjg)h.e.aQ()).g);
        a4.a = h2;
        a4.b(c3.h());
        a4.j(equals);
        a4.k(false);
        a4.l((boolean)h.f.aQ());
        a4.c = a3.b();
        a4.i(u2.j() == hip.b);
        a4.c(h.t.d());
        j.e(a4.a());
        final hhy u3 = h.u;
        u3.getClass();
        t.f(fvn, u3).d(new env(this, 2), this.f);
        this.N = (hwe)this.ad.a();
        this.U.g();
    }
    
    public final boolean G() {
        final flv t = this.T;
        return t != null && (boolean)t.b().aQ();
    }
    
    @Override
    public final niz be() {
        return niz.h(this.T);
    }
    
    @Override
    public final void br() {
        this.w();
    }
    
    public final void bs() {
        this.u();
        this.v(true);
        this.k.o();
        this.k.h();
    }
    
    public final void bt() {
        this.I.c(this.z.d(this.ap));
    }
    
    @Override
    public final void close() {
        this.x(false);
    }
    
    @Override
    public final void f(final int n) {
        if (n == 0) {
            final flv t = this.T;
            if (t != null) {
                this.x((boolean)t.b().aQ());
            }
        }
    }
    
    public final void m() {
        this.ac.aR(true);
        final kjk i = this.I;
        if (i != null && !i.a()) {
            this.I.close();
        }
        this.I = new kjk();
        this.S.b();
        this.o.d();
        this.o.e(true);
        final iys b = this.o.b;
        if (b != null) {
            b.f = 0;
            b.g = 0;
            b.k = false;
        }
        this.U.f("CuttlefishModule#start");
        this.A();
        this.x(true);
        this.u.addListener(this.Q);
        this.I.c(this.ah.a(hjq.d).a(this.an, this.f));
        this.I.c(new ens(this, 1));
        this.I.c(this.v.d(this.g));
        this.I.c(this.q.a(new ent(this), this.f));
        this.I.c(this.z.d(this.ap));
        this.i.a(this.R);
        this.I.c(new ens(this));
        this.aj = (ProgressOverlay)((ixw)this.Y.get()).c.c(2131427865);
        this.I(true);
        if (bmx.v(this.aq)) {
            this.D(bmx.b(this.aq.a()));
            bmx.f(this.aq.a());
        }
        this.m.b();
        this.m.a();
        this.A.b();
        this.I.c(new ens(this, 2));
        this.U.g();
        this.O.c();
        this.I.c(this.O);
        this.I.c(this.af.d(this.ae));
        this.I.c(this.af.d(this.ak));
        if (this.s.k(cxv.f)) {
            final niz a = ((ejf)this.ag).a();
            if (a.g()) {
                this.I.c(new ohn(((File)a.c()).getAbsolutePath()));
            }
        }
        if (this.al.g() && this.am.j) {
            final cxl s = this.s;
            final cxo a2 = cxs.a;
            s.b();
            final float d = this.k.d();
            final Float c = eok.c;
            if (d < c) {
                this.k.r(c);
                final jjb k = this.k;
                if (((jjq)k).L) {
                    k.h();
                }
            }
            ((fal)this.al.c()).a();
            this.am.j = false;
        }
    }
    
    public final void o() {
        if (this.ai.isDone()) {
            final flv t = this.T;
            if (t != null) {
                t.close();
                this.T = null;
            }
        }
        else {
            this.ai.cancel(true);
        }
        this.W.d();
        this.o.e(false);
        this.I(false);
        this.S.a();
        this.I.close();
    }
    
    @Override
    public final boolean q() {
        kjm.a();
        if (this.p.c()) {
            this.Z.b();
            this.p.a();
            return true;
        }
        return false;
    }
    
    @Override
    public final boolean s() {
        return true;
    }
    
    public final void u() {
        if (this.p.c()) {
            this.Z.b();
            this.p.a();
        }
    }
    
    public final void v(final boolean b) {
        this.o.a();
        this.e.g().n();
        this.O.d();
        this.O.a();
        this.v.r();
        final CountDownTimer m = this.M;
        if (m != null) {
            m.onFinish();
        }
        if (!b && !this.z.n()) {
            this.v.m();
        }
    }
    
    public final void w() {
        if (hjb.a((int)this.ab.aQ()) != hjb.a) {
            this.ab.aR(hjb.a.f);
        }
        if (hjb.a((int)this.aa.aQ()) != hjb.a) {
            this.aa.aR(hjb.a.f);
        }
    }
    
    public final void x(final boolean b) {
        if (!super.a) {
            return;
        }
        if (this.p.c()) {
            return;
        }
        this.e.g().i(b);
        if (b) {
            this.r.d();
            return;
        }
        this.r.j();
    }
    
    @Override
    public final void y() {
        if (!super.a) {
            return;
        }
        this.Z.b();
        this.F();
    }
    
    @Override
    public final void z() {
        if (!super.a) {
            return;
        }
        this.Z.a();
        this.X.c(2131886104);
    }
}
