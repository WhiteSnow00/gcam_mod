import android.hardware.SensorEvent;
import android.hardware.Sensor;
import java.util.Iterator;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

final class dlt implements dlh
{
    final /* synthetic */ dlu a;
    
    public dlt(final dlu a) {
        this.a = a;
    }
    
    @Override
    public final Set e() {
        final HashSet set = new HashSet();
        final Iterator iterator = this.a.d.iterator();
        while (iterator.hasNext()) {
            set.addAll(((dlh)iterator.next()).e());
        }
        return set;
    }
    
    @Override
    public final void f(final Sensor sensor) {
        for (final dlh dlh : this.a.d) {
            if (dlh.e().contains(sensor)) {
                dlh.f(sensor);
            }
        }
    }
    
    @Override
    public final void g(final Sensor sensor) {
        for (final dlh dlh : this.a.d) {
            if (dlh.e().contains(sensor)) {
                dlh.g(sensor);
            }
        }
    }
    
    public final void onAccuracyChanged(final Sensor sensor, final int n) {
        for (final dlh dlh : this.a.d) {
            if (dlh.e().contains(sensor)) {
                dlh.onAccuracyChanged(sensor, n);
            }
        }
    }
    
    public final void onSensorChanged(final SensorEvent sensorEvent) {
        for (final dlh dlh : this.a.d) {
            if (dlh.e().contains(sensorEvent.sensor)) {
                dlh.onSensorChanged(sensorEvent);
            }
        }
    }
}
