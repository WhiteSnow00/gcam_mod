import android.hardware.camera2.CameraManager;

// 
// Decompiled by Procyon v0.6.0
// 

public final class xz implements pii
{
    final /* synthetic */ ya a;
    
    public xz(final ya a) {
        this.a = a;
    }
    
    @Override
    public final Object get() {
        final ya a = this.a;
        CameraManager a2 = a.a;
        if (a2 == null) {
            final Object systemService = a.a().getSystemService("camera");
            if (systemService == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.hardware.camera2.CameraManager");
            }
            a2 = (CameraManager)systemService;
            a.a = a2;
        }
        return a2;
    }
}
