import android.animation.Animator;
import j$.util.function.Consumer;
import android.animation.AnimatorListenerAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jbn extends AnimatorListenerAdapter
{
    final /* synthetic */ Consumer a;
    
    public jbn(final Consumer a) {
        this.a = a;
    }
    
    public final void onAnimationEnd(final Animator animator) {
        this.a.accept((Object)animator);
    }
}
