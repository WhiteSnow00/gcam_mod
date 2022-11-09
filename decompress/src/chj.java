import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import android.hardware.camera2.CaptureRequest;
import android.view.Surface;

// 
// Decompiled by Procyon v0.6.0
// 

public final class chj implements cgt
{
    public static final nsd a;
    public static final bue b;
    private del A;
    private blv B;
    private final cdg C;
    private final ckb D;
    private boolean E;
    private kzl F;
    private kzl G;
    public final Object c;
    public final niz d;
    public final int e;
    public cfo f;
    public kwz g;
    public kwz h;
    public kwz i;
    public final ctr j;
    public final lae k;
    public final ceo l;
    private final cdi m;
    private final pii n;
    private final cqp o;
    private final cid p;
    private final boolean q;
    private final chp r;
    private kwd s;
    private kwz t;
    private Surface u;
    private Surface v;
    private krc w;
    private kvw x;
    private kvw y;
    private cev z;
    
    static {
        a = nsd.g("com/google/android/apps/camera/camcorder/frameserver/CamcorderFrameServerImpl");
        b = new btv();
    }
    
    public chj(final lae k, final cdi m, final pii n, final cqp o, final niz d, final ceo l, final chp r, final cid p12, final cxl cxl, final ctr j, final cdg c, final ckb d2) {
        this.c = new Object();
        this.E = false;
        this.k = k;
        this.m = m;
        this.n = n;
        this.o = o;
        this.d = d;
        this.l = l;
        this.r = r;
        this.p = p12;
        this.e = (int)cxl.a(cxr.c).c();
        this.q = cxl.j(cxr.ac);
        this.j = j;
        this.C = c;
        this.D = d2;
    }
    
    private final boolean g(final cfo cfo) {
        return this.o.a(cfo) || cfo.C;
    }
    
    @Override
    public final bkx a(final bjz bjz) {
        return this.m.a(bjz);
    }
    
    @Override
    public final oey b(final kra kra) {
        synchronized (this.c) {
            if (this.i != null) {
                final kwd s = this.s;
                if (s != null) {
                    if (this.G != null) {
                        s.g(CaptureRequest.JPEG_ORIENTATION, kra.e);
                        final ofn f = ofn.f();
                        final kwd s2 = this.s;
                        s2.getClass();
                        final kzl g = this.G;
                        g.getClass();
                        final kvs q = s2.q(g);
                        q.j(new chi(this, f, q));
                        return f;
                    }
                }
            }
            return ofi.m(new IllegalStateException("Snapshot not available"));
        }
    }
    
    @Override
    public final oey c() {
        synchronized (this.c) {
            final kwz g = this.g;
            g.getClass();
            final kwz h = this.h;
            h.getClass();
            final cfo f = this.f;
            f.getClass();
            final kwd s = this.s;
            s.getClass();
            Object o = this.c;
            synchronized (o) {
                final cev z = this.z;
                z.getClass();
                this.p.a(cic.b).c(z.e(new chh(this)));
                final kjk a = this.p.a(cic.b);
                final blv b = this.B;
                b.getClass();
                a.c(z.e(b));
                monitorexit(o);
                o = this.u;
                if (o != null) {
                    g.d((Surface)o);
                }
                final kvw r = s.r(s.s(g), 0);
                this.x = r;
                o = ofn.f();
                r.k(new chf(this, new AtomicInteger(0), (ofn)o, r));
                this.p.a(cic.b).c(this.A.c(new chg(this, (ofn)o)));
                this.F = s.u(h, noi.H(kxc.p(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, f.o)));
                final Surface v = this.v;
                if (v != null) {
                    h.d(v);
                }
                final kwz i = this.i;
                if (i != null) {
                    this.G = s.s(i);
                }
                if (this.g(f)) {
                    final kwz t = this.t;
                    t.getClass();
                    this.y = s.r(s.s(t), 2);
                    if (this.o.a(f)) {
                        final kvw y = this.y;
                        y.getClass();
                        y.k(new chd(this, t, 1));
                    }
                    if (f.C) {
                        final kvw y2 = this.y;
                        y2.getClass();
                        y2.k(new chd(this, t));
                    }
                }
                this.E = false;
                return (oey)o;
            }
        }
    }
    
    @Override
    public final void close() {
        synchronized (this.c) {
            final kwd s = this.s;
            if (s != null) {
                s.close();
                this.s = null;
            }
            final krc w = this.w;
            if (w != null) {
                w.close();
                this.w = null;
            }
            final kvw x = this.x;
            if (x != null) {
                x.close();
                this.x = null;
            }
            final kvw y = this.y;
            if (y != null) {
                y.close();
                this.y = null;
            }
            this.F = null;
            this.G = null;
            this.E = true;
        }
    }
    
