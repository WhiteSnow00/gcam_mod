import android.hardware.SensorEvent;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class lgv implements SensorEventListener
{
    final /* synthetic */ lgw a;
    private long b;
    
    public lgv(final lgw a) {
        this.a = a;
        this.b = 1L;
    }
    
    public final void onAccuracyChanged(final Sensor sensor, final int n) {
    }
    
    public final void onSensorChanged(final SensorEvent sensorEvent) {
        if (sensorEvent.sensor != null && sensorEvent.sensor.getType() == 4) {
            final float[] values = sensorEvent.values;
            synchronized (this.a) {
                final lgw a = this.a;
                final lgs lgs = a.a.get(a.c);
                final long b = this.b;
                this.b = 1L + b;
                lgs.d = b;
                lgs.e = sensorEvent.timestamp;
                lgs.f = values[0];
                lgs.g = values[1];
                lgs.h = values[2];
                final lgw a2 = this.a;
                a2.c = (a2.c + 1) % 6000;
            }
        }
    }
}
