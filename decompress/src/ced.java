import android.hardware.camera2.params.MeteringRectangle;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Executor;
import android.graphics.PointF;
import java.util.concurrent.ScheduledExecutorService;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ced implements ceg
{
    public final blc a;
    public final niz b;
    public final fwx c;
    public final eyt d;
    public final fvt e;
    public final cid f;
    public final cfg g;
    public final kwd h;
    public final jcx i;
    public final niz j;
    public ofn k;
    public ofn l;
    public boolean m;
    public final Runnable n;
    public final Runnable o;
    private final ScheduledExecutorService p;
    private final niz q;
    private final igs r;
    private final bky s;
    private volatile boolean t;
    private boolean u;
    private final fwk v;
    
    public ced(final cfg g, final cid f, final fwk v, final blc a, final niz b, final niz q, final eyt d, final fvt e, final kwd h, final bky s, final igs r, final fwx c, final jcx i, final niz j) {
        this.t = false;
        this.n = new ceb(this);
        this.o = new ceb(this, 2, null);
        this.g = g;
        this.v = v;
        this.p = mcn.l("cdr_trk_ttf_ex");
        this.a = a;
        this.b = b;
        this.c = c;
        this.q = q;
        this.r = r;
        this.d = d;
        this.h = h;
        this.e = e;
        this.f = f;
        this.s = s;
        this.i = i;
        this.j = j;
    }
    
    public static final PointF h(final igr igr) {
        return new PointF(igr.b.centerX(), igr.b.centerY());
    }
    
    private final void i() {
        synchronized (this) {
            if (this.t) {
                return;
            }
            this.t = true;
            this.f.a(cic.a).c(((igo)this.b.c()).d(nii.a, niz.i(fif.c())));
        }
    }
    
    @Override
    public final bkx a(final bjz bjz) {
        synchronized (this) {
            if (!this.u && this.b.g() && this.q.g()) {
                this.f.b(cic.e);
                final ofn l = this.l;
                if (l != null) {
                    l.cancel(false);
                }
                final ofn k = this.k;
                if (k != null) {
                    k.cancel(false);
                }
                this.l = ofn.f();
                this.k = ofn.f();
                this.m = false;
                this.i();
                this.f.a(cic.e).c(new cdt(this));
                this.f();
                this.r.a();
                final PointF a = this.c.a(bjz.a);
                this.d.d(false, a);
                this.g(bjz.a, true);
                final ofn f = ofn.f();
                ((Executor)this.q.c()).execute(new cdw(this, a, f));
                return new cea(this, f);
            }
            return new bkt();
        }
    }
    
    public final void b() {
        ((Executor)this.q.c()).execute(new ceb(this, 1));
    }
    
    public final void c() {
        this.a.c(this.o);
        this.a.c(this.n);
    }
    
    @Override
    public final void close() {
        this.u = true;
        this.f.b(cic.e);
    }
    
    public final void d(final long n, final boolean b) {
        synchronized (this) {
            try {
                this.f.a(cic.e).c(new cdu(this.p.schedule(new cdx(this, b), n, TimeUnit.MILLISECONDS), 1));
            }
            catch (final RejectedExecutionException ex) {}
        }
    }
    
    public final void e() {
        synchronized (this) {
            try {
                this.f.a(cic.e).c(new cdu(this.p.schedule(this.n, 4L, TimeUnit.SECONDS)));
            }
            catch (final RejectedExecutionException ex) {}
        }
    }
    
    public final void f() {
        this.g.d.aR(false);
        final fwj b = ((fwl)this.v.a.d).b;
        this.h.k(b.b == gzr.e || b.b == gzr.f, true, false);
        final kwd h = this.h;
        final kvq a = h.a();
        a.b(this.s.a());
        h.l(a.a());
    }
    
    public final void g(final PointF pointF, final boolean b) {
        monitorenter(this);
        Label_0032: {
            if (b) {
                break Label_0032;
            }
            try {
                while (true) {
                    if (this.r.b(pointF)) {
                        final MeteringRectangle[] array = this.s.c(pointF);
                        final kvq a = this.h.a();
                        ((kxn)a).h = array;
                        if (this.m) {
                            ((kxn)a).i = this.s.a();
                        }
                        else {
                            ((kxn)a).i = array;
                        }
                        this.h.l(a.a());
                        return;
                    }
                    return;
                    final MeteringRectangle[] array = this.s.d(pointF);
                    continue;
                }
            }
            finally {
                monitorexit(this);
            }
        }
    }
}
