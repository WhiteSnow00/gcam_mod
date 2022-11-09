import android.animation.Animator;
import j$.util.function.Consumer;
import android.animation.AnimatorListenerAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jbo extends AnimatorListenerAdapter
{
    final /* synthetic */ Consumer a;
    
    public jbo(final Consumer a) {
        this.a = a;
    }
    
    public final void onAnimationStart(final Animator animator) {
        this.a.accept((Object)animator);
    }
}
