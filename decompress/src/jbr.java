import android.util.DisplayMetrics;
import android.view.WindowManager;
import android.view.Window;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jbr
{
    public final float a;
    
    public jbr(final Window window) {
        final WindowManager windowManager = (WindowManager)window.getContext().getSystemService("window");
        final DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
        this.a = displayMetrics.xdpi * displayMetrics.ydpi;
    }
}
