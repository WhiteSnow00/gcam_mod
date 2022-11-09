import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;

// 
// Decompiled by Procyon v0.6.0
// 

public final class etn extends HandlerThread
{
    Handler a;
    final /* synthetic */ etp b;
    
    public etn(final etp b) {
        this.b = b;
        super("sensor thread");
        this.a = null;
    }
    
    protected final void onLooperPrepared() {
        this.a = kpo.d(this.getLooper());
        final etp b = this.b;
        final SensorManager b2 = b.b;
        b2.registerListener(b.p, b2.getDefaultSensor(1), 1, this.a);
        final etp b3 = this.b;
        final SensorManager b4 = b3.b;
        b4.registerListener(b3.p, b4.getDefaultSensor(4), 1, this.a);
        final etp b5 = this.b;
        final SensorManager b6 = b5.b;
        b6.registerListener(b5.p, b6.getDefaultSensor(2), 3, this.a);
    }
}
