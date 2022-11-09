// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.camera.bottombar;

import android.animation.ValueAnimator;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

class RoundedThumbnailView$3 extends AnimatorListenerAdapter
{
    final /* synthetic */ RoundedThumbnailView this$0;
    
    public RoundedThumbnailView$3(final RoundedThumbnailView this$0) {
        this.this$0 = this$0;
    }
    
    public void onAnimationEnd(final Animator animator) {
        if (this.this$0.foregroundRequest != null) {
            this.this$0.foregroundRequest.finishRippleAnimation();
            this.this$0.processRevealRequests();
        }
        this.this$0.rippleAnimator = null;
    }
}
