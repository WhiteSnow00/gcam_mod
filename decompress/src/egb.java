import android.hardware.SensorManager;
import android.app.KeyguardManager;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class egb
{
    public final Context a;
    
    public egb(final Context a) {
        this.a = a;
    }
    
    public static Object c(final Context context, final String s) {
        try {
            return context.getSystemService(s);
        }
        catch (final Exception ex) {
            return null;
        }
    }
    
    public final KeyguardManager a() {
        return (KeyguardManager)c(this.a, "keyguard");
    }
    
    public final SensorManager b() {
        return (SensorManager)c(this.a, "sensor");
    }
}
