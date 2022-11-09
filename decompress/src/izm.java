import android.animation.Animator$AnimatorListener;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.animation.TimeInterpolator;
import android.view.animation.LinearInterpolator;
import android.animation.ValueAnimator;
import com.google.android.apps.camera.ui.captureframe.CaptureFrameUi;

// 
// Decompiled by Procyon v0.6.0
// 

public final class izm implements jap
{
    private final pii a;
    private final ihl b;
    
    public izm(final ihl b, final pii a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void a() {
        final CaptureFrameUi captureFrameUi = (CaptureFrameUi)((ixw)this.a.get()).c.c(2131427484);
        final ihl b = this.b;
        (b.a = ValueAnimator.ofFloat(new float[] { 0.0f, 1.0f })).setDuration(200L);
        b.a.setInterpolator((TimeInterpolator)new LinearInterpolator());
        b.a.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new ihj(b, captureFrameUi));
        b.a.addListener((Animator$AnimatorListener)new ihk(b, captureFrameUi));
    }
}
