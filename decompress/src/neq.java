import android.graphics.Color;
import android.graphics.PorterDuff$Mode;
import android.util.TypedValue;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class neq
{
    public neq() {
    }
    
    public neq(final pii pii) {
        pii.getClass();
    }
    
    public static float a(final Context context, final int n) {
        return TypedValue.applyDimension(1, (float)n, context.getResources().getDisplayMetrics());
    }
    
    public static PorterDuff$Mode b(final int n, final PorterDuff$Mode porterDuff$Mode) {
        switch (n) {
            default: {
                return porterDuff$Mode;
            }
            case 16: {
                return PorterDuff$Mode.ADD;
            }
            case 15: {
                return PorterDuff$Mode.SCREEN;
            }
            case 14: {
                return PorterDuff$Mode.MULTIPLY;
            }
            case 9: {
                return PorterDuff$Mode.SRC_ATOP;
            }
            case 5: {
                return PorterDuff$Mode.SRC_IN;
            }
            case 3: {
                return PorterDuff$Mode.SRC_OVER;
            }
        }
    }
    
    public static int c(final Context context, final int n, final int n2) {
        final TypedValue e = neu.e(context, n);
        if (e != null) {
            return e.data;
        }
        return n2;
    }
    
    public static int d(final int n, final int n2, final float n3) {
        return gv.b(gv.c(n2, Math.round(Color.alpha(n2) * n3)), n);
    }
    
    public static boolean e(int blue) {
        if (blue != 0) {
            double[] array;
            if ((array = gv.a.get()) == null) {
                array = new double[3];
                gv.a.set(array);
            }
            final int red = Color.red(blue);
            final int green = Color.green(blue);
            blue = Color.blue(blue);
            if (array.length != 3) {
                throw new IllegalArgumentException("outXyz must have a length of 3.");
            }
            final double n = red;
            Double.isNaN(n);
            final double n2 = n / 255.0;
            double pow;
            if (n2 < 0.04045) {
                pow = n2 / 12.92;
            }
            else {
                pow = Math.pow((n2 + 0.055) / 1.055, 2.4);
            }
            final double n3 = green;
            Double.isNaN(n3);
            final double n4 = n3 / 255.0;
            double pow2;
            if (n4 < 0.04045) {
                pow2 = n4 / 12.92;
            }
            else {
                pow2 = Math.pow((n4 + 0.055) / 1.055, 2.4);
            }
            final double n5 = blue;
            Double.isNaN(n5);
            final double n6 = n5 / 255.0;
            double pow3;
            if (n6 < 0.04045) {
                pow3 = n6 / 12.92;
            }
            else {
                pow3 = Math.pow((n6 + 0.055) / 1.055, 2.4);
            }
            array[0] = (0.4124 * pow + 0.3576 * pow2 + 0.1805 * pow3) * 100.0;
            array[1] = (0.2126 * pow + 0.7152 * pow2 + 0.0722 * pow3) * 100.0;
            array[2] = (pow * 0.0193 + pow2 * 0.1192 + pow3 * 0.9505) * 100.0;
            if (array[1] / 100.0 > 0.5) {
                return true;
            }
        }
        return false;
    }
}
