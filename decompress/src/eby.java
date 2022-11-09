import android.os.SystemClock;
import java.util.Iterator;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.HashSet;
import java.util.concurrent.Executor;
import android.os.ConditionVariable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicBoolean;
import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;
import android.app.Activity;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class eby implements ebm, eaz
{
    private static final nsd N;
    public final jgi A;
    public final hkc B;
    public final hkd C;
    public boolean D;
    public long E;
    public long F;
    public long G;
    public long H;
    public int I;
    public eat J;
    public final eap K;
    public final ebl L;
    public final bmq M;
    private final pii O;
    private final efm P;
    private final Set Q;
    private final Activity R;
    private final htm S;
    private final ScheduledExecutorService T;
    private final edy U;
    private final kjk V;
    private final edf W;
    private final jdj X;
    private int Y;
    public final Context a;
    public final edx b;
    public final gxf c;
    public final cxl d;
    public final edc e;
    public final ebo f;
    public final kjm g;
    public final klv h;
    public final eyt i;
    public final kse j;
    public final ivj k;
    public final igu l;
    public final Set m;
    public final ebc n;
    public final eba o;
    public final ecv p;
    public float q;
    public final AtomicBoolean r;
    public final AtomicInteger s;
    public final ConditionVariable t;
    public final car u;
    public final irf v;
    public final irf w;
    public final irf x;
    public final irf y;
    public final irf z;
    
    static {
        N = nsd.g("com/google/android/apps/camera/imax/ImaxRecordingController");
    }
    
    public eby(final Context context, final edx b, final pii o, final gxf c, final edc e, final ebo f, final kjm g, final efm p31, final eap k, final ecv p32, final cxl d, final klv h, final eyt i, final edf w, final ebl l, final kjk v, final kse j, final Activity r, final htm s, final ivj m, final ScheduledExecutorService t, final igu l2, final Set m2, final ebc n, final jgi a, final eba o2, final edy u, final bmq m3, final jdj x, final hkc b2, final hkd c2) {
        this.q = 0.0f;
        this.r = new AtomicBoolean(false);
        this.s = new AtomicInteger(0);
        this.t = new ConditionVariable(true);
        this.D = false;
        this.I = 1;
        this.a = context;
        this.b = b;
        this.O = o;
        this.c = c;
        this.e = e;
        this.f = f;
        this.g = g;
        this.P = p31;
        this.K = k;
        this.p = p32;
        this.d = d;
        this.h = h;
        this.i = i;
        this.W = w;
        this.L = l;
        this.j = j;
        this.R = r;
        this.S = s;
        this.k = m;
        this.T = t;
        this.l = l2;
        this.m = m2;
        this.n = n;
        this.A = a;
        this.o = o2;
        this.V = v;
        this.U = u;
        this.M = m3;
        this.X = x;
        this.B = b2;
        this.C = c2;
        b.f();
        this.u = new car(j, m2);
        v.c(o2.f.a(new ebp(this), g));
        n.requestLayout();
        o2.l = this;
        final irg irg = new irg();
        irg.e = context;
        irg.a = false;
        irg.h = 9;
        irg.b = 1500;
        irg.g = d.k(cxr.at);
        irg.f = true;
        irg.d = context.getString(2131951671);
        this.v = irg.a();
        irg.d = context.getString(2131951670);
        this.w = irg.a();
        irg.d = context.getString(2131951672);
        this.x = irg.a();
        irg.d = context.getString(2131952128);
        this.y = irg.a();
        irg.d = context.getString(2131952127);
        this.z = irg.a();
        this.Q = new HashSet();
    }
    
    private final void i(final boolean b, final float n, final int n2) {
        this.o.a(false);
        if (!this.r.get()) {
            this.g();
            this.S.b(2131886107);
            if (n2 != 2) {
                if (b) {
                    if (n >= 1.0f || n2 != 1) {
                        this.X.c(0);
                    }
                }
                else {
                    this.X.c(1);
                }
            }
        }
        this.s.set(0);
    }
    
    private final void j(final Runnable runnable) {
        try {
            this.T.schedule(runnable, 250L, TimeUnit.MILLISECONDS);
        }
        catch (final RejectedExecutionException ex) {}
    }
    
    @Override
    public final void a(final int n) {
        this.c();
        this.d(efn.c(n, this.a, this.f.k()));
        final nsu c = eby.N.c();
        final ebr ebr = new ebr(this, n);
        nvb.g(ebr);
        a.k(c, "Capture stopped reason: %s", ebr, '\u0440');
        this.g.execute(new ebv(this, n));
    }
    
    public final float b() {
        final float n = (float)this.W.a();
        final float q = this.q;
        float n2 = n;
        if (q < 0.0f) {
            n2 = -n;
        }
        return (360.0f - n2) * q + n2;
    }
    
    public final void c() {
        final Iterator iterator = this.Q.iterator();
        while (iterator.hasNext()) {
            this.P.h((efl)iterator.next());
        }
        this.Q.clear();
    }
    
    public final void d(final String d) {
        final irg irg = new irg();
        irg.e = this.a;
        irg.d = d;
        irg.h = 11;
        irg.a = false;
        irg.g = this.d.k(cxr.at);
        final irf a = irg.a();
        this.P.e(a);
        this.Q.add(a);
    }
    
    public final void e(final irf irf) {
        this.P.e(irf);
        this.Q.add(irf);
    }
    
    public final void f() {
        if (this.D) {
            return;
        }
        if (this.s.get() == 0 && this.o.b()) {
            this.t.close();
            final AtomicInteger s = this.s;
            final int n = 1;
            s.set(1);
            this.E = SystemClock.uptimeMillis() + 250L;
            this.o.a(true);
            final kjm g = this.g;
            final edc e = this.e;
            e.getClass();
            g.b(new ebw(e));
            int requestedOrientation = this.R.getRequestedOrientation();
            this.Y = requestedOrientation;
            final int n2 = this.R.getWindowManager().getDefaultDisplay().getRotation() * 90;
            if (n2 != 0) {
                if (n2 == 180) {
                    requestedOrientation = n;
                }
                else if (n2 == 90) {
                    requestedOrientation = 0;
                }
                else if (n2 == 270) {
                    requestedOrientation = 8;
                }
            }
            else {
                requestedOrientation = n;
            }
            this.R.setRequestedOrientation(requestedOrientation);
            this.S.b(2131886106);
            this.J = ((eev)this.O).a();
            this.U.c(this.R.getWindowManager().getDefaultDisplay().getRotation() * 90);
            this.j(new ebt(this, 2));
        }
    }
    
    public final void g() {
        this.R.setRequestedOrientation(this.Y);
    }
    
    public final void h(final boolean b, final int i) {
        kjm.a();
        final int value = this.s.get();
        if (this.r.get()) {
            if (value != 3) {
                if (value != 2) {
                    return;
                }
            }
        }
        else {
            if (value != 3) {
                return;
            }
            final ees b2 = this.b.c.b;
            if (b2 == null) {
                return;
            }
            if (b2.a() == 0) {
                return;
            }
        }
        this.s.set(4);
        this.F = SystemClock.uptimeMillis();
        final float g = this.f.g();
        this.f.e.set(false);
        this.I = i;
        this.e.b();
        this.j.f("record#prepareToStop");
        Object o = this.b;
        synchronized (o) {
            ((edx)o).g = true;
            monitorexit(o);
            o = ((edx)o).c;
            ((edu)o).d();
            o = ((edu)o).b;
            if (o != null) {
                ((ees)o).a();
            }
            this.j.g();
            if (!b) {
                this.j.f("record#stopCapture");
                this.b.g(this.J.a());
                this.j.g();
                final long max = Math.max(this.F - this.E, 0L);
                o = this.i;
                final int j = this.I;
                this.J.c();
                ((eyt)o).an(efn.d(j), 0L, max, this.b(), (boolean)this.h.aQ());
                this.i(false, g, i);
                synchronized (this.m) {
                    this.m.remove(this.J.a());
                    return;
                }
            }
            this.j.f("record#getCapturePreview");
            o = this.b;
            ((edx)o).l.a(new edv((edx)o, new ebq(this)));
            this.K.b(aas.f);
            this.j.g();
            this.i(true, g, this.I);
        }
    }
}
