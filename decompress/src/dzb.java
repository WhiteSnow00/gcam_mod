import android.hardware.camera2.CaptureRequest$Key;
import android.view.WindowManager;
import android.content.SharedPreferences;
import java.util.concurrent.Executor;
import android.opengl.GLSurfaceView;
import android.hardware.SensorManager;
import android.util.DisplayMetrics;
import android.preference.PreferenceManager;
import android.view.accessibility.AccessibilityManager;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dzb implements oun
{
    private final pii a;
    private final /* synthetic */ int b;
    
    public dzb(final pii a) {
        this.a = a;
    }
    
    public dzb(final pii a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public static dzb a(final pii pii) {
        return new dzb(pii);
    }
    
    public static dzb b(final pii pii) {
        return new dzb(pii, 2);
    }
    
    public static dzb c(final pii pii) {
        return new dzb(pii, 3);
    }
    
    public static dzb d(final pii pii) {
        return new dzb(pii, 4);
    }
    
    public static dzb e(final pii pii) {
        return new dzb(pii, 5);
    }
}