    @Override
    public final void d(cfo c, final Surface u, final Surface v) {
        synchronized (this.c) {
            this.f = c;
            final cev a = ((cew)this.n).a();
            a.d(c);
            this.z = a;
            this.A = ckx.g();
            final cdg c2 = this.C;
            final eyt a2 = c2.a;
            c2.c.n();
            this.B = new blv(a2, false, c.c.a, c2.b, c.a, c2.c.a());
            synchronized (this.c) {
                this.u = u;
                final kwz g = this.g;
                if (g != null) {
                    g.d(u);
                }
                monitorexit(this.c);
                c = (cfo)this.c;
                synchronized (this.c) {
                    this.v = v;
                    final kwz h = this.h;
                    if (h != null) {
                        h.d(v);
                    }
                    monitorexit(this.c);
                    synchronized (this.c) {
                        final cfo f = this.f;
                        f.getClass();
                        final cev z = this.z;
                        z.getClass();
                        final lfj a3 = f.a;
                        final lfj b = f.b;
                        final kxa a4 = kxb.a();
                        a4.h(kxd.c);
                        a4.b(b);
                        a4.g(f.g);
                        a4.d(true);
                        final kxb a5 = a4.a();
                        final kxa a6 = kxb.a();
                        a6.h(kxd.e);
                        a6.b(b);
                        a6.g(f.e.c());
                        a6.f(34);
                        a6.d(true);
                        final kxb a7 = a6.a();
                        final glg glg = new glg();
                        glg.j(z);
                        final kwf a8 = kwg.a();
                        kwr kwr;
                        if (f.d.g()) {
                            kwr = kwr.a;
                        }
                        else {
                            kwr = kwr.b;
                        }
                        a8.g(kwr);
                        a8.a = new kwv(3, nns.m(kxc.p(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, f.n)));
                        a8.i(new kwv(3, nns.m(kxc.p(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, f.n))));
                        a8.b = new kwv(4, nns.m(kxc.p(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, f.o)));
                        a8.f(a3);
                        a8.d(a7);
                        a8.d(a5);
                        a8.c(this.r.a(f));
                        a8.j(glg);
                        a8.e(this.A);
                        final boolean g2 = f.f.g();
                        kxb a9 = null;
                        kxb a11;
                        if (g2) {
                            final kxa a10 = kxb.a();
                            a10.b(b);
                            a10.g((kre)f.f.c());
                            a10.f(256);
                            a10.c(3);
                            a10.h(kxd.a);
                            a10.d(true);
                            a11 = a10.a();
                            a8.d(a11);
                        }
                        else {
                            a11 = null;
                        }
                        if (this.g(f)) {
                            final kxa a12 = kxb.a();
                            a12.h(kxd.a);
                            a12.b(b);
                            a12.g(cex.a(f.e, f.c.a.v(35)));
                            a12.f(35);
                            a12.d(true);
                            a12.c(5);
                            a9 = a12.a();
                            a8.d(a9);
                        }
                        final nog d = noi.D();
                        if (this.q) {
                            d.g(kwu.a);
                        }
                        a8.h(d.f());
                        final kwd a13 = this.k.a(a8.a());
                        this.s = a13;
                        this.r.b(a13, f);
                        this.g = a13.b().a(a5);
                        this.h = a13.b().a(a7);
                        if (a11 != null) {
                            this.i = a13.b().a(a11);
                        }
                        if (a9 != null) {
                            this.t = a13.b().a(a9);
                        }
                        this.m.b(a13, f);
                        if (f.B && a9 != null) {
                            this.D.a(new cjq(a13, a9, f, glg)).a().a();
                        }
                    }
                }
            }
        }
    }
    
    @Override
    public final void e(final List list) {
        final Object c = this.c;
        monitorenter(c);
        try {
            if (this.E) {
                chj.a.c().E(457).o("Already closed.");
                monitorexit(c);
                return;
            }
            final cev z = this.z;
            z.getClass();
            final Iterator iterator = list.iterator();
            while (iterator.hasNext()) {
                this.p.a(cic.c).c(z.e((kxc)iterator.next()));
            }
            final kwd s = this.s;
            s.getClass();
            final kzl f = this.F;
            f.getClass();
            if (this.w == null) {
                this.w = s.p(f);
                final blv b = this.B;
                b.getClass();
                b.a(5);
            }
            else {
                chj.a.c().E(456).o("Recording stream already attached.");
            }
            monitorexit(c);
        }
        finally {
            monitorexit(c);
            while (true) {}
        }
    }
    
    @Override
    public final void f() {
        synchronized (this.c) {
            if (this.E) {
                chj.a.c().E(460).o("Already closed.");
                return;
            }
            final krc w = this.w;
            if (w != null) {
                w.close();
                this.w = null;
                final blv b = this.B;
                b.getClass();
                b.a(6);
            }
            else {
                chj.a.c().E(458).o("Recording stream not attached.");
            }
        }
    }
}
