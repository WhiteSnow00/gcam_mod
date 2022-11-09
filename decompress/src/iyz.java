import android.widget.ImageButton;
import j$.time.Duration;
import android.animation.Animator;
import com.google.android.apps.camera.ui.views.ToggleUi;
import android.animation.AnimatorListenerAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iyz extends AnimatorListenerAdapter
{
    final /* synthetic */ ToggleUi a;
    
    public iyz(final ToggleUi a) {
        this.a = a;
    }
    
    public final void onAnimationEnd(final Animator animator, final boolean b) {
        final Duration a = ToggleUi.a;
        final ImageButton c = this.a.c;
        float alpha;
        if (!b) {
            alpha = 1.0f;
        }
        else {
            alpha = 0.0f;
        }
        c.setScaleX(alpha);
        this.a.c.setScaleY(alpha);
        this.a.setAlpha(alpha);
        final ToggleUi a2 = this.a;
        int visibility;
        if (!b) {
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        a2.setVisibility(visibility);
    }
    
    public final void onAnimationStart(final Animator animator, final boolean b) {
        if (!b) {
            this.a.setVisibility(0);
        }
    }
}
