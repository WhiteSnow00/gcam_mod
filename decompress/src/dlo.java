import android.hardware.SensorEvent;
import java.util.Collections;
import java.util.Set;
import android.hardware.SensorEventListener;
import android.hardware.Sensor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dlo implements dlh
{
    final /* synthetic */ Sensor a;
    final /* synthetic */ SensorEventListener b;
    
    public dlo(final Sensor a, final SensorEventListener b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final Set e() {
        return Collections.singleton(this.a);
    }
    
    @Override
    public final void f(final Sensor sensor) {
    }
    
    @Override
    public final void g(final Sensor sensor) {
    }
    
    public final void onAccuracyChanged(final Sensor sensor, final int n) {
    }
    
    public final void onSensorChanged(final SensorEvent sensorEvent) {
        this.b.onSensorChanged(sensorEvent);
    }
}
