import android.animation.ValueAnimator;
import android.animation.ValueAnimator$AnimatorUpdateListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class qp implements ValueAnimator$AnimatorUpdateListener
{
    final /* synthetic */ qq a;
    
    public qp(final qq a) {
        this.a = a;
    }
    
    public final void onAnimationUpdate(final ValueAnimator valueAnimator) {
        final int n = (int)((float)valueAnimator.getAnimatedValue() * 255.0f);
        this.a.b.setAlpha(n);
        this.a.c.setAlpha(n);
        this.a.a();
    }
}
