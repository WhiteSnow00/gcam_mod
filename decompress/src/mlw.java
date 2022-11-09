import java.util.Random;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mlw
{
    public final short[] a;
    public final short[] b;
    public final int c;
    public long d;
    
    public mlw(final Random random) {
        this.a = new short[256];
        this.b = new short[256];
        this.c = ((random.nextInt() & 0xFFFDFFFD) | 0x10001);
        this.d = 0L;
    }
}
