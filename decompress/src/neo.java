import android.view.View;
import android.view.View$OnAttachStateChangeListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class neo implements View$OnAttachStateChangeListener
{
    public final void onViewAttachedToWindow(final View view) {
        view.removeOnAttachStateChangeListener((View$OnAttachStateChangeListener)this);
        ik.D(view);
    }
    
    public final void onViewDetachedFromWindow(final View view) {
    }
}
