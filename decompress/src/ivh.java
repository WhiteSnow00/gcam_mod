import android.view.ViewPropertyAnimator;
import android.animation.Animator$AnimatorListener;
import j$.util.function.Supplier;
import j$.util.function.ToLongFunction;
import java.util.Collection;
import j$.util.Collection$_EL;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import j$.util.function.BiFunction;
import java.util.Iterator;
import j$.util.function.Function;
import j$.util.Map$_EL;
import java.util.EnumMap;
import java.util.ArrayList;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import java.util.Map;
import android.animation.ArgbEvaluator;
import java.util.List;
import android.animation.ValueAnimator;
import com.google.android.apps.camera.ui.shutterbutton.ShutterButton;
import android.view.animation.Interpolator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ivh
{
    public static final Interpolator a;
    private static final nsd v;
    public final ShutterButton b;
    public ValueAnimator c;
    public ValueAnimator d;
    public ValueAnimator e;
    public ValueAnimator f;
    public ValueAnimator g;
    public ValueAnimator h;
    public ValueAnimator i;
    public ValueAnimator j;
    public ValueAnimator k;
    public ValueAnimator l;
    public ValueAnimator m;
    public ValueAnimator n;
    public ValueAnimator o;
    public ValueAnimator p;
    ValueAnimator q;
    public List r;
    public final ArgbEvaluator s;
    public final Interpolator t;
    public final Interpolator u;
    private final Interpolator w;
    private final Map x;
    
    static {
        v = nsd.g("com/google/android/apps/camera/ui/shutterbutton/ShutterButtonAnimator");
        a = (Interpolator)new LinearInterpolator();
    }
    
    public ivh(final ShutterButton b) {
        this.s = new ArgbEvaluator();
        this.b = b;
        this.t = AnimationUtils.loadInterpolator(b.getContext(), 2131558408);
        this.u = AnimationUtils.loadInterpolator(b.getContext(), 2131558410);
        this.w = AnimationUtils.loadInterpolator(b.getContext(), 17563661);
        final ArrayList list = new ArrayList();
        final ivc g = nrr.G(iuk.I, list);
        g.b(iuk.J, new iup(this, 3));
        g.b(iuk.g, new iut(this, 15));
        g.b(iuk.t, new iup(this, 13));
        g.b(iuk.l, new iut(this, 8));
        g.b(iuk.a, new iut(this, 8));
        g.b(iuk.K, new iut(this, 8));
        g.b(iuk.c, new ius(this, 4));
        g.c(iuk.D);
        g.b(iuk.e, new iup(this, 17));
        nrr.G(iuk.J, list).b(iuk.I, new iup(this, 15));
        final ivc g2 = nrr.G(iuk.m, list);
        g2.b(iuk.a, new iut(this, 12));
        g2.b(iuk.l, new iut(this, 12));
        final ivc g3 = nrr.G(iuk.l, list);
        g3.b(iuk.I, new iup(this, 15));
        g3.b(iuk.m, new iuy(this));
        g3.b(iuk.a, new ius(this, 2));
        g3.b(iuk.K, new ius(this, 2));
        g3.c(iuk.D);
        g3.b(iuk.e, new iup(this, 6));
        g3.b(iuk.c, new ius(this, 18));
        final ivc g4 = nrr.G(iuk.D, list);
        g4.b(iuk.I, new iup(this, 15));
        g4.b(iuk.E, new ius(this, 10));
        g4.b(iuk.l, new iup(this, 14));
        g4.b(iuk.a, new iup(this, 14));
        g4.b(iuk.K, new iup(this, 14));
        g4.b(iuk.c, new iut(this, 19));
        g4.b(iuk.t, new ius(this, 20));
        g4.c(iuk.e);
        g4.b(iuk.A, new iup(this));
        g4.b(iuk.g, new iut(this, 15));
        final ivc g5 = nrr.G(iuk.e, list);
        g5.b(iuk.I, new iup(this, 15));
        g5.c(iuk.D);
        g5.b(iuk.k, new ius(this, 12));
        g5.b(iuk.f, new iut(this, 18));
        g5.b(iuk.l, new ius(this, 7));
        g5.b(iuk.a, new ius(this, 7));
        g5.b(iuk.K, new ius(this, 7));
        g5.b(iuk.c, new ius(this, 13));
        g5.b(iuk.t, new ius(this, 16));
        g5.b(iuk.A, new iup(this));
        g5.b(iuk.g, new iut(this, 15));
        final ivc g6 = nrr.G(iuk.f, list);
        g6.c(iuk.D);
        g6.b(iuk.k, new iut(this, 11));
        g6.b(iuk.g, new iut(this, 15));
        final ivc g7 = nrr.G(iuk.E, list);
        g7.c(iuk.D);
        g7.b(iuk.F, new iup(this, 19));
        g7.b(iuk.g, new iut(this, 15));
        final ivc g8 = nrr.G(iuk.F, list);
        g8.b(iuk.D, new ius(this, 9));
        g8.b(iuk.j, new ius(this, 5));
        final ivc g9 = nrr.G(iuk.k, list);
        g9.b(iuk.I, new iup(this, 15));
        g9.b(iuk.e, new ius(this, 19));
        g9.b(iuk.D, new ius(this, 9));
        g9.b(iuk.j, new iup(this, 11));
        final ivc g10 = nrr.G(iuk.a, list);
        g10.a.add(iuk.K);
        g10.b(iuk.l, new iut(this, 14));
        g10.c(iuk.D);
        g10.b(iuk.e, new iut(this, 10));
        g10.b(iuk.g, new iut(this, 15));
        g10.b(iuk.b, new iut(this));
        g10.b(iuk.i, new iut(this, 9));
        g10.b(iuk.I, new iup(this, 15));
        g10.c(iuk.a);
        g10.c(iuk.K);
        g10.b(iuk.j, new ius(this));
        g10.b(iuk.c, new iut(this, 7));
        g10.b(iuk.n, new ius(this, 1));
        g10.b(iuk.q, new ius(this, 1));
        g10.b(iuk.t, new ius(this, 1));
        g10.b(iuk.A, new iup(this));
        g10.b(iuk.G, new iup(this, 9));
        final ivc g11 = nrr.G(iuk.b, list);
        g11.b(iuk.a, new iup(this, 20));
        g11.b(iuk.G, new iut(this, 13));
        g11.a(new iut(this, 2));
        final ivc g12 = nrr.G(iuk.c, list);
        g12.b(iuk.I, new iup(this, 15));
        g12.b(iuk.g, new iut(this, 15));
        g12.c(iuk.c);
        g12.b(iuk.d, new iup(this, 1));
        g12.b(iuk.l, new iut(this, 6));
        g12.b(iuk.a, new iut(this, 6));
        g12.b(iuk.K, new iut(this, 6));
        g12.c(iuk.D);
        g12.b(iuk.q, new iup(this, 5));
        g12.b(iuk.e, new ius(this, 11));
        g12.b(iuk.t, new iup(this, 5));
        g12.b(iuk.A, new iup(this));
        final ivc g13 = nrr.G(iuk.d, list);
        g13.b(iuk.c, new iut(this, 17));
        g13.c(iuk.l);
        g13.c(iuk.a);
        g13.c(iuk.e);
        g13.a(new ius(this, 8));
        final ivc g14 = nrr.G(iuk.n, list);
        g14.b(iuk.I, new iup(this, 15));
        g14.c(iuk.t);
        g14.b(iuk.o, new iut(this, 4));
        g14.b(iuk.p, new ius(this, 3));
        g14.b(iuk.l, new iup(this));
        g14.b(iuk.a, new iup(this));
        g14.b(iuk.K, new iup(this));
        g14.b(iuk.q, new iut(this, 7));
        g14.b(iuk.c, new iup(this, 10));
        g14.c(iuk.D);
        g14.c(iuk.n);
        g14.b(iuk.e, new iut(this, 3));
        g14.b(iuk.x, new iut(this, 16));
        g14.b(iuk.w, new iut(this, 16));
        g14.b(iuk.y, new ius(this, 3));
        g14.b(iuk.A, new iup(this));
        g14.b(iuk.g, new iut(this, 15));
        g14.b(iuk.G, new iup(this, 9));
        final ivc g15 = nrr.G(iuk.o, list);
        g15.b(iuk.p, new ius(this, 3));
        g15.b(iuk.n, new ius(this, 3));
        g15.b(iuk.w, new ius(this, 3));
        g15.a(new iut(this, 1));
        g15.b(iuk.G, new iut(this, 13));
        final ivc g16 = nrr.G(iuk.q, list);
        g16.b(iuk.I, new iup(this, 15));
        g16.b(iuk.t, new iup(this, 5));
        g16.b(iuk.n, new iup(this));
        g16.b(iuk.r, new iut(this, 4));
        g16.b(iuk.s, new ius(this, 3));
        g16.b(iuk.l, new iup(this));
        g16.b(iuk.a, new iup(this));
        g16.b(iuk.K, new iup(this));
        g16.b(iuk.c, new iup(this, 10));
        g16.c(iuk.D);
        g16.c(iuk.q);
        g16.b(iuk.e, new iut(this, 3));
        g16.b(iuk.x, new iut(this, 16));
        g16.b(iuk.w, new iut(this, 16));
        g16.b(iuk.y, new ius(this, 3));
        g16.b(iuk.A, new iup(this));
        g16.b(iuk.g, new iut(this, 15));
        final ivc g17 = nrr.G(iuk.r, list);
        g17.b(iuk.s, new ius(this, 3));
        g17.b(iuk.q, new ius(this, 3));
        g17.b(iuk.w, new ius(this, 3));
        g17.a(new iut(this, 1));
        final ivc g18 = nrr.G(iuk.t, list);
        g18.b(iuk.I, new iup(this, 15));
        g18.c(iuk.t);
        g18.b(iuk.q, new iup(this, 10));
        g18.b(iuk.u, new iut(this, 4));
        g18.b(iuk.l, new iup(this));
        g18.b(iuk.a, new iup(this));
        g18.b(iuk.K, new iup(this));
        g18.b(iuk.c, new iup(this, 10));
        g18.c(iuk.D);
        g18.b(iuk.e, new iut(this, 3));
        g18.b(iuk.x, new iut(this, 16));
        g18.b(iuk.w, new iut(this, 16));
        g18.b(iuk.y, new ius(this, 3));
        g18.b(iuk.A, new iup(this));
        g18.b(iuk.g, new iut(this, 15));
        g18.b(iuk.v, new iut(this, 16));
        final ivc g19 = nrr.G(iuk.y, list);
        g19.b(iuk.I, new iup(this, 15));
        g19.c(iuk.t);
        g19.c(iuk.y);
        g19.b(iuk.z, new iut(this, 4));
        g19.b(iuk.l, new iup(this));
        g19.b(iuk.a, new iup(this));
        g19.b(iuk.K, new iup(this));
        g19.b(iuk.c, new iup(this, 10));
        g19.c(iuk.D);
        g19.b(iuk.e, new iut(this, 3));
        g19.b(iuk.x, new iut(this, 16));
        g19.b(iuk.w, new iut(this, 16));
        g19.b(iuk.A, new iup(this));
        g19.b(iuk.g, new iut(this, 15));
        final ivc g20 = nrr.G(iuk.u, list);
        g20.b(iuk.v, new ius(this, 3));
        g20.b(iuk.t, new ius(this, 3));
        g20.b(iuk.w, new ius(this, 3));
        g20.a(new iut(this, 1));
        final ivc g21 = nrr.G(iuk.z, list);
        g21.b(iuk.v, new ius(this, 3));
        g21.b(iuk.t, new ius(this, 3));
        g21.b(iuk.w, new iup(this, 12));
        g21.a(new iut(this, 1));
        final ivc g22 = nrr.G(iuk.v, list);
        g22.b(iuk.t, new iup(this, 16));
        g22.b(iuk.w, new ius(this, 3));
        g22.a(new iut(this, 1));
        final ivc g23 = nrr.G(iuk.p, list);
        g23.b(iuk.n, new iup(this, 16));
        g23.b(iuk.w, new ius(this, 3));
        g23.a(new iut(this, 1));
        final ivc g24 = nrr.G(iuk.s, list);
        g24.b(iuk.q, new iup(this, 16));
        g24.b(iuk.w, new ius(this, 3));
        g24.a(new iut(this, 1));
        final ivc g25 = nrr.G(iuk.w, list);
        g25.b(iuk.x, new iup(this, 4));
        g25.b(iuk.t, new iup(this, 4));
        g25.a(new iuy(this, 2));
        final ivc g26 = nrr.G(iuk.x, list);
        g26.b(iuk.t, new ius(this, 14));
        g26.a(new iup(this, 7));
        final ivc g27 = nrr.G(iuk.A, list);
        g27.b(iuk.I, new iup(this, 15));
        g27.c(iuk.a);
        g27.b(iuk.B, new iut(this));
        g27.b(iuk.C, new iut(this));
        g27.b(iuk.e, new iut(this, 10));
        g27.b(iuk.c, new iut(this, 7));
        final ivc g28 = nrr.G(iuk.B, list);
        g28.b(iuk.A, new iup(this, 20));
        g28.b(iuk.G, new iut(this, 13));
        g28.b(iuk.C, new iup(this, 20));
        g28.a(new iut(this, 2));
        final ivc g29 = nrr.G(iuk.C, list);
        g29.b(iuk.A, new iup(this, 20));
        g29.a(new iut(this, 2));
        final ivc g30 = nrr.G(iuk.j, list);
        g30.b(iuk.e, new iup(this, 8));
        g30.b(iuk.a, new iup(this, 2));
        g30.b(iuk.K, new iup(this, 2));
        g30.b(iuk.t, new iup(this, 2));
        g30.b(iuk.h, new iup(this, 18));
        final ivc g31 = nrr.G(iuk.g, list);
        g31.b(iuk.c, new ius(this, 15));
        g31.b(iuk.e, new iut(this, 20));
        g31.b(iuk.a, new iut(this, 5));
        g31.b(iuk.t, new iut(this, 5));
        g31.b(iuk.n, new ius(this, 1));
        g31.b(iuk.q, new iut(this, 5));
        final ivc g32 = nrr.G(iuk.i, list);
        g32.b(iuk.j, new ius(this, 6));
        g32.b(iuk.a, new iuy(this, 1));
        g32.b(iuk.K, new iuy(this, 1));
        final ivc g33 = nrr.G(iuk.G, list);
        g33.b(iuk.a, new ius(this, 17));
        g33.b(iuk.H, new ius(this, 12));
        g33.b(iuk.n, new ius(this, 17));
        final ivc g34 = nrr.G(iuk.H, list);
        g34.b(iuk.a, new iup(this, 11));
        g34.b(iuk.n, new iup(this, 11));
        final EnumMap enumMap = new EnumMap((Class<K>)iuk.class);
        for (final ivc ivc : list) {
            final Iterator iterator2 = ivc.a.iterator();
            while (iterator2.hasNext()) {
                final EnumMap enumMap2 = (EnumMap)Map$_EL.computeIfAbsent((Map)enumMap, (Object)iterator2.next(), (Function)hsc.g);
                for (final Map.Entry<iuk, V> entry : ivc.b.entrySet()) {
                    enumMap2.put(entry.getKey(), entry.getValue());
                }
            }
        }
        this.x = nqb.e(enumMap);
    }
    
    public static ivx d(final ivx ivx, final iuk iuk) {
        final ivw c = ivx.c();
        c.l(iuk);
        return c.a();
    }
    
    private final ValueAnimator e(final int n, final int n2, final BiFunction biFunction) {
        return this.f(0, 1, (ValueAnimator$AnimatorUpdateListener)new iur(this, biFunction, n, n2));
    }
    
    private final ValueAnimator f(final int n, final int n2, final ValueAnimator$AnimatorUpdateListener valueAnimator$AnimatorUpdateListener) {
        final ValueAnimator setDuration = ValueAnimator.ofInt(new int[] { n, n2 }).setDuration(40L);
        setDuration.addUpdateListener(valueAnimator$AnimatorUpdateListener);
        setDuration.setInterpolator((TimeInterpolator)this.w);
        return setDuration;
    }
    
    private final ValueAnimator g(final int n, final int n2, final BiFunction biFunction) {
        return this.f(n, n2, (ValueAnimator$AnimatorUpdateListener)new iuq(this, biFunction));
    }
    
    public final AnimatorSet a(final ivx ivx, final ivx ivx2) {
        this.c = this.g(ivx.d, ivx2.d, (BiFunction)iuu.f);
        this.d = this.g(ivx.g, ivx2.g, (BiFunction)iuu.r);
        this.e = this.g(ivx.i, ivx2.i, (BiFunction)iuu.l);
        this.g = this.g(ivx.o, ivx2.o, (BiFunction)iuu.b);
        this.h = this.e(ivx.f, ivx2.f, (BiFunction)iuu.e);
        this.f = this.g(ivx.e, ivx2.e, (BiFunction)iuu.d);
        this.i = this.g(ivx.q, ivx2.q, (BiFunction)iuu.i);
        this.j = this.e(ivx.h, ivx2.h, (BiFunction)iuu.q);
        this.k = this.g(ivx.s, ivx2.s, (BiFunction)iuu.j);
        this.l = this.e(ivx.t, ivx2.t, (BiFunction)iuu.a);
        this.n = this.g(ivx.j, ivx2.j, (BiFunction)iuu.g);
        this.m = this.g(ivx.k, ivx2.k, (BiFunction)iuu.h);
        this.o = this.g(ivx.u, ivx2.u, (BiFunction)iuu.k);
        this.p = this.g(ivx.v, ivx2.v, (BiFunction)iuu.c);
        final ValueAnimator g = this.g(ivx.y, ivx2.y, (BiFunction)iuu.n);
        final ValueAnimator g2 = this.g(ivx.z, ivx2.z, (BiFunction)iuu.o);
        final ValueAnimator g3 = this.g(ivx.A, ivx2.A, (BiFunction)iuu.p);
        final ValueAnimator g4 = this.g(ivx.B, ivx2.B, (BiFunction)iuu.m);
        final ValueAnimator f = this.f(0, 1, (ValueAnimator$AnimatorUpdateListener)new iuo(this));
        (this.q = f).getClass();
        final ValueAnimator e = this.e;
        e.getClass();
        final ValueAnimator c = this.c;
        c.getClass();
        final ValueAnimator f2 = this.f;
        f2.getClass();
        final ValueAnimator d = this.d;
        d.getClass();
        final ValueAnimator g5 = this.g;
        g5.getClass();
        final ValueAnimator h = this.h;
        h.getClass();
        final ValueAnimator i = this.i;
        i.getClass();
        final ValueAnimator k = this.k;
        k.getClass();
        final ValueAnimator l = this.l;
        l.getClass();
        final ValueAnimator j = this.j;
        j.getClass();
        final ValueAnimator n = this.n;
        n.getClass();
        final ValueAnimator m = this.m;
        m.getClass();
        final ValueAnimator o = this.o;
        o.getClass();
        final ValueAnimator p2 = this.p;
        p2.getClass();
        g.getClass();
        g2.getClass();
        g3.getClass();
        g4.getClass();
        this.r = nns.r(f, e, c, f2, d, g5, h, i, k, l, j, n, (Animator)m, (Animator)o, (Animator)p2, (Animator)g, (Animator)g2, (Animator)g3, (Animator)g4);
        final iva iva = (iva)Map$_EL.getOrDefault((Map)Map$_EL.getOrDefault(this.x, (Object)ivx.w, (Object)nqq.a), (Object)ivx2.w, (Object)null);
        if (iva != null) {
            iva.accept((Object)ivx, (Object)ivx2);
        }
        else {
            ivh.v.c().E(2968).x("Unsupported transition from %s -> %s", ivx.w, ivx2.w);
        }
        this.q.setDuration(Collection$_EL.stream((Collection)this.r).mapToLong((ToLongFunction)iux.a).max().orElseThrow((Supplier)new iuw(this)));
        this.q.addListener((Animator$AnimatorListener)new iuz(this, ivx2));
        final AnimatorSet set = new AnimatorSet();
        set.playTogether((Collection)this.r);
        return set;
    }
    
    public final ViewPropertyAnimator b(final float n, final int n2) {
        final ViewPropertyAnimator animate = this.b.animate();
        animate.setDuration((long)n2);
        animate.setInterpolator((TimeInterpolator)this.w);
        animate.scaleX(n).scaleY(n);
        return animate;
    }
    
    public final ivg c(final Animator animator) {
        return new ivg(this, animator);
    }
}
