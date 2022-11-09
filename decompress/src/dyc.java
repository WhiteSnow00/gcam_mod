import android.graphics.RectF;
import android.graphics.Rect;
import android.hardware.camera2.params.Face;
import android.hardware.camera2.CaptureResult;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dyc implements dyn
{
    private final String a;
    private final String b;
    private final lfg c;
    private final lfg d;
    
    public dyc(final jcx jcx, final Map map) {
        final kwz kwz = map.get(gti.c);
        kwz.getClass();
        final String a = kwz.c().a;
        this.a = a;
        final kwz kwz2 = map.get(gti.b);
        kwz2.getClass();
        final String a2 = kwz2.c().a;
        this.b = a2;
        this.c = jcx.a(a);
        this.d = jcx.a(a2);
    }
    
    private static final float b(final int n, final int n2, final float n3, final float n4) {
        final double radians = Math.toRadians(0.5);
        final double n5 = n4;
        Double.isNaN(n5);
        final double tan = Math.tan(n5 * radians);
        final double n6 = n3;
        Double.isNaN(n6);
        final double n7 = tan / Math.tan(n6 * radians);
        final double n8 = n / (float)n2;
        Double.isNaN(n8);
        return (float)(1.0 / (n7 * n8));
    }
    
    private static final float c(final lji lji, final lfg lfg) {
        final Float n = (Float)lji.d(CaptureResult.LENS_FOCAL_LENGTH);
        n.getClass();
        final float floatValue = n;
        final double n2 = lfe.c(lfg) / 2.0;
        final double n3 = floatValue;
        Double.isNaN(n3);
        final double atan = Math.atan(n2 / n3);
        return (float)Math.toDegrees(atan + atan);
    }
    
    @Override
    public final niz a(final kvs kvs) {
        final ljm c = kvs.c();
        c.getClass();
        final lji lji = c.h().get(this.a);
        final ljm c2 = kvs.c();
        c2.getClass();
        final lji lji2 = c2.h().get(this.b);
        lji.getClass();
        lji2.getClass();
        final Rect h = this.c.h();
        final Rect h2 = this.d.h();
        final Face[] array = (Face[])lji.d(CaptureResult.STATISTICS_FACES);
        array.getClass();
        final Face[] array2 = array;
        Rect rect = new Rect();
        final int length = array2.length;
        float n = -1.0f;
        float n3;
        for (int i = 0; i < length; ++i, n = n3) {
            final Rect bounds = array2[i].getBounds();
            final float n2 = (float)((bounds.right - bounds.left) * (bounds.bottom - bounds.top));
            if (n2 > n) {
                rect = bounds;
            }
            n3 = n;
            if (n2 > n) {
                n3 = n2;
            }
        }
        final Rect rect2 = new Rect(0, 0, 1512, 1512);
        rect2.offset(rect.centerX() - rect2.centerX(), rect.centerY() - rect2.centerY());
        rect2.inset(-Math.max(rect2.right - h.right, 0), -Math.max(rect2.bottom - h.bottom, 0), Math.max(rect2.right - h.right, 0), Math.max(rect2.bottom - h.bottom, 0));
        rect2.inset(-Math.min(rect2.left - h.left, 0), -Math.min(rect2.top - h.top, 0), Math.min(rect2.left - h.left, 0), Math.min(rect2.top - h.top, 0));
        final int n4 = (int)(rect2.width() * 0.2f);
        final int n5 = (int)(rect2.height() * 0.2f);
        final Rect rect3 = new Rect(rect2.left - n4, rect2.top - n5, rect2.right + n4, rect2.bottom + n5);
        final float c3 = c(lji, this.c);
        final float c4 = c(lji2, this.d);
        final float b = b(h.height(), h2.height(), c3, c4);
        final float b2 = b(h.width(), h2.width(), c3, c4);
        final Rect rect4 = new Rect(0, 0, (int)(rect3.width() * b2), (int)(rect3.height() * b));
        rect4.offset((int)((rect3.centerX() - h.centerX()) * b2) + h2.centerX() - rect4.centerX(), (int)((rect3.centerY() - h.centerY()) * b) + h2.centerY() - rect4.centerY());
        rect4.setIntersect(rect4, h2);
        return niz.i(new RectF(rect4.left / (float)h2.width(), rect4.top / (float)h2.height(), rect4.right / (float)h2.width(), rect4.bottom / (float)h2.height()));
    }
}
