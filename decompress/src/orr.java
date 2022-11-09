import android.util.Log;

// 
// Decompiled by Procyon v0.6.0
// 

public final class orr
{
    private static final Class a;
    private final Object b;
    
    static {
        Class<?> forName;
        try {
            forName = Class.forName("android.view.DisplayCutout");
        }
        catch (final Exception ex) {
            Log.e("AndroidPCompat", "Failed to obtain DisplayCutout API.");
            forName = null;
        }
        a = forName;
    }
    
    private orr(final Object b) {
        this.b = b;
    }
    
    public static orr b(final Object o) {
        if (o == null) {
            return null;
        }
        if (orr.a == null) {
            return null;
        }
        return new orr(o);
    }
    
    public final int a(final String s) {
        try {
            return (int)orr.a.getDeclaredMethod(s, (Class[])new Class[0]).invoke(this.b, new Object[0]);
        }
        catch (final Exception ex) {
            return 0;
        }
    }
}
