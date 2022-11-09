import android.hardware.camera2.CaptureResult;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import android.graphics.PointF;
import android.hardware.camera2.params.Face;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ljj
{
    public final Face a;
    public final float b;
    public final float c;
    public final float d;
    private final PointF[] e;
    private final HashMap f;
    
    public ljj(final Face a, final byte[] array, final float[] array2, final float[] array3) {
        this.e = new PointF[array.length];
        this.f = new HashMap();
        for (int i = 0; i < array.length; ++i) {
            this.f.put(array[i], i);
            final PointF[] e = this.e;
            final int n = i + i;
            e[i] = new PointF(array2[n], array2[n + 1]);
        }
        this.a = a;
        this.b = array3[0];
        this.c = array3[1];
        this.d = array3[2];
    }
    
    public static List b(final lji lji) {
        final ArrayList list = new ArrayList();
        final Face[] array = (Face[])lji.d(CaptureResult.STATISTICS_FACES);
        final int[] array2 = (int[])lji.d(jli.m);
        final byte[] array3 = (byte[])lji.d(jli.n);
        final float[] array4 = (float[])lji.d(jli.o);
        final float[] array5 = (float[])lji.d(jli.p);
        final float[] array6 = (float[])lji.d(jli.q);
        if (array != null && array2 != null && array3 != null && array4 != null && array5 != null && array6 != null) {
            final int length = array.length;
            int i = 0;
            int n = 0;
            final byte[] array7 = array3;
            while (i < length) {
                final int n2 = array2[i];
                final byte[] array8 = new byte[n2];
                final int n3 = n2 + n2;
                final float[] array9 = new float[n3];
                final float[] array10 = new float[n2];
                final float[] array11 = new float[3];
                System.arraycopy(array7, n, array8, 0, n2);
                System.arraycopy(array4, n + n, array9, 0, n3);
                System.arraycopy(array5, n, array10, 0, n2);
                System.arraycopy(array6, i * 3, array11, 0, 3);
                n += n2;
                list.add(new ljj(array[i], array8, array9, array11));
                ++i;
            }
        }
        return list;
    }
    
    public final PointF a(final byte b) {
        final HashMap f = this.f;
        final Byte value = b;
        if (f.containsKey(value)) {
            return this.e[(int)this.f.get(value)];
        }
        final StringBuilder sb = new StringBuilder(41);
        sb.append("Landmark:");
        sb.append(b);
        sb.append(" not detected for this face.");
        throw new IllegalArgumentException(sb.toString());
    }
    
    @Override
    public final String toString() {
        return String.format("{ bounds: %s, score: %s, id: %d }", this.a.getBounds(), this.a.getScore(), this.a.getId());
    }
}
