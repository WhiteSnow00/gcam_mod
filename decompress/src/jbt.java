import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.PointF;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jbt
{
    private static final nsd a;
    private final gkw b;
    
    static {
        a = nsd.g("com/google/android/apps/camera/uiutils/FocusPointNormalizer");
    }
    
    public jbt(final gkw b) {
        this.b = b;
    }
    
    private static final float b(final float n) {
        return Math.max(0.0f, Math.min(1.0f, n));
    }
    
    public final PointF a(final PointF pointF, final RectF rectF, final lfu lfu) {
        if (pointF.x < 0.0f || pointF.y < 0.0f) {
            a.k(jbt.a.c(), "Negative focus point: %s", pointF, '\u0bc4');
        }
        final float[] array = { b((pointF.x - rectF.left) / rectF.width()), b((pointF.y - rectF.top) / rectF.height()) };
        final int a = this.b.f().a();
        final Matrix matrix = new Matrix();
        matrix.setRotate((float)a, 0.5f, 0.5f);
        matrix.mapPoints(array);
        if (lfu == lfu.a) {
            array[0] = 1.0f - array[0];
        }
        return new PointF(array[0], array[1]);
    }
}
