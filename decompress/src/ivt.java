import android.animation.Animator;
import com.google.android.apps.camera.ui.shutterbutton.ShutterButtonProgressOverlay;
import android.animation.AnimatorListenerAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ivt extends AnimatorListenerAdapter
{
    final /* synthetic */ ShutterButtonProgressOverlay a;
    
    public ivt(final ShutterButtonProgressOverlay a) {
        this.a = a;
    }
    
    public final void onAnimationCancel(final Animator animator) {
        final ShutterButtonProgressOverlay a = this.a;
        a.k = 4;
        a.b = a.e;
        a.c = (float)a.f;
    }
    
    public final void onAnimationEnd(final Animator animator) {
        this.a.k = 4;
    }
    
    public final void onAnimationStart(final Animator animator) {
        final ShutterButtonProgressOverlay a = this.a;
        a.k = 2;
        a.setVisibility(0);
    }
}
