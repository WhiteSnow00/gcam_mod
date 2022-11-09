import android.graphics.SurfaceTexture;
import android.graphics.SurfaceTexture$OnFrameAvailableListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class ory implements SurfaceTexture$OnFrameAvailableListener
{
    final /* synthetic */ orz a;
    
    public ory(final orz a) {
        this.a = a;
    }
    
    public final void onFrameAvailable(final SurfaceTexture surfaceTexture) {
        this.a.d.getAndIncrement();
        synchronized (this.a.k) {
            if (!this.a.j) {
                final osa b = this.a.b;
                if (b != null) {
                    b.b();
                }
            }
        }
    }
}
