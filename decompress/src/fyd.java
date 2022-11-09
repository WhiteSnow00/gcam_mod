import android.hardware.camera2.CaptureRequest;
import android.graphics.Rect;
import android.hardware.camera2.params.Face;
import android.util.Pair;
import android.hardware.camera2.CaptureResult;
import java.util.concurrent.ExecutorService;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fyd implements oun
{
    private final /* synthetic */ int a;
    
    public fyd() {
    }
    
    public fyd(final int a) {
        this.a = a;
    }
    
    public static ExecutorService a() {
        final ExecutorService e = mcn.e("CameraEx");
        pqf.k(e);
        return e;
    }
    
    public static final gbo b() {
        return new gbo();
    }
    
    public static fyd c(final pii pii) {
        return new fyd(8);
    }
    
    public static gko d() {
        return new gko();
    }
    
    public static hny e() {
        return new hny();
    }
}
