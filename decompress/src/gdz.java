import android.util.Pair;
import android.hardware.camera2.CaptureResult;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gdz extends kxc
{
    private final kri a;
    
    public gdz(final kri a) {
        this.a = a;
    }
    
    @Override
    public final void b(final ljm ljm) {
        this.a.aR(gea.a((Float)ljm.d(CaptureResult.LENS_FOCUS_DISTANCE), (Pair)ljm.d(CaptureResult.LENS_FOCUS_RANGE)));
    }
}
