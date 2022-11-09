import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.animation.Animator$AnimatorListener;
import android.view.View;
import java.lang.ref.WeakReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class in
{
    public final WeakReference a;
    
    public in(final View view) {
        this.a = new WeakReference((T)view);
    }
    
    public final void a() {
        final View view = (View)this.a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }
    
    public final void b(final float n) {
        final View view = (View)this.a.get();
        if (view != null) {
            view.animate().alpha(n);
        }
    }
    
    public final void c(final long duration) {
        final View view = (View)this.a.get();
        if (view != null) {
            view.animate().setDuration(duration);
        }
    }
    
    public final void d(final io io) {
        final View view = (View)this.a.get();
        if (view != null) {
            if (io != null) {
                view.animate().setListener((Animator$AnimatorListener)new il(io));
                return;
            }
            view.animate().setListener((Animator$AnimatorListener)null);
        }
    }
    
    public final void e(final ll ll) {
        final View view = (View)this.a.get();
        if (view != null) {
            Object updateListener;
            if (ll != null) {
                updateListener = new im(ll);
            }
            else {
                updateListener = null;
            }
            view.animate().setUpdateListener((ValueAnimator$AnimatorUpdateListener)updateListener);
        }
    }
    
    public final void f(final float n) {
        final View view = (View)this.a.get();
        if (view != null) {
            view.animate().translationY(n);
        }
    }
}
