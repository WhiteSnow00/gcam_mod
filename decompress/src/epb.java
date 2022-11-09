import java.util.concurrent.Executor;
import com.google.android.apps.camera.bottombar.BottomBarListener;
import com.google.android.apps.camera.bottombar.BottomBarController;

// 
// Decompiled by Procyon v0.6.0
// 

public final class epb extends bqw
{
    private static final nsd s;
    private final niz A;
    private final niz B;
    private final fvo C;
    private flu D;
    private hwe E;
    public final crg b;
    public final bql c;
    public final kjm d;
    public final iit e;
    public final fme f;
    public final ivj g;
    public final htm h;
    public final fmz i;
    public final BottomBarController j;
    public final jjb k;
    public final eiq l;
    public final BottomBarListener m;
    public final eip n;
    public boolean o;
    public kjk p;
    public boolean q;
    public flv r;
    private final kse t;
    private final fxc u;
    private final fxr v;
    private final ivq w;
    private final fnb x;
    private final hwc y;
    private final ejh z;
    
    static {
        s = nsd.g("com/google/android/apps/camera/legacy/app/module/motionblur/MotionBlurMode");
    }
    
    public epb(final kse t, final crg b, final fxc u, final fnb x, final bqm c, final fxr v, final kjm d, final iit e, final htm h, final fmz i, final hwc y, final fme f, final ivj g, final niz niz, final niz a, final niz b2, final BottomBarController j, final jjb k, final eiq l) {
        this.m = new eor(this);
        this.C = new eov(this);
        this.n = new eow(this);
        this.t = t;
        this.b = b;
        this.u = u;
        this.x = x;
        this.c = c;
        this.v = v;
        this.d = d;
        this.e = e;
        this.h = h;
        this.i = i;
        this.y = y;
        this.f = f;
        this.g = g;
        this.E = (hwe)y.a();
        this.j = j;
        this.k = k;
        this.l = l;
        this.B = b2;
        this.w = new eox(this);
        njo.d(false);
        this.z = (ejh)niz.c();
        this.A = a;
    }
    
    @Override
    public final void br() {
        final nsx a = ntf.a;
    }
    
    public final void bs() {
        final nsx a = ntf.a;
    }
    
    public final void bt() {
        final nsx a = ntf.a;
    }
    
    @Override
    public final void close() {
        this.u(false);
    }
    
    public final void m() {
        final nsx a = ntf.a;
        this.t.f("Lasagna-ModuleStart");
        final kjk p = new kjk();
        this.p = p;
        final ejh z = this.z;
        z.getClass();
        p.c(z.a());
        this.f.d();
        this.v();
        this.u(true);
        this.j.addListener(this.m);
        this.p.c(new eoo(this, 1));
        this.p.c(this.g.d(this.w));
        this.l.a(this.n);
        this.p.c(new eoo(this));
        if (this.B.g()) {
            ((ejj)this.B.c()).b();
        }
        if (this.A.g()) {
            ((ejg)this.A.c()).a();
        }
        this.t.g();
    }
    
    public final void o() {
        final nsx a = ntf.a;
        this.t.f("Lasagna-StopModule");
        if (this.D.isDone()) {
            final flv r = this.r;
            if (r != null) {
                r.close();
                this.r = null;
            }
        }
        else {
            this.D.cancel(true);
        }
        if (this.B.g()) {
            ((ejj)this.B.c()).a();
        }
        this.v.d();
        this.o = false;
        this.p.close();
        this.t.g();
    }
    
    public final void u(final boolean b) {
        if (!super.a) {
            return;
        }
        this.g.H(b);
        this.c.g().i(b);
    }
    
    public final void v() {
        this.r = null;
        this.D = this.u.a(this.b, this.v, jbm.l);
        this.k.j();
        ofi.w(this.D, new epa(this), this.d);
    }
    
    public final void w() {
        final nsx a = ntf.a;
        this.t.f("LasagnaModule#takePictureNow");
        final flv r = this.r;
        if (r == null) {
            a.l(epb.s.c().g(ntf.a, "LasagnaMode"), "Not taking picture since Camera is closed.", '\u0547');
            return;
        }
        if (!(boolean)r.b().aQ()) {
            a.l(epb.s.c().g(ntf.a, "LasagnaMode"), "Not taking picture since the Camera is not ready to take a picture.", '\u0546');
            return;
        }
        this.u(false);
        this.f.b();
        this.g.T();
        this.x.d(r, this.C, this.o, this.E).d(new eop(this), this.d);
        this.o = false;
        this.E = (hwe)this.y.a();
        this.t.g();
    }
    
    public final boolean x() {
        final flv r = this.r;
        return r != null && (boolean)r.b().aQ();
    }
}
