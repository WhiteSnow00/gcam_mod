import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

final class ive extends AnimatorListenerAdapter
{
    final /* synthetic */ ivg a;
    
    public ive(final ivg a) {
        this.a = a;
    }
    
    public final void onAnimationEnd(final Animator animator) {
        this.a.a.b.blockClickForAnimation(false);
    }
    
    public final void onAnimationStart(final Animator animator) {
        this.a.a.b.blockClickForAnimation(true);
    }
}
