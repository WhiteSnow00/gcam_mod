import java.util.HashSet;
import java.util.Set;
import android.hardware.Sensor;
import java.util.concurrent.Executor;
import android.hardware.SensorManager;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hfb
{
    public final SensorManager a;
    public final Executor b;
    public final Sensor c;
    public final hfa d;
    public final Object e;
    public final float[] f;
    public final float[] g;
    public final float[] h;
    public final Set i;
    public boolean j;
    
    public hfb(final SensorManager a, final Executor b) {
        this.e = new Object();
        this.f = new float[9];
        this.g = new float[9];
        this.h = new float[3];
        this.i = new HashSet();
        this.a = a;
        this.b = b;
        this.c = a.getDefaultSensor(11);
        this.d = new hfa(this);
    }
}
