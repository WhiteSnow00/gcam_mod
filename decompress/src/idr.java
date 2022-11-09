import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class idr
{
    public static byte[] a;
    public static float[] b;
    public static float[] c;
    public final ByteBuffer d;
    public final idt e;
    public final egv f;
    public final hny g;
    public final jvh h;
    
    public idr(final jvh h, int n, final int n2, final hny g, final egv f, final byte[] array, final byte[] array2, final byte[] array3) {
        this.e = new idt(h, n, n2, null, null);
        n *= n2;
        idr.a = new byte[n];
        idr.b = new float[9];
        idr.c = new float[576];
        this.g = g;
        this.f = f;
        this.d = ByteBuffer.allocateDirect(n * 3);
        this.h = h;
    }
}
