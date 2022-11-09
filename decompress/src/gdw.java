import android.graphics.Rect;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.params.Face;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gdw extends kxc
{
    private final kri a;
    
    public gdw(final kri a) {
        this.a = a;
    }
    
    @Override
    public final void b(final ljm ljm) {
        final Face[] array = (Face[])ljm.d(CaptureResult.STATISTICS_FACES);
        final Rect rect = (Rect)ljm.d(CaptureResult.SCALER_CROP_REGION);
        final Long n = (Long)ljm.d(CaptureResult.SENSOR_FRAME_DURATION);
        if (array != null && rect != null && n != null) {
            this.a.aR(new gdx(array, rect, n));
        }
    }
}
