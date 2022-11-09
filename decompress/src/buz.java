import j$.util.function.Supplier;
import android.content.Context;
import android.view.ViewStub;
import android.animation.AnimatorSet;
import java.util.concurrent.Executor;
import android.view.View$OnClickListener;
import android.view.View$OnTouchListener;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.content.res.Resources$Theme;
import com.google.android.apps.camera.ui.views.ToggleUi;
import android.widget.ImageButton;

// 
// Decompiled by Procyon v0.6.0
// 

public final class buz implements bvb
{
    private ImageButton A;
    private int B;
    private irf C;
    private irf D;
    private irf E;
    private irf F;
    private irf G;
    private irf H;
    private krc I;
    private String J;
    private String K;
    public final duq a;
    public final klv b;
    public final klv c;
    public final hkg d;
    public final eyt e;
    public final klj f;
    public final klv g;
    public final klv h;
    public final klv i;
    public final klv j;
    public final klv k;
    public final cxl l;
    public final hys m;
    public ToggleUi n;
    public int o;
    public int p;
    public boolean q;
    public boolean r;
    public jbm s;
    public boolean t;
    public boolean u;
    private final kjm v;
    private final klv w;
    private final efm x;
    private final niz y;
    private final boolean z;
    
    public buz(final klv w, final duq a, final kjm v, final efm x, final hkg d, final eyt e, final klv g, final hkd hkd, final fvt fvt, final klj f, final klv h, final cxl l, final hys m, final niz y) {
        final Boolean value = false;
        this.b = new kkz(value);
        this.c = new kkz(value);
        this.q = false;
        this.r = false;
        this.s = jbm.a;
        this.t = false;
        this.u = false;
        this.a = a;
        this.v = v;
        this.w = w;
        this.x = x;
        this.d = d;
        this.e = e;
        this.i = fvt.a;
        this.f = f;
        this.g = g;
        this.h = h;
        this.j = hkd.b(hjq.i);
        this.k = hkd.b(hjq.j);
        this.l = l;
        this.m = m;
        this.y = y;
        this.z = l.k(cxr.at);
    }
    
    public static boolean s(final ggv ggv, final hjg hjg, final boolean b, final boolean b2) {
        return ggv.e != 3 && hjg == hjg.a && !b && !b2;
    }
    
    private final void u(final boolean b, final boolean b2) {
        final boolean k = this.l.k(cxr.at);
        if (b) {
            this.n.e(2131951841);
            final ToggleUi n = this.n;
            int n2;
            if (k) {
                n2 = 2131231110;
            }
            else {
                n2 = 2131231111;
            }
            n.c(n2);
            final Drawable drawable = this.n.getResources().getDrawable(2131231209, (Resources$Theme)null);
            if (k && drawable != null) {
                drawable.mutate().setTint(leg.g((View)this.n));
            }
            this.n.d(drawable);
            return;
        }
        this.n.e(2131951840);
        final int n3 = 2131231108;
        if (k) {
            final LayerDrawable layerDrawable = (LayerDrawable)this.n.getContext().getDrawable(2131231108);
            if (layerDrawable != null) {
                final Drawable drawableByLayerId = layerDrawable.findDrawableByLayerId(2131428082);
                if (drawableByLayerId != null) {
                    int tint;
                    if (b2) {
                        tint = leg.j((View)this.n);
                    }
                    else {
                        tint = leg.l((View)this.n);
                    }
                    drawableByLayerId.setTint(tint);
                }
            }
        }
        final ToggleUi n4 = this.n;
        int n5;
        if (!k) {
            n5 = 2131231109;
        }
        else {
            n5 = n3;
        }
        n4.c(n5);
        final Drawable drawable2 = this.n.getResources().getDrawable(2131231208, (Resources$Theme)null);
        if (k && drawable2 != null) {
            final Drawable mutate = drawable2.mutate();
            int tint2;
            if (b2) {
                tint2 = leg.g((View)this.n);
            }
            else {
                tint2 = leg.k((View)this.n);
            }
            mutate.setTint(tint2);
        }
        this.n.d(drawable2);
    }
    
