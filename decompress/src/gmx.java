import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import android.graphics.PointF;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledExecutorService;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gmx implements bjj, krc
{
    public final niz a;
    public final niz b;
    public final igs c;
    public final kwd d;
    public final fvt e;
    public final niz f;
    public final eyt g;
    public final blc h;
    public final bkg i;
    public ofn j;
    public krc k;
    public krc l;
    public final bky m;
    public final grh n;
    public final bjo o;
    public final Runnable p;
    private final fwx q;
    private final gmh r;
    private final ScheduledExecutorService s;
    private volatile ScheduledFuture t;
    private final Object u;
    private final klv v;
    private boolean w;
    private final cxl x;
    private final fwk y;
    
    public gmx(final fxu fxu, final niz a, final gmh r, final fvt e, final ScheduledExecutorService s, final blc h, final kwd d, klv v, final klv klv, final fwk y, final niz f, final eyt g, final pii pii, final bky m, final grh n, final cxl x, final bjo o, final niz b) {
        this.u = new Object();
        this.k = null;
        this.l = null;
        this.w = false;
        this.p = new gmr(this, 2, null);
        this.i = (bkg)pii.get();
        this.a = a;
        this.q = new fwx(fxu.f());
        this.c = new igs();
        this.r = r;
        this.d = d;
        this.e = e;
        this.f = f;
        this.s = s;
        this.h = h;
        if (fxu.l() == lfu.a) {
            v = klv;
        }
        this.v = v;
        this.y = y;
        this.g = g;
        this.m = m;
        this.n = n;
        this.x = x;
        this.o = o;
        this.b = b;
    }
    
    @Override
    public final bkx a(final bjz bjz) {
        synchronized (this) {
            if (!this.w && this.a.g()) {
                if (this.f.g()) {
                    this.n.f();
                    if (!((igo)this.a.c()).i()) {
                        return this.r.a(bjz);
                    }
                    final PointF a = this.q.a(bjz.a);
                    this.g.d(true, a);
                    if (this.f(bjz.a)) {
                        return new bkt();
                    }
                    final krc k = this.k;
                    if (k != null) {
                        k.close();
                    }
                    final krc l = this.l;
                    if (l != null) {
                        l.close();
                    }
                    Object o = this.u;
                    synchronized (o) {
                        if (this.t != null) {
                            this.t.cancel(false);
                        }
                        monitorexit(o);
                        this.c();
                        final ofn f = ofn.f();
                        this.j = f;
                        if ((int)this.v.aQ() == hjb.b.f) {
                            this.v.aR(hjb.a.f);
                        }
                        this.e();
                        this.c.a();
                        o = ofn.f();
                        this.g(bjz.a, true, true);
                        final ofn f2 = ofn.f();
                        ((Executor)this.f.c()).execute(new gms(this, a, f2, (ofn)o));
                        return new gmw(this, (ofn)o, f, f2);
                    }
                }
            }
            return new bkt();
        }
    }
    
    public final PointF b(final igr igr) {
        final PointF pointF = new PointF(igr.b.centerX(), igr.b.centerY());
        if (!igr.c()) {
            return pointF;
        }
        return this.q.b(pointF);
    }
    
    public final void c() {
        this.h.c(this.p);
        this.i.c(this.p);
        this.i.e();
    }
    
    @Override
    public final void close() {
        synchronized (this) {
            this.w = true;
            synchronized (this.u) {
                if (this.t != null) {
                    this.t.cancel(false);
                }
                monitorexit(this.u);
                this.c();
                try (final krc k = this.k) {}
                try (final krc l = this.l) {}
            }
        }
    }
    
    public final void d(final long n) {
        try {
            synchronized (this.u) {
                this.t = this.s.schedule(new gmr(this), n, TimeUnit.MILLISECONDS);
            }
        }
        catch (final RejectedExecutionException ex) {}
    }
    
    public final void e() {
        final klv a = this.e.a;
        boolean b = false;
        a.aR(false);
        final fwj b2 = ((fwl)this.y.a.d).b;
        if (b2.b != gzr.e) {
            if (b2.b == gzr.f) {
                b = true;
            }
        }
        else {
            b = true;
        }
        ((Executor)this.f.c()).execute(new gmu(this, b));
    }
    
    public final boolean f(final PointF pointF) {
        return this.q.a(pointF).y > (float)this.x.g(cxk.b).c();
    }
    
    public final void g(final PointF pointF, final boolean b, final boolean b2) {
        ((Executor)this.f.c()).execute(new gmt(this, pointF, b, b2));
    }
}
