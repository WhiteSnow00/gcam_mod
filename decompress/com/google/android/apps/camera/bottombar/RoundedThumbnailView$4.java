// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.camera.bottombar;

import android.animation.ValueAnimator;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

class RoundedThumbnailView$4 extends AnimatorListenerAdapter
{
    final /* synthetic */ RoundedThumbnailView this$0;
    
    public RoundedThumbnailView$4(final RoundedThumbnailView this$0) {
        this.this$0 = this$0;
    }
    
    public void onAnimationEnd(final Animator animator) {
        this.this$0.burstFlashAnimator = null;
    }
}
