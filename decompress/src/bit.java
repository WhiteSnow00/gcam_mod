import java.util.Collection;
import android.text.TextUtils;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bit
{
    public static Object a(final Object o) {
        e(o, "Argument must not be null");
        return o;
    }
    
    public static void b(final boolean b, final String s) {
        if (b) {
            return;
        }
        throw new IllegalArgumentException(s);
    }
    
    public static void c(final String s) {
        if (!TextUtils.isEmpty((CharSequence)s)) {
            return;
        }
        throw new IllegalArgumentException("Must not be null or empty");
    }
    
    public static void d(final Collection collection) {
        if (!collection.isEmpty()) {
            return;
        }
        throw new IllegalArgumentException("Must not be empty.");
    }
    
    public static void e(final Object o, final String s) {
        if (o != null) {
            return;
        }
        throw new NullPointerException(s);
    }
}
