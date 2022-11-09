// 
// Decompiled by Procyon v0.6.0
// 

public final class fam
{
    public final float[] a;
    public final float b;
    public long c;
    public long d;
    public int e;
    public int f;
    
    public fam(final float[] a, final float b) {
        this.c = -1L;
        this.d = -1L;
        this.e = 0;
        this.f = 0;
        njo.e(true, "layFlatDirection must be 3-dimensional");
        final float n = (float)Math.sqrt(a(a, a));
        njo.e(n > 0.0f, "layFlatDirection must be non-zero");
        final float n2 = 1.0f / n;
        a[0] *= n2;
        a[1] *= n2;
        a[2] *= n2;
        this.a = a;
        this.b = b;
    }
    
    public static float a(final float[] array, final float[] array2) {
        return array[0] * array2[0] + array[1] * array2[1] + array[2] * array2[2];
    }
}
