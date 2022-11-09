import java.util.concurrent.ExecutorService;
import android.hardware.camera2.CaptureRequest;
import android.view.View;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bks implements oun
{
    private final pii a;
    private final /* synthetic */ int b;
    
    public bks(final pii a) {
        this.a = a;
    }
    
    public bks(final pii a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public static bks a(final pii pii) {
        return new bks(pii, 1);
    }
    
    public static bks b(final pii pii) {
        return new bks(pii, 20);
    }
}
