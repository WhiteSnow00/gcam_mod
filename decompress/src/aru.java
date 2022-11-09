import android.hardware.Camera;
import android.hardware.Camera$Parameters;

// 
// Decompiled by Procyon v0.6.0
// 

final class aru
{
    private Camera$Parameters a;
    private final Camera b;
    
    public aru(final Camera b) {
        this.b = b;
    }
    
    public final Camera$Parameters a() {
        synchronized (this) {
            Camera$Parameters a = this.a;
            if (a == null) {
                a = this.b.getParameters();
                if ((this.a = a) == null) {
                    auc.a(asa.a, "Camera object returned null parameters!");
                    throw new IllegalStateException("camera.getParameters returned null");
                }
            }
            return a;
        }
    }
    
    public final void b() {
        synchronized (this) {
            this.a = null;
        }
    }
}
