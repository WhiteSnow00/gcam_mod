import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

final class bwi extends AnimatorListenerAdapter
{
    final /* synthetic */ bwk a;
    
    public bwi(final bwk a) {
        this.a = a;
    }
    
    public final void onAnimationEnd(final Animator animator) {
        bwk.a(this.a);
    }
    
    public final void onAnimationStart(final Animator animator) {
        this.a.setVisibility(0);
        this.a.a.setAlpha(0.0f);
        this.a.b.setAlpha(0.0f);
    }
}
