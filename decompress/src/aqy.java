import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCaptureSession$StateCallback;

// 
// Decompiled by Procyon v0.6.0
// 

final class aqy extends CameraCaptureSession$StateCallback
{
    final /* synthetic */ arb a;
    
    public aqy(final arb a) {
        this.a = a;
    }
    
    public final void onActive(final CameraCaptureSession cameraCaptureSession) {
        final asy k = this.a.k;
        if (k != null) {
            k.a();
            this.a.k = null;
        }
    }
    
    public final void onConfigureFailed(final CameraCaptureSession cameraCaptureSession) {
        auc.a(ard.a, "Failed to configure the camera for capture");
    }
    
    public final void onConfigured(final CameraCaptureSession i) {
        final arb a = this.a;
        a.i = i;
        a.a(8);
    }
}
