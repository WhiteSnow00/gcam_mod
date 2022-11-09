import com.google.googlex.gcam.InterleavedWriteViewU8;
import com.google.android.apps.camera.rectiface.Rectiface$RectifaceProgressCallback;
import com.google.googlex.gcam.YuvWriteView;
import com.google.googlex.gcam.ShotMetadata;
import android.graphics.Bitmap;
import com.google.googlex.gcam.InterleavedImageU8;
import android.hardware.HardwareBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public interface hbb extends AutoCloseable
{
    hbj c();
    
    InterleavedImageU8 d(final HardwareBuffer p0);
    
    void e(final Bitmap p0, final ShotMetadata p1);
    
    void f(final YuvWriteView p0, final ShotMetadata p1);
    
    void g();
    
    boolean h(final HardwareBuffer p0, final HardwareBuffer p1, final ShotMetadata p2);
    
    boolean i();
    
    void j(final HardwareBuffer p0, final ShotMetadata p1, final boolean p2, final String p3, final hbj p4, final huz p5, final Rectiface$RectifaceProgressCallback p6);
    
    void k(final InterleavedWriteViewU8 p0, final ShotMetadata p1, final boolean p2, final String p3, final hbj p4, final huz p5, final Rectiface$RectifaceProgressCallback p6);
}
