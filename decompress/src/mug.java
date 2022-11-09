import java.nio.ByteOrder;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import j$.util.concurrent.ConcurrentHashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mug
{
    @Deprecated
    public mug() {
        new ConcurrentHashMap();
    }
    
    public static FloatBuffer a(final float[] array) {
        final ByteBuffer allocateDirect = ByteBuffer.allocateDirect(array.length * 4);
        allocateDirect.order(ByteOrder.nativeOrder());
        final FloatBuffer floatBuffer = allocateDirect.asFloatBuffer();
        floatBuffer.put(array);
        floatBuffer.position(0);
        return floatBuffer;
    }
    
    public static float[] b(final float n, final float n2) {
        final float[] array = new float[8];
        float n3 = 1.0f;
        final float n4 = -1.0f + n2;
        int n5 = 0;
        int n6 = 0;
        while (true) {
            final float n7 = (float)n5;
            if (n7 > 0.0f) {
                break;
            }
            int n8 = n6;
            if (n5 > 0) {
                final int n9 = n6 + 1;
                array[n6] = array[n9 - 3];
                final int n10 = n9 + 1;
                array[n9] = array[n10 - 3];
                final int n11 = n10 + 1;
                array[n10] = n;
                n8 = n11 + 1;
                array[n11] = n3;
            }
            float n12;
            if (n7 == 0.0f) {
                n12 = n2;
            }
            else {
                n12 = n3 + n4;
            }
            float n13 = n;
            for (int i = 0; i <= 1; ++i, n13 += 1.0f - n) {
                final int n14 = n8 + 1;
                array[n8] = n13;
                final int n15 = n14 + 1;
                array[n14] = n3;
                final int n16 = n15 + 1;
                array[n15] = n13;
                n8 = n16 + 1;
                array[n16] = n12;
            }
            ++n5;
            n3 += n4;
            n6 = n8;
        }
        return array;
    }
    
    public static void c(final boolean b, final String s, final Object... array) {
        if (b) {
            return;
        }
        throw new IllegalArgumentException(String.format(s, array));
    }
}
