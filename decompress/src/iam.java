import android.hardware.camera2.params.MeteringRectangle;
import android.graphics.Rect;
import android.graphics.PointF;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iam implements bjj
{
    public final fvt a;
    public final fwd b;
    public final AtomicBoolean c;
    public final AtomicBoolean d;
    public final AtomicBoolean e;
    public final AtomicBoolean f;
    public final dgn g;
    public final bjx h;
    public final cxl i;
    public final niz j;
    public final blc k;
    public final icy l;
    public final fxb m;
    public final Runnable n;
    public lfg o;
    public kwd p;
    public kjk q;
    public gir r;
    public ScheduledFuture s;
    public ScheduledFuture t;
    public ofn u;
    public final fwk v;
    public ibs w;
    private final ScheduledExecutorService x;
    private final gko y;
    
    public iam(final fvt a, final fwd b, final dgn g, final bjx h, final cxl i, final niz j, final blc k, final ScheduledExecutorService x, final gko y, final icy l, final fxb m, final byte[] array) {
        this.c = new AtomicBoolean(false);
        this.d = new AtomicBoolean(false);
        this.e = new AtomicBoolean(false);
        this.f = new AtomicBoolean(false);
        this.n = new iak(this);
        this.a = a;
        this.b = b;
        this.v = new fwk(false);
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.x = x;
        this.y = y;
        this.l = l;
        this.m = m;
    }
    
    private final void f(final boolean b) {
        final ScheduledFuture s = this.s;
        if (s != null) {
            s.cancel(true);
        }
        this.s = this.x.schedule(new iaj(this, b), 5000L, TimeUnit.MILLISECONDS);
    }
    
    @Override
    public final bkx a(final bjz bjz) {
        this.e.set(true);
        this.k.c(this.n);
        final ScheduledFuture t = this.t;
        if (t != null) {
            t.cancel(true);
        }
        final ScheduledFuture s = this.s;
        if (s != null) {
            s.cancel(true);
        }
        final PointF a = bjz.a;
        final bkw c = bkw.c(a, a, this.o.f());
        final Rect a2 = ((giq)this.r.aQ()).a;
        final kvq a3 = this.p.a();
        a3.b(c.b(a2));
        this.p.n(a3.a());
        this.u = ofn.f();
        if (this.i.k(cyl.g)) {
            if (this.c.get()) {
                if (this.f.get()) {
                    this.c();
                }
                else if (this.d.get()) {
                    this.c();
                    this.f(false);
                    this.l.f(false);
                }
                else if (!this.d.get()) {
                    this.c();
                    this.f(true);
                }
            }
            else {
                this.c();
                this.f(true);
            }
        }
        else {
            this.c();
            this.f(false);
        }
        final ibs w = this.w;
        if (w != null) {
            if (w.a.k(cyl.g)) {
                if (((iah)w.b.j.d).equals(iah.h)) {
                    w.b.f();
                }
            }
        }
        return new ial(this, bjz);
    }
    
    final void b() {
        final Rect a = ((giq)this.r.aQ()).a;
        fws.c();
        final MeteringRectangle[] a2 = fws.a;
        this.p.k(true, true, this.c.get() ^ true);
        final kwd p = this.p;
        final kvq a3 = p.a();
        a3.b(a2);
        p.l(a3.a());
        this.k.c(this.n);
        this.a.a();
        this.b.a();
        this.e.set(false);
    }
    
    public final void c() {
        final ScheduledFuture t = this.t;
        if (t != null) {
            t.cancel(true);
        }
        this.t = this.x.schedule(new iak(this, 1), 2000L, TimeUnit.MILLISECONDS);
    }
    
    final void d() {
        this.c.set(false);
        this.f.set(false);
        if (!this.g.p()) {
            this.p.k(false, false, true);
        }
    }
    
    final void e(final boolean b) {
        if (!this.i.k(cyl.g)) {
            return;
        }
        boolean b2;
        if (this.d.get() != b && !b) {
            b2 = true;
        }
        else {
            if (this.d.get() != b) {}
            b2 = false;
        }
        this.d.set(b);
        if (this.g.p()) {
            this.l.f(false);
            return;
        }
        if (this.f.get()) {
            this.l.f(false);
            if (b2) {
                this.b();
            }
            return;
        }
        if (b) {
            if (this.c.get()) {
                if (!this.e.get()) {
                    this.p.o(true);
                }
                final ScheduledFuture t = this.t;
                if (t != null) {
                    t.cancel(true);
                }
                this.k.c(this.n);
            }
        }
        else if (b2) {
            this.b();
        }
        this.l.f(b);
    }
}
