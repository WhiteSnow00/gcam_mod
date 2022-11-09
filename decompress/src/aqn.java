import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;

// 
// Decompiled by Procyon v0.6.0
// 

final class aqn implements atn
{
    private final CameraManager a;
    private final String[] b;
    private final int c;
    
    public aqn(final CameraManager a, final String[] b) {
        this.a = a;
        this.b = b;
        int i = 0;
        int c = -1;
        while (i < b.length) {
            int n;
            try {
                final int intValue = (int)a.getCameraCharacteristics(b[i]).get(CameraCharacteristics.LENS_FACING);
                n = c;
                if (c == -1) {
                    if (intValue == 1) {
                        n = i;
                    }
                    else {
                        n = -1;
                    }
                }
            }
            catch (final CameraAccessException ex) {
                final aub a2 = ard.a;
                final StringBuilder sb = new StringBuilder();
                sb.append("Couldn't get characteristics of camera '");
                sb.append(i);
                sb.append("'");
                auc.d(a2, sb.toString(), (Throwable)ex);
                n = c;
            }
            ++i;
            c = n;
        }
        this.c = c;
    }
    
    @Override
    public final int a() {
        return this.c;
    }
    
    @Override
    public final atm b(final int n) {
        final String s = this.b[n];
        try {
            return new aqm(this.a.getCameraCharacteristics(s));
        }
        catch (final CameraAccessException ex) {
            return null;
        }
    }
}
