import android.app.Activity;
import android.view.WindowManager;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iwu
{
    private static iwu a;
    private final int b;
    private final boolean c;
    
    private iwu(final Context context) {
        this.b = ((WindowManager)context.getSystemService("window")).getDefaultDisplay().getRotation();
        this.c = ((Activity)context).isInMultiWindowMode();
    }
    
    public static int a(final Context context) {
        final iwu a = iwu.a;
        if (a != null) {
            return a.b;
        }
        return ((WindowManager)context.getSystemService("window")).getDefaultDisplay().getRotation();
    }
    
    public static void b(final Context context) {
        if (iwu.a == null) {
            iwu.a = new iwu(context);
        }
    }
    
    public static void c() {
        iwu.a = null;
    }
    
    public static boolean d(final Context context) {
        final iwu a = iwu.a;
        if (a != null) {
            return a.c;
        }
        return ((Activity)context).isInMultiWindowMode();
    }
}
