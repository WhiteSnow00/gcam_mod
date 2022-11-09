import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import android.animation.ValueAnimator;
import com.google.android.apps.camera.zoomui.ZoomUi;
import android.animation.ValueAnimator$AnimatorUpdateListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jir implements ValueAnimator$AnimatorUpdateListener
{
    final /* synthetic */ ZoomUi a;
    private final /* synthetic */ int b;
    
    public jir(final ZoomUi a) {
        this.a = a;
    }
    
    public jir(final ZoomUi a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public final void onAnimationUpdate(final ValueAnimator valueAnimator) {
        switch (this.b) {
            default: {
                final FrameLayout$LayoutParams layoutParams = (FrameLayout$LayoutParams)this.a.e().getLayoutParams();
                layoutParams.width = (int)valueAnimator.getAnimatedValue();
                this.a.e().setLayoutParams((ViewGroup$LayoutParams)layoutParams);
                return;
            }
            case 2: {
                final FrameLayout$LayoutParams layoutParams2 = (FrameLayout$LayoutParams)this.a.e().getLayoutParams();
                layoutParams2.width = (int)valueAnimator.getAnimatedValue();
                this.a.e().setLayoutParams((ViewGroup$LayoutParams)layoutParams2);
                return;
            }
            case 1: {
                final FrameLayout$LayoutParams layoutParams3 = (FrameLayout$LayoutParams)this.a.e().getLayoutParams();
                layoutParams3.height = (int)valueAnimator.getAnimatedValue();
                this.a.e().setLayoutParams((ViewGroup$LayoutParams)layoutParams3);
                return;
            }
            case 0: {
                final FrameLayout$LayoutParams layoutParams4 = (FrameLayout$LayoutParams)this.a.e().getLayoutParams();
                layoutParams4.topMargin = (int)valueAnimator.getAnimatedValue();
                this.a.e().setLayoutParams((ViewGroup$LayoutParams)layoutParams4);
            }
        }
    }
}
