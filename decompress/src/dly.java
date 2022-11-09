import android.hardware.SensorEvent;
import android.hardware.Sensor;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dly implements dla, dky, dkx, dlh
{
    public final dni a;
    private final dla b;
    private final dkx c;
    private final dky d;
    private final dlh e;
    
    public dly(final dni a, final dla b, final dkx c, final dky d, final dlh e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    @Override
    public final boolean a() {
        return this.b.a();
    }
    
    @Override
    public final void b(final kvs kvs, final kwz kwz) {
        this.c.b(kvs, kwz);
    }
    
    @Override
    public final void c() {
        this.d.c();
    }
    
    @Override
    public final void d(final lfg lfg, final boa boa) {
        this.d.d(lfg, boa);
    }
    
    @Override
    public final Set e() {
        return this.e.e();
    }
    
    @Override
    public final void f(final Sensor sensor) {
        this.e.f(sensor);
    }
    
    @Override
    public final void g(final Sensor sensor) {
        this.e.g(sensor);
    }
    
    public final void onAccuracyChanged(final Sensor sensor, final int n) {
        this.e.onAccuracyChanged(sensor, n);
    }
    
    public final void onSensorChanged(final SensorEvent sensorEvent) {
        this.e.onSensorChanged(sensorEvent);
    }
}
