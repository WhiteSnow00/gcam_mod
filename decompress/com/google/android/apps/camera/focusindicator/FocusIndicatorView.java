// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.camera.focusindicator;

import android.view.View;
import android.content.res.Resources;
import android.util.TypedValue;
import android.graphics.Matrix;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.util.AttributeSet;
import android.content.Context;
import android.animation.Animator$AnimatorListener;
import android.graphics.PointF;
import android.animation.Animator;
import android.widget.TextView;
import android.widget.RelativeLayout;

public class FocusIndicatorView extends RelativeLayout implements bke
{
    FocusIndicatorRingView a;
    dos b;
    dou c;
    TextView d;
    jcl e;
    jcl f;
    jcl g;
    jcl h;
    jcl i;
    jcl j;
    jcl k;
    jcl l;
    public Animator m;
    private final dox n;
    private final PointF o;
    private final int[] p;
    private volatile jcb q;
    private final Animator$AnimatorListener r;
    
    public FocusIndicatorView(final Context context, final AttributeSet set) {
        super(context, set);
        this.o = new PointF(0.0f, 0.0f);
        this.p = new int[2];
        this.r = (Animator$AnimatorListener)new dow(this);
        ((LayoutInflater)context.getSystemService("layout_inflater")).inflate(2131624014, (ViewGroup)this);
        final dox s = this.s(context);
        this.n = s;
        final dor dor = (dor)s;
        this.a = dpa.b(dor.a);
        this.b = dpd.b(dor.a);
        this.c = dpe.b(dor.a);
        final TextView d = dor.a.d;
        pqf.k(d);
        this.d = d;
        this.e = (jcl)dor.b.get();
        this.f = (jcl)dor.c.get();
        this.g = (jcl)dor.d.get();
        this.h = (jcl)dor.e.get();
        this.i = (jcl)dor.f.get();
        this.j = (jcl)dor.g.get();
        this.k = (jcl)dor.h.get();
        this.l = (jcl)dor.i.get();
        this.w(this.e);
        this.w(this.f);
        this.w(this.g);
        this.w(this.h);
        this.w(this.i);
        this.w(this.j);
    }
    
    FocusIndicatorView(final Context context, final FocusIndicatorRingView a, final dos b, final dou c, final TextView d, final jcl e, final jcl f, final jcl g, final jcl h, final jcl i, final jcl j) {
        super(context);
        this.o = new PointF(0.0f, 0.0f);
        this.p = new int[2];
        this.r = (Animator$AnimatorListener)new dow(this);
        this.n = this.s(context);
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.w(e);
        this.e = e;
        this.w(f);
        this.f = f;
        this.w(g);
        this.g = g;
        this.w(h);
        this.h = h;
        this.w(i);
        this.i = i;
        this.w(j);
        this.j = j;
    }
    
    private final PointF q(final PointF pointF) {
        final float[] array = { pointF.x, pointF.y };
        final int e = this.q.e;
        final Matrix matrix = new Matrix();
        matrix.setRotate((float)e, 0.5f, 0.5f);
        matrix.mapPoints(array);
        return new PointF(array[0] * this.getWidth(), array[1] * this.getHeight());
    }
    
    private final PointF r(PointF pointF) {
        pointF = new PointF(pointF.x, pointF.y);
        pointF.offset(-this.o.x, -this.o.y);
        return pointF;
    }
    
    private final dox s(final Context context) {
        final doy a = new doy(context, this);
        final doq doq = new doq();
        pqf.j(doq.a = a, doy.class);
        return new dor(doq.a);
    }
    
    private final void t() {
        final Animator m = this.m;
        if (m != null && m.isRunning()) {
            this.m.cancel();
            this.m = null;
        }
    }
    
    private final void u() {
        this.c.d(0.0f);
        this.b.e(0.0f);
        this.a.invalidate();
    }
    
    private final void v(final niz niz, final int n) {
        if (niz.g()) {
            this.a.b(this.q((PointF)niz.c()));
            final double n2 = ((PointF)niz.c()).x;
            Double.isNaN(n2);
            if (Math.abs(n2 - 0.5) < 0.001) {
                final double n3 = ((PointF)niz.c()).y;
                Double.isNaN(n3);
                Math.abs(n3 - 0.5);
            }
            this.x((float)n);
            return;
        }
        this.a.b(new PointF((float)(this.getWidth() / 2), (float)(this.getHeight() / 2)));
    }
    
