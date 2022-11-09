import android.hardware.camera2.params.MeteringRectangle;
import android.graphics.Rect;
import android.graphics.PointF;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bkw implements fwu
{
    private static final nsd a;
    private final PointF b;
    private final PointF c;
    private final fwx d;
    private final int e;
    
    static {
        a = nsd.g("com/google/android/apps/camera/aaa/PointMeteringParameters");
    }
    
    public bkw(final PointF b, final PointF c, final fwx d, final int e) {
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public static bkw c(final PointF pointF, final PointF pointF2, final int n) {
        final boolean b = true;
        njo.e(n % 90 == 0, "sensorOrientation must be a multiple of 90");
        njo.e(n >= 0 && b, "sensorOrientation must not be negative");
        return new bkw(pointF, pointF2, new fwx(n % 360), 0);
    }
    
    private final MeteringRectangle d(PointF a, final Rect rect) {
        if (rect.width() < 0 || rect.height() < 0) {
            a.k(bkw.a.c(), "Negative cropRegion: %s", rect, '\u0005');
        }
        rect.left = Math.max(0, rect.left);
        rect.top = Math.max(0, rect.top);
        rect.right = Math.max(rect.left, rect.right);
        rect.bottom = Math.max(rect.top, rect.bottom);
        final int max = Math.max(0, Math.min(rect.width(), rect.height()));
        a = this.d.a(a);
        a = new PointF(rect.left + a.x * rect.width(), rect.top + a.y * rect.height());
        final float n = (float)(int)(max * 0.06125f);
        final Rect rect2 = new Rect((int)(a.x - n), (int)(a.y - n), (int)(a.x + n), (int)(a.y + n));
        rect2.left = e(rect2.left, rect.left, rect.right);
        rect2.top = e(rect2.top, rect.top, rect.bottom);
        rect2.right = e(rect2.right, rect.left, rect.right);
        rect2.bottom = e(rect2.bottom, rect.top, rect.bottom);
        int e;
        if ((e = this.e) == 0) {
            e = 122;
        }
        return new MeteringRectangle(rect2, e);
    }
    
    private static final int e(final int n, final int n2, final int n3) {
        return Math.min(Math.max(n, n2), n3);
    }
    
    @Override
    public final MeteringRectangle[] a(final Rect rect) {
        return new MeteringRectangle[] { this.d(this.c, rect) };
    }
    
    @Override
    public final MeteringRectangle[] b(final Rect rect) {
        return new MeteringRectangle[] { this.d(this.b, rect) };
    }
}
