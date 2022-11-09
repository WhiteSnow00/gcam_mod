import android.hardware.camera2.CameraManager$AvailabilityCallback;

// 
// Decompiled by Procyon v0.6.0
// 

final class ktf extends CameraManager$AvailabilityCallback
{
    final /* synthetic */ kti a;
    
    public ktf(final kti a) {
        this.a = a;
    }
    
    public final void onCameraAvailable(final String s) {
        if (this.a.a.equals(s)) {
            synchronized (this.a.h) {
                this.a.h.notify();
            }
        }
    }
    
    public final void onCameraUnavailable(final String s) {
    }
}
