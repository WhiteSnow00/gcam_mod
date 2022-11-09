import android.content.Context;
import android.content.res.TypedArray;
import java.util.Locale;
import android.os.Build;
import android.os.Build$VERSION;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lry
{
    private static final int[] a;
    
    static {
        a = new int[] { 2130969041 };
    }
    
    public static void a(final Activity activity) {
        if (Build$VERSION.SDK_INT + Build$VERSION.PREVIEW_SDK_INT > 30 && Build.BRAND.toLowerCase(Locale.ENGLISH).equals("google")) {
            final TypedArray obtainStyledAttributes = ((Context)activity).obtainStyledAttributes(lry.a);
            final int resourceId = obtainStyledAttributes.getResourceId(0, 0);
            obtainStyledAttributes.recycle();
            if (resourceId != 0) {
                activity.setTheme(resourceId);
            }
        }
    }
}
