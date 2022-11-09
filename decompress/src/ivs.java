import android.animation.ValueAnimator;
import com.google.android.apps.camera.ui.shutterbutton.ShutterButtonProgressOverlay;
import android.animation.ValueAnimator$AnimatorUpdateListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ivs implements ValueAnimator$AnimatorUpdateListener
{
    final /* synthetic */ ShutterButtonProgressOverlay a;
    private final /* synthetic */ int b;
    
    public ivs(final ShutterButtonProgressOverlay a) {
        this.a = a;
    }
    
    public ivs(final ShutterButtonProgressOverlay a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public final void onAnimationUpdate(final ValueAnimator valueAnimator) {
        switch (this.b) {
            default: {
                this.a.c = (float)valueAnimator.getAnimatedValue();
                this.a.invalidate();
                return;
            }
            case 2: {
                this.a.c = (float)valueAnimator.getAnimatedValue();
                final ShutterButtonProgressOverlay a = this.a;
                a.a.setStrokeWidth(a.c);
                this.a.invalidate();
                return;
            }
            case 1: {
                this.a.d = (int)valueAnimator.getAnimatedValue();
                this.a.invalidate();
                return;
            }
            case 0: {
                this.a.b = (int)valueAnimator.getAnimatedValue();
                this.a.invalidate();
            }
        }
    }
}
