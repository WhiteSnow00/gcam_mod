// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.camera.bottombar;

import android.animation.AnimatorSet;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

class RoundedThumbnailView$2 extends AnimatorListenerAdapter
{
    final /* synthetic */ RoundedThumbnailView this$0;
    
    public RoundedThumbnailView$2(final RoundedThumbnailView this$0) {
        this.this$0 = this$0;
    }
    
    public void onAnimationEnd(final Animator animator) {
        if (this.this$0.foregroundRequest != null) {
            this.this$0.foregroundRequest.finishThumbnailAnimation();
            this.this$0.processRevealRequests();
        }
        this.this$0.thumbnailAnimatorSet = null;
    }
}
