// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.camera.filmstrip.transition;

import android.graphics.PointF;
import android.graphics.Color;
import android.view.WindowInsets;
import android.app.Activity;
import android.graphics.Point;
import android.graphics.RectF;
import android.view.View;
import android.util.SizeF;
import android.view.animation.Interpolator;
import android.animation.Animator$AnimatorListener;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.animation.TimeInterpolator;
import android.view.animation.AnimationUtils;
import android.util.AttributeSet;
import android.content.Context;
import com.google.android.apps.camera.bottombar.RoundedThumbnailView;
import android.animation.ValueAnimator;
import android.widget.FrameLayout;

public class FilmstripTransitionLayout extends FrameLayout
{
    public final ValueAnimator a;
    public final ValueAnimator b;
    public boolean c;
    public boolean d;
    public FilmstripTransitionThumbnailView e;
    public RoundedThumbnailView f;
    public boolean g;
    public doo h;
    public doi i;
    private final liy j;
    
    public FilmstripTransitionLayout(final Context context, final AttributeSet set) {
        super(context, set);
        this.c = false;
        this.d = false;
        this.i = null;
        this.j = liy.a();
        this.g = true;
        this.setVisibility(4);
        this.b(0.0f);
        final Interpolator loadInterpolator = AnimationUtils.loadInterpolator(context, 17563661);
        final ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[] { 1.0f, 0.0f });
        (this.a = ofFloat).setDuration(250L);
        ofFloat.setInterpolator((TimeInterpolator)loadInterpolator);
        ofFloat.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new dom(this, 1));
        ofFloat.addListener((Animator$AnimatorListener)new dol(this));
        final ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[] { 0.0f, 1.0f });
        (this.b = ofFloat2).setDuration(250L);
        ofFloat2.setInterpolator((TimeInterpolator)loadInterpolator);
        ofFloat2.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new dom(this));
        ofFloat2.addListener((Animator$AnimatorListener)new don(this));
    }
    
    public final dop a() {
        this.f.getClass();
        final SizeF sizeF = new SizeF((float)this.e.a().getWidth(), (float)this.e.a().getHeight());
        final float thumbnailFinalDiameter = this.f.getThumbnailFinalDiameter();
        final Point y = jwn.Y((View)this.f);
        final float rippleRingMaxDiameterDp = this.f.getRippleRingMaxDiameterDp();
        final RectF rectF = new RectF((float)y.x, (float)y.y, y.x + rippleRingMaxDiameterDp, y.y + rippleRingMaxDiameterDp);
        final View rootView = this.getRootView();
        final int[] w = jvu.w(rootView);
        int max = 0;
        final int n = w[0];
        final RectF rectF2 = new RectF((float)n, (float)w[1], (float)(n + rootView.getWidth()), (float)(w[1] + rootView.getHeight()));
        final Context context = this.getContext();
        final Point point = new Point();
        ((Activity)context).getWindowManager().getDefaultDisplay().getRealSize(point);
        final RectF rectF3 = new RectF(0.0f, 0.0f, (float)point.x, (float)point.y);
        if (this.j.e && jvu.v((View)this)) {
            final int[] w2 = jvu.w(this.getRootView());
            final WindowInsets rootWindowInsets = this.getRootWindowInsets();
            int max2;
            if (this.getResources().getConfiguration().orientation == 1) {
                max2 = Math.max(w2[1] + rootWindowInsets.getSystemWindowInsetTop(), rootWindowInsets.getSystemWindowInsetBottom());
            }
            else {
                max = Math.max(w2[0] + rootWindowInsets.getSystemWindowInsetLeft(), rootWindowInsets.getSystemWindowInsetRight());
                max2 = 0;
            }
            final Point point2 = new Point(max, max2);
            rectF3.inset((float)point2.x, (float)point2.y);
        }
        return new dop(sizeF, rectF2, rectF3, rectF, thumbnailFinalDiameter);
    }
    
    public final void b(final float n) {
        this.setBackgroundColor(Color.argb((int)(n * 255.0f), 0, 0, 0));
    }
    
    public final void c(final float n) {
        final doo h = this.h;
        h.getClass();
        final float b = h.b(n);
        this.e.setScaleX(b);
        this.e.setScaleY(b);
        final PointF c = this.h.c(n);
        this.e.setTranslationX(c.x);
        this.e.setTranslationY(c.y);
        this.e.b(this.h.a(n));
        this.b(doo.d(n));
    }
    
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.e = (FilmstripTransitionThumbnailView)this.findViewById(2131428100);
    }
}
