import android.hardware.camera2.CaptureRequest;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fzo
{
    public static noi a(final boolean b) {
        final Integer value = 1;
        final Integer value2 = 0;
        noi noi;
        if (b) {
            noi = noi.K(kxc.p(CaptureRequest.FLASH_MODE, value2), kxc.p(CaptureRequest.CONTROL_AE_MODE, value), kxc.p(jlg.a, value), kxc.p(CaptureRequest.STATISTICS_OIS_DATA_MODE, value));
        }
        else {
            noi = noi.I(kxc.p(CaptureRequest.FLASH_MODE, value2), kxc.p(CaptureRequest.CONTROL_AE_MODE, value));
        }
        return noi;
    }
}
