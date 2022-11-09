import android.app.Activity;
import android.graphics.Point;
import android.content.Context;
import android.view.Display;

// 
// Decompiled by Procyon v0.6.0
// 

public enum jcb
{
    a("PORTRAIT", 0, 0), 
    b("LANDSCAPE", 1, 270), 
    c("REVERSE_LANDSCAPE", 2, 90), 
    d("REVERSE_PORTRAIT", 3, 180);
    
    public final int e;
    
    private jcb(final String s, final int n, final int e) {
        this.e = e;
    }
    
    public static jcb a(final Display display, final Context context) {
        final Point point = new Point();
        display.getSize(point);
        return c(display, context, point.x, point.y);
    }
    
    public static jcb b(final int n, final boolean b, final int n2, final int n3) {
        if (n2 < n3 || b) {
            return jcb.a;
        }
        if (n == 0 || n == 1) {
            return jcb.b;
        }
        if (n != 2 && n != 3) {
            throw new IllegalStateException("Reverse portrait not supported");
        }
        return jcb.c;
    }
    
    public static jcb c(final Display display, final Context context, final int n, final int n2) {
        return b(display.getRotation(), ((Activity)context).isInMultiWindowMode(), n, n2);
    }
    
    public static boolean d(final jcb jcb) {
        return jcb.equals(jcb.a) || jcb.equals(jcb.d);
    }
}
