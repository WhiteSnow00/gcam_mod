import android.media.Image;
import java.nio.ByteBuffer;
import android.media.ImageReader;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CameraCaptureSession;
import android.os.Handler;
import android.media.ImageReader$OnImageAvailableListener;
import android.hardware.camera2.CameraCaptureSession$CaptureCallback;

// 
// Decompiled by Procyon v0.6.0
// 

final class arc extends CameraCaptureSession$CaptureCallback implements ImageReader$OnImageAvailableListener
{
    final /* synthetic */ Handler a;
    final /* synthetic */ aso b;
    final /* synthetic */ aqu c;
    final /* synthetic */ esn d;
    
    public arc() {
    }
    
    public arc(final aqu c, final esn d, final Handler a, final aso b) {
        this.c = c;
        this.d = d;
        this.a = a;
        this.b = b;
    }
    
    public final void onCaptureStarted(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final long n, final long n2) {
        if (this.d != null) {
            this.a.post((Runnable)new aqr(this));
        }
    }
    
    public final void onImageAvailable(ImageReader acquireNextImage) {
        acquireNextImage = (ImageReader)acquireNextImage.acquireNextImage();
        try {
            if (this.b != null) {
                final ByteBuffer buffer = ((Image)acquireNextImage).getPlanes()[0].getBuffer();
                final byte[] array = new byte[buffer.remaining()];
                buffer.get(array);
                this.a.post((Runnable)new aqs(this, array));
            }
            if (acquireNextImage != null) {
                ((Image)acquireNextImage).close();
            }
        }
        finally {
            try {}
            finally {
                if (acquireNextImage != null) {
                    try {
                        ((Image)acquireNextImage).close();
                    }
                    finally {
                        final Throwable t;
                        final Throwable t2;
                        t.addSuppressed(t2);
                    }
                }
            }
        }
    }
}
