import java.util.concurrent.CancellationException;
import android.animation.Animator;
import com.google.android.apps.camera.filmstrip.transition.FilmstripTransitionLayout;
import android.animation.AnimatorListenerAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dol extends AnimatorListenerAdapter
{
    final /* synthetic */ FilmstripTransitionLayout a;
    
    public dol(final FilmstripTransitionLayout a) {
        this.a = a;
    }
    
    public final void onAnimationCancel(final Animator animator) {
        final doi i = this.a.i;
        if (i != null) {
            i.c.c.setVisibility(4);
            i.c.d.setVisibility(0);
            i.a.a(new CancellationException("Animation is cancelled"));
        }
    }
    
    public final void onAnimationEnd(final Animator animator) {
        final FilmstripTransitionLayout a = this.a;
        if (a.g) {
            a.setVisibility(4);
        }
        final FilmstripTransitionLayout a2 = this.a;
        if (a2.c) {
            a2.c = false;
            return;
        }
        final doi i = a2.i;
        if (i != null) {
            if (i.c.g.isDone()) {
                final CancellationException ex = new CancellationException("Photos Launch was already cancelled.");
                a.m(doj.a.c(), "onTransitionEnd", '\u0340', ex);
                i.a.a(ex);
                return;
            }
            i.a.e(i.c.h(i.b));
        }
    }
    
    public final void onAnimationStart(final Animator animator) {
        this.a.setVisibility(0);
        this.a.f.setVisibility(4);
    }
}
