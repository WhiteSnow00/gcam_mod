import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.Set;
import com.google.android.apps.camera.stats.timing.CameraActivityTiming;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jfv implements jgf
{
    public static final nsd a;
    public final CameraActivityTiming b;
    private final Set c;
    private final kse d;
    private final Executor e;
    private final crg f;
    
    static {
        a = nsd.g("com/google/android/apps/camera/viewfindereffects/ViewfinderEffectsRunner");
    }
    
    public jfv(final Set c, final kse d, final Executor e, final CameraActivityTiming b, final crg f) {
        this.c = c;
        this.d = d;
        this.e = e;
        this.b = b;
        this.f = f;
    }
}
