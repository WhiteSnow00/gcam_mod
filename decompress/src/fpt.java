import java.util.concurrent.Executor;
import android.content.res.Resources;
import com.google.android.apps.camera.bottombar.BottomBarController;
import com.google.android.apps.camera.bottombar.BottomBarListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fpt extends bqw implements ceh
{
    public static final nsd b;
    public final ckq c;
    public final kjm d;
    public final pii e;
    public final clu f;
    public final ckl g;
    public final ckm h;
    public final crg i;
    public final cxl j;
    public final ckt k;
    public final cbh l;
    public final Object m;
    public final cde n;
    private final bqm o;
    private final String p;
    private final cki q;
    private kjk r;
    private final BottomBarListener s;
    private final BottomBarController t;
    private final hkn u;
    private final hko v;
    private final ceo w;
    
    static {
        b = nsd.g("com/google/android/apps/camera/modules/video/VideoModule");
    }
    
    public fpt(final bqm o, final kjm d, final Resources resources, final cde n, final hkn u, final hko v, final BottomBarController t, final ckq c, final ckl g, final ckm h, final cki q, final ckt k, final cbh l, final ceo w, final clu f, final pii e, final crg i, final cxl j) {
        this.m = new Object();
        this.j = j;
        this.g = g;
        this.h = h;
        this.q = q;
        this.i = i;
        this.o = o;
        this.d = d;
        this.c = c;
        this.p = resources.getString(2131952779);
        this.u = u;
        this.l = l;
        this.e = e;
        this.t = t;
        this.n = n;
        this.v = v;
        this.k = k;
        this.w = w;
        this.f = f;
        this.s = new fpq(this);
    }
    
    private final kri u(final ckp ckp) {
        return new fpm(this, ckp);
    }
    
    @Override
    public final void bq(final boolean b) {
        synchronized (this.m) {
            this.l.j(b);
        }
    }
    
    @Override
    public final void br() {
        synchronized (this.m) {
            this.n.c(this.o.g(), jbm.c);
            this.l.b();
        }
    }
    
    public final void bs() {
        synchronized (this.m) {
            this.n.e();
        }
    }
    
    public final void bt() {
        synchronized (this.m) {
            monitorexit(this.m);
        }
    }
    
    @Override
    public final String c() {
        return this.p;
    }
    
    @Override
    public final void close() {
        synchronized (this.m) {
            this.l.m();
        }
    }
    
    @Override
    public final void d() {
        this.n.j(true);
    }
    
    @Override
    public final void f(final int n) {
        synchronized (this.m) {
            this.l.e(n);
        }
    }
    
    @Override
    public final void g() {
        final clu f = this.f;
        if (f.b.g()) {
            ((cpu)f.b.c()).p(null);
        }
    }
    
    @Override
    public final void h() {
    }
    
    @Override
    public final void i() {
        final clu f = this.f;
        if (f.b.g()) {
            final cpu cpu = (cpu)f.b.c();
            cpt cpt;
            if (f.d.e().equals(lfu.a)) {
                cpt = cpt.c;
            }
            else if (!f.c.c()) {
                f.c(true);
                cpt = cpt.b;
            }
            else {
                cpt = cpt.a;
            }
            cpu.h(cpt);
            if (cpt.d) {
                cpu.p(new clq(f));
            }
            f.e.f();
            f.g.set(false);
            if (f.f.a(cwv.i).g()) {
                final int intValue = (int)f.f.a(cwv.i).c();
                clp clp;
                if (intValue == 2) {
                    clp = clp.c;
                }
                else if (intValue == 3) {
                    clp = clp.d;
                }
                else if (intValue == 4) {
                    clp = clp.e;
                }
                else {
                    clp = clp.b;
                }
                f.d(clp, true);
            }
        }
    }
    
    @Override
    public final void j(final cgs cgs) {
    }
    
    @Override
    public final void k(final boolean b) {
        this.l.g(b);
    }
    
    public final void m() {
        synchronized (this.m) {
            (this.r = new kjk()).c(this.u.a.a(this.u(this.g), this.d));
            this.r.c(this.u.b.a(this.u(this.h), this.d));
            this.r.c(this.u.c.a(this.u(this.q), this.d));
            this.r.c(this.v.a(new fpo(this), this.d));
            this.r.c(this.i.a(new fpp(this), this.d));
            this.r.c(this.f.b(new fps(this)));
            this.t.addListener(this.s);
            this.n.h();
            final ceo w = this.w;
            if (w.a) {
                w.b.o();
            }
            this.l.a(this);
            this.l.l(true);
        }
    }
    
    public final void o() {
        synchronized (this.m) {
            this.t.removeListener(this.s);
            this.n.i();
            this.r.close();
            this.l.m();
            this.l.k(this);
            final ceo w = this.w;
            if (w.a() && w.d.g()) {
                ((htz)w.d.c()).a();
            }
            w.e = false;
        }
    }
    
    @Override
    public final boolean q() {
        synchronized (this.m) {
            return this.l.n();
        }
    }
    
    @Override
    public final boolean s() {
        return true;
    }
}
