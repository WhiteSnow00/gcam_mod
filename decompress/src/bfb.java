import android.content.res.Resources$NotFoundException;
import android.graphics.drawable.Drawable;
import android.content.res.Resources$Theme;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bfb
{
    private static volatile boolean a;
    
    static {
        bfb.a = true;
    }
    
    public static Drawable a(final Context context, final Context context2, final int n, Resources$Theme theme) {
        try {
            if (bfb.a) {
                Object o;
                if (theme != null) {
                    o = new lv(context2, theme);
                }
                else {
                    o = context2;
                }
                return lp.b((Context)o, n);
            }
        }
        catch (final Resources$NotFoundException ex) {}
        catch (final IllegalStateException ex2) {
            if (!context.getPackageName().equals(context2.getPackageName())) {
                return aah.a(context2, n);
            }
            throw ex2;
        }
        catch (final NoClassDefFoundError noClassDefFoundError) {
            bfb.a = false;
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        return gu.b(context2.getResources(), n, theme);
    }
}
