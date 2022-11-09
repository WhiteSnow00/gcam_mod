import java.util.Set;
import java.util.Collection;
import android.hardware.camera2.CaptureResult;
import java.util.HashSet;
import android.hardware.camera2.CaptureResult$Key;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kzv
{
    private final long a;
    private final int b;
    
    public kzv(final long a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    private static noi f(final int n) {
        final Integer value = 0;
        if (n == 1) {
            return noi.I(value, 3);
        }
        if (g(n)) {
            return noi.K(value, 1, 2, 6);
        }
        return noi.H(value);
    }
    
    private static boolean g(final int n) {
        return n == 4 || n == 3;
    }
    
    public final lao a(final CaptureResult$Key captureResult$Key, final noi noi) {
        return new lao(captureResult$Key, noi, this.a, this.b);
    }
    
    final lap b(final kvr kvr, final boolean b, final boolean b2, final boolean b3) {
        final HashSet set = new HashSet();
        set.add(this.a(CaptureResult.CONTROL_AF_MODE, noi.H(kvr.b())));
        if (b) {
            set.add(this.a(CaptureResult.CONTROL_AF_STATE, f(kvr.b())));
        }
        set.add(this.a(CaptureResult.CONTROL_AE_MODE, noi.H(kvr.a())));
        if (b2) {
            final CaptureResult$Key control_AE_STATE = CaptureResult.CONTROL_AE_STATE;
            noi noi;
            if (kvr.a() != 0) {
                noi = noi.L(0, 1, 2, 4, 5);
            }
            else {
                noi = noi.H(0);
            }
            set.add(this.a(control_AE_STATE, noi));
        }
        set.add(this.a(CaptureResult.CONTROL_AWB_MODE, noi.H(kvr.c())));
        if (b3) {
            final CaptureResult$Key control_AWB_STATE = CaptureResult.CONTROL_AWB_STATE;
            noi noi2;
            if (kvr.c() != 0) {
                noi2 = noi.J(0, 1, 2);
            }
            else {
                noi2 = noi.H(0);
            }
            set.add(this.a(control_AWB_STATE, noi2));
        }
        set.add(this.a(CaptureResult.FLASH_MODE, noi.H(kvr.e())));
        if (kvr.e() == 2) {
            set.add(this.a(CaptureResult.FLASH_STATE, noi.I(3, 0)));
        }
        else if (kvr.e() == 0) {
            set.add(this.a(CaptureResult.FLASH_STATE, noi.I(2, 0)));
        }
        return new lap(noi.F(set));
    }
    
    final lap c(final kvr kvr, final boolean b, final boolean b2, final boolean b3) {
        final HashSet set = new HashSet();
        set.add(this.a(CaptureResult.CONTROL_AF_MODE, noi.H(kvr.b())));
        final Integer value = 2;
        final Integer value2 = 0;
        if (b) {
            final CaptureResult$Key control_AF_STATE = CaptureResult.CONTROL_AF_STATE;
            final int intValue = kvr.b();
            noi noi;
            if (intValue == 1) {
                noi = f(1);
            }
            else if (g(intValue)) {
                noi = noi.J(value2, value, 6);
            }
            else {
                noi = noi.H(value2);
            }
            set.add(this.a(control_AF_STATE, noi));
        }
        set.add(this.a(CaptureResult.CONTROL_AE_MODE, noi.H(kvr.a())));
        if (b2) {
            final CaptureResult$Key control_AE_STATE = CaptureResult.CONTROL_AE_STATE;
            noi noi2;
            if (kvr.a() != 0) {
                noi2 = noi.I(value, 4);
            }
            else {
                noi2 = noi.H(value2);
            }
            set.add(this.a(control_AE_STATE, noi2));
        }
        set.add(this.a(CaptureResult.CONTROL_AWB_MODE, noi.H(kvr.c())));
        if (b3) {
            final CaptureResult$Key control_AWB_STATE = CaptureResult.CONTROL_AWB_STATE;
            noi noi3;
            if (kvr.c() == 1) {
                noi3 = noi.H(value);
            }
            else {
                noi3 = noi.H(value2);
            }
            set.add(this.a(control_AWB_STATE, noi3));
        }
        return new lap(noi.F(set));
    }
    
    final lap d(final kvr kvr, final boolean b, final boolean b2, final boolean b3) {
        return new lap(noi.F(this.e(kvr, b, b2, b3)));
    }
    
    public final Set e(final kvr kvr, final boolean b, final boolean b2, final boolean b3) {
        final HashSet set = new HashSet();
        set.add(this.a(CaptureResult.CONTROL_AF_MODE, noi.H(kvr.b())));
        final Integer value = 0;
        if (b) {
            noi noi;
            if (kvr.b() == 0) {
                noi = noi.H(value);
            }
            else {
                noi = noi.I(4, 5);
            }
            set.add(this.a(CaptureResult.CONTROL_AF_STATE, noi));
        }
        set.add(this.a(CaptureResult.CONTROL_AE_MODE, noi.H(kvr.a())));
        if (b2) {
            noi noi2;
            if (kvr.a() == 0) {
                noi2 = noi.H(value);
            }
            else {
                noi2 = noi.H(3);
            }
            set.add(this.a(CaptureResult.CONTROL_AE_STATE, noi2));
        }
        set.add(this.a(CaptureResult.CONTROL_AWB_MODE, noi.H(kvr.c())));
        if (b3) {
            noi noi3;
            if (kvr.c() == 0) {
                noi3 = noi.H(value);
            }
            else {
                noi3 = noi.H(3);
            }
            set.add(this.a(CaptureResult.CONTROL_AWB_STATE, noi3));
        }
        return set;
    }
}
