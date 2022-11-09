import android.animation.Animator;
import com.google.android.apps.camera.smarts.SmartsChipView;
import android.animation.AnimatorListenerAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hmr extends AnimatorListenerAdapter
{
    final /* synthetic */ int a;
    final /* synthetic */ SmartsChipView b;
    
    public hmr(final SmartsChipView b, final int a) {
        this.b = b;
        this.a = a;
    }
    
    public final void onAnimationEnd(final Animator animator) {
        this.b.setVisibility(this.a);
    }
}
