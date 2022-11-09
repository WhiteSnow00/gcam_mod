import android.hardware.SensorEvent;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dmo implements SensorEventListener
{
    final /* synthetic */ dni a;
    
    public dmo(final dni a) {
        this.a = a;
    }
    
    public final void onAccuracyChanged(final Sensor sensor, final int n) {
    }
    
    public final void onSensorChanged(final SensorEvent sensorEvent) {
        this.a.h(sensorEvent.timestamp, sensorEvent.values);
    }
}
