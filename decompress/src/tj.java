import android.content.res.TypedArray;
import android.util.Log;
import android.view.View;
import android.util.AttributeSet;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.TypedValue;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class tj
{
    static final int[] a;
    static final int[] b;
    static final int[] c;
    static final int[] d;
    static final int[] e;
    private static final ThreadLocal f;
    private static final int[] g;
    
    static {
        f = new ThreadLocal();
        a = new int[] { -16842910 };
        b = new int[] { 16842908 };
        c = new int[] { 16842919 };
        d = new int[] { 16842912 };
        e = new int[0];
        g = new int[1];
    }
    
    public static int a(final Context context, int b) {
        final ColorStateList c = c(context, b);
        if (c != null && c.isStateful()) {
            return c.getColorForState(tj.a, c.getDefaultColor());
        }
        final ThreadLocal f = tj.f;
        TypedValue typedValue;
        if ((typedValue = f.get()) == null) {
            typedValue = new TypedValue();
            f.set(typedValue);
        }
        context.getTheme().resolveAttribute(16842803, typedValue, true);
        final float float1 = typedValue.getFloat();
        b = b(context, b);
        return gv.c(b, Math.round(Color.alpha(b) * float1));
    }
    
    public static int b(Context k, int color) {
        final int[] g = tj.g;
        g[0] = color;
        k = (Context)to.k(k, null, g);
        try {
            color = ((to)k).b.getColor(0, 0);
            return color;
        }
        finally {
            ((to)k).n();
        }
    }
    
    public static ColorStateList c(Context k, final int n) {
        final int[] g = tj.g;
        g[0] = n;
        k = (Context)to.k(k, null, g);
        try {
            return ((to)k).g(0);
        }
        finally {
            ((to)k).n();
        }
    }
    
    public static void d(final View view, Context obtainStyledAttributes) {
        obtainStyledAttributes = (Context)obtainStyledAttributes.obtainStyledAttributes(lo.j);
        try {
            if (!((TypedArray)obtainStyledAttributes).hasValue(117)) {
                final StringBuilder sb = new StringBuilder();
                sb.append("View ");
                sb.append(view.getClass());
                sb.append(" is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
                Log.e("ThemeUtils", sb.toString());
            }
        }
        finally {
            ((TypedArray)obtainStyledAttributes).recycle();
        }
    }
}
