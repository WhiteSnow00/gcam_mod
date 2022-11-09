import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Set;
import android.util.SizeF;
import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dte
{
    public static final nsd a;
    public final eha b;
    public final int c;
    public final kre d;
    public final Object e;
    public final AtomicReference f;
    private final ehf g;
    private final SizeF h;
    private final kre i;
    private final float j;
    private final Set k;
    
    static {
        a = nsd.g("com/google/android/apps/camera/gyro/motionestimator/GyroTransformCalculator");
    }
    
    public dte(final SizeF h, final kre d, final kre i, final int c, final eha b, final ehf g, final Set k) {
        this.e = new Object();
        this.f = new AtomicReference();
        njo.d(true);
        this.h = h;
        this.d = d;
        this.i = i;
        this.c = c;
        this.b = b;
        this.g = g;
        this.k = k;
        final float n = h.getWidth() / h.getHeight();
        final float n2 = d.a / (float)d.b;
        this.j = (n2 / n - 1.0f) / ((n2 + n2) / n);
        final ArrayList list = new ArrayList(c);
        for (int j = 0; j < c; ++j) {
            list.add(null);
        }
        this.f.set(list);
    }
    
    public static long d(final long n, final long n2, final long n3) {
        return n + (n2 + n3) / 2L;
    }
    
    public final float a(final float n, final float n2, final float[] array) {
        return 1.0f / (1.0f / n - n2 / 1000.0f) * this.d.a / this.h.getWidth() * ((array[0] + array[1]) * 0.5f);
    }
    
    public final long b(final long n, final float[] array) {
        final float j = this.j;
        return (long)(n * (1.0f - (j + j)) / array[1]);
    }
    
    public final long c(final long n, final long n2, final float[] array) {
        long n3 = n;
        if (n > 0L) {
            final float n4 = (float)n2;
            n3 = n + (long)(this.j * n4) + (long)((0.5f - 0.5f / array[1]) * n4);
        }
        return n3;
    }
    
    public final float[] e(final String s, long d, final long n, final long n2, final kre kre, final float[] array, final boolean b) {
        final float[] array3;
        final float[] array2 = array3 = new float[2];
        array3[1] = (array3[0] = 0.0f);
        float[] array4;
        if (s != null && this.k.contains(s)) {
            array4 = array2;
        }
        else if (d >= 0L) {
            d = d(d, n, n2);
            if (b) {
                array4 = this.g.b(d, n2);
            }
            else {
                array4 = this.g.a(d);
            }
        }
        else {
            array4 = array2;
        }
        return new float[] { (kre.a - 1) * (array4[0] * array[0] + 0.5f), (kre.b - 1) * (array4[1] * array[1] + 0.5f) };
    }
    
    public final float[] f(final Rect rect) {
        final float[] array2;
        final float[] array = array2 = new float[2];
        array2[1] = (array2[0] = 1.0f);
        if (rect != null) {
            array[0] = this.i.a / (float)(rect.right - rect.left);
            array[1] = this.i.b / (float)(rect.bottom - rect.top);
        }
        return array;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.d);
        final String value2 = String.valueOf(this.h);
        final int c = this.c;
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 113 + String.valueOf(value2).length());
        sb.append("AbsoluteGyroTransformCalculator{imageSize=");
        sb.append(value);
        sb.append(", sensorSize=");
        sb.append(value2);
        sb.append(", timeoutMs=0, numOfStrips=");
        sb.append(c);
        sb.append('}');
        return sb.toString();
    }
}
