import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mar
{
    public final int a;
    public final lxk b;
    public final int c;
    final /* synthetic */ int d;
    final /* synthetic */ float[] e;
    
    public mar(final int a, final lxk b, final int c, final int d, final float[] e) {
        this.d = d;
        this.e = e;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public static mar a(final float[] array, final int n) {
        final int length = array.length;
        njo.d(length % n == 0);
        return new mar(length / n, lxw.h, n, n, array);
    }
    
    public static mar b(final float... array) {
        return a(array, 2);
    }
    
    public final void c(final int n, final ByteBuffer byteBuffer) {
        int n2 = 0;
        while (true) {
            final int d = this.d;
            if (n2 >= d) {
                break;
            }
            byteBuffer.putFloat(this.e[d * n + n2]);
            ++n2;
        }
    }
    
    @Override
    public final String toString() {
        final int a = this.a;
        final int d = this.d;
        final StringBuilder sb = new StringBuilder(64);
        sb.append("GLVertexData{vertexCount=");
        sb.append(a);
        sb.append(", type=");
        sb.append(d);
        sb.append("D float32}");
        return sb.toString();
    }
}
