import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

final class bwj extends AnimatorListenerAdapter
{
    final /* synthetic */ bwk a;
    
    public bwj(final bwk a) {
        this.a = a;
    }
    
    public final void onAnimationEnd(final Animator animator) {
        this.a.setVisibility(8);
        bwk.a(this.a);
    }
    
    public final void onAnimationStart(final Animator animator) {
        this.a.setVisibility(0);
        this.a.a.setAlpha(1.0f);
        this.a.b.setAlpha(1.0f);
    }
}
