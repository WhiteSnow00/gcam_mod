import java.util.HashSet;
import java.util.ArrayList;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import java.util.Set;
import android.hardware.SensorManager;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lgw implements lgr
{
    public final List a;
    public final krh b;
    public int c;
    private final SensorManager d;
    private final Set e;
    private final SensorEventListener f;
    private final Sensor g;
    
    public lgw(final SensorManager d) {
        this.d = d;
        this.g = d.getDefaultSensor(4);
        this.a = new ArrayList(6000);
        for (int i = 0; i < 6000; ++i) {
            this.a.add(new lgs(104, 1, 4, 0L, -1L, 0.0f, 0.0f, 0.0f));
        }
        this.c = 0;
        this.f = (SensorEventListener)new lgv(this);
        this.e = new HashSet();
        this.b = new krh(lgt.a, 6000);
    }
    
    private final void c() {
        synchronized (this) {
            this.d.unregisterListener(this.f);
        }
    }
    
    private final void d() {
        synchronized (this) {
            this.d.registerListener(this.f, this.g, 0);
        }
    }
    
    @Override
    public final lgq a(final String s) {
        synchronized (this) {
            if (this.e.isEmpty()) {
                this.d();
            }
            final lgu lgu = new lgu(this, s);
            this.e.add(lgu);
            return lgu;
        }
    }
    
    public final void b(final lgq lgq) {
        synchronized (this) {
            if (this.e.remove(lgq) && this.e.isEmpty()) {
                this.c();
            }
        }
    }
}
