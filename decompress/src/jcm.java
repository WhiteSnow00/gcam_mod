import android.animation.Animator$AnimatorListener;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

final class jcm extends AnimatorListenerAdapter
{
    final /* synthetic */ ofn a;
    
    public jcm(final ofn a) {
        this.a = a;
    }
    
    public final void onAnimationCancel(final Animator animator) {
        animator.removeListener((Animator$AnimatorListener)this);
        this.a.o(Boolean.FALSE);
    }
    
    public final void onAnimationEnd(final Animator animator) {
        animator.removeListener((Animator$AnimatorListener)this);
        this.a.o(Boolean.TRUE);
    }
}
