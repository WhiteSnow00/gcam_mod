import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

final class iyq extends AnimatorListenerAdapter
{
    final /* synthetic */ iys a;
    
    public iyq(final iys a) {
        this.a = a;
    }
    
    public final void onAnimationCancel(final Animator animator) {
        final iys a = this.a;
        a.n = 4;
        a.d = a.f;
        a.e = (float)a.g;
    }
    
    public final void onAnimationEnd(final Animator animator) {
        this.a.n = 4;
    }
    
    public final void onAnimationStart(final Animator animator) {
        final iys a = this.a;
        a.n = 2;
        a.setVisibility(0);
    }
}
