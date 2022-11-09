import android.animation.ValueAnimator;
import com.google.android.apps.camera.filmstrip.transition.FilmstripTransitionLayout;
import android.animation.ValueAnimator$AnimatorUpdateListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dom implements ValueAnimator$AnimatorUpdateListener
{
    final /* synthetic */ FilmstripTransitionLayout a;
    private final /* synthetic */ int b;
    
    public dom(final FilmstripTransitionLayout a) {
        this.a = a;
    }
    
    public dom(final FilmstripTransitionLayout a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public final void onAnimationUpdate(final ValueAnimator valueAnimator) {
        switch (this.b) {
            default: {
                this.a.c(1.0f - valueAnimator.getAnimatedFraction());
                this.a.invalidate();
                return;
            }
            case 0: {
                this.a.c(valueAnimator.getAnimatedFraction());
                this.a.invalidate();
            }
        }
    }
}
