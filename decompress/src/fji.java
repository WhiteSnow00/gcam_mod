import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fji
{
    private final float[] a;
    private final float[] b;
    
    public fji(final float[] a, final float[] b) {
        this.a = a;
        this.b = b;
    }
    
    public final float a(float n) {
        final int binarySearch = Arrays.binarySearch(this.a, n);
        if (binarySearch == -1) {
            return this.b[0];
        }
        if (binarySearch < -201) {
            return this.b[200];
        }
        if (binarySearch >= 0) {
            return this.b[binarySearch];
        }
        final int n2 = -binarySearch - 1;
        final float[] a = this.a;
        final int n3 = n2 - 1;
        final float n4 = a[n3];
        final float[] b = this.b;
        final float n5 = b[n3];
        final float n6 = a[n2];
        final float n7 = b[n2];
        if (n <= n4) {
            n = n5;
        }
        else {
            if (n < n6) {
                return n5 + (n - n4) / (n6 - n4) * (n7 - n5);
            }
            n = n7;
        }
        return n;
    }
}
