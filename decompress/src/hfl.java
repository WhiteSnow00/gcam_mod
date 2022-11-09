import java.util.Iterator;
import java.util.HashMap;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.BitmapDrawable;
import j$.util.function.Consumer;
import com.google.googlex.gcam.DebugParams;
import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hfl implements hhy
{
    private static final nsd x;
    private gxd A;
    private final List B;
    private boolean C;
    private final gxa D;
    private final gwp E;
    public final hfw a;
    public final dck b;
    public final hio c;
    public krd d;
    public hgz e;
    public final Executor f;
    public final hin g;
    public final hfu h;
    public final hha i;
    public final btl j;
    public final jdi k;
    public final huz l;
    public final ofn m;
    public final ofn n;
    public boolean o;
    public ljm p;
    public final niz q;
    public final hie r;
    public hia s;
    public final ofn t;
    public volatile niz u;
    public int v;
    public int w;
    private iwv y;
    private final hhu z;
    
    static {
        x = nsd.g("com/google/android/apps/camera/session/CaptureSessionBase");
    }
    
    public hfl(final Executor f, final hha i, final hfu h, final huz l, final dck b, final hhu z, final jdi k, final hio c, final String s, final btl j, final hie r, final gxa d, final niz q) {
        this.y = iwx.a;
        this.d = krd.c;
        final ofn f2 = ofn.f();
        this.m = f2;
        this.n = ofn.f();
        this.B = new ArrayList();
        this.C = false;
        this.o = false;
        this.v = 1;
        this.w = 1;
        this.t = ofn.f();
        this.f = f;
        this.z = z;
        this.r = r;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
        this.b = b;
        this.D = d;
        this.q = q;
        this.c = c;
        this.a = new hfw();
        final hin a = hin.a(him.a(), r.b, s);
        this.g = a;
        this.E = new gxy(this);
        z.h(a.a, f2, r.d);
        this.u = nii.a;
    }
    
    @Override
    public final void A() {
        this.T("finalizeSession");
        this.i.a(this.e);
        this.h.a();
        this.E.h();
    }
    
    @Override
    public final void C(final iwv y, final Throwable t) {
        final String value = String.valueOf(t.getMessage());
        String concat;
        if (value.length() != 0) {
            concat = "finishWithFailure, throwable message = ".concat(value);
        }
        else {
            concat = new String("finishWithFailure, throwable message = ");
        }
        this.E(concat);
        if (this.a.a()) {
            this.E("Ignoring finishWithFailure. CaptureSession already saved/canceled or failed.");
            return;
        }
        this.a.e(4);
        this.y = y;
        this.t();
        this.J(y);
        final hha i = this.i;
        final hgz e = this.e;
        e.getClass();
        i.a(e);
        this.h.g(this.v, this.w, t);
        this.b.e(this.g.b);
    }
    
    @Override
    public final void D(final boolean b) {
        if (b) {
            final niz q = this.q;
            if (!q.g()) {
                return;
            }
            final hwe hwe = (hwe)q.c();
            hwe.i(hwd.c);
            final ksh a = hwe.a;
            if (a != null) {
                a.a();
                hwe.a = null;
            }
        }
        this.b.c(this.g.b, "onFramesRequested");
    }
    
    final void E(final String s) {
        hfl.x.c().E(2276).x("[%s] %s", this.h(), s);
    }
    
    final void F(final Bitmap bitmap, int length) {
        synchronized (this) {
            final hhu z = this.z;
            final him h = this.h();
            final hho hho = new hho(z, h, bitmap, length);
            final String value = String.valueOf(h);
            length = String.valueOf(value).length();
            final StringBuilder sb = new StringBuilder(length + 33);
            sb.append("#onSessionCaptureIndicatorUpdate ");
            sb.append(value);
            z.e(h, hho, sb.toString());
        }
    }
    
    final void G(final him him) {
        synchronized (this) {
            this.T("notifySessionUpdated");
            final hhu z = this.z;
            final hhn hhn = new hhn(z, him, 1);
            final String value = String.valueOf(him);
            final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 18);
            sb.append("#onSessionUpdated ");
            sb.append(value);
            z.e(him, hhn, sb.toString());
        }
    }
    
    final void H() {
        synchronized (this) {
            this.m.cancel(true);
            final hhu z = this.z;
            final him h = this.h();
            final oey oey = z.e.get(h);
            if (oey == null) {
                a.k(hhu.a.b(), "%s: No queued future found, maybe shot already finalized?: notifyTaskCanceled", h, '\u0911');
                return;
            }
            oey.d(new hhn(z, h), z.d);
        }
    }
    
    final void I() {
        synchronized (this) {
            this.z.g(this.h());
        }
    }
    
    final void J(final iwv iwv) {
        synchronized (this) {
            final hhu z = this.z;
            final him h = this.h();
            final oey oey = z.e.get(h);
            if (oey == null) {
                a.k(hhu.a.b(), "%s: No queued future found, maybe shot already finalized?: notifyTaskFailed", h, '\u0917');
                return;
            }
            oey.d(new hhn(z, h, 3), z.d);
        }
    }
    
    final void K(final krd krd) {
        synchronized (this) {
            this.S(krd.e);
            final hhu z = this.z;
            final him h = this.h();
            final hhp hhp = new hhp(z, h, krd);
            final String value = String.valueOf(h);
            final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 19);
            sb.append("#onSessionProgress ");
            sb.append(value);
            z.e(h, hhp, sb.toString());
        }
    }
    
    @Override
    public final void L(final ljm p) {
        final ljm p2 = this.p;
        boolean b = false;
        if (p2 != null && p.b() > p2.b()) {
            b = true;
        }
        if (this.p != null && !b) {
            return;
        }
        this.p = p;
    }
    
    @Override
    public final void M(final DebugParams debugParams) {
        this.u = niz.i(debugParams);
    }
    
    public final void N(final krd d, boolean b) {
        monitorenter(this);
        final boolean b2 = true;
        Label_0031: {
            Label_0029: {
                if (!b) {
                    Label_0254: {
                        try {
                            if (d != krd.a) {
                                b = b2;
                                break Label_0031;
                            }
                            b = false;
                            break Label_0031;
                        }
                        finally {
                            break Label_0254;
                        }
                        break Label_0029;
                    }
                    monitorexit(this);
                }
            }
            b = b2;
        }
        njo.e(b, "Cannot set progress to 100% before persisting images.");
        this.d = d;
        if (this.r.d == hip.b) {
            krd d2;
            if (!this.o && d.a(krd.d) >= 0) {
                d2 = krd.d;
            }
            else {
                d2 = d;
            }
            final hie r = this.r;
            final Executor f = this.f;
            if (r.d == hip.b) {
                if (!d2.d()) {
                    final krr g = r.g;
                    final String value = String.valueOf(r);
                    final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 59);
                    sb.append("Skipping progress update for not yet started GcaMediaGroup ");
                    sb.append(value);
                    g.b(sb.toString());
                }
                else {
                    ofi.w(r.c().c(), new hic(r, d2), f);
                }
            }
        }
        this.K(d);
        final gxd a = this.A;
        if (a != null) {
            a.a(d);
        }
        monitorexit(this);
    }
    
    @Override
    public final void O(final iwv y) {
        synchronized (this) {
            if (!this.a.c() && !this.a.b()) {
                final String value = String.valueOf(ksc.b());
                String concat;
                if (value.length() != 0) {
                    concat = "Ignoring setProgressMessage - state is !started && !finishing: ".concat(value);
                }
                else {
                    concat = new String("Ignoring setProgressMessage - state is !started && !finishing: ");
                }
                this.E(concat);
                return;
            }
            this.T("setProgressMessage");
            this.y = y;
            if (!jwn.af(y) && this.d == krd.c) {
                this.d = krd.b;
            }
            final gxd a = this.A;
            if (a != null) {
                a.b(y);
            }
        }
    }
    
    @Override
    public final void P(final kre kre) {
        throw null;
    }
    
    @Override
    public final void Q(final long n) {
        this.z.d((Consumer)new hhs(n));
    }
    
    @Override
    public final void S(final Integer n) {
        this.b.f(this.g.b, n);
    }
    
    final void T(final String s) {
        this.b.c(this.g.b, s);
    }
    
    @Override
    public final void U(final Bitmap bitmap, final int n) {
        this.T("updateCaptureIndicatorThumbnail");
        if (!this.C) {
            this.F(bitmap, n);
            this.h.e(this.q);
            this.C = true;
        }
    }
    
    @Override
    public final void V(final Bitmap bitmap) {
        this.z.f(bitmap);
    }
    
    @Override
    public final void W(final Bitmap bitmap) {
        if (this.a.a()) {
            return;
        }
        this.T("updateThumbnail");
        final hha i = this.i;
        final hgz e = this.e;
        e.getClass();
        final BitmapDrawable bitmapDrawable = new BitmapDrawable(i.a.getResources(), bitmap);
        boolean b = true;
        final bfm bfm = new bfm(bitmapDrawable, 1);
        final hxg b2 = i.b;
        final him a = e.a;
        b2.b.size();
        if (bfm.a() > 20971520) {
            bfm.a();
        }
        else {
            final Drawable f = bfm.f();
            b2.c.put(a, kre.h(f.getIntrinsicWidth(), f.getIntrinsicHeight()));
            b2.b.put((Object)a, (Object)bfm);
            final Integer n = b2.d.get(a);
            final HashMap d = b2.d;
            int n2;
            if (n == null) {
                n2 = 0;
            }
            else {
                n2 = n + 1;
            }
            d.put(a, n2);
        }
        this.G(this.h());
        if (this.r.d == hip.b) {
            this.T("Writing out thumbnail");
            final hie r = this.r;
            final Executor f2 = this.f;
            if (r.d != hip.b) {
                b = false;
            }
            njo.p(b, "Thumbnail can be written to store only when using private store API");
            ofi.w(odg.h(r.c().c(), new hib(r, bitmap), f2), new hfj(this), odx.a);
        }
        this.h.d(bitmap);
    }
    
    final void X() {
        hfl.x.b().E(2274).x("[%s] %s", this.h(), "Failed to write out thumbnail for MARS shot");
    }
    
    @Override
    public final void Y(final int n) {
        if (this.v == 1) {
            this.v = n;
        }
        this.w = n;
    }
    
    @Override
    public final krd a() {
        return this.d;
    }
    
    @Override
    public final void b(final krd krd) {
        synchronized (this) {
            this.N(krd, false);
        }
    }
    
    @Override
    public final void c(final gxd a) {
        if (!jwn.af(this.y)) {
            a.b(this.y);
        }
        a.a(this.d);
        this.A = a;
    }
    
    @Override
    public final long d() {
        return this.r.b;
    }
    
    public final gxa e() {
        final gxa d = this.D;
        d.getClass();
        return d;
    }
    
    @Override
    public final hia f() {
        final hia s = this.s;
        s.getClass();
        return s;
    }
    
    @Override
    public final hie g() {
        return this.r;
    }
    
    @Override
    public final him h() {
        return this.g.a;
    }
    
    @Override
    public final hio i() {
        return this.c;
    }
    
    @Override
    public final hip j() {
        return this.r.d;
    }
    
    @Override
    public final huz k() {
        return this.l;
    }
    
    @Override
    public final ljm l() {
        return this.p;
    }
    
    @Override
    public final niz m() {
        return this.u;
    }
    
    @Override
    public final niz n() {
        return this.q;
    }
    
    final niz o(final hwr hwr, final hbm hbm) {
        return hwr.c.b(new hfg(this, hwr, hbm));
    }
    
    @Override
    public final oey p() {
        return this.t;
    }
    
    @Override
    public final oey q() {
        return ofi.o(this.m);
    }
    
    @Override
    public final String s() {
        return this.g.c;
    }
    
    final void t() {
        monitorenter(this);
        try {
            final Iterator iterator = this.B.iterator();
            while (iterator.hasNext()) {
                ((Runnable)iterator.next()).run();
            }
            this.x();
            this.r.d();
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    @Override
    public final String toString() {
        return this.g.toString();
    }
    
    @Override
    public final void u(final hik hik) {
        final hfu h = this.h;
        synchronized (h.a) {
            h.a.add(hik);
        }
    }
    
    final void v(final Runnable runnable) {
        synchronized (this) {
            this.B.add(runnable);
        }
    }
    
    @Override
    public final void w(final Throwable t) {
        if (this.C && !(t instanceof dgg)) {
            this.T("cancel() invoked, but userNotifiedCaptureOccurred. Invoking finishWithFailure.");
            this.C(iwx.a, new dgi("cancel invoked, but user already notified.", t));
            return;
        }
        if (this.a.a()) {
            final String value = String.valueOf(t);
            final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 72);
            sb.append("Ignoring cancel. CaptureSession already saved/canceled or failed. Cause:");
            sb.append(value);
            this.E(sb.toString());
            return;
        }
        this.T("cancel");
        this.a.e(4);
        this.t();
        this.H();
        final hgz e = this.e;
        if (e != null) {
            this.i.a(e);
            this.e = null;
        }
        this.h.f(this.v, this.w, new dgg(t));
        this.b.e(this.g.b);
    }
    
    final void x() {
        synchronized (this.m) {
            if (!this.m.cancel(true)) {
                this.E("Could not cancel MediaStore insertion");
            }
        }
    }
    
    @Override
    public final void y() {
        this.h.i(this.v, this.w);
    }
    
    public final void z() {
        this.e().a(this.E);
    }
}
