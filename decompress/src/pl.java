import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.widget.PopupWindow$OnDismissListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class pl implements PopupWindow$OnDismissListener
{
    final /* synthetic */ ViewTreeObserver$OnGlobalLayoutListener a;
    final /* synthetic */ pm b;
    
    public pl(final pm b, final ViewTreeObserver$OnGlobalLayoutListener a) {
        this.b = b;
        this.a = a;
    }
    
    public final void onDismiss() {
        final ViewTreeObserver viewTreeObserver = this.b.d.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.a);
        }
    }
}
