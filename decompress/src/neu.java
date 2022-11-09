import android.util.TypedValue;
import android.view.View;
import android.graphics.drawable.Drawable;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class neu
{
    public static ColorStateList a(final Context context, final TypedArray typedArray, final int n) {
        if (typedArray.hasValue(n)) {
            final int resourceId = typedArray.getResourceId(n, 0);
            if (resourceId != 0) {
                final ColorStateList a = lp.a(context, resourceId);
                if (a != null) {
                    return a;
                }
            }
        }
        return typedArray.getColorStateList(n);
    }
    
    public static Drawable b(final Context context, final TypedArray typedArray, final int n) {
        if (typedArray.hasValue(n)) {
            final int resourceId = typedArray.getResourceId(n, 0);
            if (resourceId != 0) {
                final Drawable b = lp.b(context, resourceId);
                if (b != null) {
                    return b;
                }
            }
        }
        return typedArray.getDrawable(n);
    }
    
    public static int c(final View view, final int n) {
        return d(view.getContext(), n, view.getClass().getCanonicalName());
    }
    
    public static int d(final Context context, final int n, final String s) {
        final TypedValue e = e(context, n);
        if (e != null) {
            return e.data;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", s, context.getResources().getResourceName(n)));
    }
    
    public static TypedValue e(final Context context, final int n) {
        final TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(n, typedValue, true)) {
            return typedValue;
        }
        return null;
    }
    
    public static boolean f(final Context context, final int n, boolean b) {
        final TypedValue e = e(context, n);
        if (e != null && e.type == 18) {
            if (e.data != 0) {
                return true;
            }
            b = false;
        }
        return b;
    }
}
