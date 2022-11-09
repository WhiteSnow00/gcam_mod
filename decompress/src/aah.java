import android.view.View;
import android.os.Build$VERSION;
import android.graphics.drawable.Drawable;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aah
{
    public static Drawable a(final Context context, final int n) {
        return context.getDrawable(n);
    }
    
    public static boolean b() {
        if (Build$VERSION.SDK_INT < 31) {
            final String codename = Build$VERSION.CODENAME;
            if (!"REL".equals(codename)) {
                if (codename.compareTo("S") >= 0) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
    
    public static int c(final sq sq, final rp rp, final View view, final View view2, final se se, final boolean b) {
        if (se.ah() == 0 || sq.a() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!b) {
            return Math.abs(se.bd(view) - se.bd(view2)) + 1;
        }
        return Math.min(rp.k(), rp.a(view2) - rp.d(view));
    }
    
    public static int d(final sq sq, final rp rp, final View view, final View view2, final se se, final boolean b, final boolean b2) {
        if (se.ah() == 0 || sq.a() == 0 || view == null || view2 == null) {
            return 0;
        }
        final int min = Math.min(se.bd(view), se.bd(view2));
        final int max = Math.max(se.bd(view), se.bd(view2));
        int n;
        if (b2) {
            n = Math.max(0, sq.a() - max - 1);
        }
        else {
            n = Math.max(0, min);
        }
        if (!b) {
            return n;
        }
        return Math.round(n * (Math.abs(rp.a(view2) - rp.d(view)) / (float)(Math.abs(se.bd(view) - se.bd(view2)) + 1)) + (rp.j() - rp.d(view)));
    }
    
    public static int e(final sq sq, final rp rp, final View view, final View view2, final se se, final boolean b) {
        if (se.ah() == 0 || sq.a() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!b) {
            return sq.a();
        }
        return (int)((rp.a(view2) - rp.d(view)) / (float)(Math.abs(se.bd(view) - se.bd(view2)) + 1) * sq.a());
    }
}
