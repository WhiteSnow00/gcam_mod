import java.util.concurrent.Executor;
import com.google.android.apps.camera.stats.timing.CameraActivityTiming;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bnu implements bsk
{
    public final CameraActivityTiming a;
    private final bnl b;
    
    public bnu(final bnl b, final CameraActivityTiming a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final oey aP() {
        this.a.j(hvu.c, CameraActivityTiming.b);
        return odg.h(this.b.a(), new bnt(this), odx.a);
    }
}
