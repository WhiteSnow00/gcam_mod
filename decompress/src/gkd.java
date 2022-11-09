import android.animation.Animator;
import com.google.android.apps.camera.optionsbar.view.OptionsMenuContainer;
import android.animation.AnimatorListenerAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gkd extends AnimatorListenerAdapter
{
    final /* synthetic */ OptionsMenuContainer a;
    
    public gkd(final OptionsMenuContainer a) {
        this.a = a;
    }
    
    public final void onAnimationStart(final Animator animator) {
        this.a.f().setVisibility(8);
        this.a.e().setVisibility(0);
    }
}
