import android.hardware.camera2.CameraCharacteristics;
import android.util.Size;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

final class fyv
{
    private final List a;
    
    public fyv(final fxu fxu) {
        final List e = krf.e((Size[])((lff)((lfv)fxu).a).n(CameraCharacteristics.JPEG_AVAILABLE_THUMBNAIL_SIZES, lff.f));
        this.a = e;
        njo.o(e.contains(new kre(0, 0)));
    }
}
