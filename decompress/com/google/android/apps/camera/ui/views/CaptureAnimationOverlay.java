// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.camera.ui.views;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.animation.Animator$AnimatorListener;
import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.util.AttributeSet;
import android.content.Context;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.view.animation.Interpolator;
import android.graphics.RectF;
import android.animation.AnimatorSet;
import android.graphics.Paint;
import android.view.View;

public class CaptureAnimationOverlay extends View
{
    public final Paint a;
    public AnimatorSet b;
    public int c;
    private final RectF d;
    private final Interpolator e;
    private final Interpolator f;
    private final Interpolator g;
    private final ValueAnimator$AnimatorUpdateListener h;
    
    public CaptureAnimationOverlay(final Context context, final AttributeSet set) {
        super(context, set);
        this.c = 1;
        this.d = new RectF();
        (this.a = new Paint()).setColor(-16777216);
        this.e = (Interpolator)new LinearInterpolator();
        this.f = AnimationUtils.loadInterpolator(this.getContext(), 17563661);
        this.g = AnimationUtils.loadInterpolator(this.getContext(), 17563663);
        this.h = (ValueAnimator$AnimatorUpdateListener)new iyk(this);
    }
    
    public final void a(final boolean b) {
        final AnimatorSet b2 = this.b;
        if (b2 != null && b2.isRunning()) {
            this.b.cancel();
        }
        ValueAnimator valueAnimator;
        if (b) {
            valueAnimator = ValueAnimator.ofFloat(new float[] { 0.0f, 0.6f });
            valueAnimator.setDuration(167L);
            valueAnimator.setInterpolator((TimeInterpolator)this.f);
        }
        else {
            valueAnimator = ValueAnimator.ofFloat(new float[] { 0.6f, 0.0f });
            valueAnimator.setDuration(133L);
            valueAnimator.setInterpolator((TimeInterpolator)this.g);
        }
        valueAnimator.addUpdateListener(this.h);
        (this.b = new AnimatorSet()).play((Animator)valueAnimator);
        this.b.addListener((Animator$AnimatorListener)new iyn(this, b));
        this.b.start();
    }
    
    public final void b() {
        final ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[] { 0.76f, 0.76f });
        final ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[] { 0.76f, 0.0f });
        ofFloat.setDuration(66L);
        ofFloat2.setDuration(166L);
        ofFloat.addUpdateListener(this.h);
        ofFloat2.addUpdateListener(this.h);
        ofFloat.setInterpolator((TimeInterpolator)this.e);
        ofFloat2.setInterpolator((TimeInterpolator)this.e);
        ofFloat.addListener((Animator$AnimatorListener)new iyl(this, ofFloat2));
        ofFloat2.addListener((Animator$AnimatorListener)new iym(this));
        ofFloat.start();
    }
    
    public final boolean hasOverlappingRendering() {
        return false;
    }
    
    public final void layout(final int n, final int n2, final int n3, final int n4) {
        super.layout(n, n2, n3, n4);
        this.d.set(new Rect(n, n2, n3, n4));
    }
    
    public final void onDraw(final Canvas canvas) {
        if (this.c != 1) {
            canvas.drawRect(this.d, this.a);
            canvas.clipRect(this.d);
        }
    }
    
    protected final void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        super.onLayout(b, n, n2, n3, n4);
        this.d.set((float)n, (float)n2, (float)n3, (float)n4);
    }
}
