import android.os.PowerManager$OnThermalStatusChangedListener;
import java.util.concurrent.Executor;
import android.os.PowerManager;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hzb
{
    public static final nsd a;
    public final PowerManager b;
    public boolean c;
    public boolean d;
    public final Executor e;
    
    static {
        a = nsd.g("com/google/android/apps/camera/temperature/PowerManagerProxy");
    }
    
    public hzb(final PowerManager b, final Executor e) {
        this.c = false;
        this.d = false;
        this.b = b;
        this.e = e;
    }
    
    final void a(final PowerManager$OnThermalStatusChangedListener powerManager$OnThermalStatusChangedListener) {
        synchronized (this) {
            this.c = true;
            this.e.execute(new hza(this, powerManager$OnThermalStatusChangedListener, 1));
        }
    }
}
