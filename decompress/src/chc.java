import java.util.Iterator;
import java.util.List;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicInteger;
import android.hardware.camera2.CaptureRequest;
import android.view.Surface;

// 
// Decompiled by Procyon v0.6.0
// 

public final class chc implements cgt
{
    public static final nsd a;
    public static final bue b;
    private del A;
    private boolean B;
    private kzl C;
    private kzl D;
    public final Object c;
    public final niz d;
    public final int e;
    public final ctr f;
    public final cgc g;
    public cfo h;
    public kwz i;
    public kwz j;
    public kwz k;
    public final lae l;
    public final ceo m;
    private final cdi n;
    private final pii o;
    private final cqp p;
    private final cid q;
    private final ckb r;
    private final chp s;
    private kwd t;
    private kwz u;
    private Surface v;
    private kvw w;
    private kvw x;
    private kvw y;
    private cev z;
    
    static {
        a = nsd.g("com/google/android/apps/camera/camcorder/frameserver/CamcorderFrameServerImageReaderImpl");
        b = new btv();
    }
    
    public chc(final lae l, final cdi n, final pii o, final cqp p12, final niz d, final ceo m, final chp s, final cid q, final cxl cxl, final ctr f, final cgc g, final ckb r) {
        this.c = new Object();
        this.B = false;
        this.l = l;
        this.n = n;
        this.o = o;
        this.p = p12;
        this.d = d;
        this.m = m;
        this.s = s;
        this.q = q;
        this.e = (int)cxl.a(cxr.c).c();
        this.f = f;
        this.g = g;
        this.r = r;
    }
    
    private final boolean g(final cfo cfo) {
        return this.p.a(cfo) || cfo.C;
    }
    
    @Override
    public final bkx a(final bjz bjz) {
        return this.n.a(bjz);
    }
    
