import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import com.google.android.apps.camera.camerafatalerror.CameraFatalErrorTrackerDatabase;
import com.google.android.apps.camera.debug.shottracker.db.ShotDatabase;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cbl implements oun
{
    private final pii a;
    private final /* synthetic */ int b;
    
    public cbl(final pii a) {
        this.a = a;
    }
    
    public cbl(final pii a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public static cbl a(final pii pii, final pii pii2, final pii pii3) {
        return new cbl(pii, 13);
    }
}
