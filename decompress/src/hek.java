import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

final class hek extends AnimatorListenerAdapter
{
    final /* synthetic */ hel a;
    
    public hek(final hel a) {
        this.a = a;
    }
    
    public final void onAnimationEnd(final Animator animator) {
        this.a.b.a();
    }
}
