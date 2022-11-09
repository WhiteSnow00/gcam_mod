import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

final class jcg extends AnimatorListenerAdapter
{
    final /* synthetic */ jci a;
    
    public jcg(final jci a) {
        this.a = a;
    }
    
    public final void onAnimationCancel(final Animator animator) {
        this.a.b();
    }
    
    public final void onAnimationEnd(final Animator animator) {
        this.a.b();
    }
    
    public final void onAnimationStart(final Animator animator) {
        this.a.a.setVisibility(0);
    }
}
