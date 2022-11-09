import android.view.ViewTreeObserver;
import android.view.View;
import android.view.View$OnAttachStateChangeListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class np implements View$OnAttachStateChangeListener
{
    final /* synthetic */ nq a;
    
    public np(final nq a) {
        this.a = a;
    }
    
    public final void onViewAttachedToWindow(final View view) {
    }
    
    public final void onViewDetachedFromWindow(final View view) {
        final ViewTreeObserver d = this.a.d;
        if (d != null) {
            if (!d.isAlive()) {
                this.a.d = view.getViewTreeObserver();
            }
            final nq a = this.a;
            a.d.removeGlobalOnLayoutListener(a.b);
        }
        view.removeOnAttachStateChangeListener((View$OnAttachStateChangeListener)this);
    }
}
