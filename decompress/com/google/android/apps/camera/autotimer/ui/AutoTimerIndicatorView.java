// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.camera.autotimer.ui;

import android.graphics.Canvas;
import android.view.Display;
import android.content.res.Resources;
import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.graphics.Paint$Cap;
import android.graphics.Paint$Style;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.RectF;
import android.graphics.Matrix;
import android.view.ViewPropertyAnimator;
import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.view.View$OnLayoutChangeListener;
import j$.time.Duration;
import android.view.View;

public final class AutoTimerIndicatorView extends View
{
    public static final Duration a;
    static final Duration b;
    public final View$OnLayoutChangeListener c;
    final Paint d;
    final ValueAnimator e;
    public ViewPropertyAnimator f;
    private final int g;
    private final int h;
    private final int i;
    private final int j;
    private final int k;
    private final float l;
    private final float m;
    private final float n;
    private final Matrix o;
    private final Paint p;
    private final Paint q;
    private final RectF r;
    private final RectF s;
    private final RectF t;
    private final RectF u;
    private int v;
    private float w;
    
    static {
        a = Duration.ofMillis(250L);
        b = Duration.ofMillis(100L);
    }
    
    public AutoTimerIndicatorView(final Context context, final AttributeSet set) {
        super(context, set);
        this.setLayerType(2, (Paint)null);
        final Resources resources = this.getResources();
        this.h = resources.getDimensionPixelSize(2131165299);
        this.k = resources.getDimensionPixelSize(2131165302);
        this.j = resources.getDimensionPixelSize(2131165301);
        this.i = resources.getDimensionPixelSize(2131165300);
        final int color = resources.getColor(2131099687);
        this.g = color;
        final float n = (float)resources.getDimensionPixelSize(2131165298);
        this.l = n;
        this.o = new Matrix();
        this.r = new RectF();
        this.u = new RectF();
        this.s = new RectF();
        this.t = new RectF();
        final Paint d = new Paint();
        (this.d = d).setColor(color);
        d.setAntiAlias(true);
        final Paint p2 = new Paint();
        (this.p = p2).setColor(resources.getColor(2131099685));
        p2.setAntiAlias(true);
        final Paint q = new Paint();
        (this.q = q).setStyle(Paint$Style.STROKE);
        q.setColor(resources.getColor(2131099686));
        q.setAntiAlias(true);
        q.setStrokeCap(Paint$Cap.ROUND);
        q.setStrokeWidth(n);
        final ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[] { 0.0f });
        (this.e = ofFloat).addUpdateListener((ValueAnimator$AnimatorUpdateListener)new bwr(this));
        ofFloat.setInterpolator((TimeInterpolator)new DecelerateInterpolator());
        final float n2 = (float)resources.getInteger(2131492873);
        final float n3 = (float)resources.getInteger(2131492872);
        this.m = n2 / n3;
        this.n = (n3 - n2) / n3;
        this.c = (View$OnLayoutChangeListener)new bws(this);
    }
    
    private static RectF c(final int n, final int n2, final int n3, final int n4, final int n5) {
        if (n5 != 1 && n5 != 3) {
            return new RectF((float)n, (float)n2, (float)n3, (float)n4);
        }
        return new RectF((float)n2, (float)n, (float)n4, (float)n3);
    }
    
    public final void a(final float w) {
        this.w = w;
        if (this.getVisibility() == 0) {
            if (this.e.isRunning()) {
                this.e.cancel();
            }
            this.e.setFloatValues(new float[] { (float)this.e.getAnimatedValue(), w });
            this.e.setDuration(AutoTimerIndicatorView.b.toMillis());
            this.e.start();
        }
    }
    
    public final void b(final int n, final int n2, final int n3, final int n4) {
        final Display display = this.getDisplay();
        int rotation;
        if (display != null) {
            rotation = display.getRotation();
        }
        else {
            rotation = 0;
        }
        this.v = rotation;
        this.o.reset();
        this.o.postRotate((float)(-rotation * 90), 0.5f, 0.5f);
        this.o.postTranslate((n3 - n) * 0.5f, (n4 - n2) * 0.5f);
        final RectF c = c(n, n2, n3, n4, this.v);
        this.t.top = -c.height() * 0.5f + this.i;
        final RectF t = this.t;
        t.bottom = t.top + this.h;
        this.t.left = -c.width() * 0.5f + this.i;
        final RectF t2 = this.t;
        t2.right = -t2.left;
        this.s.top = this.t.top;
        this.s.bottom = this.t.bottom;
    }
    
    protected final void onDraw(final Canvas canvas) {
        final RectF c = c(this.getLeft(), this.getTop(), this.getRight(), this.getBottom(), this.v);
        final float floatValue = (float)this.e.getAnimatedValue();
        final int j = this.j;
        final float width = c.width();
        final int i = this.i;
        this.s.left = -Math.max(j, (int)((width - (i + i)) * floatValue)) * 0.5f;
        final RectF s = this.s;
        s.right = -s.left;
        this.o.mapRect(this.u, this.s);
        this.o.mapRect(this.r, this.t);
        this.d.setColor((int)((this.w * this.n + this.m) * 255.0f) << 24 | (this.g & 0xFFFFFF));
        final RectF r = this.r;
        final float n = (float)this.k;
        canvas.drawRoundRect(r, n, n, this.p);
        final float left = this.r.left;
        final float l = this.l;
        final float top = this.r.top;
        final float k = this.l;
        final float right = this.r.right;
        final float m = this.l;
        final float bottom = this.r.bottom;
        final float l2 = this.l;
        final float n2 = (float)this.k;
        canvas.drawRoundRect(left - l, top - k, right + m, bottom + l2, n2, n2, this.q);
        final RectF u = this.u;
        final float n3 = (float)this.k;
        canvas.drawRoundRect(u, n3, n3, this.d);
    }
}
