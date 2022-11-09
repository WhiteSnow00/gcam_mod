import android.animation.Animator;
import com.google.android.apps.camera.ui.modeswitcher.MoreModesGrid;
import android.animation.AnimatorListenerAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

final class ira extends AnimatorListenerAdapter
{
    final /* synthetic */ MoreModesGrid a;
    
    public ira(final MoreModesGrid a) {
        this.a = a;
    }
    
    public final void onAnimationEnd(final Animator animator) {
        this.a.setVisibility(8);
        this.a.l = false;
    }
}
