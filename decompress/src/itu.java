import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

final class itu extends AnimatorListenerAdapter
{
    final /* synthetic */ itw a;
    
    public itu(final itw a) {
        this.a = a;
    }
    
    public final void onAnimationStart(final Animator animator) {
        super.onAnimationStart(animator);
        this.a.setVisibility(0);
    }
}
