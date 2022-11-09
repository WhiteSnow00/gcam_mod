import android.animation.Animator;
import com.google.android.apps.camera.filmstrip.transition.FilmstripTransitionLayout;
import android.animation.AnimatorListenerAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

public final class don extends AnimatorListenerAdapter
{
    final /* synthetic */ FilmstripTransitionLayout a;
    
    public don(final FilmstripTransitionLayout a) {
        this.a = a;
    }
    
    public final void onAnimationCancel(final Animator animator) {
    }
    
    public final void onAnimationEnd(final Animator animator) {
        this.a.setVisibility(4);
        this.a.f.setVisibility(0);
        final FilmstripTransitionLayout a = this.a;
        if (a.d) {
            a.d = false;
        }
    }
    
    public final void onAnimationStart(final Animator animator) {
        this.a.setVisibility(0);
    }
}
