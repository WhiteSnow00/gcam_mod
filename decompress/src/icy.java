import java.util.concurrent.TimeUnit;
import java.util.concurrent.ScheduledExecutorService;
import android.content.Context;
import com.google.android.apps.camera.bottombar.BottomBarListener;
import com.google.android.apps.camera.bottombar.BottomBarController;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicBoolean;
import android.view.View;
import android.widget.TextView;
import java.util.concurrent.ScheduledFuture;
import android.animation.ObjectAnimator;
import android.view.ViewGroup;
import android.widget.FrameLayout;

// 
// Decompiled by Procyon v0.6.0
// 

public final class icy
{
    public final pii A;
    public final jgv B;
    public FrameLayout C;
    public ViewGroup D;
    public irf E;
    public ObjectAnimator F;
    public cph G;
    public cia H;
    public ScheduledFuture I;
    public TextView J;
    public idc K;
    public iep L;
    public View M;
    public View N;
    public ViewGroup O;
    public ViewGroup P;
    public ViewGroup Q;
    public int R;
    public final itx S;
    private final liz T;
    private irf U;
    public final AtomicBoolean a;
    public final AtomicLong b;
    public final BottomBarController c;
    public final BottomBarListener d;
    public final crg e;
    public final ixx f;
    public final Context g;
    public final imk h;
    public final iec i;
    public final ims j;
    public final cxl k;
    public final kjk l;
    public final kjm m;
    public final efm n;
    public final jgg o;
    public final niz p;
    public final niz q;
    public final gjj r;
    public final ScheduledExecutorService s;
    public final ivj t;
    public final ivq u;
    public final ieo v;
    public final eiq w;
    public final eip x;
    public final bqm y;
    public final klv z;
    
    public icy(final igw igw, final BottomBarController c, final crg e, final ixx f, final Context g, final liz t, final imk h, final iec i, final ims j, final cxl k, final kjk l, final klv z, final kjm m, final efm n, final jgg o, final ScheduledExecutorService s, final ivj t2, final ieo v, final eiq w, final jjb jjb, final itx s2, final bqm y, final niz p27, final niz q, final pii a, final jgv b, final gjj r) {
        this.a = new AtomicBoolean(false);
        this.b = new AtomicLong(0L);
        this.c = c;
        this.e = e;
        this.f = f;
        this.g = g;
        this.T = t;
        this.i = i;
        this.j = j;
        this.k = k;
        this.m = m;
        this.n = n;
        this.o = o;
        this.s = s;
        this.t = t2;
        this.v = v;
        this.l = l;
        this.w = w;
        this.S = s2;
        this.y = y;
        this.p = p27;
        this.q = q;
        this.A = a;
        this.z = z;
        this.h = h;
        this.B = b;
        this.r = r;
        this.d = new ict(this);
        this.u = new icu(this, igw);
        this.x = new icv(this, jjb);
        if (k.k(cwv.H)) {
            this.G = new icr(this, j);
        }
    }
    
    final void a() {
        this.t.H(false);
        if (!this.k.k(cwv.H)) {
            this.v.c();
        }
    }
    
    final void b() {
        this.t.H(true);
        if (!this.k.k(cwv.H)) {
            final ieg o = this.v.o;
            if (o != null) {
                o.setEnabled(true);
            }
        }
    }
    
    public final void c(final boolean b) {
        final ScheduledFuture i = this.I;
        if (i != null) {
            i.cancel(true);
            this.I = null;
        }
        this.m.b(new icp(this, b));
    }
    
    final void d() {
        this.c.setSnapshotButtonClickEnabled(true);
    }
    
    final void e() {
        this.c(false);
        if (this.h()) {
            final cxl k = this.k;
            final cxm a = cyl.a;
            k.b();
            this.I = this.s.schedule(new icn(this, 1), 60000L, TimeUnit.MILLISECONDS);
        }
    }
    
    final void f(final boolean b) {
        if (!this.k.k(cyl.g)) {
            return;
        }
        if (this.U == null) {
            final irg irg = new irg();
            irg.h = 2;
            irg.a = true;
            irg.e = this.g;
            irg.d = this.g.getResources().getString(2131952354);
            irg.g = this.k.k(cxr.at);
            this.U = irg.a();
        }
        if (b && this.h() && (this.e.j() || this.T.d())) {
            this.n.e(this.U);
            return;
        }
        this.n.h(this.U);
    }
    
    final void g() {
        this.a.set(true);
        this.e();
        if (this.k.k(cwv.H)) {
            if (this.q.g()) {
                ((cpf)this.q.c()).c();
                ((cpf)this.q.c()).h(false);
                ((cpf)this.q.c()).f(false);
            }
            return;
        }
        this.v.a.set(false);
        this.S.b();
    }
    
    final boolean h() {
        return this.a.get();
    }
}
