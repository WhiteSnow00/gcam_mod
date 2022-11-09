import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

final class djh extends AnimatorListenerAdapter
{
    final /* synthetic */ djj a;
    
    public djh(final djj a) {
        this.a = a;
    }
    
    public final void onAnimationEnd(final Animator animator) {
        final djj a = this.a;
        a.d.postDelayed(a.i, 1000L);
    }
}
