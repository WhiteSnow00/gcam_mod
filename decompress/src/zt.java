import j$.util.Objects;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zt implements ie
{
    final /* synthetic */ CoordinatorLayout a;
    
    public zt(final CoordinatorLayout a) {
        this.a = a;
    }
    
    @Override
    public final ix a(final View view, final ix e) {
        final CoordinatorLayout a = this.a;
        if (!Objects.equals((Object)a.e, (Object)e)) {
            a.e = e;
            final int d = e.d();
            final boolean b = true;
            int i = 0;
            final boolean f = d > 0;
            a.f = f;
            a.setWillNotDraw(!f && a.getBackground() == null && b);
            if (!e.r()) {
                while (i < a.getChildCount()) {
                    final View child = a.getChildAt(i);
                    if (ik.Q(child) && ((zy)child.getLayoutParams()).a != null && e.r()) {
                        break;
                    }
                    ++i;
                }
            }
            a.requestLayout();
        }
        return e;
    }
}
