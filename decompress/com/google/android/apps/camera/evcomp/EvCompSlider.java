// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.camera.evcomp;

import android.graphics.Canvas;
import android.view.View;
import android.view.MotionEvent;
import android.content.res.Resources$Theme;
import android.graphics.Paint$Style;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.Paint;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;

public class EvCompSlider extends FrameLayout
{
    public int a;
    private final AccessibilityManager b;
    private final Paint c;
    private final Paint d;
    private final int e;
    private final int f;
    private final int g;
    
    public EvCompSlider(final Context context, final AttributeSet set) {
        super(context, set);
        this.setWillNotDraw(false);
        final int dimensionPixelSize = this.getResources().getDimensionPixelSize(2131165445);
        this.e = this.getResources().getDimensionPixelSize(2131165452);
        this.f = this.getResources().getDimensionPixelSize(2131165451);
        this.g = dimensionPixelSize / 2;
        final Paint c = new Paint();
        (this.c = c).setStyle(Paint$Style.FILL);
        c.setColor(this.getResources().getColor(2131099834, (Resources$Theme)null));
        c.setAntiAlias(true);
        final Paint d = new Paint();
        (this.d = d).setStyle(Paint$Style.STROKE);
        d.setStrokeWidth((float)this.getResources().getDimensionPixelSize(2131165450));
        d.setColor(this.getResources().getColor(2131099833, (Resources$Theme)null));
        d.setAntiAlias(true);
        this.b = (AccessibilityManager)context.getSystemService("accessibility");
    }
    
    public final boolean dispatchTouchEvent(final MotionEvent motionEvent) {
        if (this.b.isTouchExplorationEnabled()) {
            for (int i = 0; i < this.getChildCount(); ++i) {
                final View child = this.getChildAt(i);
                if (child instanceof dgk) {
                    return child.dispatchTouchEvent(motionEvent);
                }
            }
            return super.dispatchTouchEvent(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }
    
    protected final void onDraw(final Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawRoundRect((float)(this.getMeasuredWidth() - this.f / 2), (float)this.g, (float)(this.getMeasuredWidth() - this.f / 2 + this.e), (float)(this.g + this.a), (float)this.getResources().getDimensionPixelSize(2131165449), (float)this.getResources().getDimensionPixelSize(2131165449), this.c);
        canvas.drawRoundRect((float)(this.getMeasuredWidth() - this.f / 2), (float)this.g, (float)(this.getMeasuredWidth() - this.f / 2 + this.e), (float)(this.g + this.a), (float)this.getResources().getDimensionPixelSize(2131165449), (float)this.getResources().getDimensionPixelSize(2131165449), this.d);
    }
}
