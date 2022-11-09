import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

final class itv extends AnimatorListenerAdapter
{
    final /* synthetic */ itw a;
    
    public itv(final itw a) {
        this.a = a;
    }
    
    public final void onAnimationCancel(final Animator animator) {
        super.onAnimationCancel(animator);
        this.a.setVisibility(8);
    }
    
    public final void onAnimationEnd(final Animator animator) {
        super.onAnimationEnd(animator);
        this.a.setVisibility(8);
    }
}
