import android.animation.Animator;
import com.google.android.apps.camera.autotimer.ui.AutoTimerIndicatorView;
import android.animation.AnimatorListenerAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bwu extends AnimatorListenerAdapter
{
    final /* synthetic */ AutoTimerIndicatorView a;
    
    public bwu(final AutoTimerIndicatorView a) {
        this.a = a;
    }
    
    public final void onAnimationEnd(final Animator animator) {
        this.a.setVisibility(8);
    }
    
    public final void onAnimationStart(final Animator animator) {
        this.a.setVisibility(0);
        this.a.a(0.0f);
    }
}
