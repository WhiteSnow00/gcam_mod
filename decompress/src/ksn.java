import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraDevice$StateCallback;

// 
// Decompiled by Procyon v0.6.0
// 

final class ksn extends CameraDevice$StateCallback
{
    private final ktb a;
    private final String b;
    
    public ksn(final ktb a, final String b) {
        this.a = a;
        this.b = b;
    }
    
    public final void onClosed(final CameraDevice cameraDevice) {
        cameraDevice.getClass();
        njo.d(cameraDevice.getId().equals(this.b));
        this.a.a();
    }
    
    public final void onDisconnected(final CameraDevice cameraDevice) {
        cameraDevice.getClass();
        njo.d(cameraDevice.getId().equals(this.b));
        this.a.b();
        cameraDevice.close();
    }
    
    public final void onError(final CameraDevice cameraDevice, final int n) {
        cameraDevice.getClass();
        njo.d(cameraDevice.getId().equals(this.b));
        final ktb a = this.a;
        final kst kst = (kst)kst.s.get(n);
        if (kst != null) {
            a.c(kst);
            cameraDevice.close();
            return;
        }
        throw new IllegalStateException("Unknown Camera Device error code");
    }
    
    public final void onOpened(final CameraDevice cameraDevice) {
        cameraDevice.getClass();
        njo.d(cameraDevice.getId().equals(this.b));
        this.a.d(new lel(cameraDevice));
    }
}
