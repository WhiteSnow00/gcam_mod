import android.view.ViewTreeObserver;
import android.view.View;
import android.view.View$OnAttachStateChangeListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class ml implements View$OnAttachStateChangeListener
{
    final /* synthetic */ mp a;
    
    public ml(final mp a) {
        this.a = a;
    }
    
    public final void onViewAttachedToWindow(final View view) {
    }
    
    public final void onViewDetachedFromWindow(final View view) {
        final ViewTreeObserver e = this.a.e;
        if (e != null) {
            if (!e.isAlive()) {
                this.a.e = view.getViewTreeObserver();
            }
            final mp a = this.a;
            a.e.removeGlobalOnLayoutListener(a.c);
        }
        view.removeOnAttachStateChangeListener((View$OnAttachStateChangeListener)this);
    }
}