    @Override
    public final krc a(final jbm s, final ggu ggu) {
        this.s = s;
        this.A.setOnTouchListener((View$OnTouchListener)new buw(this));
        this.A.setOnClickListener((View$OnClickListener)new bur(this));
        final krc a = this.i.a(new bus(this, ggu, 1), this.v);
        final krc a2 = ggu.a(new buy(this, 1), this.v);
        final krc a3 = this.g.a(new bus(this, ggu, 2), this.v);
        final krc a4 = this.m.a().a(new bus(this, ggu), this.v);
        final klj j = klq.j(klq.b(this.c, this.b), new but(this));
        final krc a5 = klq.b(this.k, this.j).a(new buy(this, 5), this.v);
        final klv w = this.w;
        w.getClass();
        return new bux(this, j.a(new cfj(w, 1), this.v), a2, a3, a, this.a.b().a(new buy(this, 3), this.v), this.a.a().a(new buy(this, 4), this.v), this.h.a(new buy(this), this.v), a5, this.b.a(new buy(this, 2), this.v), a4);
    }
    
    @Override
    public final void b() {
        this.A.setEnabled(false);
    }
    
    public final void c() {
        final ToggleUi n = this.n;
        if (n != null) {
            n.b();
            final AnimatorSet e = n.e;
            if (e != null) {
                e.start();
            }
        }
    }
    
    public final void d() {
        final ToggleUi n = this.n;
        if (n != null) {
            n.b();
            final AnimatorSet e = n.e;
            if (e != null) {
                e.reverse();
            }
        }
    }
    
    public final void e() {
        final ToggleUi n = this.n;
        if (n != null) {
            n.b();
            this.n.setVisibility(4);
        }
    }
    
    public final void f() {
        try (final krc i = this.I) {}
    }
    
    @Override
    public final void g(final ViewStub viewStub, final Context context) {
        if (this.n == null) {
            this.n = (ToggleUi)viewStub.inflate();
        }
        this.A = this.n.c;
        this.o = context.getResources().getInteger(2131492985);
        this.p = context.getResources().getInteger(2131492984);
        this.B = context.getResources().getInteger(2131492983);
        final irg irg = new irg();
        irg.d = context.getResources().getString(2131951835);
        irg.e = context;
        irg.h = 7;
        irg.a = false;
        irg.b = 3000;
        irg.g = this.z;
        this.C = irg.a();
        final irg irg2 = new irg();
        irg2.d = context.getResources().getString(2131951832);
        irg2.e = context;
        irg2.h = 7;
        irg2.a = false;
        irg2.b = 3000;
        irg2.g = this.z;
        this.D = irg2.a();
        if (this.y.g()) {
            final irg irg3 = new irg();
            irg3.d = context.getResources().getString(((hyn)this.y.c()).a());
            irg3.e = context;
            irg3.h = 7;
            irg3.a = false;
            irg3.b = 3000;
            irg3.g = this.z;
            this.E = irg3.a();
        }
        final irg irg4 = new irg();
        irg4.d = context.getResources().getString(2131951834);
        irg4.e = context;
        irg4.h = 2;
        irg4.a = true;
        irg4.g = this.z;
        this.H = irg4.a();
        this.J = context.getResources().getString(2131951836);
        this.K = context.getResources().getString(2131951838);
        this.e();
    }
    
    @Override
    public final void h() {
        this.p((boolean)((kkz)this.c).d, (boolean)((kkz)this.b).d);
    }
    
    @Override
    public final void i(final jcb jcb) {
        final ToggleUi n = this.n;
        if (n != null) {
            n.a(jcb);
        }
    }
    
    public final void j(final boolean b) {
        monitorenter(this);
        Label_0030: {
            if (!b) {
                break Label_0030;
            }
            try {
                if (!this.u) {
                    this.x.e(this.H);
                    return;
                }
                this.x.h(this.H);
            }
            finally {
                monitorexit(this);
            }
        }
    }
    
    public final void k(final boolean b) {
        synchronized (this) {
            if (this.F == null) {
                return;
            }
            final irf g = this.G;
            if (g != null) {
                this.x.h(g);
            }
            if (b && !this.u) {
                this.q = false;
                final irf f = this.F;
                this.G = f;
                this.x.e(f);
            }
        }
    }
    
