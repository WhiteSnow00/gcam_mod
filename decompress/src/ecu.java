import android.graphics.SurfaceTexture;
import android.graphics.SurfaceTexture$OnFrameAvailableListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class ecu implements SurfaceTexture$OnFrameAvailableListener
{
    final /* synthetic */ ecv a;
    
    public ecu(final ecv a) {
        this.a = a;
    }
    
    public final void onFrameAvailable(final SurfaceTexture surfaceTexture) {
        if (this.a.h.getAndSet(true)) {
            a.l(ecv.a.c(), "Skipped a camera frame", '\u0455');
        }
    }
}
