// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.camera.ui.views;

import android.view.View;
import android.view.MotionEvent;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.animation.DecelerateInterpolator;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.animation.TimeInterpolator;
import android.animation.AnimatorSet;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.content.res.Resources;
import android.content.res.Resources$Theme;
import android.graphics.Rect;
import android.view.ViewGroup;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.TextView;
import java.util.concurrent.Callable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.widget.ImageView;
import com.google.android.apps.camera.ui.layout.GcaLayout;

public class ViewfinderCover extends GcaLayout implements iqb, csc
{
    private static final nsd k;
    public ImageView e;
    public AnimatedVectorDrawable f;
    public boolean g;
    public Callable h;
    public final iqc i;
    public boolean j;
    private TextView l;
    private final cxl m;
    
    static {
        k = nsd.g("com/google/android/apps/camera/ui/views/ViewfinderCover");
    }
    
    public ViewfinderCover(final Context context, final AttributeSet set) {
        super(context, set);
        this.g = true;
        this.j = false;
        this.i = new iqc(this);
        this.m = ((bmp)context).a();
    }
    
    private final int p(final Rect rect) {
        final Object a = this.d.a();
        if (a == null) {
            return 0;
        }
        if (this.m.k(cxr.aQ)) {
            kqp kqp;
            if (((inw)a).a.f == jcb.a) {
                kqp = kqp.h(rect.height(), rect.width());
            }
            else {
                kqp = kqp.h(rect.width(), rect.height());
            }
            if (kqp.equals(kqp.b)) {
                return this.getResources().getDimensionPixelSize(2131166370);
            }
        }
        return 0;
    }
    
    @Override
    public final oey a(final lfu lfu) {
        final Resources resources = this.getResources();
        int n;
        if (lfu == lfu.b) {
            n = 2131231104;
        }
        else {
            n = 2131231103;
        }
        this.f = (AnimatedVectorDrawable)resources.getDrawable(n, (Resources$Theme)null);
        final ofn f = ofn.f();
        this.i.n(jbm.a, iey.g, new izd(this), new izb(f), false);
        return f;
    }
    
    @Override
    public final niz b() {
        final Object a = this.d.a();
        if (a == null) {
            return nii.a;
        }
        final Rect e = ((inw)a).b.e;
        final ipy a2 = ipz.a();
        a2.c(e);
        a2.b(this.p(e));
        return niz.i(a2.a());
    }
    
    @Override
    public final niz c() {
        try {
            return this.h.call();
        }
        catch (final Exception ex) {
            a.m(ViewfinderCover.k.b(), "Failed to create snapshot", '\u0bb3', ex);
            return nii.a;
        }
    }
    
    @Override
    public final void d(final boolean b) {
        final iqc i = this.i;
        i.w.setAlpha(0.0f);
        i.m();
        i.w.animate().alpha(1.0f).setDuration(250L).start();
        if (b) {
            i.x.setAlpha(0.0f);
            i.x.setVisibility(0);
            i.x.animate().alpha(1.0f).setDuration(250L).start();
        }
    }
    
    @Override
    public final void e() {
        this.i.f();
    }
    
    @Override
    public final void f() {
        this.i.g();
    }
    
    @Override
    public final void g(final jbm jbm) {
        final ImageView e = this.e;
        final CharSequence charSequence = null;
        Drawable a;
        if (jbm != null) {
            if (jbm == jbm.a) {
                a = null;
            }
            else {
                a = jbk.b(jbm).a(this.getResources());
            }
        }
        else {
            a = null;
        }
        e.setImageDrawable(a);
        final TextView l = this.l;
        CharSequence d;
        if (jbm != null) {
            if (jbm == jbm.a) {
                d = charSequence;
            }
            else {
                d = jbk.b(jbm).d(this.getResources());
            }
        }
        else {
            d = charSequence;
        }
        l.setText(d);
    }
    
    @Override
    public final boolean h() {
        return this.g;
    }
    
    @Override
    public final boolean i() {
        return true;
    }
    
    public final void j() {
        final iqc i = this.i;
        final jbm a = jbm.a;
        final int f = i.F;
        if (f == 0) {
            throw null;
        }
        switch (f - 1) {
            default: {
                return;
            }
            case 0:
            case 3: {
                i.d();
            }
        }
    }
    
    public final void k() {
        this.i.e();
    }
    
    public final void l() {
        this.i.l();
    }
    
    public final void m(final jbm jbm, final ize ize, final Runnable runnable) {
        final iqc i = this.i;
        ize.getClass();
        i.n(jbm, runnable, this, new iza(ize), false);
    }
    
    public final void n(final jbm jbm, final Runnable runnable) {
        this.o(jbm, runnable, false);
    }
    
    public final void o(final jbm jbm, final Runnable runnable, final boolean b) {
        this.i.n(jbm, iey.h, this, new izc(runnable), b);
    }
    
