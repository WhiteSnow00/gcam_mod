// 
// Decompiled by Procyon v0.6.0
// 

public final class jdl
{
    public double a;
    public double b;
    public double c;
    public double d;
    
    public final void a(final jdl jdl) {
        this.a = jdl.a;
        this.b = jdl.b;
        this.c = jdl.c;
        this.d = jdl.d;
    }
    
    public final void b(final float[] array) {
        final float n = (float)this.a;
        final float n2 = (float)this.b;
        final float n3 = (float)this.c;
        final float n4 = (float)this.d;
        final float n5 = n + n;
        final float n6 = n2 + n2;
        final float n7 = n3 + n3;
        final float n8 = n5 * n4;
        final float n9 = n6 * n4;
        final float n10 = n4 * n7;
        final float n11 = n5 * n;
        final float n12 = n6 * n;
        final float n13 = n * n7;
        final float n14 = n6 * n2;
        final float n15 = n2 * n7;
        final float n16 = n7 * n3;
        array[0] = 1.0f - (n14 + n16);
        array[1] = n12 + n10;
        array[2] = n13 - n9;
        array[3] = 0.0f;
        array[4] = n12 - n10;
        array[5] = 1.0f - (n16 + n11);
        array[6] = n15 + n8;
        array[7] = 0.0f;
        array[8] = n13 + n9;
        array[9] = n15 - n8;
        array[10] = 1.0f - (n11 + n14);
        array[12] = (array[11] = 0.0f);
        array[14] = (array[13] = 0.0f);
        array[15] = 1.0f;
    }
}
