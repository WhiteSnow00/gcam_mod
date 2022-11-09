// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.behavior;

import android.view.ViewGroup$MarginLayoutParams;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import android.animation.Animator$AnimatorListener;
import android.animation.TimeInterpolator;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import android.view.ViewPropertyAnimator;

public class HideBottomViewOnScrollBehavior extends zv
{
    public ViewPropertyAnimator a;
    private int b;
    private int c;
    
    public HideBottomViewOnScrollBehavior() {
        this.b = 0;
        this.c = 2;
    }
    
    public HideBottomViewOnScrollBehavior(final Context context, final AttributeSet set) {
        super(context, set);
        this.b = 0;
        this.c = 2;
    }
    
    private final void w(final View view, final int n, final long duration, final TimeInterpolator interpolator) {
        this.a = view.animate().translationY((float)n).setInterpolator(interpolator).setDuration(duration).setListener((Animator$AnimatorListener)new nct(this));
    }
    
    @Override
    public final boolean d(final CoordinatorLayout coordinatorLayout, final View view, final int n) {
        this.b = view.getMeasuredHeight() + ((ViewGroup$MarginLayoutParams)view.getLayoutParams()).bottomMargin;
        return false;
    }
    
    @Override
    public final void l(final CoordinatorLayout coordinatorLayout, final View view, final int n, final int n2, final int n3, final int[] array) {
        if (n > 0) {
            if (this.c != 1) {
                final ViewPropertyAnimator a = this.a;
                if (a != null) {
                    a.cancel();
                    view.clearAnimation();
                }
                this.c = 1;
                this.w(view, this.b, 175L, ncj.b);
            }
        }
        else if (n < 0 && this.c != 2) {
            final ViewPropertyAnimator a2 = this.a;
            if (a2 != null) {
                a2.cancel();
                view.clearAnimation();
            }
            this.c = 2;
            this.w(view, 0, 225L, ncj.c);
        }
    }
    
    @Override
    public final boolean p(final View view, final int n, final int n2) {
        return n == 2;
    }
}
