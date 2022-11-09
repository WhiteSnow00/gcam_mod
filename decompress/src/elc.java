import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import android.os.Trace;
import java.util.concurrent.atomic.AtomicBoolean;
import android.content.Context;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class elc
{
    public static final Executor a;
    public final Context b;
    public final AtomicBoolean c;
    
    static {
        a = bsy.a;
    }
    
    public elc(final Context b) {
        this.c = new AtomicBoolean(false);
        this.b = b;
    }
    
    public final void a() {
        Trace.beginSection("prewarmCameraService");
        try {
            ((CameraManager)this.b.getSystemService("camera")).getCameraIdList();
        }
        catch (final CameraAccessException ex) {}
        Trace.endSection();
    }
}
