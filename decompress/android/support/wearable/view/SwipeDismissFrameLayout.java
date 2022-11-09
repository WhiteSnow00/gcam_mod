// 
// Decompiled by Procyon v0.6.0
// 

package android.support.wearable.view;

import android.util.AttributeSet;
import android.content.Context;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;

@Deprecated
public class SwipeDismissFrameLayout extends vd
{
    public final ArrayList d;
    public final int e;
    public final DecelerateInterpolator f;
    public final AccelerateInterpolator g;
    public final DecelerateInterpolator h;
    public boolean i;
    private final vq j;
    private final vp k;
    private final vs l;
    
    public SwipeDismissFrameLayout(final Context context) {
        this(context, null, 0);
    }
    
    public SwipeDismissFrameLayout(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public SwipeDismissFrameLayout(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        final vq vq = new vq(this);
        this.j = vq;
        final vp vp = new vp(this);
        this.k = vp;
        final vs vs = new vs(this);
        this.l = vs;
        this.d = new ArrayList();
        super.a = vq;
        super.b = vp;
        super.c = vs;
        this.e = this.getContext().getResources().getInteger(17694720);
        this.f = new DecelerateInterpolator(1.5f);
        this.g = new AccelerateInterpolator(1.5f);
        this.h = new DecelerateInterpolator(1.5f);
    }
}
