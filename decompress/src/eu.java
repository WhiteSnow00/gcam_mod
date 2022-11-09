import android.view.ViewGroup;
import android.view.View;
import android.view.View$OnAttachStateChangeListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class eu implements View$OnAttachStateChangeListener
{
    final /* synthetic */ fo a;
    final /* synthetic */ ev b;
    
    public eu(final ev b, final fo a) {
        this.b = b;
        this.a = a;
    }
    
    public final void onViewAttachedToWindow(final View view) {
        final fo a = this.a;
        final ei c = a.c;
        a.d();
        gf.b((ViewGroup)c.O.getParent(), this.b.a).c();
    }
    
    public final void onViewDetachedFromWindow(final View view) {
    }
}
