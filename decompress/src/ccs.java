import java.util.Map;
import android.media.AudioManager;
import java.util.Collections;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ccs implements kob, krc
{
    public static final nsd a;
    public final List A;
    public cil B;
    public int C;
    public final cqu D;
    public int E;
    private final cqn F;
    private final irw G;
    private final cbr H;
    private final kqw I;
    private final cqz J;
    private final boolean K;
    private cgr L;
    private long M;
    public final cej b;
    public final kjm c;
    public final cde d;
    public final List e;
    public final Object f;
    public final cia g;
    public final cek h;
    public final ccz i;
    public final cid j;
    public final cxl k;
    public final gkw l;
    public final cfo m;
    public final cfg n;
    public final AtomicReference o;
    public final ckg p;
    public final ckz q;
    public final chv r;
    public final ScheduledExecutorService s;
    public final niz t;
    public final cfu u;
    public final hwn v;
    public final niz w;
    public final Executor x;
    public final hkc y;
    public final List z;
    
    static {
        a = nsd.g("com/google/android/apps/camera/camcorder/Video2ActiveCamcorderRecordingSession");
    }
    
    public ccs(final kjm c, final cqu d, final cek h, final ccz i, final cid j, final cfm cfm, final cqn f, final ckg p26, final cle q, final cia g, final cqz k, final cde d2, final ScheduledExecutorService s, final bup bup, final cfu u, final hwn v, final cxl l, final gkw m, final clu clu, final irw g2, final boolean k2, final dbu dbu, final cej b, final cfo m2, final Executor x, final hkc y) {
        this.e = Collections.synchronizedList(new ArrayList<Object>());
        this.f = new Object();
        this.H = new cbr();
        this.I = new kqw();
        this.o = new AtomicReference();
        this.z = new ArrayList();
        final ArrayList a = new ArrayList();
        this.A = a;
        this.C = 0;
        this.M = 0L;
        this.c = c;
        this.D = d;
        this.d = d2;
        this.F = f;
        this.p = p26;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = l;
        this.l = m;
        this.G = g2;
        this.K = k2;
        this.m = m2;
        this.n = cfm.a();
        this.b = b;
        this.q = q;
        this.r = new chv(m2.d, dbu);
        this.g = g;
        this.J = k;
        this.s = s;
        this.u = u;
        this.v = v;
        this.x = x;
        this.y = y;
        niz t;
        if (h.c() && m2.y == lfu.b) {
            final jjb a2 = ((iii)bup.a).a();
            final klj klj = (klj)bup.b.get();
            klj.getClass();
            final cid cid = (cid)bup.c.get();
            cid.getClass();
            final AudioManager a3 = ((egj)bup.d).a();
            final klv klv = (klv)bup.e.get();
            klv.getClass();
            t = niz.i(new buo(a2, klj, cid, a3, klv));
        }
        else {
            t = nii.a;
        }
        this.t = t;
        if (t.g()) {
            ((buk)t.c()).a();
        }
        this.j(1);
        f.b.incrementAndGet();
        h.e();
        if (h.g()) {
            a.add(clu.a());
            j.a(cic.c).c(clu.b(new cch(this)));
        }
        j.a(cic.c).c(this);
        j.a(cic.c).c(q);
        niz w;
        if (m2.d == kmt.a) {
            w = niz.i(new chr());
        }
        else {
            w = nii.a;
        }
        this.w = w;
    }
    
    @Override
    public final void aU(final kov kov) {
        if (this.h.e()) {
            this.H.aU(kov);
            this.b.aU(kov);
            return;
        }
        throw new UnsupportedOperationException("Not implemented");
    }
    
    public final cgf b() {
        synchronized (this.f) {
            final cil b = this.B;
            b.getClass();
            return (cgf)nov.d(b.b);
        }
    }
    
    public final oey c(final boolean b) {
        synchronized (this.f) {
            final int e = this.E;
            if (e != 2 && e != 3) {
                final String a = ccr.a(e);
                final StringBuilder sb = new StringBuilder(a.length() + 26);
                sb.append("Trying to stop with state=");
                sb.append(a);
                return ofi.m(new IllegalStateException(sb.toString()));
            }
            this.j(4);
            Object f = this.f;
            synchronized (f) {
                final int e2 = this.E;
                int n = 0;
                njo.o(e2 == 4);
                if (this.t.g()) {
                    ((buk)this.t.c()).c();
                }
                final cil b2 = this.B;
                b2.getClass();
                final kof a2 = b2.a;
                final ofn f2 = ofn.f();
                final cgf b3 = this.b();
                final long a3 = this.g.a(b3.b);
                if (b) {
                    this.v.i(hwm.e);
                    oey oey;
                    if (this.h.e()) {
                        oey = a2.i();
                    }
                    else {
                        oey = a2.k();
                    }
                    f2.e(oey);
                }
                else {
                    if (!this.h.e()) {
                        n = 1000 - (int)a3;
                    }
                    final bsv bsv = new bsv("CdrRecSession", n);
                    this.j.a(cic.c).c(bsv);
                    bsv.execute(new ccm(this, f2, a2));
                }
                final oey i = odg.i(f2, new ccj(this, b3), odx.a);
                monitorexit(f);
                f = new cci(this);
                return odg.h(i, (nir)f, odx.a);
            }
        }
    }
    
    @Override
    public final void close() {
        this.c(true);
    }
    
    @Override
    public final void d() {
        final cce cce = (cce)this.b;
        cce.n(new cbv(cce, 2));
    }
    
    @Override
    public final void e() {
        synchronized (this.f) {
            if (this.E == 4) {
                return;
            }
            if (!this.h.h()) {
                return;
            }
            try {
                this.L = this.J.b(this.m.h.a.f);
                final cil b = this.B;
                b.getClass();
                b.a.m(this.L.f());
            }
            catch (final Exception ex) {
                ccs.a.b().h(ex).E(361).o("Failed to set next video file.");
                this.f();
            }
        }
    }
    
    @Override
    public final void f() {
        final cce cce = (cce)this.b;
        ofi.w(cce.b(false), new cca(cce, 1), cce.c);
    }
    
    @Override
    public final void g() {
        synchronized (this.f) {
            final cge a = cgf.a();
            a.b(this.L);
            a.c(this.F.b());
            final cgf a2 = a.a();
            this.g.b(a2.b);
            this.i(this.b());
            final cil b = this.B;
            b.getClass();
            b.b.add(a2);
        }
    }
    
    @Override
    public final void h(final long n, long n2) {
        final kqw i = this.I;
        n2 *= 8L;
        i.a(new kqv(n, (float)n2));
        this.M += n2;
    }
    
    public final void i(final cgf cgf) {
        synchronized (this.f) {
            final cgr a = cgf.a;
            long n = this.g.a(cgf.b);
            if (a.h()) {
                if (this.h.e() || n >= 1000L) {
                    a.close();
                    final cil b = this.B;
                    b.getClass();
                    final kof a2 = b.a;
                    if (b.b.size() == 1 && this.h.e()) {
                        n = (long)a2.f().e(n);
                    }
                    final float n2 = n / 1000.0f;
                    float n3;
                    if (n2 == 0.0f) {
                        n3 = 0.0f;
                    }
                    else {
                        n3 = this.M / (n2 * this.m.d.a());
                    }
                    niz niz;
                    if (this.h.e()) {
                        niz = a2.e();
                    }
                    else {
                        niz = niz.i(this.r.f());
                    }
                    final knc h = this.m.h;
                    final cfu u = this.u;
                    a2.d();
                    final boolean booleanValue = (boolean)((kkz)this.n.e).d;
                    final long currentTimeMillis = System.currentTimeMillis();
                    final int e = this.r.e();
                    final int d = this.r.d();
                    final int value = this.F.a.get();
                    final int a3 = this.F.a();
                    final int intValue = (int)((kkz)this.n.m).d;
                    final cbr h2 = this.H;
                    Object b2 = h2.b;
                    synchronized (b2) {
                        final nnx e2 = nqb.e(h2.a);
                        h2.a.clear();
                        monitorexit(b2);
                        final hio z = this.m.z;
                        final List a4 = this.A;
                        final int c = this.C;
                        final boolean k = this.K;
                        float n6;
                        if (this.w.g()) {
                            b2 = this.w.c();
                            final float n4 = (float)((chr)b2).a;
                            final float n5 = ((chr)b2).b / 2 + n4;
                            n6 = 0.0f;
                            if (n5 != 0.0f) {
                                n6 = n4 / n5;
                            }
                        }
                        else {
                            n6 = 0.0f;
                            if (this.m.d == kmt.c) {
                                n6 = 1.0f;
                            }
                        }
                        final cgi cgi = new cgi(a, h, u, booleanValue, currentTimeMillis, n, e, d, value, a3, intValue, niz, e2, z, a4, c, k, n6, (long)n3, this.m.h.b());
                        this.h.e();
                        if (cgi.l != this.r.f()) {
                            ccs.a.c().E(368).u("Video file encoded %d frames, but frame drop listener saw %d", cgi.l, this.r.f());
                        }
                        this.z.add(0, cgi);
                        return;
                    }
                }
            }
            a.g();
            this.G.a(irv.h);
            ccs.a.c().E(366).o("Video file is abandoned. Probably because the length is too short.");
        }
    }
    
    public final void j(final int e) {
        synchronized (this.f) {
            this.E = e;
        }
    }
}
