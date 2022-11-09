import android.view.View;
import java.util.WeakHashMap;
import android.view.View$OnAttachStateChangeListener;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class ih implements ViewTreeObserver$OnGlobalLayoutListener, View$OnAttachStateChangeListener
{
    public ih() {
        new WeakHashMap();
    }
    
    public final void onGlobalLayout() {
    }
    
    public final void onViewAttachedToWindow(final View view) {
        view.getViewTreeObserver().addOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)this);
    }
    
    public final void onViewDetachedFromWindow(final View view) {
    }
}
