import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import android.view.ViewGroup$OnHierarchyChangeListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zx implements ViewGroup$OnHierarchyChangeListener
{
    final /* synthetic */ CoordinatorLayout a;
    
    public zx(final CoordinatorLayout a) {
        this.a = a;
    }
    
    public final void onChildViewAdded(final View view, final View view2) {
        final ViewGroup$OnHierarchyChangeListener g = this.a.g;
        if (g != null) {
            g.onChildViewAdded(view, view2);
        }
    }
    
    public final void onChildViewRemoved(final View view, final View view2) {
        this.a.j(2);
        final ViewGroup$OnHierarchyChangeListener g = this.a.g;
        if (g != null) {
            g.onChildViewRemoved(view, view2);
        }
    }
}
