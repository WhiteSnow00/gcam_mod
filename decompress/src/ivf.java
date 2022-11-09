import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

final class ivf extends AnimatorListenerAdapter
{
    final /* synthetic */ ivg a;
    
    public ivf(final ivg a) {
        this.a = a;
    }
    
    public final void onAnimationStart(final Animator animator) {
        this.a.a.b.inFlightSpecBuilder.b(true);
    }
}
