import com.google.android.apps.camera.ui.views.MainActivityLayout;
import android.content.Context;
import android.widget.LinearLayout;
import com.google.android.apps.camera.optionsbar.view.OptionsMenuView;
import com.google.android.apps.camera.optionsbar.view.OptionsMenuContainer;
import com.google.android.apps.camera.bottombar.BottomBarListener;
import java.util.concurrent.Executor;
import android.util.AttributeSet;
import android.widget.ImageButton;
import android.view.View$OnClickListener;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import com.google.android.apps.camera.bottombar.BottomBarController;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jak implements jap
{
    public final pii a;
    public final kjm b;
    public final niz c;
    public final fcz d;
    public final klv e;
    public final klv f;
    public final dir g;
    public final klj h;
    public final gjj i;
    public final crg j;
    public final oui k;
    public final cxl l;
    public final klj m;
    public final klj n;
    public final duq o;
    public final hys p;
    public final bmz q;
    private final BottomBarController r;
    private final oui s;
    private final dfz t;
    private final kjk u;
    private final ine v;
    
    public jak(final pii a, final bmz q, final kjm b, final klv e, final klv f, final dir g, final klj h, final ine v, final niz c, final fcz d, final BottomBarController r, final gjj i, final crg j, final oui k, final oui s, final duq o, final cxl l, final dfz t, final hkc hkc, final hys p20) {
        this.a = a;
        this.q = q;
        this.u = q.i();
        this.b = b;
        this.v = v;
        this.c = c;
        this.d = d;
        this.e = e;
        this.g = g;
        this.h = h;
        this.f = f;
        this.r = r;
        this.i = i;
        this.j = j;
        this.k = k;
        this.s = s;
        this.l = l;
        this.t = t;
        this.m = hkc.a(hjq.i);
        this.n = hkc.a(hjq.j);
        this.o = o;
        this.p = p20;
    }
    
    @Override
    public final void a() {
        njo.o(kjm.c());
        final OptionsMenuContainer h = ((iyc)this.a).a().h;
        final gjj i = this.i;
        njo.o(kjm.c());
        i.d.f("OptionsBarCtrl#wire");
        if (h != null) {
            i.aS = h.l();
            if (i.e.k(cya.d)) {
                final OptionsMenuView as = i.aS;
                as.k = true;
                final LinearLayout j = as.i;
                j.getClass();
                final ViewGroup$MarginLayoutParams layoutParams = (ViewGroup$MarginLayoutParams)j.getLayoutParams();
                layoutParams.setMargins(0, 0, 0, 0);
                as.i.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
            }
            (i.aU = h).n(new gjh(i, h));
            i.aU.s = i.j;
            i.aT = h.b();
            h.findViewById(2131427756);
            if (i.bf.g()) {
                final flj flj = (flj)i.bf.c();
                throw null;
            }
            h.findViewById(2131427757).setVisibility(8);
        }
        if (h != null) {
            final Context context = h.getContext();
            if (i.e.k(cya.d)) {
                i.aU.c().setOnClickListener((View$OnClickListener)new giu(i, 1));
            }
            else {
                (i.aV = new ImageButton(context, (AttributeSet)null, 0, 2132018617)).setImageResource(2131231529);
                i.aV.setContentDescription((CharSequence)context.getResources().getString(2131952625));
                i.aV.setOnClickListener((View$OnClickListener)new giu(i));
            }
            final irg irg = new irg();
            irg.e = context;
            irg.g = i.e.k(cxr.at);
            final cxl e = i.e;
            final cxo a = cwv.a;
            e.e();
            irg.a = true;
            irg.d = h.j.getResources().getString(2131951983);
            h.u = irg.a();
        }
        else {
            a.l(gjj.a.c(), "OptionsMenuContainer is null!", '\u072f');
        }
        i.bg.c(i.b.a(new git(i, 3), odx.a));
        i.bg.c(klq.b(i.v, i.w).a(new giw(i), i.c));
        i.bg.c(i.aj.a(new git(i, 5), odx.a));
        i.bg.c(i.o.a(new git(i, 6), odx.a));
        i.bg.c(i.al.a(new git(i, 7), odx.a));
        i.bg.c(i.ak.a(new git(i, 8), odx.a));
        i.bg.c(i.F.a(new git(i, 16), odx.a));
        i.bg.c(i.G.a(new git(i, 17), odx.a));
        i.bg.c(i.L.a(new git(i, 2), odx.a));
        i.k(i.l, i.az, i.P);
        i.k(i.l, i.az, i.O);
        i.k(i.m, i.aA, i.Q);
        i.k(i.n, i.aB, i.R);
        i.k(i.p, i.aC, i.S);
        if (i.bf.g()) {
            i.bg.c(i.p.a(new git(i, 18), i.c));
        }
        i.k(i.q, i.aC, i.T);
        i.k(i.r, i.aO, i.U);
        if (i.bf.g()) {
            i.bg.c(i.r.a(new git(i, 19), i.c));
        }
        i.k(i.s, i.aO, i.V);
        i.k(i.t, i.aO, i.W);
        i.k(i.u, i.aF, i.ah);
        if (i.bf.g()) {
            final kjk bg = i.bg;
            final klv u = i.u;
            final flj flj2 = (flj)i.bf.c();
            bg.c(u.a(new giy(), i.c));
        }
        i.k(i.y, i.aJ, i.X);
        i.k(i.z, i.aG, i.Y);
        i.k(i.A, i.aH, i.Z);
        i.k(i.B, i.aI, i.aa);
        i.k(i.C, i.aI, i.ab);
        i.k(i.E, i.aP, i.ac);
        i.k(i.D, i.aK, i.ae);
        i.k(i.F, i.aL, i.ad);
        i.k(i.L, i.aE, i.as);
        i.k(i.M, i.aM, i.af);
        if (i.ai != null) {
            i.k(i.N.c(), i.aN, i.ai);
        }
        i.bg.c(i.f.b().a(new git(i, 10), i.c));
        i.bg.c(i.am.a(new git(i, 11), i.c));
        i.bg.c(i.p.a(new git(i, 20), i.c));
        i.bg.c(i.q.a(new giw(i, 1), i.c));
        i.bg.c(i.m.a(new git(i, 1), i.c));
        i.bg.c(i.H.a(new git(i, 12), i.c));
        i.bg.c(i.N.a().a(new git(i, 13), i.c));
        i.bg.c(i.b.a(new git(i, 4), i.c));
        i.bg.c(i.N.b().a(new git(i, 14), i.c));
        i.bg.c(i.I.a(new git(i, 15), i.c));
        i.bg.c(i.l.a(new git(i), odx.a));
        i.d.g();
        final niz f = this.j.f();
        if (f.g()) {
            this.i.r((fxu)f.c());
        }
        else {
            final dfz t = this.t;
            final String name = this.j.e().name();
            final StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 18);
            sb.append("No ");
            sb.append(name);
            sb.append(" camera present");
            t.b(new dfx(sb.toString(), kst.b, new lfu[] { this.j.e() }));
        }
        h.setVisibility(0);
        this.i.e(new jaj(this));
        this.r.addListener(new jag(this));
        if (this.c.g()) {
            this.u.c(this.e.a(new jad(this), this.b));
        }
        final ine v = this.v;
        final jaf b = new jaf(this, 1);
        final jaf c = new jaf(this, 3);
        Object o = v.a;
        synchronized (o) {
            v.b = b;
            v.c = c;
            monitorexit(o);
            if (this.l.k(cxr.aL)) {
                this.u.c(this.f.a(new jad(this, 1), this.b));
                this.u.c(((ivj)this.s.get()).d(new jah(this)));
            }
            o = ((iyc)this.a).a().c;
            ((MainActivityLayout)o).f.add(this.i);
        }
    }
}
