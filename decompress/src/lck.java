import android.util.Log;
import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;

// 
// Decompiled by Procyon v0.6.0
// 

final class lck
{
    public static OutputConfiguration a(final ldw ldw, final Surface surface) {
        OutputConfiguration outputConfiguration2;
        try {
            final OutputConfiguration outputConfiguration = new OutputConfiguration(surface);
            b(ldw, outputConfiguration);
            outputConfiguration2 = outputConfiguration;
        }
        catch (final IllegalArgumentException ex) {
            Log.w("OutputConfigs", "The illegal argument may be caused by invalid surface.");
            outputConfiguration2 = null;
        }
        return outputConfiguration2;
    }
    
    public static void b(final ldw ldw, final OutputConfiguration outputConfiguration) {
        if (ldw.g) {
            njo.p(true, "Physical camera ids are only available on Android P and greater.");
            outputConfiguration.setPhysicalCameraId(ldw.f.a);
        }
    }
}
