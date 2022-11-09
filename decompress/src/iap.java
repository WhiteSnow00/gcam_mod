import java.util.concurrent.Executor;
import android.content.res.Resources;
import android.widget.SeekBar$OnSeekBarChangeListener;
import android.view.View$AccessibilityDelegate;
import android.content.res.Resources$Theme;
import android.widget.TextView;
import android.view.View$OnTouchListener;
import android.widget.FrameLayout;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import android.widget.FrameLayout$LayoutParams;
import android.support.constraint.ConstraintLayout;
import android.view.ViewGroup;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iap extends bqw
{
    private static final nsd b;
    private final crg c;
    private final klv d;
    private final kse e;
    private final idc f;
    private final cjl g;
    private iao h;
    private final elo i;
    
    static {
        b = nsd.g("com/google/android/apps/camera/timelapse/TimelapseController");
    }
    
    public iap(final crg c, final klv d, final elo i, final idc f, final kse e, final cjl g) {
        this.c = c;
        this.d = d;
        this.e = e;
        this.i = i;
        this.f = f;
        this.g = g;
    }
    
    private final iao u() {
        final iao h = this.h;
        nov.z(h);
        return h;
    }
    
    @Override
    public final void br() {
    }
    
    public final void bs() {
        if (this.h == null) {
            a.l(iap.b.c(), "Cheetah component is not initialized, aborting pause", '\u0a35');
            return;
        }
        final ibu a = this.u().a();
        a.i(false);
        final ibf a2 = a.A;
        a.q.b(new ibi(a, 5));
        if (a.I != null) {
            a.u.execute(new ibi(a, 6));
        }
    }
    
    public final void bt() {
        if (this.h == null) {
            a.l(iap.b.c(), "Cheetah component is not initialized, aborting resume", '\u0a36');
            return;
        }
        final ibu a = this.u().a();
        if ((((iah)a.j.d).k | iah.c.k) == iah.e.k) {
            a.j.aR(iah.e);
        }
        else {
            a.j.aR(iah.c);
        }
        a.A.e();
        if (a.I != null) {
            a.u.execute(new ibi(a, 8));
        }
        final icy d = a.D;
        final idc l = a.L;
        d.K = l;
        d.O = (ViewGroup)((ConstraintLayout)d.f.k.c(2131427411)).getRootView();
        d.D = (ViewGroup)d.f.k.c(2131427486);
        d.P = (ViewGroup)d.f.k.c(2131428112);
        d.Q = (ViewGroup)d.f.k.c(2131427486);
        d.o.f(new icw(d));
        final Resources resources = d.g.getResources();
        final FrameLayout$LayoutParams frameLayout$LayoutParams = new FrameLayout$LayoutParams(-1, -1);
        (d.M = new View(d.g)).setLayoutParams((ViewGroup$LayoutParams)frameLayout$LayoutParams);
        d.M.setAlpha(0.0f);
        d.M.setBackgroundColor(-16777216);
        d.M.setVisibility(8);
        (d.C = new FrameLayout(d.g)).setLayoutParams((ViewGroup$LayoutParams)frameLayout$LayoutParams);
        d.C.setAlpha(0.0f);
        d.C.setBackgroundColor(-16777216);
        d.C.setVisibility(8);
        d.C.setOnTouchListener((View$OnTouchListener)new icq(d, 1));
        (d.N = new View(d.g)).setLayoutParams((ViewGroup$LayoutParams)new FrameLayout$LayoutParams(-1, -1));
        d.N.setAlpha(0.0f);
        d.N.setBackgroundColor(-16777216);
        d.N.setOnTouchListener((View$OnTouchListener)new icq(d));
        (d.J = new TextView(d.g)).setText((CharSequence)resources.getString(2131952353));
        d.J.setTextColor(resources.getColor(2131099845, (Resources$Theme)null));
        d.J.setTextSize(resources.getDimensionPixelSize(2131165489) / resources.getDisplayMetrics().scaledDensity);
        gu.c(d.g, 2131296290, new icx(d));
        final FrameLayout$LayoutParams frameLayout$LayoutParams2 = new FrameLayout$LayoutParams(-2, -2, 49);
        frameLayout$LayoutParams2.topMargin = resources.getDimensionPixelSize(2131166173);
        final irg irg = new irg();
        irg.h = 7;
        irg.a = true;
        irg.e = d.g;
        irg.d = resources.getString(2131952352);
        irg.g = d.k.k(cxr.at);
        d.E = irg.a();
        d.C.addView((View)d.J, (ViewGroup$LayoutParams)frameLayout$LayoutParams2);
        d.P.addView(d.N);
        d.Q.addView(d.M);
        d.O.addView((View)d.C);
        d.R = ((FrameLayout$LayoutParams)d.J.getLayoutParams()).topMargin;
        d.h.d(true);
        final ViewGroup o = d.O;
        final ViewGroup d2 = d.D;
        d.c.addListener(d.d);
        d.w.a(d.x);
        d.l.c(d.t.d(d.u));
        d.l.c(new ics(d, 1));
        d.l.c(new ics(d));
        if (!d.k.k(cwv.H)) {
            final iec i = d.i;
            final ixx f = d.f;
            i.i = f;
            i.k = (View)f.i;
            final idy f2 = i.f;
            kjm.a();
            f2.setAlpha(0.0f);
            f2.setVisibility(8);
            f2.setBackground(f2.b.getDrawable(2131231075, (Resources$Theme)null));
            f2.addView((View)f2.d);
            f2.addView((View)f2.a);
            f2.addView((View)f2.c);
            f2.c.setAccessibilityDelegate((View$AccessibilityDelegate)new idw(f2));
            f2.d.setAccessibilityDelegate((View$AccessibilityDelegate)new idx(f2));
            f2.a();
            f2.requestLayout();
            o.addView((View)i.f);
        }
        if (d.q.g()) {
            ((cpf)d.q.c()).a(d.G);
        }
        else {
            final ieh p = new ieh(l);
            final Object c = d.f.k.c(2131428112);
            final ieo v = d.v;
            final iep j = d.L;
            v.r = (View)d2;
            final View s = (View)c;
            v.s = s;
            v.p = p;
            v.d.put(idb.a, 2131952745);
            v.d.put(idb.b, 2131952747);
            v.d.put(idb.c, 2131952743);
            v.d.put(idb.d, 2131952746);
            v.d.put(idb.e, 2131952744);
            s.addOnLayoutChangeListener(v.f);
            v.n = new iel(v, v.c);
            v.d();
            v.n.setLayoutParams((ViewGroup$LayoutParams)new FrameLayout$LayoutParams(-1, -1));
            v.n.requestLayout();
            d2.addView((View)v.n);
            ik.ac((View)v.n);
            v.o = new ieg(v.c, p, v.i);
            v.c();
            final ieg o2 = v.o;
            o2.e = o2.getResources().getDimensionPixelSize(2131166316) / 2;
            if (o2.c > 0) {
                o2.d = o2.getResources().getDimension(2131166310);
            }
            else {
                o2.d = 0.0f;
            }
            o2.setBackground(o2.getResources().getDrawable(2131231081, (Resources$Theme)null));
            o2.setClickable(true);
            o2.setMax(o2.c);
            o2.setAccessibilityDelegate((View$AccessibilityDelegate)new ief(o2));
            v.o.setOnSeekBarChangeListener((SeekBar$OnSeekBarChangeListener)new iem(v, j));
            final int c2 = ((nqk)p.a.c).c;
            int dimensionPixelSize;
            if (c2 > 1) {
                dimensionPixelSize = v.g.getDimensionPixelSize(2131166310);
            }
            else {
                dimensionPixelSize = 0;
            }
            final int k = v.k;
            v.l = k + k + (c2 - 1) * dimensionPixelSize;
            final int dimensionPixelSize2 = v.g.getDimensionPixelSize(2131166309);
            v.m = dimensionPixelSize2;
            v.o.setLayoutParams((ViewGroup$LayoutParams)new FrameLayout$LayoutParams(v.l, dimensionPixelSize2));
            final ieg o3 = v.o;
            final int m = v.k;
            o3.setPadding(m, 0, m, 0);
            v.o.setId(2131427997);
            v.q = new ien(v, v.c, v.o);
            final iej q = v.q;
            final int dimensionPixelSize3 = q.b.getDimensionPixelSize(2131166312);
            final float scaledDensity = q.b.getDisplayMetrics().scaledDensity;
            q.setBackground(q.b.getDrawable(2131231083, (Resources$Theme)null));
            q.setElevation((float)q.b.getDimensionPixelSize(2131166315));
            q.setLetterSpacing(igu.a(q.b.getDimension(2131166314)));
            q.setGravity(17);
            q.setTextAlignment(4);
            q.setTextColor(q.b.getColor(2131101457, (Resources$Theme)null));
            q.setTextSize(dimensionPixelSize3 / scaledDensity);
            gu.c(q.getContext(), 2131296290, new iei(q));
            v.n.addView((View)v.o);
            v.n.addView((View)v.q);
            v.n.setClipChildren(false);
            v.b(jcb.a(v.i.getDefaultDisplay(), v.c));
            final idb c3 = p.a.c((double)v.j.aQ());
            v.o.e(c3);
            v.e(v.o.b(c3));
        }
        Label_1830: {
            if (a.o.k(cyl.d)) {
                final ias p2 = a.p;
                final icy d3 = a.D;
                d3.getClass();
                final ibh z = new ibh(d3);
                synchronized (p2.s) {
                    p2.z = z;
                    break Label_1830;
                }
            }
            final iaa n = a.n;
            final icy d4 = a.D;
            d4.getClass();
            n.M = new ibh(d4);
        }
        if (!((iah)a.j.d).equals(iah.e) && !((iah)a.j.d).equals(iah.i)) {
            return;
        }
        final kjm q2 = a.q;
        final icm b = a.B;
        b.getClass();
        q2.b(new ibk(b, 2));
    }
    
    @Override
    public final void close() {
    }
    
    public final void m() {
        this.g.a = jbm.n;
        this.e.f("Cheetah-ModuleStart");
        this.d.aR(true);
        final elo i = this.i;
        i.d = new jvh();
        if (i.d == null) {
            i.d = new jvh();
        }
        this.h = new elp(i.a, i.b, i.c);
        this.u().a().b(this.c.e(), this.f);
        final ibu a = this.u().a();
        a.j.aR(iah.b);
        final icg c = a.C;
        knf.f(c.n.a(), new icc(c), c.d);
        a.d();
        this.e.g();
    }
    
    public final void o() {
        if (this.h == null) {
            a.l(iap.b.c(), "Cheetah component is not initialized, aborting stop", '\u0a37');
            return;
        }
        this.e.f("Cheetah-StopModule");
        final ibu a = this.u().a();
        Label_0177: {
            if (((iah)a.j.d).equals(iah.j)) {
                a.l(ibu.a.b(), "onStop(): STATE_RECORDING_ERROR", '\u0a61');
                a.i(true);
            }
            else if (((iah)a.j.d).equals(iah.i)) {
                a.K.d(new ibi(a, 9), a.q);
                break Label_0177;
            }
            final kjm q = a.q;
            final icm b = a.B;
            b.getClass();
            q.b(new ibk(b, 3));
            a.A.f();
            a.j.aR(iah.a);
        }
        ((kjk)((elp)this.u()).a.get()).close();
        this.h = null;
        this.e.g();
    }
    
    @Override
    public final boolean q() {
        final iao h = this.h;
        boolean b = false;
        if (h == null) {
            a.l(iap.b.c(), "Cheetah component is not initialized, aborting onBackPressed", '\u0a38');
            return false;
        }
        final ibu a = this.u().a();
        final iah iah = (iah)a.j.d;
        final boolean a2 = iah.a(iah);
        a.i(false);
        if (a.o.k(cwv.H)) {
            if (!a2) {
                final icy d = a.D;
                if (d.k.k(cwv.H)) {
                    if (!d.q.g()) {
                        b = true;
                        return b;
                    }
                    ((cpf)d.q.c()).d();
                    return true;
                }
            }
            b = true;
        }
        else if (!iah.equals(iah.e)) {
            return true;
        }
        return b;
    }
}
