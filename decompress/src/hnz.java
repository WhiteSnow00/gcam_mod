import com.google.googlex.gcam.YuvImage;
import android.graphics.Matrix;
import android.graphics.Bitmap$Config;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.ColorSpace$Named;
import com.google.googlex.gcam.ShotMetadata;
import android.hardware.HardwareBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

final class hnz implements fuj
{
    final /* synthetic */ lju a;
    final /* synthetic */ evj b;
    
    public hnz(final lju a, final evj b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void a(final RuntimeException ex) {
        a.m(hoa.a.b(), "HDR processing failed:", '\u0939', ex);
        this.a.close();
    }
    
    @Override
    public final void b(final HardwareBuffer hardwareBuffer, final ShotMetadata shotMetadata) {
        final Bitmap wrapHardwareBuffer = Bitmap.wrapHardwareBuffer(hardwareBuffer, ColorSpace.get(ColorSpace$Named.SRGB));
        Bitmap bitmap;
        if (wrapHardwareBuffer == null) {
            bitmap = wrapHardwareBuffer;
        }
        else {
            final int b = shotMetadata.b();
            final Bitmap copy = wrapHardwareBuffer.copy(Bitmap$Config.ARGB_8888, true);
            final Matrix matrix = new Matrix();
            matrix.postRotate((float)b);
            bitmap = Bitmap.createBitmap(copy, 0, 0, copy.getWidth(), copy.getHeight(), matrix, true);
        }
        hardwareBuffer.close();
        this.a.close();
        this.b.a(bitmap);
    }
    
    @Override
    public final void c(final YuvImage yuvImage, final ShotMetadata shotMetadata) {
        a.l(hoa.a.b(), "Got unexpected YUV buffer.", '\u093e');
        this.a.close();
        throw new IllegalStateException("Got unexpected YUV buffer.");
    }
    
    @Override
    public final void d(final HardwareBuffer hardwareBuffer, final ShotMetadata shotMetadata) {
        hardwareBuffer.close();
        throw new IllegalStateException("Got unexpected YUV HardwareBuffer.");
    }
}