    private final void w(final jcl jcl) {
        if (jcl != null) {
            jcl.b(this.r);
        }
    }
    
    private final void x(float n) {
        final Resources resources = this.getContext().getResources();
        final float n2 = (float)resources.getDisplayMetrics().widthPixels;
        final float n3 = (float)resources.getDisplayMetrics().heightPixels;
        float n4;
        if (n > 1350.0f) {
            n4 = 1350.0f;
        }
        else {
            n4 = n;
            if (n < 360.0f) {
                n4 = 360.0f;
            }
        }
        n = Math.max(n3, n2);
        final float min = Math.min(n3, n2);
        final float n5 = n / min;
        if (this.q.e == 0) {
            n = n4 * min / 1080.0f;
        }
        else {
            int n6;
            if (n5 > 2.1f) {
                n6 = 2280;
            }
            else {
                n6 = 2060;
            }
            n = n4 * n / n6;
        }
        n = TypedValue.applyDimension(0, n / 2.0f, resources.getDisplayMetrics());
        this.b.d(n);
        this.b.c(n / 2.0f);
    }
    
    public final jck b() {
        final Animator m = this.m;
        if (m != null && m.isRunning()) {
            return jcl.a;
        }
        return this.f.a();
    }
    
    public final jck c(final PointF pointF) {
        this.t();
        this.u();
        this.a.b(this.r(pointF));
        return this.e.a();
    }
    
    public final jck d() {
        final Animator m = this.m;
        if (m != null && m.isRunning()) {
            return jcl.a;
        }
        return this.h.a();
    }
    
    public final jck e(final niz niz, final int n) {
        final Animator m = this.m;
        if (m != null && m.isRunning()) {
            return jcl.a;
        }
        this.u();
        this.v(niz, n);
        return this.g.a();
    }
    
    public final jck f() {
        final Animator m = this.m;
        if (m != null && m.isRunning()) {
            return jcl.a;
        }
        return this.l.a();
    }
    
    public final jck g(final PointF pointF) {
        this.t();
        this.u();
        this.a.b(this.r(pointF));
        return this.k.a();
    }
    
    public final void h() {
        this.t();
        this.u();
    }
    
    public final void i() {
        this.a.b(new PointF((float)(this.getWidth() / 2), (float)(this.getHeight() / 2)));
    }
    
    public final void j(final boolean b) {
        int visibility;
        if (!b) {
            visibility = 4;
        }
        else {
            visibility = 0;
        }
        this.setVisibility(visibility);
    }
    
    public final void k(final niz niz, final int n) {
        this.v(niz, n);
        this.b.f(this.getContext().getResources().getDimension(2131165294));
        this.b.e(1.0f);
        this.a.invalidate();
    }
    
    public final void l(PointF q) {
        q = this.q(q);
        this.a.b(q);
    }
    
    public final void m(PointF q, float y) {
        q = this.q(q);
        this.x(y);
        final float x = q.x;
        final float x2 = this.a.getX();
        final int width = this.a.getWidth();
        y = q.y;
        this.a.animate().translationXBy(x - x2 - width / 2).translationYBy(y - this.a.getY() - this.a.getHeight() / 2).setDuration(33L).start();
        this.a.invalidate();
    }
    
    public final boolean n(PointF r) {
        final FocusIndicatorRingView a = this.a;
        r = this.r(r);
        final float n = r.x - a.c.x;
        final float n2 = r.y - a.c.y;
        final float d = a.d;
        return n * n + n2 * n2 <= d * d;
    }
    
    public final void o() {
        this.d.setVisibility(8);
    }
    
    protected final void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        super.onLayout(b, n, n2, n3, n4);
        this.getLocationInWindow(this.p);
        final PointF o = this.o;
        final int[] p5 = this.p;
        o.set((float)p5[0], (float)p5[1]);
        final View view = (View)this.getParent();
        this.q = jcb.b(iwu.a(this.getContext()), iwu.d(this.getContext()), view.getMeasuredWidth(), view.getMeasuredHeight());
    }
    
    public final jck p() {
        final Animator m = this.m;
        if (m != null && m.isRunning()) {
            return jcl.a;
        }
        this.u();
        this.a.b(new PointF((float)(this.getWidth() / 2), (float)(this.getHeight() / 2)));
        return this.g.a();
    }
}
