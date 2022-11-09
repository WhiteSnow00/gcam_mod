import android.animation.ValueAnimator;
import android.view.View;
import android.animation.ValueAnimator$AnimatorUpdateListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class nge implements ValueAnimator$AnimatorUpdateListener
{
    final /* synthetic */ View a;
    final /* synthetic */ View b;
    final /* synthetic */ ngg c;
    
    public nge(final ngg c, final View a, final View b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public final void onAnimationUpdate(final ValueAnimator valueAnimator) {
        this.c.a(this.a, this.b, valueAnimator.getAnimatedFraction());
    }
}
