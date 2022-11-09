import android.graphics.Rect;
import android.graphics.PointF;
import android.hardware.camera2.params.MeteringRectangle;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bky
{
    private final gir a;
    private final fxu b;
    private final liy c;
    private final cxl d;
    private final gko e;
    
    public bky(final gir a, final gko e, final fxu b, final liy c, final cxl d, final byte[] array) {
        this.a = a;
        this.e = e;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    private final MeteringRectangle[] e(final fwu fwu) {
        if (gir.g(this.b, this.d) && this.c.g) {
            return fwu.b(this.a.d().a);
        }
        return fwu.b(((giq)this.a.aQ()).a);
    }
    
    private final MeteringRectangle[] f(final PointF pointF, final int n) {
        final int f = this.b.f();
        final boolean b = true;
        njo.e(f % 90 == 0, "sensorOrientation must be a multiple of 90");
        njo.e(f >= 0 && b, "sensorOrientation must not be negative");
        return this.e(new bkw(pointF, pointF, new fwx(f % 360), n));
    }
    
    public final MeteringRectangle[] a() {
        fws.c();
        final Rect a = ((giq)this.a.aQ()).a;
        return fws.a;
    }
    
    public final MeteringRectangle[] b(final PointF pointF) {
        return this.e(bkw.c(pointF, pointF, this.b.f()));
    }
    
    public final MeteringRectangle[] c(final PointF pointF) {
        return this.f(pointF, 2);
    }
    
    public final MeteringRectangle[] d(final PointF pointF) {
        return this.f(pointF, 1);
    }
}
