import com.google.android.libraries.camera.jni.yuv.YuvUtilNative;
import com.google.android.libraries.camera.jni.surface.SurfaceNative;
import com.google.android.apps.camera.jni.tracking.RoiTrackerNative;
import com.google.android.libraries.camera.gyro.hardwarebuffer.ReadHardwareBufferJniFunctions;
import com.google.android.apps.camera.jni.federatedphoto.ModeSuggestionClient;
import com.google.android.apps.camera.jni.microvideotonemap.MicrovideoToneMapNative;
import com.google.android.apps.camera.jni.mallopt.Mallopt;
import com.google.android.apps.camera.jni.lensoffset.LensOffsetQueueNative;
import com.google.android.libraries.camera.jni.jpeg.JpegUtilNative;
import com.google.android.apps.camera.processing.imagebackend.ImgUtilNative;
import com.google.android.libraries.camera.jni.graphics.HardwareBuffers;
import com.google.android.apps.camera.jni.gyro.GyroQueueNative;
import com.google.android.apps.camera.jni.facebeautification.GpuRetoucherNative;
import com.google.android.apps.camera.jni.eisutil.FrameUtilNative;
import com.google.android.apps.camera.moments.FastMomentsHdrImpl;
import com.google.android.apps.camera.processing.imagebackend.FaceUtilNative;
import com.google.android.apps.camera.jni.facebeautification.FaceBeautificationNative;
import com.google.android.apps.camera.jni.eis.EisNative;
import com.google.android.libraries.oliveoil.bufferflinger.BufferFlinger;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ehh
{
    public static final nns a;
    
    static {
        a = nns.r(BufferFlinger.class, cua.class, dew.class, EisNative.class, FaceBeautificationNative.class, FaceUtilNative.class, FastMomentsHdrImpl.class, FrameUtilNative.class, egz.class, GpuRetoucherNative.class, GyroQueueNative.class, HardwareBuffers.class, ImgUtilNative.class, JpegUtilNative.class, LensOffsetQueueNative.class, Mallopt.class, MicrovideoToneMapNative.class, ModeSuggestionClient.class, ReadHardwareBufferJniFunctions.class, hbk.class, RoiTrackerNative.class, SurfaceNative.class, YuvUtilNative.class);
    }
}