    protected final void onDraw(final Canvas canvas) {
        final iqc i = this.i;
        if (!i.k.g()) {
            canvas.drawColor(0);
            return;
        }
        if (i.z > 0) {
            canvas.saveLayer((RectF)null, (Paint)null, 31);
            iqc.c(canvas, i.m.a, i.z, i.i);
        }
        canvas.drawBitmap(((ixt)i.k.c()).a, i.l, i.m.a, i.g);
        if (i.z > 0) {
            canvas.restore();
        }
        final int n = i.n;
        if (n > 0) {
            i.h.setAlpha(n);
            iqc.c(canvas, i.m.a, i.z, i.h);
        }
        if (i.o.g()) {
            i.j.post((Runnable)i.o.c());
            i.o = nii.a;
        }
    }
    
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.e = (ImageView)this.findViewById(2131428136);
        this.l = (TextView)this.findViewById(2131428137);
        final iqc i = this.i;
        i.w = (View)this.e;
        i.x = (View)this.l;
        i.f();
        this.i.g();
    }
    
    @Override
    protected final void onLayout(final boolean b, int n, int n2, int n3, int n4) {
        super.onLayout(b, n, n2, n3, n4);
        final Object a = this.d.a();
        if (this.j && a != null) {
            final inw inw = (inw)a;
            if (!inw.b.o) {
                this.j = false;
                final ipy a2 = ipz.a();
                a2.c(inw.b.e);
                a2.b(this.p(inw.b.e));
                final ipz a3 = a2.a();
                final iqc i = this.i;
                if (i.F == 3) {
                    if (!this.h()) {
                        i.F = 4;
                        return;
                    }
                    i.F = 4;
                    if (i.k.g()) {
                        float n5;
                        if (i.D != i.C.e()) {
                            n5 = i.p;
                        }
                        else {
                            n5 = (float)i.q.aQ();
                        }
                        if (i.p <= n5) {
                            i.q.aQ();
                            if (!a3.a.equals((Object)i.m.a)) {
                                final Rect a4 = ((ixt)i.k.c()).a();
                                Rect l;
                                final Rect rect = l = i.l;
                                if (!rect.equals((Object)a4)) {
                                    if (rect.height() > rect.width()) {
                                        n = a4.height();
                                        n2 = Math.round(n * iqc.a(rect));
                                    }
                                    else {
                                        n2 = a4.width();
                                        n = Math.round(n2 / iqc.a(rect));
                                    }
                                    n4 = a4.centerX();
                                    n3 = a4.centerY();
                                    n2 /= 2;
                                    n /= 2;
                                    l = new Rect(n4 - n2, n3 - n, n4 + n2, n3 + n);
                                }
                                final ixt ixt = (ixt)i.k.c();
                                final Rect a5 = a3.a;
                                n2 = a5.width();
                                n = ixt.b;
                                n = n2 / (n + n);
                                n2 = a5.height();
                                n3 = ixt.b;
                                n3 = n2 / (n3 + n3);
                                n4 = a5.centerX() / ixt.b;
                                n2 = a5.centerY() / ixt.b;
                                final Rect rect2 = new Rect(n4 - n, n2 - n3, n4 + n, n2 + n3);
                                float n6;
                                if (!i.p()) {
                                    n6 = 1.0f;
                                }
                                else {
                                    n6 = 0.8f;
                                }
                                final float a6 = iqc.a(l);
                                final float a7 = iqc.a(rect2);
                                if (a7 == 0.0f) {
                                    a.k(iqc.a.c(), "Invalid aspect ratio in fitToRect: %s", rect2, '\u0b00');
                                }
                                else {
                                    float n7;
                                    float n8;
                                    if (a7 < a6) {
                                        n7 = (float)l.height();
                                        n8 = a7 * n7;
                                    }
                                    else {
                                        n8 = (float)l.width();
                                        n7 = n8 / a7;
                                    }
                                    n = l.centerX();
                                    n2 = l.centerY();
                                    n3 = Math.round(n8 / 2.0f * n6);
                                    n4 = Math.round(n7 / 2.0f * n6);
                                    l = new Rect(n - n3, n2 - n4, n + n3, n2 + n4);
                                }
                                i.f.cancel();
                                i.f = new AnimatorSet();
                                final AnimatorSet f = i.f;
                                final ValueAnimator b2 = iqc.b(i.m.a, a3.a, (TimeInterpolator)i.e, (ValueAnimator$AnimatorUpdateListener)new ipt(i, 2));
                                final ValueAnimator b3 = iqc.b(i.l, l, (TimeInterpolator)i.e, (ValueAnimator$AnimatorUpdateListener)new ipt(i, 3));
                                n = i.m.b;
                                n2 = a3.b;
                                final DecelerateInterpolator interpolator = new DecelerateInterpolator();
                                final ipt ipt = new ipt(i, 4);
                                final ValueAnimator ofInt = ValueAnimator.ofInt(new int[] { n, n2 });
                                ofInt.setInterpolator((TimeInterpolator)interpolator);
                                ofInt.addUpdateListener((ValueAnimator$AnimatorUpdateListener)ipt);
                                f.playTogether(new Animator[] { (Animator)b2, (Animator)b3, (Animator)ofInt });
                                i.f.setDuration(300L);
                                i.f.start();
                                return;
                            }
                            final Rect a8 = i.m.a;
                            if (i.y) {
                                final float p5 = i.p;
                                if (p5 <= n5) {
                                    final Rect j = i.l;
                                    float n9 = n5;
                                    if (i.p()) {
                                        n9 = n5 / 0.8f;
                                    }
                                    final float n10 = p5 / n9;
                                    n3 = Math.round(j.width() * n10);
                                    n4 = Math.round(j.height() * n10);
                                    n = j.centerX();
                                    n2 = j.centerY();
                                    n3 /= 2;
                                    n4 /= 2;
                                    final Rect rect3 = new Rect(n - n3, n2 - n4, n + n3, n2 + n4);
                                    if (rect3.left >= 0 && rect3.top >= 0) {
                                        i.f.cancel();
                                        (i.f = new AnimatorSet()).playTogether(new Animator[] { (Animator)iqc.b(i.l, rect3, (TimeInterpolator)i.e, (ValueAnimator$AnimatorUpdateListener)new ipt(i)) });
                                        i.f.setDuration(300L);
                                        i.f.start();
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    
    public final boolean onTouchEvent(final MotionEvent motionEvent) {
        return false;
    }
}
