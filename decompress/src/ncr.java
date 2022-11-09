import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import android.util.AttributeSet;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

class ncr extends zv
{
    private ncs a;
    
    public ncr() {
    }
    
    public ncr(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    protected void U(final CoordinatorLayout coordinatorLayout, final View view, final int n) {
        coordinatorLayout.k(view, n);
    }
    
    @Override
    public boolean d(final CoordinatorLayout coordinatorLayout, View view, final int n) {
        this.U(coordinatorLayout, view, n);
        if (this.a == null) {
            this.a = new ncs(view);
        }
        final ncs a = this.a;
        a.b = a.a.getTop();
        a.c = a.a.getLeft();
        final ncs a2 = this.a;
        view = a2.a;
        ik.y(view, -(view.getTop() - a2.b));
        view = a2.a;
        ik.x(view, -(view.getLeft() - a2.c));
        return true;
    }
}
