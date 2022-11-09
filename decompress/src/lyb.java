import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lyb
{
    public static final lyb a;
    public static final lyb b;
    public final float[] c;
    
    static {
        a = a(new float[] { 1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 1.0f });
        b = a(new float[] { -1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f });
    }
    
    private lyb(final float[] c) {
        njo.d(c.length == 9);
        this.c = c;
    }
    
    public static lyb a(final float[] array) {
        return new lyb(Arrays.copyOf(array, array.length));
    }
    
    public static lyb b() {
        return a(new float[] { 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f });
    }
    
    public final lyb c(final lyb lyb) {
        final float[] d = lyb.d();
        final float[] array = new float[9];
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 3; ++j) {
                for (int k = 0; k < 3; ++k) {
                    final int n = i * 3;
                    final int n2 = n + j;
                    array[n2] += this.c[k * 3 + j] * d[n + k];
                }
            }
        }
        return a(array);
    }
    
    public final float[] d() {
        final float[] c = this.c;
        return Arrays.copyOf(c, c.length);
    }
    
    public final float[] e(final float[] array) {
        final float[] c = this.c;
        final float n = c[6];
        final float n2 = array[0];
        final float n3 = c[7];
        final float n4 = array[1];
        final float n5 = n * n2 + n3 * n4 + c[8];
        return new float[] { (c[0] * n2 + c[1] * n4 + c[2]) / n5, (c[3] * array[0] + c[4] * array[1] + c[5]) / n5 };
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o == this || (o instanceof lyb && Arrays.equals(this.c, ((lyb)o).c));
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(this.c);
    }
    
    @Override
    public final String toString() {
        final float[] c = this.c;
        final float n = c[0];
        final float n2 = c[1];
        final float n3 = c[2];
        final float n4 = c[3];
        final float n5 = c[4];
        final float n6 = c[5];
        final float n7 = c[6];
        final float n8 = c[7];
        final float n9 = c[8];
        final StringBuilder sb = new StringBuilder(153);
        sb.append("[");
        sb.append(n);
        sb.append(", ");
        sb.append(n2);
        sb.append(", ");
        sb.append(n3);
        sb.append("; ");
        sb.append(n4);
        sb.append(", ");
        sb.append(n5);
        sb.append(", ");
        sb.append(n6);
        sb.append("; ");
        sb.append(n7);
        sb.append(", ");
        sb.append(n8);
        sb.append(", ");
        sb.append(n9);
        sb.append("]");
        return sb.toString();
    }
}
