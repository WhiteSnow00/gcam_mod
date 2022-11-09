import android.graphics.Rect;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.params.Face;
import com.google.googlex.gcam.Tuning;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dwo
{
    public final Tuning a;
    public final gdx b;
    
    public dwo(final Tuning a, final ljm ljm) {
        ljm.getClass();
        this.a = a;
        final Face[] array = (Face[])ljm.d(CaptureResult.STATISTICS_FACES);
        final Rect rect = (Rect)ljm.d(CaptureResult.SCALER_CROP_REGION);
        final Long n = (Long)ljm.d(CaptureResult.SENSOR_FRAME_DURATION);
        if (array == null) {
            throw new IllegalStateException("STATISTICS_FACES not present in metadata.");
        }
        if (rect != null) {
            long longValue;
            if (n != null) {
                longValue = n;
            }
            else {
                longValue = 0L;
            }
            this.b = new gdx(array, rect, longValue);
            return;
        }
        throw new IllegalStateException("SCALER_CROP_REGION not present in metadata.");
    }
}
