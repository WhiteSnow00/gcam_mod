import java.util.Iterator;
import android.view.View;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class mk implements ViewTreeObserver$OnGlobalLayoutListener
{
    final /* synthetic */ mp a;
    
    public mk(final mp a) {
        this.a = a;
    }
    
    public final void onGlobalLayout() {
        if (this.a.u() && this.a.b.size() > 0 && !this.a.b.get(0).a.o) {
            final View d = this.a.d;
            if (d == null || !d.isShown()) {
                this.a.k();
                return;
            }
            final Iterator iterator = this.a.b.iterator();
            while (iterator.hasNext()) {
                ((mo)iterator.next()).a.s();
            }
        }
    }
}
