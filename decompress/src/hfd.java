import android.hardware.SensorEventListener;
import java.util.Iterator;
import java.util.concurrent.Executor;
import android.hardware.Sensor;
import android.hardware.SensorManager;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hfd
{
    public final SensorManager a;
    public final Sensor b;
    private final Executor c;
    
    public hfd(final SensorManager a, final Executor c) {
        this.a = a;
        this.c = c;
        while (true) {
            for (final Sensor b : a.getSensorList(-1)) {
                if ("Double Twist".equals(b.getName()) && "Google".equals(b.getVendor())) {
                    this.b = b;
                    return;
                }
            }
            Sensor b = null;
            continue;
        }
    }
    
    public final void a(final SensorEventListener sensorEventListener) {
        if (this.b != null) {
            this.c.execute(new hfc(this, sensorEventListener));
        }
    }
    
    public final void b(final SensorEventListener sensorEventListener) {
        if (this.b != null) {
            this.c.execute(new hfc(this, sensorEventListener, 1));
        }
    }
}
