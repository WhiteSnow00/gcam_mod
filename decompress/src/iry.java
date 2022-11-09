import android.graphics.drawable.Drawable;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

final class iry extends AnimatorListenerAdapter
{
    final /* synthetic */ irz a;
    
    public iry(final irz a) {
        this.a = a;
    }
    
    public final void onAnimationEnd(final Animator animator) {
        this.a.a.setForeground((Drawable)null);
    }
}
