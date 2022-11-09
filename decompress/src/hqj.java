import java.util.concurrent.Executor;
import android.view.ViewGroup;
import android.view.ViewStub;
import java.io.Serializable;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import com.google.android.apps.camera.bottombar.BottomBar;
import android.app.Activity;
import android.content.res.Resources;
import java.util.Set;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hqj implements hrj, exn, ewz, exj, exm, exl
{
    private static final nsd u;
    private final hdo A;
    private final dag B;
    private final daj C;
    private final Handler D;
    private final Set E;
    private boolean F;
    public final Resources a;
    public final Activity b;
    public final pii c;
    public final hrh d;
    public final hpo e;
    public final ijj f;
    public final bqv g;
    public final hhu h;
    public final klj i;
    public final BottomBar j;
    public final ewy k;
    public final kjm l;
    public final hkc m;
    public final hkd n;
    public final List o;
    public final hrk p;
    public int q;
    public String r;
    public boolean s;
    public final bmz t;
    private final hqo v;
    private final hfn w;
    private final hsw x;
    private final hrv y;
    private final boolean z;
    
    static {
        u = nsd.g("com/google/android/apps/camera/socialshare/SocialShareControllerImpl");
    }
    
    public hqj(final Activity b, final pii c, final hrh d, final hqo v, final hfn w, final hpo e, final ijj f, final bqv g, final hhu h, final klv klv, final BottomBar j, final ewy k, final bmz t, final hsw x, final hrv y, final boolean z, final hdo a, final dag b2, final daj c2, final kjm l, final hkc m, final hkd n, final Handler d2) {
        this.E = new HashSet();
        this.o = new ArrayList();
        this.p = new hqg(this);
        this.F = false;
        this.q = 0;
        this.r = "";
        this.s = false;
        this.a = b.getResources();
        this.b = b;
        this.c = c;
        this.d = d;
        this.v = v;
        this.w = w;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = kld.c(klv);
        this.j = j;
        this.k = k;
        this.t = t;
        this.x = x;
        this.y = y;
        this.z = z;
        this.A = a;
        this.B = b2;
        this.C = c2;
        this.l = l;
        this.m = m;
        this.n = n;
        this.D = d2;
    }
    
    private final void m(final boolean b, final bqr bqr) {
        if (this.z && bqr != null) {
            this.A.d((Parcelable)bqr.a(), bqr.b());
            return;
        }
        final int c = this.v.c(bqr);
        boolean b2 = true;
        if (c != 1) {
            ((hrc)this.c.get()).j();
            return;
        }
        bqr.getClass();
        final bqs a = bqr.a();
        final him d = a.d();
        gxb a2;
        if (d == null) {
            a2 = null;
        }
        else {
            a2 = this.w.a(d);
        }
        if (a2 == null || a2.a().e < 100) {
            b2 = false;
        }
        if (a.j() && !b2) {
            ((hrc)this.c.get()).d(bqr, b);
            return;
        }
        ((hrc)this.c.get()).b(bqr, b);
    }
    
    @Override
    public final void a(final int n, final int n2) {
        if (n == 1000 && n2 == -1) {
            this.F = true;
            ((hrc)this.c.get()).n();
        }
    }
    
    @Override
    public final void b(final hrk hrk) {
        synchronized (this.o) {
            this.o.size();
            this.o.add(hrk);
        }
    }
    
    @Override
    public final void bj() {
        this.d.c();
        this.x.e();
        if (this.F) {
            this.F = false;
            this.D.post((Runnable)new hqf(this, 1));
        }
    }
    
    @Override
    public final void bk() {
        this.s = false;
        this.l(hri.a);
    }
    
    @Override
    public final void e() {
        this.s = true;
        this.k(hri.a);
    }
    
    @Override
    public final void f(final ViewStub viewStub) {
        this.y.f();
        final hrh d = this.d;
        d.f = viewStub.inflate();
        ((ViewGroup)d.f.getParent()).setWillNotDraw(false);
        d.d.d(d.f);
        d.g = d.f.findViewById(2131427983);
        d.c.d(d.f);
        d.f.post((Runnable)new hre(d));
        this.d.b.d(new hqf(this), this.l);
    }
    
    @Override
    public final void g(final jcb h) {
        this.d.h = h;
        this.x.f(h);
        this.d.c();
    }
    
    public final void h(final boolean b) {
        this.m(b, this.g.b());
    }
    
    @Override
    public final void i(final Parcelable parcelable, final Serializable s) {
        final bqt bqt = (bqt)s;
        final bqs bqs = (bqs)parcelable;
        czt czt;
        if (bqt.b.equals(bqt)) {
            final dag b = this.B;
            czt = new dae(b.c, b.d, bqs, b.h, hip.a);
        }
        else {
            if (!bqt.c.equals(bqt)) {
                hqj.u.c().E(2410).y("%sopen: invalid item type=%s data=%s", this.r, bqt, bqs);
                return;
            }
            final daj c = this.C;
            czt = new dah(c.a, c.b, bqs, hip.a);
        }
        this.m(false, this.g.f(czt));
    }
    
    @Override
    public final void j(final hrk hrk) {
        synchronized (this.o) {
            this.o.remove(hrk);
        }
    }
    
    final void k(final hri hri) {
        synchronized (this) {
            this.E.add(hri);
            ((hrc)this.c.get()).a();
        }
    }
    
    final void l(final hri hri) {
        synchronized (this) {
            this.E.remove(hri);
            if (this.E.isEmpty()) {
                ((hrc)this.c.get()).i();
            }
        }
    }
}
