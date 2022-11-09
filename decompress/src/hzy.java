import android.hardware.SensorEvent;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class hzy implements SensorEventListener
{
    final /* synthetic */ crg a;
    final /* synthetic */ iaa b;
    
    public hzy(final iaa b, final crg a) {
        this.b = b;
        this.a = a;
    }
    
    public final void onAccuracyChanged(final Sensor sensor, final int n) {
    }
    
    public final void onSensorChanged(final SensorEvent sensorEvent) {
        if (sensorEvent.sensor.getType() == 4) {
            final idf f = this.b.F;
            f.getClass();
            final lfu e = this.a.e();
            float n = sensorEvent.values[0];
            final float n2 = sensorEvent.values[1];
            final float n3 = sensorEvent.values[2];
            final long timestamp = sensorEvent.timestamp;
            final lfu a = lfu.a;
            float n4 = 0.0f;
            float n5 = 0.0f;
            switch (e.ordinal()) {
                default: {
                    n4 = n2;
                    n5 = n3;
                    break;
                }
                case 1: {
                    n4 = n;
                    n = n2;
                    n5 = n3;
                    break;
                }
                case 0: {
                    final float n6 = -n2;
                    n5 = -n3;
                    final float n7 = n6;
                    n4 = n;
                    n = n7;
                    break;
                }
            }
            f.b(n, n4, n5, sensorEvent.timestamp);
        }
    }
}
