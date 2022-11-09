// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.camera.bottombar;

import android.animation.Animator$AnimatorListener;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.animation.TimeInterpolator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.View;
import android.animation.ValueAnimator;
import android.view.View$OnClickListener;

class RoundedThumbnailView$1 implements View$OnClickListener
{
    final /* synthetic */ RoundedThumbnailView this$0;
    
    public RoundedThumbnailView$1(final RoundedThumbnailView this$0) {
        this.this$0 = this$0;
    }
    
    public void onClick(final View view) {
        final ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[] { 0.7f, 0.0f });
        ofFloat.setDuration(150L);
        ofFloat.setInterpolator((TimeInterpolator)new AccelerateDecelerateInterpolator());
        ofFloat.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new RoundedThumbnailView$1$$ExternalSyntheticLambda0(this));
        ofFloat.addListener((Animator$AnimatorListener)new RoundedThumbnailView$1$1(this));
        ofFloat.start();
        if (this.this$0.optionalOnClickListener.g()) {
            ((View$OnClickListener)this.this$0.optionalOnClickListener.c()).onClick(view);
        }
    }
}
