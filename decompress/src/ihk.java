import android.animation.Animator;
import com.google.android.apps.camera.ui.captureframe.CaptureFrameUi;
import android.animation.AnimatorListenerAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ihk extends AnimatorListenerAdapter
{
    final /* synthetic */ CaptureFrameUi a;
    final /* synthetic */ ihl b;
    
    public ihk(final ihl b, final CaptureFrameUi a) {
        this.b = b;
        this.a = a;
    }
    
    public final void onAnimationEnd(final Animator animator) {
        synchronized (this.b.d) {
            if (this.b.c.equals(ihn.a)) {
                this.a.setVisibility(8);
            }
            final ihl b = this.b;
            b.b = b.c;
        }
    }
    
    public final void onAnimationStart(final Animator animator) {
        synchronized (this.b.d) {
            if (!this.b.c.equals(ihn.a)) {
                this.a.setVisibility(0);
            }
        }
    }
}
