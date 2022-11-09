import android.hardware.camera2.CameraCharacteristics;

// 
// Decompiled by Procyon v0.6.0
// 

public final class duw
{
    public static final nsd a;
    private static final int[] b;
    
    static {
        a = nsd.g("com/google/android/apps/camera/hdrplus/HdrPlusModule");
        b = new int[0];
    }
    
    public static boolean a(final lfg lfg) {
        final int[] array = (int[])lfg.n(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES, duw.b);
        for (int length = array.length, i = 0; i < length; ++i) {
            if (array[i] == 3) {
                return true;
            }
        }
        return false;
    }
}
