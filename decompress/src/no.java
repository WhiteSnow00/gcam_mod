import android.view.View;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class no implements ViewTreeObserver$OnGlobalLayoutListener
{
    final /* synthetic */ nq a;
    
    public no(final nq a) {
        this.a = a;
    }
    
    public final void onGlobalLayout() {
        if (this.a.u()) {
            final nq a = this.a;
            if (!a.a.o) {
                final View c = a.c;
                if (c != null && c.isShown()) {
                    this.a.a.s();
                    return;
                }
                this.a.k();
            }
        }
    }
}
