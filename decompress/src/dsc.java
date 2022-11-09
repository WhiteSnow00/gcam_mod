import java.util.List;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dsc
{
    public final int a;
    private final lyp b;
    private final short[] c;
    private final float[] d;
    private final float[] e;
    
    public dsc(final lyp b, int a) {
        njo.o(a > 0);
        this.b = b;
        this.a = a;
        final short[] c = new short[a * 6];
        for (int i = 0; i < a + a; ++i) {
            for (int j = 0; j < 3; ++j) {
                c[i * 3 + j] = (short)(i + j);
            }
        }
        this.c = c;
        ++a;
        this.e = c(-1.0f, 1.0f, -1.0f, a, 4);
        this.d = c(0.0f, 0.0f, 1.0f, a, 2);
    }
    
    private static float[] c(final float n, float n2, float n3, final int n4, final int n5) {
        final float n6 = (n3 - n2) / (n4 - 1);
        final float[] array = new float[(n4 + n4) * n5];
        int i = 0;
        int n7 = 0;
        while (i < n4) {
            n3 = n;
            int n8 = 0;
            while (true) {
                int j = 2;
                if (n8 >= 2) {
                    break;
                }
                array[n7] = n3;
                array[n7 + 1] = n2;
                n3 += 1.0f - n;
                if (n5 > 2) {
                    while (j < n5 - 1) {
                        array[n7 + 2] = 0.0f;
                        j = 3;
                    }
                    array[n7 + n5 - 1] = 1.0f;
                }
                n7 += n5;
                ++n8;
            }
            n2 += n6;
            ++i;
        }
        return array;
    }
    
    public final lzr a() {
        final lyp b = this.b;
        final short[] c = this.c;
        final int length = c.length;
        final ByteBuffer order = ByteBuffer.allocate(length + length).order(ByteOrder.nativeOrder());
        order.asShortBuffer().put(c);
        return new lzr(lyh.b(b, 34963, order), length);
    }
    
    public final maq b(final List list) {
        njo.o(list.size() == this.a);
        final float[] e = this.e;
        final float[] array = new float[e.length];
        for (int size = list.size(), i = 0; i <= size; ++i) {
            lyb lyb;
            if (i > 0) {
                lyb = list.get(i - 1);
            }
            else {
                lyb = list.get(0);
            }
            for (int j = 0; j < 2; ++j) {
                final int n = j * 4 + i * 8;
                final float n2 = e[n];
                final float[] c = lyb.c;
                final int n3 = n + 1;
                final int n4 = n + 3;
                array[n] = n2 * c[0] + e[n3] * c[1] + e[n4] * c[2];
                array[n3] = e[n] * c[3] + e[n3] * c[4] + e[n4] * c[5];
                array[n + 2] = 0.0f;
                array[n4] = e[n] * c[6] + e[n3] * c[7] + e[n4] * c[8];
            }
        }
        return maq.e(this.b, mar.a(array, 4), mar.b(this.d));
    }
}
