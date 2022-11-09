import android.hardware.Camera;
import android.os.Handler;
import android.hardware.Camera$PictureCallback;

// 
// Decompiled by Procyon v0.6.0
// 

final class arv implements Camera$PictureCallback
{
    private final Handler a;
    
    private arv(final Handler a) {
        this.a = a;
    }
    
    public static arv a(final Handler handler, final aso aso) {
        if (handler != null && aso != null) {
            return new arv(handler);
        }
        return null;
    }
    
    public final void onPictureTaken(final byte[] array, final Camera camera) {
        this.a.post((Runnable)new aas(2));
    }
}
