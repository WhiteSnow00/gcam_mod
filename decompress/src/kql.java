import android.hardware.camera2.CameraCharacteristics$Key;
import android.hardware.camera2.CameraCharacteristics;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kql
{
    public static final int[] a;
    
    static {
        a = new int[0];
    }
    
    public static final lfu a(final xi xi) {
        final CameraCharacteristics$Key lens_FACING = CameraCharacteristics.LENS_FACING;
        lens_FACING.getClass();
        final Object a = xi.a(lens_FACING);
        a.getClass();
        final int intValue = ((Number)a).intValue();
        if (intValue == 1) {
            return lfu.b;
        }
        if (intValue == 0) {
            return lfu.a;
        }
        return lfu.c;
    }
}
