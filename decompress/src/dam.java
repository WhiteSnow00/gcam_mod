import android.util.Log;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dam
{
    public static int a;
    
    static {
        dam.a = 0;
    }
    
    public static boolean a(final String s, final int n) {
        return Log.isLoggable("CAM_", n) || Log.isLoggable(s, n);
    }
}
