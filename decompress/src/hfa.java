import java.util.Collection;
import android.hardware.SensorManager;
import android.hardware.SensorEvent;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class hfa implements SensorEventListener
{
    final /* synthetic */ hfb a;
    
    public hfa(final hfb a) {
        this.a = a;
    }
    
    public final void onAccuracyChanged(final Sensor sensor, final int n) {
    }
    
    public final void onSensorChanged(final SensorEvent sensorEvent) {
        if (sensorEvent.sensor.getType() == this.a.c.getType()) {
            SensorManager.getRotationMatrixFromVector(this.a.f, sensorEvent.values);
            final hfb a = this.a;
            SensorManager.remapCoordinateSystem(a.f, 1, 3, a.g);
            final hfb a2 = this.a;
            SensorManager.getOrientation(a2.g, a2.h);
            final hfb a3 = this.a;
            final float[] h = a3.h;
            int i = 0;
            float n2;
            final float n = n2 = h[0] * 57.29578f % 360.0f;
            if (n < 0.0f) {
                n2 = n + 360.0f;
            }
            final float n3 = h[1];
            float n5;
            final float n4 = n5 = h[2] * 57.29578f % 360.0f;
            if (n4 < 0.0f) {
                n5 = n4 + 360.0f;
            }
            final hez hez = new hez(n2, n3 * 57.29578f, n5);
            synchronized (a3.e) {
                final nns j = nns.j(a3.i);
                monitorexit(a3.e);
                while (i < j.size()) {
                    ((hey)j.get(i)).b(hez);
                    ++i;
                }
            }
        }
    }
}
