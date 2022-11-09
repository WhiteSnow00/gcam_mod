import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.animation.TimeInterpolator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ncj
{
    public static final TimeInterpolator a;
    public static final TimeInterpolator b;
    public static final TimeInterpolator c;
    
    static {
        new LinearInterpolator();
        a = (TimeInterpolator)new adh();
        b = (TimeInterpolator)new adg();
        c = (TimeInterpolator)new adi();
        new DecelerateInterpolator();
    }
    
    public static int a(final int n, final int n2, final float n3) {
        return n + Math.round(n3 * (n2 - n));
    }
}
