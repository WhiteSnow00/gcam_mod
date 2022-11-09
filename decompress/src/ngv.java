import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ngv
{
    private static final int[] a;
    private static final int[] b;
    
    static {
        a = new int[] { 16842752, 2130969807 };
        b = new int[] { 2130969408 };
    }
    
    public static Context a(final Context context, final AttributeSet set, int resourceId, int n) {
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, ngv.b, resourceId, n);
        n = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        if (context instanceof lv && ((lv)context).a == n) {
            resourceId = 1;
        }
        else {
            resourceId = 0;
        }
        if (n != 0 && resourceId == 0) {
            final lv lv = new lv(context, n);
            final TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(set, ngv.a);
            n = obtainStyledAttributes2.getResourceId(0, 0);
            resourceId = obtainStyledAttributes2.getResourceId(1, 0);
            obtainStyledAttributes2.recycle();
            if (n != 0) {
                resourceId = n;
            }
            if (resourceId != 0) {
                ((Context)lv).getTheme().applyStyle(resourceId, true);
            }
            return (Context)lv;
        }
        return context;
    }
}
