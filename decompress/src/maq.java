import java.util.Arrays;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class maq implements luy
{
    public final lyh a;
    public final lxk[] b;
    public final int c;
    private final int[] d;
    
    public maq(final lyh a, final lxk[] b, final int[] d, final int c) {
        njo.d(b.length == d.length);
        this.a = a;
        this.b = b;
        this.d = d;
        this.c = c;
    }
    
    public static maq e(final lyp lyp, final mar... array) {
        final int a = array[0].a;
        final lxk[] array2 = new lxk[2];
        final int[] array3 = new int[2];
        int i = 0;
        int n = 0;
        while (i < 2) {
            final mar mar = array[i];
            final lxk b = mar.b;
            final int c = mar.c;
            n += c * 32 * a;
            array2[i] = b;
            array3[i] = c;
            ++i;
        }
        final ByteBuffer order = ByteBuffer.allocateDirect(n / 8).order(ByteOrder.nativeOrder());
        for (int j = 0; j < 2; ++j) {
            final mar mar2 = array[j];
            for (int k = 0; k < a; ++k) {
                mar2.c(k, order);
            }
        }
        order.rewind();
        return new maq(lyh.b(lyp, 34962, order), array2, array3, a);
    }
    
    public static maq f(final lyp lyp, final mar mar) {
        final int a = mar.a;
        final int c = mar.c;
        final lxk b = mar.b;
        int i = 0;
        final ByteBuffer order = ByteBuffer.allocateDirect(c * 32 * a / 8).order(ByteOrder.nativeOrder());
        while (i < a) {
            mar.c(i, order);
            ++i;
        }
        order.rewind();
        return new maq(lyh.b(lyp, 34962, order), new lxk[] { b }, new int[] { c }, a);
    }
    
    @Override
    public final lwk a() {
        return this.a.a();
    }
    
    public final int b(final int n) {
        return this.d(n).a() * this.c(n) / 8;
    }
    
    public final int c(final int n) {
        return this.d[n];
    }
    
    @Override
    public final void close() {
        this.a.close();
    }
    
    public final lxk d(final int n) {
        return this.b[n];
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final String string = Arrays.toString(this.b);
        final String string2 = Arrays.toString(this.d);
        final int c = this.c;
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 83 + String.valueOf(string).length() + String.valueOf(string2).length());
        sb.append("GLVertexArray{buffer=");
        sb.append(value);
        sb.append(", types=");
        sb.append(string);
        sb.append(", dimensions=");
        sb.append(string2);
        sb.append(", count=");
        sb.append(c);
        sb.append(", isInterleaved=false}");
        return sb.toString();
    }
}
