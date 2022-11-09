import com.google.android.libraries.camera.exif.ExifInterface;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jdi
{
    private final cxl a;
    
    public jdi(final cxl a) {
        this.a = a;
    }
    
    public final void a(final ExifInterface exifInterface) {
        final cxl a = this.a;
        final cxo a2 = cxr.a;
        a.e();
        exifInterface.p(ExifInterface.f);
        if (!this.a.k(cxr.aa)) {
            return;
        }
        exifInterface.y(exifInterface.i(ExifInterface.h, "QCAM-AA"));
        exifInterface.y(exifInterface.i(ExifInterface.g, "QCAM-AA"));
    }
}
