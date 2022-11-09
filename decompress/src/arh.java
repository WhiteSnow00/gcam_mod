import android.hardware.Camera$CameraInfo;

// 
// Decompiled by Procyon v0.6.0
// 

final class arh extends atm
{
    private final Camera$CameraInfo a;
    
    public arh(final Camera$CameraInfo a) {
        this.a = a;
    }
    
    @Override
    public final int a() {
        return this.a.orientation;
    }
    
    @Override
    public final boolean b() {
        return this.a.facing == 0;
    }
    
    @Override
    public final boolean c() {
        return this.a.facing == 1;
    }
}
