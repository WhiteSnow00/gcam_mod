import android.graphics.drawable.Drawable;
import android.content.res.ColorStateList;
import android.content.Context;
import java.util.WeakHashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lp
{
    static {
        new ThreadLocal();
        new WeakHashMap(0);
    }
    
    public static ColorStateList a(final Context context, final int n) {
        return context.getColorStateList(n);
    }
    
    public static Drawable b(final Context context, final int n) {
        return sx.e().c(context, n);
    }
}
