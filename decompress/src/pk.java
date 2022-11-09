import android.view.View;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class pk implements ViewTreeObserver$OnGlobalLayoutListener
{
    final /* synthetic */ pm a;
    
    public pk(final pm a) {
        this.a = a;
    }
    
    public final void onGlobalLayout() {
        final pm a = this.a;
        final pp d = a.d;
        if (ik.T((View)d) && ((View)d).getGlobalVisibleRect(a.c)) {
            this.a.n();
            this.a.s();
            return;
        }
        this.a.k();
    }
}
