import com.google.android.apps.camera.ui.popupmenu.PopupMenuButton;
import android.widget.FrameLayout;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.view.View$AccessibilityDelegate;
import android.view.View$OnClickListener;
import android.view.ViewStub;
import android.view.View;
import com.google.android.apps.camera.camcorder.ui.stabilization.StabilizationUi;
import java.util.concurrent.atomic.AtomicBoolean;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cpr implements cpu
{
    private irf A;
    private irf B;
    private krc C;
    private final kjk D;
    public final cqk a;
    public final cqc b;
    public final efm c;
    public final hkg d;
    public final kjm e;
    public final Context f;
    public final pii g;
    public final gkw h;
    public final cxl i;
    public final AtomicBoolean j;
    public final hkd k;
    public final gjj l;
    public final jjb m;
    public StabilizationUi n;
    public cpt o;
    public irf p;
    public irf q;
    public cql r;
    public final liq s;
    public krc t;
    public int u;
    public final Object v;
    public final cpl w;
    public clq x;
    public final ihl y;
    private View z;
    
    public cpr(final cqk a, final cqc b, final efm c, final hkg d, final kjm e, final Context f, final pii g, final gkw h, final ihl y, final cxl i, final bmz bmz, final hkd k, final gjj l, final jjb m) {
        this.j = new AtomicBoolean(false);
        this.o = cpt.c;
        this.r = cql.a;
        this.s = new cpk(this);
        this.w = new cpl(this);
        this.u = -1;
        this.v = new Object();
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.y = y;
        this.i = i;
        this.D = bmz.i();
        this.k = k;
        this.l = l;
        this.m = m;
    }
    
    public static boolean o(final kra kra) {
        return kra.equals(kra.b) || kra.equals(kra.d);
    }
    
    private final void q() {
        this.d();
        this.n.setVisibility(8);
        this.f();
        ((cpy)this.b).a.d();
    }
    
    private final void r() {
        njo.p(this.o.e, "Stabilization button is not visible");
        this.n.setVisibility(0);
    }
    
    @Override
    public final cqk a() {
        return this.a;
    }
    
    @Override
    public final void b() {
        synchronized (this.v) {
            final irf b = this.B;
            if (b != null) {
                this.c.h(b);
                this.B = null;
            }
        }
    }
    
    public final void c() {
        synchronized (this.v) {
            if (this.C == null) {
                this.C = this.c.f(efo.a);
            }
        }
    }
    
    @Override
    public final void close() {
        this.q();
        this.o = cpt.c;
    }
    
    public final void d() {
        final krc t = this.t;
        if (t != null) {
            t.close();
            this.t = null;
        }
    }
    
    @Override
    public final void e(final ViewStub viewStub) {
        if (this.n == null) {
            this.n = (StabilizationUi)viewStub.inflate();
        }
        this.n.b.c(this.i.k(cxr.at));
        final irg irg = new irg();
        irg.d = this.f.getResources().getString(2131952165);
        irg.e = this.f;
        irg.h = 11;
        irg.a = true;
        irg.g = this.i.k(cxr.at);
        this.A = irg.a();
        final irg irg2 = new irg();
        irg2.d = this.f.getResources().getString(2131952167);
        irg2.e = this.f;
        irg2.h = 11;
        irg2.a = true;
        irg2.g = this.i.k(cxr.at);
        this.p = irg2.a();
        final irg irg3 = new irg();
        irg3.d = this.f.getResources().getString(2131952166);
        irg3.e = this.f;
        irg3.h = 11;
        irg3.b = 3000;
        irg3.g = this.i.k(cxr.at);
        this.q = irg3.a();
        final cqk a = this.a;
        final cpm cpm = new cpm(this);
        final cqi cqi = (cqi)a;
        cqi.c.b.setOnClickListener((View$OnClickListener)new cqe(cpm));
        cqi.g.c(new cqf(cpm), true);
        this.D.c(this.a.a(new cpn(this)));
        (this.z = (View)this.n.c).setAccessibilityDelegate((View$AccessibilityDelegate)new cpo(this));
        this.z.setOnClickListener((View$OnClickListener)new cpi(this));
    }
    
    public final void f() {
        synchronized (this.v) {
            this.u = -1;
            monitorexit(this.v);
            this.h.k(this.w);
            this.h.h(this.s);
            final cqi cqi = (cqi)this.a;
            cqi.g.e(cql.a);
            cqi.b();
            this.i(cql.a);
        }
    }
    
    public final void g() {
        synchronized (this.v) {
            final krc c = this.C;
            if (c != null) {
                c.close();
                this.C = null;
            }
        }
    }
    
    @Override
    public final void h(final cpt o) {
        synchronized (this) {
            this.o = o;
            final StabilizationUi n = this.n;
            float alpha;
            if (!o.d) {
                alpha = 0.3f;
            }
            else {
                alpha = 1.0f;
            }
            n.b.setAlpha(alpha);
            if (o.e) {
                this.r();
                if (o.d) {
                    final int n2 = (int)((kkz)this.k.b(hjq.u)).d + 1;
                    this.k.d(hjq.u, n2);
                    if ((!(boolean)((kkz)this.k.b(hjq.w)).d && n2 == 2) || n2 == 10) {
                        if (this.t == null) {
                            final FrameLayout c = this.n.c;
                            ((View)c).getViewTreeObserver().addOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)new cpq(this, (View)c));
                        }
                        this.k.d(hjq.w, true);
                        this.k.d(hjq.u, 0);
                    }
                }
                return;
            }
            this.q();
        }
    }
    
    public final void i(final cql r) {
        this.r = r;
        final StabilizationUi n = this.n;
        final PopupMenuButton b = n.b;
        final Integer n2 = (Integer)n.a.get(r);
        n2.getClass();
        b.setImageResource(n2);
    }
    
    @Override
    public final void j(final jcb jcb) {
        this.n.a(jcb);
        final cqi cqi = (cqi)this.a;
        cqi.d.a(jcb);
        cqi.c.a(jcb);
    }
    
    public final void k(final irf b) {
        synchronized (this.v) {
            this.b();
            this.B = b;
            final efm c = this.c;
            b.getClass();
            c.e(b);
        }
    }
    
    @Override
    public final void l() {
        synchronized (this.v) {
            if (this.r.equals(cql.b) && !this.j.get()) {
                this.k(this.A);
            }
        }
    }
    
    @Override
    public final void m() {
        this.j.set(true);
        final cpt o = this.o;
        if (o.d) {
            this.a.b();
            this.n.b(true, this.i.k(cwv.P));
            if (this.r.equals(cql.b)) {
                this.y.a(ihn.c);
                this.b();
            }
            this.d();
            return;
        }
        if (o.e) {
            this.q();
        }
    }
    
    @Override
    public final void n() {
        this.j.set(false);
        final cpt o = this.o;
        if (o.d) {
            this.n.b(false, this.i.k(cwv.P));
            if (!this.r.equals(cql.b)) {
                return;
            }
            this.y.a(ihn.b);
            this.l();
            synchronized (this.v) {
                this.u = -1;
                return;
            }
        }
        if (o.e) {
            this.r();
        }
    }
    
    @Override
    public final void p(final clq x) {
        this.x = x;
    }
}
