import java.util.List;
import android.os.Trace;

// 
// Decompiled by Procyon v0.6.0
// 

@pka(b = "androidx.camera.camera2.pipe.compat.Camera2DeviceCache$getCameras$2", c = "Camera2DeviceCache.kt", d = "invokeSuspend", e = {})
final class xt extends pkf implements plc
{
    final /* synthetic */ xu a;
    
    public xt(final xu a, final pjl pjl) {
        this.a = a;
        super(pjl);
    }
    
    public final Object b(final Object o) {
        final pjs a = pjs.a;
        pip.b(o);
        final xu a2 = this.a;
        try {
            Trace.beginSection("readCameraIds");
            final List a3 = a2.a();
            if (!a3.isEmpty()) {
                synchronized (a2.b) {
                    a2.c = a3;
                    return;
                }
            }
            return pja.a;
        }
        finally {
            Trace.endSection();
        }
    }
    
    @Override
    public final pjl c(final Object o, final pjl pjl) {
        return new xt(this.a, pjl);
    }
}
