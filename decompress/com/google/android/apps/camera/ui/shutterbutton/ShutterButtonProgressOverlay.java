// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.camera.ui.shutterbutton;

import android.graphics.Canvas;
import android.animation.Animator$AnimatorListener;
import android.animation.Animator;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.animation.TimeInterpolator;
import android.graphics.Paint$Style;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.RectF;
import android.view.animation.Interpolator;
import android.animation.ValueAnimator;
import android.animation.AnimatorSet;
import android.graphics.Paint;
import android.view.View;

public class ShutterButtonProgressOverlay extends View
{
    public final Paint a;
    public int b;
    public float c;
    public int d;
    public int e;
    public int f;
    public boolean g;
    public boolean h;
    public AnimatorSet i;
    public ValueAnimator j;
    public int k;
    private final int l;
    private final Paint m;
    private final Interpolator n;
    private final Interpolator o;
    private int p;
    private int q;
    private int r;
    private final RectF s;
    private AnimatorSet t;
    
    public ShutterButtonProgressOverlay(final Context context, final AttributeSet set) {
        super(context, set);
        this.k = 1;
        this.d = 0;
        this.p = 0;
        this.s = new RectF();
        this.g = true;
        this.h = true;
        this.i = null;
        this.t = null;
        this.j = null;
        this.setVisibility(4);
        this.l = context.getResources().getDimensionPixelSize(2131166160);
        this.e = context.getResources().getDimensionPixelSize(2131166158);
        this.f = context.getResources().getDimensionPixelSize(2131166161);
        this.n = (Interpolator)new LinearInterpolator();
        this.o = AnimationUtils.loadInterpolator(this.getContext(), 17563661);
        final Paint a = new Paint();
        (this.a = a).setAntiAlias(true);
        a.setStyle(Paint$Style.STROKE);
        a.setColor(-1);
        a.setAlpha(51);
        (this.m = new Paint(a)).setAlpha(255);
        this.g = true;
    }
    
    public final void a() {
        final AnimatorSet t = this.t;
        if (t != null && t.isRunning()) {
            this.t.cancel();
        }
        final ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[] { (float)this.f, 0.0f });
        ofFloat.setDuration(133L);
        ofFloat.setInterpolator((TimeInterpolator)this.n);
        ofFloat.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new ivs(this, 3));
        (this.t = new AnimatorSet()).play((Animator)ofFloat);
        this.t.addListener((Animator$AnimatorListener)new ivu(this));
        this.t.start();
    }
    
    public final void b(int repeatCount, final long n, final boolean b) {
        final int n2 = 0;
        final int min = Math.min(100, Math.max(repeatCount, 0));
        if (min == 0) {
            final AnimatorSet t = this.t;
            if (t != null && t.isRunning()) {
                this.t.cancel();
            }
            if (this.g) {
                this.d = 0;
                this.p = 0;
                this.g = false;
                this.h = true;
                final AnimatorSet i = this.i;
                if (i != null && i.isRunning()) {
                    this.i.cancel();
                }
                final ValueAnimator ofInt = ValueAnimator.ofInt(new int[] { this.l, this.e });
                ofInt.setDuration(167L);
                ofInt.setInterpolator((TimeInterpolator)this.o);
                ofInt.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new ivs(this));
                final ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[] { 0.0f, (float)this.f });
                ofFloat.setDuration(167L);
                ofFloat.setInterpolator((TimeInterpolator)this.o);
                ofFloat.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new ivs(this, 2));
                (this.i = new AnimatorSet()).playTogether(new Animator[] { (Animator)ofInt, (Animator)ofFloat });
                this.i.addListener((Animator$AnimatorListener)new ivt(this));
                this.i.start();
            }
        }
        else {
            final AnimatorSet j = this.i;
            if (j != null && j.isRunning()) {
                this.i.cancel();
            }
            this.k = 4;
            if (n > 0L) {
                final ValueAnimator k = this.j;
                if (k != null && k.isRunning()) {
                    repeatCount = 1;
                }
                else {
                    repeatCount = 0;
                }
                if (min < 100 && repeatCount == 0) {
                    long duration;
                    if (!b) {
                        duration = n;
                    }
                    else {
                        duration = 3000L;
                    }
                    if (b) {
                        repeatCount = (int)(n / 3000L);
                    }
                    else {
                        repeatCount = n2;
                    }
                    final ValueAnimator l = this.j;
                    if (l != null && l.isRunning()) {
                        this.j.cancel();
                    }
                    (this.j = ValueAnimator.ofInt(new int[] { 0, 360 })).setDuration(duration);
                    this.j.setInterpolator((TimeInterpolator)this.o);
                    this.j.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new ivs(this, 1));
                    this.j.setRepeatCount(repeatCount);
                    this.j.start();
                }
            }
            else {
                this.d = (int)(min * 3.6f);
                this.invalidate();
            }
            if (min == 100) {
                final ValueAnimator m = this.j;
                if (m != null && m.isRunning()) {
                    this.j.cancel();
                }
                this.a();
            }
        }
    }
    
    public final void onDraw(final Canvas canvas) {
        if (this.k == 1) {
            return;
        }
        if (this.h) {
            canvas.drawCircle((float)this.q, (float)this.r, (float)this.b, this.a);
        }
        final int k = this.k;
        if (k != 4 && k != 3) {
            return;
        }
        this.a.setStrokeWidth(this.c);
        this.m.setStrokeWidth(this.c);
        final RectF s = this.s;
        final int q = this.q;
        final int b = this.b;
        final int r = this.r;
        s.set((float)(q - b), (float)(r - b), (float)(q + b), (float)(r + b));
        canvas.drawArc(this.s, (float)(this.p - 100), 20.0f, false, this.m);
        this.p = this.d;
    }
    
    public final void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        super.onLayout(b, n, n2, n3, n4);
        if (b) {
            this.q = (n3 - n) / 2;
            this.r = (n4 - n2) / 2;
        }
    }
}
