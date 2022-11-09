import java.util.concurrent.TimeUnit;
import android.hardware.SensorEvent;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class ibn implements SensorEventListener
{
    final /* synthetic */ icy a;
    final /* synthetic */ ibu b;
    
    public ibn(final ibu b, final icy a) {
        this.b = b;
        this.a = a;
    }
    
    public final void onAccuracyChanged(final Sensor sensor, final int n) {
    }
    
    public final void onSensorChanged(final SensorEvent sensorEvent) {
        if (sensorEvent.sensor.getType() == 4) {
            final float[] values = sensorEvent.values;
            int i = 0;
            final float n = values[0];
            final float n2 = sensorEvent.values[1];
            final float n3 = sensorEvent.values[2];
            final ibu b = this.b;
            final double m = b.M;
            double n4 = 0.0;
            if (m == 0.0) {
                b.M = Math.sqrt(n * n + n2 * n2 + n3 * n3);
            }
            final ibu b2 = this.b;
            b2.N = b2.M;
            b2.M = Math.sqrt(n * n + n2 * n2 + n3 * n3);
            final ibu b3 = this.b;
            final double abs = Math.abs(b3.M - b3.N);
            Object o = this.b.b;
            synchronized (o) {
                final ibu b4 = this.b;
                final long d = b4.d;
                b4.d = 1L + d;
                final int n5 = (int)d;
                final double[] c = b4.c;
                c[n5 % 3] = abs;
                while (i < 3) {
                    n4 += c[i];
                    ++i;
                }
                monitorexit(o);
                this.b.O = TimeUnit.NANOSECONDS.toMillis(sensorEvent.timestamp - this.b.P);
                o = this.b;
                if (((ibu)o).O > 50L) {
                    ((ibu)o).P = sensorEvent.timestamp;
                }
                final ibu b5 = this.b;
                if (b5.O > 50L && n4 / 3.0 > 0.014999999664723873) {
                    if (((iah)b5.j.d).equals(iah.h)) {
                        this.a.e();
                    }
                    this.b.h(true);
                    this.b.f();
                }
            }
        }
    }
}
