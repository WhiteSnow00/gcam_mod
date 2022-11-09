import android.hardware.Camera;
import android.hardware.Camera$CameraInfo;

// 
// Decompiled by Procyon v0.6.0
// 

final class ari implements atn
{
    private final Camera$CameraInfo[] a;
    private final int b;
    
    private ari(final Camera$CameraInfo[] a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    public static ari c() {
        try {
            final int numberOfCameras = Camera.getNumberOfCameras();
            final Camera$CameraInfo[] array = new Camera$CameraInfo[numberOfCameras];
            for (int i = 0; i < numberOfCameras; ++i) {
                Camera.getCameraInfo(i, array[i] = new Camera$CameraInfo());
            }
            int n = -1;
            for (int j = numberOfCameras - 1; j >= 0; --j) {
                if (array[j].facing == 0) {
                    n = j;
                }
                else {
                    final int facing = array[j].facing;
                }
            }
            return new ari(array, n);
        }
        catch (final RuntimeException ex) {
            auc.b(asa.a, "Exception while creating CameraDeviceInfo", ex);
            return null;
        }
    }
    
    @Override
    public final int a() {
        return this.b;
    }
    
    @Override
    public final atm b(final int n) {
        final Camera$CameraInfo camera$CameraInfo = this.a[n];
        if (camera$CameraInfo != null) {
            return new arh(camera$CameraInfo);
        }
        return null;
    }
}
