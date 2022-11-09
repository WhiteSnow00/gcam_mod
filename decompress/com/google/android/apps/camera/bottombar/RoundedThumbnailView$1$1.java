// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.camera.bottombar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

class RoundedThumbnailView$1$1 extends AnimatorListenerAdapter
{
    final /* synthetic */ RoundedThumbnailView$1 this$1;
    
    public RoundedThumbnailView$1$1(final RoundedThumbnailView$1 this$1) {
        this.this$1 = this$1;
    }
    
    public void onAnimationEnd(final Animator animator) {
        super.onAnimationEnd(animator);
        this.this$1.this$0.currentHitStateCircleOpacity = -1.0f;
        if (this.this$1.this$0.callback.g()) {
            ((RoundedThumbnailView$Callback)this.this$1.this$0.callback.c()).onHitStateFinished();
        }
    }
}
