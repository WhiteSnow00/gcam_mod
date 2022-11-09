import androidx.coordinatorlayout.widget.CoordinatorLayout;
import android.view.ViewTreeObserver$OnPreDrawListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zz implements ViewTreeObserver$OnPreDrawListener
{
    final /* synthetic */ CoordinatorLayout a;
    
    public zz(final CoordinatorLayout a) {
        this.a = a;
    }
    
    public final boolean onPreDraw() {
        this.a.j(0);
        return true;
    }
}
