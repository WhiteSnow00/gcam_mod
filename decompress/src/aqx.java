import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.graphics.Rect;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraDevice$StateCallback;

// 
// Decompiled by Procyon v0.6.0
// 

final class aqx extends CameraDevice$StateCallback
{
    final /* synthetic */ arb a;
    
    public aqx(final arb a) {
        this.a = a;
    }
    
    public final void onDisconnected(final CameraDevice cameraDevice) {
        final aub a = ard.a;
        final StringBuilder sb = new StringBuilder();
        sb.append("Camera device '");
        sb.append(this.a.b);
        sb.append("' was disconnected");
        auc.c(a, sb.toString());
    }
    
    public final void onError(final CameraDevice cameraDevice, int b) {
        final aub a = ard.a;
        final StringBuilder sb = new StringBuilder();
        sb.append("Camera device '");
        sb.append(this.a.b);
        sb.append("' encountered error code '");
        sb.append(b);
        sb.append('\'');
        auc.a(a, sb.toString());
        final arb a2 = this.a;
        final asi a3 = a2.a;
        if (a3 != null) {
            b = a2.b;
            a3.c(b, a2.c(b));
        }
    }
    
    public final void onOpened(final CameraDevice d) {
        final arb a = this.a;
        a.d = d;
        if (a.a != null) {
            try {
                final CameraCharacteristics cameraCharacteristics = a.q.e.getCameraCharacteristics(a.c);
                final atm b = this.a.q.b().b(this.a.b);
                final arb a2 = this.a;
                final ard q = a2.q;
                a2.e = new aqu(q, q, a2.b, b, cameraCharacteristics);
                this.a.f = new aue();
                this.a.g = (Rect)cameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
                this.a.h = ((int)cameraCharacteristics.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL) == 2);
                this.a.a(2);
                final arb a3 = this.a;
                a3.a.b(a3.e);
            }
            catch (final CameraAccessException ex) {
                final arb a4 = this.a;
                final asi a5 = a4.a;
                final int b2 = a4.b;
                a5.c(b2, a4.c(b2));
            }
        }
    }
}
