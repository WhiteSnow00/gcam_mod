import android.hardware.SensorEvent;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class dnc implements SensorEventListener
{
    final /* synthetic */ dly a;
    
    public dnc(final dly a) {
        this.a = a;
    }
    
    public final void onAccuracyChanged(final Sensor sensor, final int n) {
        if (this.a.a()) {
            this.a.onAccuracyChanged(sensor, n);
        }
    }
    
    public final void onSensorChanged(final SensorEvent sensorEvent) {
        if (this.a.a()) {
            this.a.onSensorChanged(sensorEvent);
        }
    }
}
