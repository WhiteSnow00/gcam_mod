import android.view.View;
import android.os.VibrationEffect;
import android.content.Context;
import android.os.Vibrator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jdj
{
    private static final liz a;
    private final Vibrator b;
    private final boolean c;
    
    static {
        a = liz.a();
    }
    
    public jdj(final Context context, final cxl cxl) {
        final Vibrator b = (Vibrator)context.getSystemService("vibrator");
        this.b = b;
        this.c = cxl.k(cxr.aV);
    }
    
    public static void b(final Context context) {
        if (((bmp)context).a().k(cxr.aV)) {
            if (jdj.a.i) {
                return;
            }
            ((Vibrator)context.getSystemService("vibrator")).vibrate(VibrationEffect.createPredefined(2));
        }
    }
    
    public static void e(final View view) {
        view.performHapticFeedback(6);
    }
    
    public final void a() {
        if (jdj.a.i) {
            return;
        }
        if (this.c) {
            this.d(VibrationEffect.createPredefined(2));
        }
    }
    
    public final void c(final int n) {
        this.d(VibrationEffect.createPredefined(n));
    }
    
    public final void d(final VibrationEffect vibrationEffect) {
        if (this.b.hasVibrator()) {
            this.b.vibrate(vibrationEffect);
        }
    }
}
