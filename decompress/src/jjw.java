import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

final class jjw extends AnimatorListenerAdapter
{
    final /* synthetic */ jkf a;
    
    public jjw(final jkf a) {
        this.a = a;
    }
    
    public final void onAnimationEnd(final Animator animator) {
        this.a.c();
    }
}
