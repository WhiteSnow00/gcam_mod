import android.animation.Animator;
import com.google.android.apps.camera.ui.shutterbutton.ShutterButtonProgressOverlay;
import android.animation.AnimatorListenerAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ivu extends AnimatorListenerAdapter
{
    final /* synthetic */ ShutterButtonProgressOverlay a;
    
    public ivu(final ShutterButtonProgressOverlay a) {
        this.a = a;
    }
    
    public final void onAnimationCancel(final Animator animator) {
        final ShutterButtonProgressOverlay a = this.a;
        a.k = 1;
        a.setVisibility(4);
    }
    
    public final void onAnimationEnd(final Animator animator) {
        final ShutterButtonProgressOverlay a = this.a;
        a.k = 1;
        a.setVisibility(4);
        this.a.g = true;
    }
    
    public final void onAnimationStart(final Animator animator) {
        final ShutterButtonProgressOverlay a = this.a;
        a.b = a.e;
        a.k = 3;
    }
}
