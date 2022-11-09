import com.google.android.apps.camera.stats.timing.CameraActivityTiming;
import java.util.concurrent.Executor;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jfw
{
    private final pii a;
    private final pii b;
    private final pii c;
    private final pii d;
    private final pii e;
    
    public jfw(final pii a, final pii b, final pii c, final pii d, final pii e) {
        a.getClass();
        this.a = a;
        b.getClass();
        this.b = b;
        c.getClass();
        this.c = c;
        d.getClass();
        this.d = d;
        e.getClass();
        this.e = e;
    }
    
    public final jfv a(final Set set) {
        set.getClass();
        this.a.get().getClass();
        final kse kse = (kse)this.b.get();
        kse.getClass();
        final Executor executor = (Executor)this.c.get();
        executor.getClass();
        final CameraActivityTiming cameraActivityTiming = (CameraActivityTiming)this.d.get();
        cameraActivityTiming.getClass();
        final crg crg = (crg)this.e.get();
        crg.getClass();
        return new jfv(set, kse, executor, cameraActivityTiming, crg);
    }
}
