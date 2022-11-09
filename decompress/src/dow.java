import android.animation.Animator;
import com.google.android.apps.camera.focusindicator.FocusIndicatorView;
import android.animation.AnimatorListenerAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dow extends AnimatorListenerAdapter
{
    final /* synthetic */ FocusIndicatorView a;
    
    public dow(final FocusIndicatorView a) {
        this.a = a;
    }
    
    public final void onAnimationEnd(final Animator animator) {
        this.a.m = null;
    }
    
    public final void onAnimationStart(final Animator m) {
        this.a.m = m;
    }
}
