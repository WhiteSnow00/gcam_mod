import android.animation.Animator;
import android.view.View;
import android.animation.AnimatorListenerAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

final class jis extends AnimatorListenerAdapter
{
    final /* synthetic */ View a;
    
    public jis(final View a) {
        this.a = a;
    }
    
    public final void onAnimationEnd(final Animator animator, final boolean b) {
        if (b) {
            this.a.setVisibility(8);
        }
    }
    
    public final void onAnimationStart(final Animator animator, final boolean b) {
        if (!b) {
            this.a.setVisibility(0);
        }
    }
}
