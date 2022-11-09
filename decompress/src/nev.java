import android.graphics.Color;
import android.util.StateSet;
import android.content.res.ColorStateList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nev
{
    private static final int[] a;
    private static final int[] b;
    private static final int[] c;
    
    static {
        a = new int[] { 16842919 };
        b = new int[] { 16842913, 16842919 };
        c = new int[] { 16842913 };
        nev.class.getSimpleName();
    }
    
    private nev() {
    }
    
    public static ColorStateList a(final ColorStateList list) {
        return new ColorStateList(new int[][] { nev.c, StateSet.NOTHING }, new int[] { c(list, nev.b), c(list, nev.a) });
    }
    
    public static ColorStateList b(final ColorStateList list) {
        if (list != null) {
            return list;
        }
        return ColorStateList.valueOf(0);
    }
    
    private static int c(final ColorStateList list, final int[] array) {
        int colorForState;
        if (list != null) {
            colorForState = list.getColorForState(array, list.getDefaultColor());
        }
        else {
            colorForState = 0;
        }
        final int alpha = Color.alpha(colorForState);
        return gv.c(colorForState, Math.min(alpha + alpha, 255));
    }
}
