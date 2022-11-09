import android.util.Log;

// 
// Decompiled by Procyon v0.6.0
// 

public final class auc
{
    public static final aub a;
    
    static {
        a = new aub("Log");
    }
    
    public static void a(final aub aub, final String s) {
        if (h(aub, 6)) {
            Log.e(aub.a, s);
        }
    }
    
    public static void b(final aub aub, final String s, final Throwable t) {
        if (h(aub, 6)) {
            Log.e(aub.a, s, t);
        }
    }
    
    public static void c(final aub aub, final String s) {
        if (h(aub, 5)) {
            Log.w(aub.a, s);
        }
    }
    
    public static void d(final aub aub, final String s, final Throwable t) {
        if (h(aub, 5)) {
            Log.w(aub.a, s, t);
        }
    }
    
    public static void e(final aub aub) {
        if (h(aub, 3)) {
            final String a = aub.a;
        }
    }
    
    public static void f(final aub aub) {
        if (h(aub, 4)) {
            final String a = aub.a;
        }
    }
    
    public static void g(final aub aub) {
        if (h(aub, 2)) {
            final String a = aub.a;
        }
    }
    
    private static boolean h(final aub aub, final int n) {
        try {
            return Log.isLoggable("CAM2PORT_", n) || Log.isLoggable(aub.a, n);
        }
        catch (final IllegalArgumentException ex) {
            final aub a = auc.a;
            final StringBuilder sb = new StringBuilder();
            sb.append("Tag too long:");
            sb.append(aub);
            a(a, sb.toString());
            return false;
        }
    }
}
