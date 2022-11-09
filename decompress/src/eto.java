import android.hardware.SensorEvent;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class eto implements SensorEventListener
{
    final /* synthetic */ etp a;
    
    public eto(final etp a) {
        this.a = a;
    }
    
    public final void onAccuracyChanged(final Sensor sensor, final int n) {
    }
    
    public final void onSensorChanged(final SensorEvent sensorEvent) {
        if (sensorEvent.sensor.getType() == 1) {
            final etp a = this.a;
            if (!a.d) {
                a.c.a(sensorEvent.values[0], sensorEvent.values[1], sensorEvent.values[2]);
                a.d = true;
            }
            else {
                final jdm c = a.c;
                final float n = sensorEvent.values[0];
                final jdm c2 = a.c;
                c.a = n * 0.15f + c2.a * 0.85f;
                final float n2 = sensorEvent.values[1];
                final jdm c3 = a.c;
                c2.b = n2 * 0.15f + c3.b * 0.85f;
                c3.c = sensorEvent.values[2] * 0.15f + a.c.c * 0.85f;
            }
            this.a.j.c(sensorEvent.values, sensorEvent.timestamp);
            return;
        }
        if (sensorEvent.sensor.getType() == 2) {
            this.a.e[0] = sensorEvent.values[0];
            this.a.e[1] = sensorEvent.values[1];
            this.a.e[2] = sensorEvent.values[2];
            return;
        }
        if (sensorEvent.sensor.getType() == 4) {
            final float[] values = sensorEvent.values;
            values[0] -= this.a.h[0];
            final float[] values2 = sensorEvent.values;
            values2[1] -= this.a.h[1];
            final float[] values3 = sensorEvent.values;
            values3[2] -= this.a.h[2];
            final float n3 = sensorEvent.values[0];
            final float n4 = sensorEvent.values[0];
            final float n5 = sensorEvent.values[1];
            final float n6 = sensorEvent.values[1];
            final float n7 = sensorEvent.values[2];
            final float n8 = sensorEvent.values[2];
            final etp a2 = this.a;
            final float m = n3 * n4 + n5 * n6 + n7 * n8;
            a2.m = m;
            final euc l = a2.l;
            if (l != null) {
                l.a(m);
            }
            final etp a3 = this.a;
            if (a3.f != 0L) {
                final float n9 = (sensorEvent.timestamp - a3.f) * 1.0E-9f;
                synchronized (a3) {
                    final float[] g = a3.g;
                    g[0] += sensorEvent.values[0] * n9;
                    final float[] g2 = a3.g;
                    g2[1] += sensorEvent.values[1] * n9;
                    final float[] g3 = a3.g;
                    g3[2] += sensorEvent.values[2] * n9;
                    ++a3.i;
                }
            }
            a3.f = sensorEvent.timestamp;
            this.a.j.d(sensorEvent.values, sensorEvent.timestamp);
        }
    }
}
