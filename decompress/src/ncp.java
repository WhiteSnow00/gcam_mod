import java.util.List;
import android.view.Gravity;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.Rect;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class ncp extends ncr
{
    public final Rect a;
    final Rect b;
    public int c;
    public int d;
    
    public ncp() {
        this.a = new Rect();
        this.b = new Rect();
        this.c = 0;
    }
    
    public ncp(final Context context, final AttributeSet set) {
        super(context, set);
        this.a = new Rect();
        this.b = new Rect();
        this.c = 0;
    }
    
    public final int A(final View view) {
        if (this.d == 0) {
            return 0;
        }
        this.z(view);
        final int d = this.d;
        return aag.c((int)(d * 0.0f), 0, d);
    }
    
    @Override
    protected final void U(final CoordinatorLayout coordinatorLayout, final View view, int a) {
        final View w = this.w(coordinatorLayout.h(view));
        if (w != null) {
            final zy zy = (zy)view.getLayoutParams();
            final Rect a2 = this.a;
            a2.set(coordinatorLayout.getPaddingLeft() + zy.leftMargin, w.getBottom() + zy.topMargin, coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight() - zy.rightMargin, coordinatorLayout.getHeight() + w.getBottom() - coordinatorLayout.getPaddingBottom() - zy.bottomMargin);
            final ix e = coordinatorLayout.e;
            if (e != null && ik.Q((View)coordinatorLayout) && !ik.Q(view)) {
                a2.left += e.b();
                a2.right -= e.c();
            }
            final Rect b = this.b;
            int c = zy.c;
            if (c == 0) {
                c = 8388659;
            }
            Gravity.apply(c, view.getMeasuredWidth(), view.getMeasuredHeight(), a2, b, a);
            a = this.A(w);
            view.layout(b.left, b.top - a, b.right, b.bottom - a);
            this.c = b.top - w.getBottom();
            return;
        }
        coordinatorLayout.k(view, a);
        this.c = 0;
    }
    
    public abstract View w(final List p0);
    
    public int y() {
        throw null;
    }
    
    public void z(final View view) {
        throw null;
    }
}
