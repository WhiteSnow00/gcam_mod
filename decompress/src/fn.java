import android.view.View;
import android.view.View$OnAttachStateChangeListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class fn implements View$OnAttachStateChangeListener
{
    final /* synthetic */ View a;
    
    public fn(final View a) {
        this.a = a;
    }
    
    public final void onViewAttachedToWindow(final View view) {
        this.a.removeOnAttachStateChangeListener((View$OnAttachStateChangeListener)this);
        ik.D(this.a);
    }
    
    public final void onViewDetachedFromWindow(final View view) {
    }
}
