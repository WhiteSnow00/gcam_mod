import java.util.concurrent.Semaphore;
import android.graphics.SurfaceTexture;
import com.google.android.libraries.vision.opengl.Texture;
import android.graphics.SurfaceTexture$OnFrameAvailableListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mui implements SurfaceTexture$OnFrameAvailableListener
{
    public static final String a;
    public final Texture b;
    public final SurfaceTexture c;
    public final Semaphore d;
    
    static {
        a = mui.class.getSimpleName();
    }
    
    public mui(final int n, final int n2) {
        this.d = new Semaphore(0);
        final Texture b = new Texture(n, n2, 36197);
        this.b = b;
        (this.c = new SurfaceTexture(b.getName())).setOnFrameAvailableListener((SurfaceTexture$OnFrameAvailableListener)this);
    }
    
    public final void onFrameAvailable(final SurfaceTexture surfaceTexture) {
        this.d.release();
    }
}
