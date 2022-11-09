import android.util.AttributeSet;
import android.content.Context;
import android.widget.PopupWindow;

// 
// Decompiled by Procyon v0.6.0
// 

final class oy extends PopupWindow
{
    public oy(final Context context, final AttributeSet set, final int n) {
        super(context, set, n, 0);
        final to q = to.q(context, set, lo.r, n);
        if (q.p(2)) {
            this.setOverlapAnchor(q.o(2, false));
        }
        this.setBackgroundDrawable(q.h(0));
        q.n();
    }
}
