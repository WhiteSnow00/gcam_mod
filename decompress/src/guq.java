import android.hardware.camera2.CaptureResult$Key;

// 
// Decompiled by Procyon v0.6.0
// 

public final class guq implements fyf
{
    private final CaptureResult$Key a;
    private final Object b;
    
    public guq(final CaptureResult$Key a, final Object b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean a(final ljm ljm) {
        return ljm != null && nqb.E(ljm.d(this.a), this.b);
    }
}
