import android.hardware.SensorEvent;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class fad implements SensorEventListener
{
    final /* synthetic */ fae a;
    
    public fad(final fae a) {
        this.a = a;
    }
    
    public final void onAccuracyChanged(final Sensor sensor, final int n) {
    }
    
    public final void onSensorChanged(final SensorEvent sensorEvent) {
        if (sensorEvent.sensor.getType() == 9) {
            final fam a = this.a.a;
            final float[] array = sensorEvent.values.clone();
            final long timestamp = sensorEvent.timestamp;
            final float n = (float)Math.sqrt(fam.a(array, array));
            if (n != 0.0f) {
                final float n2 = 1.0f / n;
                final float n3 = (float)Math.acos(fam.a(new float[] { array[0] * n2, array[1] * n2, array[2] * n2 }, a.a));
                if (a.c >= 0L && n3 <= a.b) {
                    a.e = Math.min(a.e + 1, 5);
                    return;
                }
                a.c = timestamp;
                a.e = 0;
            }
        }
        else if (sensorEvent.sensor.getType() == 4) {
            final fam a2 = this.a.a;
            final float[] array2 = sensorEvent.values.clone();
            final long timestamp2 = sensorEvent.timestamp;
            final float a3 = fam.a(array2, array2);
            if (a2.d >= 0L && a3 <= 1.0E-4f) {
                a2.f = Math.min(a2.f + 1, 5);
                return;
            }
            a2.d = timestamp2;
            a2.f = 0;
        }
    }
}
