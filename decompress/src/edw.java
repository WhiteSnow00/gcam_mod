import com.google.android.libraries.vision.opengl.Texture;
import com.google.android.apps.camera.imax.cyclops.processing.NativeCaptureImpl;

// 
// Decompiled by Procyon v0.6.0
// 

public final class edw implements Runnable
{
    final /* synthetic */ edx a;
    private final /* synthetic */ int b;
    
    public edw(final edx a) {
        this.a = a;
    }
    
    public edw(final edx a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void run() {
        switch (this.b) {
            default: {
                this.a.d.release();
                return;
            }
            case 0: {
                final edx a = this.a;
                final edh d = a.d;
                final Texture i = a.i;
                final edq h = a.h;
                final double max = Math.max((double)Math.round(Math.log(h.a * h.b / 32400) / Math.log(4.0)), 0.0);
                final int name = i.getName();
                final int width = i.getWidth();
                final int height = i.getHeight();
                final NativeCaptureImpl nativeCaptureImpl = (NativeCaptureImpl)d;
                nativeCaptureImpl.initialize(name, width, height, (int)max, nativeCaptureImpl.a, nativeCaptureImpl.b);
            }
        }
    }
}
