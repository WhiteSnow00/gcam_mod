import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

final class il extends AnimatorListenerAdapter
{
    final /* synthetic */ io a;
    
    public il(final io a) {
        this.a = a;
    }
    
    public final void onAnimationCancel(final Animator animator) {
        this.a.a();
    }
    
    public final void onAnimationEnd(final Animator animator) {
        this.a.b();
    }
    
    public final void onAnimationStart(final Animator animator) {
        this.a.c();
    }
}
