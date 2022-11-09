import android.hardware.camera2.CameraCharacteristics;

// 
// Decompiled by Procyon v0.6.0
// 

public final class boa
{
    public final int a;
    public final boolean b;
    private final lit c;
    
    public boa(final lit c, final int a, final boolean b) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public static int a(final int n, final int n2, final boolean b) {
        int n3 = n2;
        if (b) {
            n3 = (360 - n2) % 360;
        }
        return (n + n3) % 360;
    }
    
    public static int b(final int n, final lfg lfg) {
        final Integer n2 = (Integer)lfg.m(CameraCharacteristics.LENS_FACING);
        final Integer n3 = (Integer)lfg.m(CameraCharacteristics.SENSOR_ORIENTATION);
        boolean b = false;
        if (n2 != null && n3 != null) {
            if (n2 == 0) {
                b = true;
            }
            return a(n3, n, b);
        }
        return 0;
    }
    
    public final klj c() {
        return klq.j(new gku(this.c), new bnz(this));
    }
    
    public final kra d() {
        return kra.b(a(this.a, this.c.a().e, this.b));
    }
}
