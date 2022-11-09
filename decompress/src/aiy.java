import android.util.Log;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aiy
{
    private static aiy a;
    private int b;
    
    public aiy() {
    }
    
    public aiy(final int b) {
        this.b = b;
    }
    
    public static aiy a() {
        synchronized (aiy.class) {
            if (aiy.a == null) {
                aiy.a = new aiy(3);
            }
            return aiy.a;
        }
    }
    
    public static String b(final String s) {
        final int length = s.length();
        final StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        if (length >= 20) {
            sb.append(s.substring(0, 20));
        }
        else {
            sb.append(s);
        }
        return sb.toString();
    }
    
    public static void c(final aiy a) {
        synchronized (aiy.class) {
            aiy.a = a;
        }
    }
    
    public static final void e(final String s, final String s2, final Throwable... array) {
        if (array.length > 0) {
            Log.e(s, s2, array[0]);
            return;
        }
        Log.e(s, s2);
    }
    
    public static final void f(final Throwable... array) {
        if (array.length > 0) {
            final Throwable t = array[0];
        }
    }
    
    public static final void g(final String s, final String s2, final Throwable... array) {
        if (array.length > 0) {
            Log.w(s, s2, array[0]);
            return;
        }
        Log.w(s, s2);
    }
    
    public final void d(final Throwable... array) {
        if (this.b <= 3 && array.length > 0) {
            final Throwable t = array[0];
        }
    }
}
