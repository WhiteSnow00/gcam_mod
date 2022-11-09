import android.hardware.camera2.CameraCharacteristics;

// 
// Decompiled by Procyon v0.6.0
// 

final class aqm extends atm
{
    private final CameraCharacteristics a;
    
    public aqm(final CameraCharacteristics a) {
        this.a = a;
    }
    
    @Override
    public final int a() {
        return (int)this.a.get(CameraCharacteristics.SENSOR_ORIENTATION);
    }
    
    @Override
    public final boolean b() {
        return ((Integer)this.a.get(CameraCharacteristics.LENS_FACING)).equals(1);
    }
    
    @Override
    public final boolean c() {
        return ((Integer)this.a.get(CameraCharacteristics.LENS_FACING)).equals(0);
    }
}
