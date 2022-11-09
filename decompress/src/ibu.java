import java.util.Timer;
import java.util.Arrays;
import android.content.IntentFilter;
import android.media.MediaCodec;
import java.util.concurrent.TimeUnit;
import android.graphics.Rect;
import java.util.Set;
import java.util.Collection;
import android.hardware.camera2.CaptureRequest;
import java.util.HashSet;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.SensorManager;
import android.hardware.SensorEventListener;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.Executor;
import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.ScheduledFuture;
import android.hardware.Sensor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ibu
{
    public static final nsd a;
    public final ibf A;
    public final icm B;
    public final icg C;
    public final icy D;
    public final kse E;
    public final eyt F;
    public final kri G;
    public final cqs H;
    public final Sensor I;
    public lfu J;
    public oey K;
    public idc L;
    public double M;
    public double N;
    public long O;
    public long P;
    public final bmq Q;
    private final iep R;
    private final ckn S;
    private final ckt T;
    private final ixn U;
    private final jjb V;
    private final jcs W;
    private ScheduledFuture X;
    private final ibs Y;
    private final ibr Z;
    private final ibp aa;
    public final Object b;
    public final double[] c;
    public long d;
    public final AtomicBoolean e;
    public final cjj f;
    public final crg g;
    public final htm h;
    public final ihp i;
    public final kkz j;
    public final Context k;
    public final niz l;
    public final Executor m;
    public final iaa n;
    public final cxl o;
    public final ias p;
    public final kjm q;
    public final Object r;
    public final gkw s;
    public final klv t;
    public final ScheduledExecutorService u;
    public final itn v;
    public final SensorEventListener w;
    public final SensorManager x;
    public final cle y;
    public final iam z;
    
    static {
        a = nsd.g("com/google/android/apps/camera/timelapse/TimelapseRecordingController");
    }
    
    public ibu(final egb egb, final crg g, final htm h, final ihp i, final Context k, final niz l, final Executor m, final iaa n, final cxl o, final bmq q, final kjk kjk, final kjm q2, final efm efm, final gkw s, final klv t, final pii pii, final itn v, final ScheduledExecutorService u, final iam z, final ias p36, final ibf a, final icm b, final icg c, final icy d, final kse e, final eyt f, final ckn s2, final hko hko, final ckt t2, final kri g2, final ixn u2, final cle y, final cjj f2, final cqs h2, final jjb v2, final jcs w) {
        this.b = new Object();
        this.c = new double[3];
        this.e = new AtomicBoolean(false);
        this.r = new Object();
        this.L = idc.a;
        this.I = egb.b().getDefaultSensor(4);
        this.g = g;
        this.h = h;
        this.i = i;
        this.k = k;
        this.l = l;
        this.o = o;
        this.G = g2;
        this.p = p36;
        this.n = n;
        this.Q = q;
        this.m = m;
        this.q = q2;
        this.s = s;
        this.t = t;
        this.v = v;
        this.x = egb.b();
        this.j = new kkz(iah.a);
        this.z = z;
        this.A = a;
        this.B = b;
        this.C = c;
        this.D = d;
        this.E = e;
        this.F = f;
        this.S = s2;
        this.T = t2;
        this.U = u2;
        this.y = y;
        this.f = f2;
        this.H = h2;
        this.V = v2;
        this.u = u;
        this.W = w;
        kjk.c(a.e.a(new ibl(this), q2));
        kjk.c(hko.a(new ibm(this, t2, g, o, s2, pii), q2));
        this.w = (SensorEventListener)new ibn(this, d);
        final ibp ibp = new ibp(this, q2, b, s, efm, k, o);
        this.aa = ibp;
        final ibq ibq = new ibq(this, d);
        this.R = ibq;
        final ibr ibr = new ibr(this);
        this.Z = ibr;
        final ibs ibs = new ibs(this, o);
        this.Y = ibs;
        a.aa = ibp;
        d.L = ibq;
        c.m = ibr;
        z.w = ibs;
    }
    
    public final idc a() {
        final idc l = this.L;
        l.getClass();
        return l;
    }
    
    public final void b(final lfu lfu, final idc idc) {
        final kmt d = idc.d(idc);
        this.J = lfu;
        final icy d2 = this.D;
        d2.m.b(new icn(d2, 4));
        final ibf a = this.A;
        final kkz e = a.e;
        int n = 0;
        e.aR(false);
        a.I = d;
        a.K = lfu;
        a.R = idc;
        a.J = igu.b(a.h, a.d, a.x, a.y);
        if (!a.d.k(cyl.d)) {
            final iaa l = a.l;
            if (l.C.c()) {
                final kmv b = igu.b(l.u, l.w, l.C, l.D);
                (l.F = ((idi)l.y).a()).e(l.u.k(), b.c().a, b.c().b, new hzx(l));
                final Sensor e2 = l.E;
                if (e2 != null) {
                    final SensorManager a2 = l.A;
                    final SensorEventListener b2 = l.B;
                    if (!l.v.e()) {
                        n = 3;
                    }
                    a2.registerListener(b2, e2, n);
                }
            }
            l.p.set(0L);
            l.s.set(0L);
        }
        a.D = new iba(a);
        this.L = idc;
        Label_0394: {
            if (this.o.k(cyl.d)) {
                final ias p2 = this.p;
                synchronized (p2.s) {
                    p2.y = idc;
                    p2.d.b((double)p2.t.aQ());
                    break Label_0394;
                }
            }
            final iaa n2 = this.n;
            n2.K = idc;
            n2.f.b((double)n2.z.aQ());
        }
        this.V.j();
    }
    
    final void c() {
        if (iah.a((iah)this.j.d)) {
            a.l(ibu.a.c(), "onCriticalStateHandled()", '\u0a59');
            this.i(false);
        }
    }
    
    final void d() {
        this.E.f("Cheetah-OpenCameraAndStartPreview");
        final ibf a = this.A;
        a.c();
        a.L = new kjk();
        final lfj b = a.f.b();
        b.getClass();
        a.E = b;
        final lfj c = a.f.c();
        c.getClass();
        a.F = c;
        a.G = a.X.a.a(a.F);
        a.H = new jcx(a.X.a, a.G, a.d);
        a.U = (int)a.G.o(CameraCharacteristics.SENSOR_ORIENTATION);
        if (a.j.f()) {
            a.M = new gir(a.q, a.r, a.G, a.d, a.i);
        }
        else {
            a.M = new gir(a.q, a.r, a.G, kqp.g(a.J.c()), a.d, a.i);
        }
        final kre a2 = a.a(a.J);
        final gir m = a.M;
        a.w.f("Cheetah-FrameServerStart");
        final kxb i = kxc.m(a.F, a2);
        final HashSet set = new HashSet();
        set.add(kxc.p(CaptureRequest.CONTROL_CAPTURE_INTENT, 3));
        set.add(kxc.p(CaptureRequest.CONTROL_MODE, 2));
        if (a.x.d()) {
            set.add(igu.d(1));
            set.add(kxc.p(CaptureRequest.STATISTICS_OIS_DATA_MODE, 1));
        }
        else {
            set.add(igu.d(0));
        }
        if (a.d.k(cyl.d)) {
            set.add(igu.e((int)(a.x.c() ? 1 : 0)));
            niz niz;
            if (jll.g != null) {
                niz = niz.i(kxc.p(jll.g, true));
            }
            else {
                niz = nii.a;
            }
            if (niz.g()) {
                set.add(niz.c());
            }
        }
        else {
            set.add(igu.e(0));
            niz niz2;
            if (jlh.k != null) {
                niz2 = niz.i(kxc.p(jlh.k, 1));
            }
            else {
                niz2 = nii.a;
            }
            if (niz2.g()) {
                set.add(niz2.c());
            }
        }
        set.addAll(igu.f(((giq)m.aQ()).a, ((giq)m.aQ()).c));
        set.addAll(grd.c(jbm.n, a.G));
        kxb kxb;
        kwg kwg;
        if (a.d.k(cyl.d)) {
            final kxa a3 = kxb.a();
            a3.g(a.J.c());
            a3.b(a.F);
            a3.f(34);
            a3.c(20);
            a3.h(kxd.a);
            a3.i(65536L);
            a3.d(true);
            kxb = a3.a();
            final kwf c2 = igu.c(a.G, a.I, set);
            c2.f(a.E);
            c2.d(kxb);
            c2.d(i);
            c2.j(a.ae);
            kwg = c2.a();
        }
        else {
            final kxa a4 = kxb.a();
            a4.g(a.J.c());
            a4.b(a.F);
            a4.f(35);
            a4.c(15);
            a4.h(kxd.a);
            a4.d(true);
            kxb = a4.a();
            final Rect h = a.G.h();
            final kxa a5 = kxb.a();
            a5.g(new kre(h.width(), h.height()));
            a5.b(a.F);
            a5.f(35);
            a5.c(1);
            a5.h(kxd.a);
            final kxb a6 = a5.a();
            final kwf c3 = igu.c(a.G, a.I, set);
            c3.f(a.E);
            c3.d(kxb);
            c3.d(i);
            c3.d(a6);
            c3.j(a.ae);
            kwg = c3.a();
        }
        final kwd a7 = a.X.a(kwg);
        final kjk l = a.L;
        l.getClass();
        l.c(a7);
        (a.W = a7).h(set);
        final kwz a8 = a7.b().a(i);
        a.O = a8;
        final kwz a9 = a7.b().a(kxb);
        Object o = a.o;
        synchronized (o) {
            a.Q = a9;
            monitorexit(o);
            a.Y = a7.s(a8);
            a.Z = a7.s(a9);
            o = a.L;
            o.getClass();
            ((kjk)o).c(a7);
            a.w.g();
            final kwd w = a.W;
            if (w != null) {
                o = a.Y;
                o.getClass();
                o = w.r((kzl)o, 1);
                final kjk j = a.L;
                j.getClass();
                j.c((krc)o);
                a.V = new iav(a, (kvw)o);
                nov.z(o);
                final kvv v = a.V;
                v.getClass();
                ((kvw)o).k(v);
            }
            if (!a.d.k(cyl.d)) {
                a.b();
            }
            o = a.W;
            if (o != null) {
                if (a.d.k(cxr.R) && a.b.g) {
                    final kjk k = a.L;
                    k.getClass();
                    k.c(a.r.a(new iat(a, (kwd)o), a.n));
                }
                else {
                    final kjk l2 = a.L;
                    l2.getClass();
                    l2.c(a.M.a(new cho((kwd)o, 11), odx.a));
                }
            }
            o = a.K;
            a.h.h((lfu)o);
            o = a.A;
            final int f = a.R.f;
            ((jjb)o).y(niz.i(kmt.b(f, f)), a.J.e());
            if (a.j.d() && a.h.k()) {
                a.A.p(false);
            }
            if (a.j.h()) {
                a.A.p(false);
            }
            a.A.m();
            o = a.u;
            final lfg g = a.G;
            final kwd w2 = a.W;
            w2.getClass();
            final kjk l3 = a.L;
            final gir m2 = a.M;
            ((iam)o).c.set(false);
            ((iam)o).d.set(false);
            ((iam)o).e.set(false);
            ((iam)o).o = g;
            ((iam)o).p = w2;
            ((iam)o).r = m2;
            ((iam)o).q = l3;
            ((iam)o).b();
            final kvq a10 = w2.a();
            ((kxn)a10).f = (Integer)((iam)o).m.a.aQ();
            w2.l(a10.a());
            l3.c(((iam)o).m.a.a(new cho(w2, 9), odx.a));
            l3.c(((iam)o).a.b.a(new cho(w2, 10), odx.a));
            l3.c(((iam)o).a.a.a(new iai((iam)o), odx.a));
            o = ((iam)o).j;
            o = igu.b(this.g, this.o, this.S, this.T);
            o = ixs.a(this.J, this.A.a((kmv)o), kqp.g(((kmv)o).c()));
            ofi.w(this.U.f((ixs)o, nii.a), new ibt(this, 1), odx.a);
        }
    }
    
    public final void e() {
        this.A.c();
        this.B.g();
        if (!this.o.k(cyl.d)) {
            this.n.e();
        }
        this.b(this.g.e(), this.L);
        this.d();
        this.A.e();
        final jjb v = this.V;
        if (((jjq)v).L) {
            v.h();
        }
    }
    
    public final void f() {
        if (!this.o.k(cyl.g)) {
            return;
        }
        final ScheduledFuture x = this.X;
        if (x != null) {
            x.cancel(true);
            this.X = null;
        }
        final ScheduledExecutorService u = this.u;
        final ibi ibi = new ibi(this, 10);
        long n;
        if (!((iah)this.j.d).equals(iah.h)) {
            n = 2L;
        }
        else {
            n = 15L;
        }
        this.X = u.schedule(ibi, n, TimeUnit.SECONDS);
    }
    
    final void g() {
        if (!((iah)this.j.d).equals(iah.e)) {
            a.l(ibu.a.c(), "Recording state is not IDLE. Ignore start recording", '\u0a68');
            return;
        }
        if (!this.e.get()) {
            this.j.aR(iah.f);
            this.B.d();
            this.q.b(new ibi(this, 1));
            this.h.b(2131886106);
            this.v.e();
            this.W.a();
            final ibf a = this.A;
            if (!a.N.g()) {
                final kqm ad = a.ad;
                a.N = niz.i(MediaCodec.createPersistentInputSurface());
            }
            final cgr p = a.P;
            if (p != null) {
                p.close();
                a.P = null;
            }
            a.P = a.z.b(llk.e);
            final kra c = a.p.c();
            final knl a2 = knl.a(a.J);
            a2.getClass();
            final krf ac = a.ac;
            final kno i = krf.i(a.F, a2);
            final kns kns = new kns(a.J);
            kns.d = i;
            kns.c = a.x.b();
            final cgr p2 = a.P;
            p2.getClass();
            ofi.r(new iax(a, kns, p2, c), a.k).d(new iay(a), a.n);
            final icg c2 = this.C;
            c2.h.b(new icb(c2));
            final icg c3 = this.C;
            c3.c.s().registerReceiver(c3.b, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            return;
        }
        a.l(ibu.a.b(), "Device status is not allowed to start recording", '\u0a67');
    }
    
    public final void h(final boolean b) {
        if (!this.o.k(cyl.g)) {
            return;
        }
        final ScheduledFuture x = this.X;
        if (x != null) {
            x.cancel(true);
            this.X = null;
        }
        this.M = 0.0;
        this.N = 0.0;
        synchronized (this.b) {
            this.d = 0L;
            Arrays.fill(this.c, 0, 3, 0.0);
            monitorexit(this.b);
            if (b) {
                this.z.e(false);
            }
        }
    }
    
    final void i(final boolean b) {
        if (!iah.a((iah)this.j.d)) {
            final Object d = this.j.d;
            return;
        }
        this.j.aR(iah.i);
        final ibf a = this.A;
        oey k = null;
        Label_0256: {
            if (b) {
                if (a.d.k(cyl.d)) {
                    a.d();
                }
                k = ofn.f();
                ((ofn)k).a(new IllegalStateException("Codec error"));
            }
            else {
                if (a.d.k(cyl.d)) {
                    final ias v = a.v;
                    v.c.set(false);
                    v.b.set(true);
                    v.f();
                    synchronized (v.s) {
                        oey oey;
                        if (v.m.get() > 1L) {
                            oey = ofi.n(v.A);
                            monitorexit(v.s);
                        }
                        else {
                            v.x = ofn.f();
                            oey = v.x;
                            monitorexit(v.s);
                        }
                        odg.h(oey, new iaw(a, 1), odx.a);
                        break Label_0256;
                    }
                }
                final iaa l = a.l;
                final Timer i = l.L;
                if (i != null) {
                    i.cancel();
                }
                l.b.set(true);
                l.J = ofn.f();
                k = odg.h(l.J, new iaw(a), odx.a);
            }
        }
        this.K = k;
        this.C.h.a();
        final icg c = this.C;
        c.c.s().unregisterReceiver(c.b);
        this.v.f();
        this.W.b();
        this.h(true);
        this.q.b(new ibi(this));
        this.h.b(2131886107);
    }
}
