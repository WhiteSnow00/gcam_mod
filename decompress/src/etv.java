import android.animation.Animator;
import android.view.View;
import android.animation.Animator$AnimatorListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class etv implements Animator$AnimatorListener
{
    final /* synthetic */ View a;
    final /* synthetic */ etw b;
    
    public etv(final etw b, final View a) {
        this.b = b;
        this.a = a;
    }
    
    public final void onAnimationCancel(final Animator animator) {
    }
    
    public final void onAnimationEnd(final Animator animator) {
        this.a.setAlpha(0.0f);
        this.a.setVisibility(8);
        this.b.a.removeAllListeners();
        this.b.a = null;
    }
    
    public final void onAnimationRepeat(final Animator animator) {
    }
    
    public final void onAnimationStart(final Animator animator) {
        this.a.setVisibility(0);
    }
}
