import android.animation.ValueAnimator;
import android.animation.ValueAnimator$AnimatorUpdateListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dpg implements ValueAnimator$AnimatorUpdateListener
{
    final /* synthetic */ dph a;
    private final /* synthetic */ int b;
    
    public dpg(final dph a) {
        this.a = a;
    }
    
    public dpg(final dph a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public final void onAnimationUpdate(final ValueAnimator valueAnimator) {
        switch (this.b) {
            default: {
                this.a.b.f((float)valueAnimator.getAnimatedValue());
                this.a.a.invalidate();
                return;
            }
            case 3: {
                this.a.b.e((float)valueAnimator.getAnimatedValue());
                this.a.a.invalidate();
                return;
            }
            case 2: {
                this.a.b.d((float)valueAnimator.getAnimatedValue());
                this.a.a.invalidate();
                return;
            }
            case 1: {
                this.a.c.c((float)valueAnimator.getAnimatedValue());
                this.a.a.invalidate();
                return;
            }
            case 0: {
                this.a.c.d((float)valueAnimator.getAnimatedValue());
                this.a.a.invalidate();
            }
        }
    }
}
