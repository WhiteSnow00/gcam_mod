import android.view.Surface;
import android.hardware.camera2.CameraConstrainedHighSpeedCaptureSession;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCaptureSession$StateCallback;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ler extends CameraCaptureSession$StateCallback
{
    private final lje a;
    
    public ler(final lje a) {
        this.a = a;
    }
    
    private static final ljf a(final CameraCaptureSession cameraCaptureSession) {
        if (cameraCaptureSession instanceof CameraConstrainedHighSpeedCaptureSession) {
            return new lek((CameraConstrainedHighSpeedCaptureSession)cameraCaptureSession);
        }
        return new lej(cameraCaptureSession);
    }
    
    public final void onActive(final CameraCaptureSession cameraCaptureSession) {
        final lje a = this.a;
        a(cameraCaptureSession);
        a.i();
    }
    
    public final void onClosed(final CameraCaptureSession cameraCaptureSession) {
        this.a.d(a(cameraCaptureSession));
    }
    
    public final void onConfigureFailed(final CameraCaptureSession cameraCaptureSession) {
        this.a.e(a(cameraCaptureSession));
    }
    
    public final void onConfigured(final CameraCaptureSession cameraCaptureSession) {
        this.a.f(a(cameraCaptureSession));
    }
    
    public final void onReady(final CameraCaptureSession cameraCaptureSession) {
        final lje a = this.a;
        a(cameraCaptureSession);
        a.j();
    }
    
    public final void onSurfacePrepared(final CameraCaptureSession cameraCaptureSession, final Surface surface) {
        final lje a = this.a;
        a(cameraCaptureSession);
        a.k();
    }
}
