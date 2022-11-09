import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class pg implements ViewTreeObserver$OnGlobalLayoutListener
{
    final /* synthetic */ pp a;
    
    public pg(final pp a) {
        this.a = a;
    }
    
    public final void onGlobalLayout() {
        if (!this.a.b.u()) {
            this.a.b();
        }
        final ViewTreeObserver viewTreeObserver = this.a.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)this);
        }
    }
}
