import java.util.concurrent.atomic.AtomicBoolean;
import android.hardware.camera2.CameraManager$AvailabilityCallback;

// 
// Decompiled by Procyon v0.6.0
// 

final class deo extends CameraManager$AvailabilityCallback
{
    final /* synthetic */ AtomicBoolean a;
    
    public deo(final AtomicBoolean a) {
        this.a = a;
    }
    
    public final void onCameraAvailable(final String s) {
        this.a.set(true);
    }
}