    @Override
    public final oey b(final kra kra) {
        synchronized (this.c) {
            if (this.k != null) {
                final kwd t = this.t;
                if (t != null) {
                    if (this.D != null) {
                        t.g(CaptureRequest.JPEG_ORIENTATION, kra.e);
                        final ofn f = ofn.f();
                        final kwd t2 = this.t;
                        t2.getClass();
                        final kzl d = this.D;
                        d.getClass();
                        final kvs q = t2.q(d);
                        q.j(new chb(this, f, q));
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
            final kwz i = this.i;
            i.getClass();
            final kwz j = this.j;
            j.getClass();
            final cfo h = this.h;
            h.getClass();
            final kwd t = this.t;
            t.getClass();
            Object o = this.c;
            synchronized (o) {
                final cev z = this.z;
                z.getClass();
                this.q.a(cic.b).c(z.e(new cha(this)));
                monitorexit(o);
                o = this.v;
                if (o != null) {
                    i.d((Surface)o);
                }
                final kvw r = t.r(t.s(i), 0);
                this.x = r;
                o = ofn.f();
                r.k(new cgy(this, new AtomicInteger(0), (ofn)o, r));
                this.q.a(cic.b).c(this.A.c(new cgz(this, (ofn)o)));
                this.C = t.s(j);
                final kwz k = this.k;
                if (k != null) {
                    this.D = t.s(k);
                }
                if (this.g(h)) {
                    final kwz u = this.u;
                    u.getClass();
                    this.y = t.r(t.s(u), 2);
                    if (this.p.a(h)) {
                        final kvw y = this.y;
                        y.getClass();
                        y.k(new cgv(this, u, 1));
                    }
                    if (h.C) {
                        final kvw y2 = this.y;
                        y2.getClass();
                        y2.k(new cgv(this, u));
                    }
                }
                this.B = false;
                return (oey)o;
            }
        }
    }
    
    @Override
    public final void close() {
        synchronized (this.c) {
            final kwd t = this.t;
            if (t != null) {
                t.close();
                this.t = null;
            }
            final kvw w = this.w;
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
            this.C = null;
            this.D = null;
            try (final ley d = this.g.d) {}
            this.B = true;
        }
    }
    
    @Override
    public final void d(cfo c, final Surface v, final Surface surface) {
        synchronized (this.c) {
            this.h = c;
            final cev a = ((cew)this.o).a();
            a.d(c);
            this.z = a;
            this.A = ckx.g();
            synchronized (this.c) {
                this.v = v;
                final kwz i = this.i;
                if (i != null) {
                    i.d(v);
                }
                monitorexit(this.c);
                c = (cfo)this.c;
                synchronized (this.c) {
                    final cgc g = this.g;
                    g.d = lfe.f(surface, 30);
                    ((jfm)g.b).a = nns.j(g.c);
                    ((jfm)g.b).b = new cgb(g);
                    monitorexit(this.c);
                    synchronized (this.c) {
                        final cfo h = this.h;
                        h.getClass();
                        final cev z = this.z;
                        z.getClass();
                        final lfj a2 = h.a;
                        final kxb l = kxc.l(a2, h.g);
                        final kxa a3 = kxb.a();
                        a3.b(a2);
                        a3.g(h.e.c());
                        a3.f(34);
                        a3.d(true);
                        a3.c(30);
                        a3.h(kxd.a);
                        a3.i(65536L);
                        final kxb a4 = a3.a();
                        final glg glg = new glg();
                        glg.j(z);
                        final kwf a5 = kwg.a();
                        kwr kwr;
                        if (h.d.g()) {
                            kwr = kwr.a;
                        }
                        else {
                            kwr = kwr.b;
                        }
                        a5.g(kwr);
                        a5.a = new kwv(3, nns.m(kxc.p(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, h.n)));
                        a5.i(new kwv(3, nns.m(kxc.p(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, h.n))));
                        a5.b = new kwv(4, nns.m(kxc.p(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, h.o)));
                        a5.f(a2);
                        a5.d(a4);
                        a5.d(l);
                        a5.c(this.s.a(h));
                        a5.j(glg);
                        a5.e(this.A);
                        final boolean g2 = h.f.g();
                        kxb a6 = null;
                        kxb a8;
                        if (g2) {
                            final kxa a7 = kxb.a();
                            a7.g((kre)h.f.c());
                            a7.f(256);
                            a7.c(3);
                            a7.h(kxd.a);
                            a7.d(true);
                            a8 = a7.a();
                            a5.d(a8);
                        }
                        else {
                            a8 = null;
                        }
                        if (this.g(h)) {
                            final kxa a9 = kxb.a();
                            a9.h(kxd.a);
                            a9.b(a2);
                            a9.g(cex.a(h.e, h.c.a.v(35)));
                            a9.f(35);
                            a9.d(true);
                            a9.c(5);
                            a6 = a9.a();
                            a5.d(a6);
                        }
                        final kwd a10 = this.l.a(a5.a());
                        this.t = a10;
                        this.s.b(a10, h);
                        this.i = a10.b().a(l);
                        this.j = a10.b().a(a4);
                        if (a8 != null) {
                            this.k = a10.b().a(a8);
                        }
                        if (a6 != null) {
                            this.u = a10.b().a(a6);
                        }
                        this.n.b(a10, h);
                        if (h.B && a6 != null) {
                            this.r.a(new cjq(a10, a6, h, glg)).a().a();
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
            if (this.B) {
                chc.a.c().E(440).o("Already closed.");
                monitorexit(c);
                return;
            }
            final cev z = this.z;
            z.getClass();
            final Iterator iterator = list.iterator();
            while (iterator.hasNext()) {
                this.q.a(cic.c).c(z.e((kxc)iterator.next()));
            }
            final kwd t = this.t;
            t.getClass();
            final kzl c2 = this.C;
            c2.getClass();
            if (this.w == null) {
                (this.w = t.r(c2, 30)).k(new cgu(this));
            }
            else {
                chc.a.c().E(439).o("Recording stream already attached.");
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
            if (this.B) {
                chc.a.c().E(443).o("Already closed.");
                return;
            }
            final kvw w = this.w;
            if (w != null) {
                w.close();
                this.w = null;
            }
            else {
                chc.a.c().E(441).o("Recording stream not attached.");
            }
        }
    }
}
