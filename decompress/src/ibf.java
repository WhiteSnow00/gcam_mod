import android.view.Surface;
import java.util.List;
import java.util.concurrent.Executor;
import android.media.AudioManager;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ibf
{
    public static final nsd a;
    public final jjb A;
    public final boolean B;
    public final ArrayList C;
    public kmj D;
    public lfj E;
    public lfj F;
    public lfg G;
    public jcx H;
    public kmt I;
    public kmv J;
    public lfu K;
    public kjk L;
    public gir M;
    public niz N;
    public kwz O;
    public cgr P;
    public kwz Q;
    public idc R;
    public ida S;
    public idd T;
    public int U;
    public kvv V;
    public kwd W;
    public final lae X;
    public kzl Y;
    public kzl Z;
    public ibp aa;
    public kmq ab;
    public final krf ac;
    public final kqm ad;
    public final kxc ae;
    private kvw af;
    public final liy b;
    public final AudioManager c;
    public final cxl d;
    public final kkz e;
    public final cfs f;
    public final kmo g;
    public final crg h;
    public final lfh i;
    public final liz j;
    public final Executor k;
    public final iaa l;
    public final eya m;
    public final kjm n;
    public final Object o;
    public final gkw p;
    public final klj q;
    public final klj r;
    public final blc s;
    public final bpt t;
    public final iam u;
    public final ias v;
    public final kse w;
    public final ckn x;
    public final ckt y;
    public final cqz z;
    
    static {
        a = nsd.g("com/google/android/apps/camera/timelapse/TimelapseFrameServer");
    }
    
    public ibf(final liy b, final AudioManager c, final cxl d, final cfs f, final kmo g, final krf ac, final crg h, final lfh i, final liz j, final Executor k, final iaa l, final eya m, final kjm n, final gkw p29, final kqm ad, final lae x, final klj q, final klj r, final blc s, final bpt t, final iam u, final ias v, final kse w, final ckn x2, final cqz z, final ckt y, final jjb a, final boolean b2, final byte[] array) {
        this.o = new Object();
        this.ae = new iaz(this);
        this.C = new ArrayList();
        this.N = nii.a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.g = g;
        this.f = f;
        this.ac = ac;
        this.h = h;
        this.i = i;
        this.q = q;
        this.j = j;
        this.l = l;
        this.B = b2;
        this.m = m;
        this.n = n;
        this.p = p29;
        this.ad = ad;
        this.X = x;
        this.e = new kkz(false);
        this.s = s;
        this.t = t;
        this.u = u;
        this.k = k;
        this.v = v;
        this.w = w;
        this.x = x2;
        this.z = z;
        this.y = y;
        this.r = r;
        this.A = a;
        this.I = kmt.c;
        this.J = kmv.h;
        this.R = idc.a;
    }
    
    final kre a(final kmv kmv) {
        kre kre;
        if (kmv.equals(kmv.g)) {
            kre = kmv.g.c();
        }
        else {
            kre = kmv.h.c();
        }
        final lfg g = this.G;
        g.getClass();
        final List w = g.w();
        njo.i(w.contains(kre), "Unable to find suitable viewfinder size from %s", w);
        return kre;
    }
    
    final void b() {
        final kwd w = this.W;
        if (w == null) {
            return;
        }
        final kzl z = this.Z;
        z.getClass();
        synchronized (this.o) {
            this.af = w.r(z, 1);
            final kjk l = this.L;
            l.getClass();
            final kvw af = this.af;
            af.getClass();
            l.c(af);
            monitorexit(this.o);
            final iau iau = new iau(this);
            final Object o = this.o;
            synchronized (this.o) {
                final kvw af2 = this.af;
                nov.z(af2);
                af2.k(iau);
            }
        }
    }
    
    final void c() {
        this.e.aR(false);
        final kjk l = this.L;
        if (l != null) {
            l.close();
            this.L = null;
        }
    }
    
    public final void d() {
        synchronized (this.o) {
            final kvw af = this.af;
            if (af != null) {
                af.close();
                this.af = null;
            }
        }
    }
    
    public final void e() {
        final kwd w = this.W;
        if (w != null) {
            w.e();
        }
    }
    
    public final void f() {
        final iam u = this.u;
        if (u.o.E()) {
            u.g.c();
        }
        u.c.set(false);
        u.d.set(false);
        u.e.set(false);
        u.a.a();
        u.b.a();
        this.A.y(nii.a, false);
        if (this.N.g()) {
            ((Surface)this.N.c()).release();
        }
        this.c();
        final cgr p = this.P;
        if (p != null) {
            p.close();
            this.P = null;
        }
        if (!this.d.k(cyl.d)) {
            this.l.e();
        }
    }
}
