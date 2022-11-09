import java.nio.ByteBuffer;
import com.google.googlex.gcam.MeshWarp;
import com.google.android.apps.camera.jni.facebeautification.FaceBeautificationNative;
import android.graphics.Point;
import com.google.android.apps.camera.jni.facebeautification.FaceInfo;
import android.graphics.Rect;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.params.Face;
import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

final class dhr implements Callable
{
    private final long a;
    private final diz b;
    private final int c;
    
    public dhr(final long a, final diz b, final int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
}
