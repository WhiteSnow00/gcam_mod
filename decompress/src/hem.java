import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

final class hem extends AnimatorListenerAdapter
{
    final /* synthetic */ hen a;
    
    public hem(final hen a) {
        this.a = a;
    }
    
    public final void onAnimationEnd(final Animator animator) {
        this.a.b.a();
    }
}
