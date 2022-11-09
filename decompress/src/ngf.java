import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

final class ngf extends AnimatorListenerAdapter
{
    final /* synthetic */ int a;
    final /* synthetic */ ngg b;
    
    public ngf(final ngg b, final int a) {
        this.b = b;
        this.a = a;
    }
    
    public final void onAnimationEnd(final Animator animator) {
        this.b.b = this.a;
    }
    
    public final void onAnimationStart(final Animator animator) {
        this.b.b = this.a;
    }
}
