import android.graphics.Color;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gv
{
    public static final ThreadLocal a;
    
    static {
        a = new ThreadLocal();
    }
    
    public static int a(final int n, final int n2, final float n3) {
        final float n4 = 1.0f - n3;
        return Color.argb((int)(Color.alpha(n) * n4 + Color.alpha(n2) * n3), (int)(Color.red(n) * n4 + Color.red(n2) * n3), (int)(Color.green(n) * n4 + Color.green(n2) * n3), (int)(Color.blue(n) * n4 + Color.blue(n2) * n3));
    }
    
    public static int b(final int n, final int n2) {
        final int alpha = Color.alpha(n2);
        final int alpha2 = Color.alpha(n);
        final int n3 = 255 - (255 - alpha) * (255 - alpha2) / 255;
        return Color.argb(n3, d(Color.red(n), alpha2, Color.red(n2), alpha, n3), d(Color.green(n), alpha2, Color.green(n2), alpha, n3), d(Color.blue(n), alpha2, Color.blue(n2), alpha, n3));
    }
    
    public static int c(final int n, final int n2) {
        if (n2 >= 0 && n2 <= 255) {
            return (n & 0xFFFFFF) | n2 << 24;
        }
        throw new IllegalArgumentException("alpha must be between 0 and 255.");
    }
    
    private static int d(final int n, final int n2, final int n3, final int n4, final int n5) {
        if (n5 == 0) {
            return 0;
        }
        return (n * 255 * n2 + n3 * n4 * (255 - n2)) / (n5 * 255);
    }
}
