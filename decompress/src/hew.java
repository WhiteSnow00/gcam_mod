import android.hardware.SensorEvent;
import java.util.concurrent.Executor;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.hardware.SensorEventListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hew implements SensorEventListener
{
    private static final nsd f;
    public int a;
    public final SensorManager b;
    public final Sensor c;
    public final Sensor d;
    public final Executor e;
    private final float[] g;
    private final float[] h;
    private final float[] i;
    
    static {
        f = nsd.g("com/google/android/apps/camera/sensor/HeadingSensor");
    }
    
    public hew(final SensorManager b, final Executor e) {
        this.a = -1;
        this.g = new float[3];
        this.h = new float[3];
        this.i = new float[16];
        this.b = b;
        this.e = e;
        this.c = b.getDefaultSensor(1);
        this.d = b.getDefaultSensor(2);
    }
    
    public final void onAccuracyChanged(final Sensor sensor, final int n) {
    }
    
    public final void onSensorChanged(final SensorEvent sensorEvent) {
        final int type = sensorEvent.sensor.getType();
        float[] array;
        if (type == 1) {
            array = this.g;
        }
        else {
            if (type != 2) {
                a.k(hew.f.c(), "Unexpected sensor type %s", sensorEvent.sensor.getName(), '\u08e0');
                return;
            }
            array = this.h;
        }
        System.arraycopy(sensorEvent.values, 0, array, 0, 3);
        final float[] array2 = new float[3];
        SensorManager.getRotationMatrix(this.i, new float[3], this.g, this.h);
        SensorManager.getOrientation(this.i, array2);
        final double n = array2[0] * 180.0f;
        Double.isNaN(n);
        final int a = (int)(n / 3.141592653589793) % 360;
        this.a = a;
        if (a < 0) {
            this.a = a + 360;
        }
    }
}
