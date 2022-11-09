import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.tabs.TabLayout;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nfy extends nov
{
    private static float K(final float n) {
        final double n2 = n;
        Double.isNaN(n2);
        return (float)(1.0 - Math.cos(n2 * 3.141592653589793 / 2.0));
    }
    
    private static float L(final float n) {
        final double n2 = n;
        Double.isNaN(n2);
        return (float)Math.sin(n2 * 3.141592653589793 / 2.0);
    }
    
    @Override
    public final void a(final TabLayout tabLayout, final View view, final View view2, float n, final Drawable drawable) {
        final RectF j = nov.J(tabLayout, view);
        final RectF i = nov.J(tabLayout, view2);
        float m;
        if (j.left < i.left) {
            final float k = K(n);
            final float l = L(n);
            n = k;
            m = l;
        }
        else {
            final float l2 = L(n);
            m = K(n);
            n = l2;
        }
        drawable.setBounds(ncj.a((int)j.left, (int)i.left, n), drawable.getBounds().top, ncj.a((int)j.right, (int)i.right, m), drawable.getBounds().bottom);
    }
}
