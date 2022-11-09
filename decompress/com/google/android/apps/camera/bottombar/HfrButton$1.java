// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.camera.bottombar;

import android.view.View;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

class HfrButton$1 extends AnimatorListenerAdapter
{
    final /* synthetic */ HfrButton this$0;
    final /* synthetic */ boolean val$callListener;
    final /* synthetic */ int val$state;
    
    public HfrButton$1(final HfrButton this$0, final boolean val$callListener, final int val$state) {
        this.this$0 = this$0;
        this.val$callListener = val$callListener;
        this.val$state = val$state;
    }
    
    public void onAnimationEnd(final Animator animator) {
        this.this$0.setState(this.val$state, false);
        if (this.val$callListener && this.this$0.onStateChangeListener != null) {
            this.this$0.onStateChangeListener.stateChanged((View)this.this$0, this.val$state);
        }
        this.this$0.setClickable(true);
    }
    
    public void onAnimationStart(final Animator animator) {
        this.this$0.setClickable(false);
        if (this.val$callListener && this.this$0.onStatePreChangeListener != null) {
            final OnStateChangeListener access$000 = this.this$0.onStatePreChangeListener;
            final HfrButton this$0 = this.this$0;
            access$000.stateChanged((View)this$0, this$0.state);
        }
    }
}
