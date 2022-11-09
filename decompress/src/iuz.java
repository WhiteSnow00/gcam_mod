import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

final class iuz extends AnimatorListenerAdapter
{
    final /* synthetic */ ivx a;
    final /* synthetic */ ivh b;
    
    public iuz(final ivh b, final ivx a) {
        this.b = b;
        this.a = a;
    }
    
    public final void onAnimationEnd(final Animator animator) {
        this.b.b.setVideoButtonAnimating(false);
        this.b.b.inFlightSpecBuilder.b(this.a.p);
    }
    
    public final void onAnimationStart(final Animator animator) {
        this.b.b.setVideoButtonAnimating(true);
    }
}