    public final void l() {
        if (!this.r && this.d.a("catshark_toggle_tooltip") <= 3) {
            this.f();
            String s2;
            final String s = s2 = this.J;
            if (this.d.a("catshark_toggle_tooltip") > 0) {
                s2 = s;
                if (((kkz)this.c).d) {
                    s2 = s;
                    if (!(boolean)((kkz)this.b).d) {
                        s2 = this.K;
                    }
                }
            }
            final iwg iwg = new iwg(s2);
            final jcb a = jcb.a;
            jcb jcb;
            if ((jcb = this.n.b) == null) {
                jcb = jcb.a;
            }
            switch (jcb.ordinal()) {
                default: {
                    iwg.o((View)this.n.d);
                    iwg.p();
                    break;
                }
                case 2: {
                    iwg.o((View)this.n.d);
                    iwg.r();
                    break;
                }
                case 1: {
                    iwg.t((View)this.n.d);
                    iwg.q();
                    break;
                }
            }
            iwg.h = this.l.k(cxr.at);
            iwg.u();
            iwg.c = 300;
            iwg.d = 6000;
            iwg.b = false;
            iwg.d((Supplier)new buv(this));
            iwg.g(new buu(this), this.v);
            iwg.k();
            iwg.f = true;
            iwg.i = this.x;
            iwg.m = 4;
            iwg.v();
            this.I = iwg.a();
        }
    }
    
    @Override
    public final void m() {
        synchronized (this) {
            this.u = true;
            this.d();
            this.j(false);
            this.f();
        }
    }
    
    @Override
    public final void n() {
        synchronized (this) {
            this.u = false;
            if (((kkz)this.a.b()).d) {
                this.c();
                this.j((boolean)this.a.a().aQ());
                this.l();
            }
        }
    }
    
    @Override
    public final void o(final fxu fxu) {
        this.t = (fxu.l() == lfu.a);
        this.q();
    }
    
    public final void p(final boolean b, final boolean b2) {
        if (b) {
            if (!this.l.k(cxr.at)) {
                this.A.setImageAlpha(this.o);
            }
            this.A.setEnabled(true);
            this.u(b2, true);
            return;
        }
        if (!this.l.k(cxr.at)) {
            this.A.setImageAlpha(this.B);
        }
        this.A.setEnabled(false);
        this.u(false, false);
    }
    
    public final void q() {
        Object o;
        if (this.t) {
            o = ((kkz)this.k).d;
        }
        else {
            o = ((kkz)this.j).d;
        }
        final String s = (String)o;
        boolean booleanValue = (boolean)((kkz)this.b).d;
        if (s.equals("ns")) {
            booleanValue = true;
        }
        else if (s.equals("off")) {
            booleanValue = false;
        }
        if ((boolean)((kkz)this.b).d != booleanValue) {
            this.b.aR(booleanValue);
        }
    }
    
    public final boolean r() {
        if (this.t) {
            return ((String)((kkz)this.k).d).equals("ns");
        }
        return ((String)((kkz)this.j).d).equals("ns");
    }
    
    public final void t(final hjg hjg, final boolean b, final boolean b2, final int n) {
        final jcb a = jcb.a;
        Label_0123: {
            Label_0079: {
                irf f = null;
                switch (n - 1) {
                    default: {
                        if (b2) {
                            this.F = this.E;
                            break Label_0123;
                        }
                        break Label_0079;
                    }
                    case 1: {
                        if (hjg != hjg.a) {
                            f = this.C;
                            break;
                        }
                        break Label_0079;
                    }
                    case 0: {
                        if (b) {
                            f = this.D;
                            break;
                        }
                        break Label_0079;
                    }
                }
                this.F = f;
                break Label_0123;
            }
            irf f2;
            if (hjg != hjg.a) {
                f2 = this.C;
            }
            else if (b) {
                f2 = this.D;
            }
            else {
                if (!b2) {
                    break Label_0123;
                }
                f2 = this.E;
            }
            this.F = f2;
        }
        final boolean q = this.q;
        boolean b3 = false;
        if (q && (boolean)((kkz)this.a.b()).d) {
            b3 = true;
        }
        this.k(b3);
    }
}
