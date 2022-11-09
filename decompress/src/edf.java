import android.hardware.camera2.CameraCharacteristics;
import android.util.SizeF;

// 
// Decompiled by Procyon v0.6.0
// 

public final class edf
{
    public final lfg a;
    public final edq b;
    public final cxl c;
    private final lfj d;
    
    public edf(final lfh lfh, final cxl c) {
        this.c = c;
        final lfj e = lfh.e(lfu.b);
        nov.z(e);
        this.d = e;
        final lfg a = lfh.a(e);
        this.a = a;
        final edq b = new edq();
        final kre c2 = kmv.h.c();
        b.a = c2.a;
        b.b = c2.b;
        b.e = false;
        b.c = a.f();
        final SizeF sizeF = (SizeF)a.m(CameraCharacteristics.SENSOR_INFO_PHYSICAL_SIZE);
        nov.z(sizeF);
        b.d = ((float[])nov.z(a.m(CameraCharacteristics.LENS_INFO_AVAILABLE_FOCAL_LENGTHS)))[0] * 36.0f / sizeF.getWidth();
        this.b = b;
    }
    
    public final double a() {
        final float d = this.b.d;
        final double atan = Math.atan(36.0f / (d + d));
        return Math.toDegrees(atan + atan);
    }
}
