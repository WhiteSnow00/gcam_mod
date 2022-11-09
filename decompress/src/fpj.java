import java.util.Set;
import com.google.android.apps.camera.stats.timing.CameraActivityTiming;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fpj implements oun
{
    private final pii a;
    private final pii b;
    private final pii c;
    private final pii d;
    private final pii e;
    
    public fpj(final pii a, final pii b, final pii c, final pii d, final pii e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public final niz a() {
        final Set a = ((ous)this.a).a();
        final cxl cxl = (cxl)this.b.get();
        final kse kse = (kse)this.c.get();
        final CameraActivityTiming cameraActivityTiming = (CameraActivityTiming)this.d.get();
        final crg crg = (crg)this.e.get();
        if (!a.isEmpty()) {
            final cxo a2 = cwv.a;
            cxl.b();
        }
        return nii.a;
    }
}
