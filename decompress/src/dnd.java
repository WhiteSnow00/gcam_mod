import java.util.Iterator;
import android.hardware.SensorEventListener;
import android.hardware.Sensor;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Set;
import java.util.List;
import android.hardware.SensorManager;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dnd
{
    public final SensorManager a;
    private final List b;
    private final List c;
    
    public dnd(final SensorManager a, final Set set) {
        this.c = new ArrayList();
        this.a = a;
        this.b = dlz.a(set);
    }
    
    final void a() {
        monitorenter(this);
        try {
            dlz.c("sensor", this.b);
            for (final dly dly : this.b) {
                if (dly.a()) {
                    for (final Sensor sensor : dly.e()) {
                        dly.g(sensor);
                        final dnc dnc = new dnc(dly);
                        this.a.registerListener((SensorEventListener)dnc, sensor, 3);
                        this.c.add(new dnb(this, dly, sensor, (SensorEventListener)dnc));
                    }
                }
            }
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final void b() {
        monitorenter(this);
        try {
            final Iterator iterator = this.c.iterator();
            while (iterator.hasNext()) {
                ((Runnable)iterator.next()).run();
            }
            this.c.clear();
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
}
