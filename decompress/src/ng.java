import android.widget.PopupWindow$OnDismissListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class ng implements PopupWindow$OnDismissListener
{
    final /* synthetic */ nh a;
    
    public ng(final nh a) {
        this.a = a;
    }
    
    public final void onDismiss() {
        this.a.c();
    }
}
