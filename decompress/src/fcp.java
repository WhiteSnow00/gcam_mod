import android.content.res.Resources$Theme;
import j$.util.Optional;
import android.os.Looper;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.ScheduledFuture;
import com.google.android.apps.camera.bottombar.BottomBarController;
import android.os.Handler;
import java.util.concurrent.ScheduledExecutorService;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fcp
{
    public final ivj a;
    public final jjb b;
    public final ims c;
    public final iqg d;
    public final ScheduledExecutorService e;
    public final Handler f;
    public final BottomBarController g;
    public final gjj h;
    public final dgn i;
    public final itn j;
    public final gkw k;
    public final kjm l;
    public final fct m;
    public kjk n;
    public volatile ScheduledFuture o;
    public boolean p;
    public boolean q;
    public boolean r;
    public final boolean s;
    public final AtomicReference t;
    public final cud u;
    public final jbj v;
    private final htm w;
    private final fep x;
    private final eyt y;
    
    public fcp(final cxl cxl, final gjj h, final BottomBarController g, final ivj a, final jbj v, final jjb b, final ims c, final AtomicBoolean atomicBoolean, final iqg d, final ScheduledExecutorService e, final htm w, final dgn i, final itn j, final gkw k, final fep x, final fct m, final kjm l, final cud u, final eyt y) {
        this.n = new kjk();
        this.o = null;
        boolean b2 = false;
        this.p = false;
        this.q = false;
        this.r = false;
        this.t = new AtomicReference();
        this.h = h;
        this.g = g;
        this.a = a;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = kpo.d(Looper.getMainLooper());
        this.w = w;
        this.i = i;
        this.j = j;
        this.k = k;
        this.x = x;
        this.b = b;
        this.m = m;
        this.v = v;
        this.l = l;
        this.y = y;
        this.u = u;
        final boolean k2 = cxl.k(cxw.m);
        final boolean k3 = cxl.k(cxw.o);
        this.s = k3;
        if (!k2) {
            if (k3) {
                b2 = true;
            }
        }
        else {
            b2 = true;
        }
        a.B(b2);
        a.C(new fcm(this, k, v, k2, atomicBoolean, x));
    }
    
    public final void a() {
        this.n.close();
        this.n = new kjk();
        if (!this.q) {
            return;
        }
        if (!this.p) {
            this.r = true;
            return;
        }
        if (this.o != null) {
            this.o.cancel(false);
            this.o = null;
        }
        final fep x = this.x;
        x.b();
        if (x.c.isPresent()) {
            x.a.aR(x.c.get());
        }
        x.d = 0.0f;
        x.c = Optional.empty();
        x.b.c();
        this.c.a(true);
        if (this.s && this.v.h) {
            this.y.ae(3, System.currentTimeMillis());
            this.a.af();
        }
        else {
            this.a.ae();
        }
        if (this.s) {
            this.v.a();
            final jbj v = this.v;
            v.c.setImageDrawable(v.d.getDrawable(2131231263, (Resources$Theme)null));
            v.h = false;
        }
        this.b.i(false);
        final krc krc = this.m.a.poll();
        krc.getClass();
        krc.close();
        this.g.stopLongShot();
        this.h.i();
        if (this.i.p()) {
            this.i.o(true, false);
        }
        this.d.v(true);
        this.u.c(true);
        this.j.f();
        this.w.b(2131886107);
        this.k.b(fcp.class);
        this.p = false;
        this.r = false;
        this.q = false;
    }
}
