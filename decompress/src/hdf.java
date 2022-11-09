import android.hardware.camera2.params.Face;
import android.hardware.camera2.CaptureResult;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hdf implements hdg
{
    private final /* synthetic */ int a;
    
    public hdf() {
    }
    
    public hdf(final int a) {
        this.a = a;
    }
    
    @Override
    public final float a(final ljm ljm) {
        final int a = this.a;
        final float n = 0.0f;
        float n2 = Float.NaN;
        switch (a) {
            default: {
                final Integer n3 = (Integer)ljm.d(CaptureResult.LENS_STATE);
                float n4;
                if (n3 == null) {
                    n4 = 1.0f;
                }
                else {
                    if (n3 == 0) {
                        return 1.0f;
                    }
                    n4 = n;
                }
                return n4;
            }
            case 3: {
                final Face[] array = (Face[])ljm.d(CaptureResult.STATISTICS_FACES);
                if (array != null) {
                    return (float)array.length;
                }
                return Float.NaN;
            }
            case 2: {
                final Integer n5 = (Integer)ljm.d(CaptureResult.CONTROL_AWB_STATE);
                if (n5 != null) {
                    if (n5 != 2 && n5 != 3) {
                        return 0.0f;
                    }
                    n2 = 1.0f;
                }
                return n2;
            }
            case 1: {
                final Integer n6 = (Integer)ljm.d(CaptureResult.CONTROL_AE_STATE);
                if (n6 != null) {
                    if (n6 != 2 && n6 != 3) {
                        return 0.0f;
                    }
                    n2 = 1.0f;
                }
                return n2;
            }
            case 0: {
                final Integer n7 = (Integer)ljm.d(CaptureResult.CONTROL_AF_STATE);
                if (n7 != null) {
                    if (n7 != 4 && n7 != 2) {
                        return 0.0f;
                    }
                    n2 = 1.0f;
                }
                return n2;
            }
        }
    }
}
