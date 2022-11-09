import java.util.concurrent.ExecutorService;
import android.os.HandlerThread;
import android.os.SystemClock;
import com.google.android.libraries.performance.primes.transmitter.clearcut.ClearcutMetricSnapshotTransmitter;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kua implements oun
{
    private final /* synthetic */ int a;
    
    public kua() {
    }
    
    public kua(final int a) {
        this.a = a;
    }
    
    public static lmm a() {
        return new lmm();
    }
    
    public static ClearcutMetricSnapshotTransmitter b() {
        return new ClearcutMetricSnapshotTransmitter();
    }
    
    public static lrh c() {
        return new lrh();
    }
}
