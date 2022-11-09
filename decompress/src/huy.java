import android.view.Choreographer$FrameCallback;
import android.view.Choreographer;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

final class huy implements hub
{
    public static final nsd a;
    public static final long b;
    public final List c;
    public final ofn d;
    private final kjm e;
    
    static {
        a = nsd.g("com/google/android/apps/camera/stats/CameraActivitySettlementDetector");
        b = TimeUnit.MILLISECONDS.toNanos(30L);
    }
    
    public huy(final kjm e) {
        this.c = new ArrayList();
        this.d = ofn.f();
        this.e = e;
    }
    
    public final void a() {
        Choreographer.getInstance().postFrameCallback((Choreographer$FrameCallback)new huw(this));
    }
    
    @Override
    public final void run() {
        this.e.execute(new hux(this));
    }
}
