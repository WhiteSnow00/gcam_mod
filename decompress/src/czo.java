import android.os.SystemClock;
import java.util.concurrent.Callable;
import android.net.Uri;
import android.graphics.Bitmap;
import java.util.Iterator;
import j$.time.Instant;
import java.util.concurrent.Executor;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class czo implements bqv, hhz
{
    public static final nsd a;
    public final czr b;
    public final oen c;
    public final Context d;
    public final dag e;
    public final daj f;
    public final dab g;
    public final Executor h;
    public final kse i;
    public final hfn j;
    public final boolean k;
    public final dad l;
    public final dad m;
    public final ofn n;
    public final hkc o;
    public final Instant p;
    public final czv q;
    public final bmz r;
    private final cxl s;
    
    static {
        a = nsd.g("com/google/android/apps/camera/data/CameraFilmstripDataAdapter");
    }
    
    public czo(final Context d, final bmz r, final dag e, final daj f, final dab g, final kse i, final cxl s, final Executor h, final hfn j, final boolean k, final hkc o, final czv q) {
        this.b = new czr();
        this.c = new czn(this);
        this.d = d;
        this.r = r;
        this.e = e;
        this.f = f;
        this.g = g;
        this.i = i;
        this.s = s;
        this.h = h;
        this.j = j;
        this.k = k;
        this.o = o;
        this.q = q;
        final ock a = ock.a;
        this.p = Instant.now();
        this.n = ofn.f();
        this.l = new dad();
        this.m = new dad();
    }
    
    private final bqr u(final him him) {
        final bqr e = this.e(him);
        njo.r(true, "Could not find %s in dataAdapter", him);
        return e;
    }
    
    private final dad w(final bqr bqr) {
        if (bqr.d() == hip.a) {
            return this.l;
        }
        return this.m;
    }
    
    @Override
    public final int a() {
        return this.q().a();
    }
    
    @Override
    public final bqr b() {
        return this.q().b();
    }
    
    @Override
    public final void bb() {
        this.g().d(new czk(this, 1), this.h);
    }
    
    @Override
    public final void bc() {
        this.h.execute(new czk(this, 2));
    }
    
    @Override
    public final void bd() {
        if (this.a() == 0) {
            final oey a = oev.a;
            return;
        }
        final oey p = ofi.p(new czk(this), this.h);
        ofi.w(p, this.c, this.h);
        this.r.i().c(new czj(p));
    }
    
    @Override
    public final void c(final bqp bqp) {
        final czr b = this.b;
        njo.p(b.a.size() < 4, "More listeners added than is allowed in configured capacity: 4");
        b.a.add(bqp);
        if (this.n.isDone()) {
            bqp.a();
        }
    }
    
    @Override
    public final void d(final bqp bqp) {
        this.b.a.remove(bqp);
    }
    
    @Override
    public final bqr e(final him him) {
        final bqr d = this.l.d(him);
        if (d != null) {
            return d;
        }
        return this.m.d(him);
    }
    
    @Override
    public final bqr f(final bqr bqr) {
        return this.w(bqr).e(bqr);
    }
    
    @Override
    public final oey g() {
        final oey p = ofi.p(new czk(this, 3), this.h);
        final cxl s = this.s;
        final cxo a = cxr.a;
        s.c();
        this.r.i().c(new czj(p, 1));
        ofi.w(p, this.c, this.h);
        return p;
    }
    
    @Override
    public final void h() {
        this.a();
        this.m.h();
        this.b.a();
    }
    
    @Override
    public final void i(final him him) {
        final bqr e = this.e(him);
        if (e == null) {
            a.k(czo.a.c(), "onSessionCanceled tried to remove URI that couldn't be found: %s", him, '\u0280');
            return;
        }
        this.r(e);
    }
    
    @Override
    public final Iterator iterator() {
        return this.q().iterator();
    }
    
    @Override
    public final void j(final him him, final Bitmap bitmap, final int n) {
        if (this.u(him) == null) {
            return;
        }
        new kre(bitmap.getWidth(), bitmap.getHeight());
        this.b.a();
    }
    
    @Override
    public final void k(final him him) {
        final bqr u = this.u(him);
        if (u == null) {
            return;
        }
        final boolean booleanValue = (boolean)niz.h(this.j.a(him)).b(btt.l).e(false);
        if (u.d() == hip.b) {
            this.p(him);
            final bqs a = u.a();
            if (a instanceof czx) {
                final czw czw = new czw((czx)a);
                czw.d(false);
                u.f(czw.a());
            }
            return;
        }
        if (!(u instanceof dah) && !booleanValue) {
            if (u instanceof dae) {
                final Uri c = u.a().c();
                njo.o(c.equals((Object)Uri.EMPTY) ^ true);
                final dag e = this.e;
                this.s(u, new dae(e.c, e.d, e.f.c(c, him), e.h, u.d()));
            }
            return;
        }
        final Uri c2 = u.a().c();
        njo.r(c2.equals((Object)Uri.EMPTY) ^ true, "Could not find MediaStore URI for %s", him);
        final daj f = this.f;
        this.s(u, new dah(f.a, f.b, f.d.c(c2, him), u.d()));
    }
    
    @Override
    public final void o(final him him, final hih hih, final hip hip) {
        final hio c = hih.c;
        if (c != hio.o && c != hio.j && c != hio.n && c != hio.r) {
            final dag e = this.e;
            kre b;
            if ((b = e.h.c.get(him)) == null) {
                b = dag.b;
                dag.a.c().E(684).y("Size not set for in-progress item %s with mediaStoreRecord %s. Assuming %s", him, hih, b);
            }
            final hhy a = e.g.a(him);
            Instant instant;
            if (a == null) {
                final ocl e2 = e.e;
                instant = Instant.now();
            }
            else {
                instant = Instant.ofEpochMilli(a.d());
            }
            final czw k = czx.k();
            k.a = him;
            k.c(instant);
            k.e(instant);
            k.b = b;
            k.d(true);
            k.b(hih.a);
            k.i(hih.b);
            this.t(new dae(e.c, e.d, k.a(), e.h, hip));
            return;
        }
        if (c != hio.o && this.k && !hih.d) {
            return;
        }
        final daj f = this.f;
        final ocl c2 = f.c;
        final Instant now = Instant.now();
        final czw i = czx.k();
        i.c(now);
        i.e(now);
        i.d(true);
        i.b(hih.a);
        i.i(hih.b);
        i.a = him;
        this.t(new dah(f.a, f.b, i.a(), hip));
    }
    
    @Override
    public final void p(final him him) {
        if (this.u(him) == null) {
            return;
        }
        this.b.a();
    }
    
    public final dad q() {
        if (this.o.c(hjq.R)) {
            return this.m;
        }
        return this.l;
    }
    
    public final void r(final bqr bqr) {
        this.w(bqr).j(bqr);
        this.b.a();
    }
    
    public final void s(final bqr bqr, final bqr bqr2) {
        this.w(bqr2).k(bqr2);
        final oey q = ofi.q(new czm(this, bqr), this.h);
        q.d(new czl(this.b), this.h);
        this.r.i().c(new czj(q, 2));
    }
    
    public final void t(final bqr bqr) {
        this.w(bqr).k(bqr);
    }
    
    @Override
    public final void v(final him him) {
        final bqr e = this.e(him);
        final hhy a = this.j.a(him);
        if (a != null) {
            a.k().A(SystemClock.elapsedRealtime());
        }
        if (e != null) {
            this.r(e);
        }
    }
}
