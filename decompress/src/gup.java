import android.hardware.camera2.CaptureResult$Key;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gup implements fyf
{
    private final CaptureResult$Key a;
    private final long b;
    
    public gup(final CaptureResult$Key a, final long b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean a(final ljm ljm) {
        if (ljm == null) {
            return false;
        }
        final Long n = (Long)ljm.d(this.a);
        return n != null && n > this.b;
    }
}
