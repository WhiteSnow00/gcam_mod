import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

final class ak
{
    final long[] a;
    final boolean[] b;
    final int[] c;
    boolean d;
    boolean e;
    
    public ak(final int n) {
        final long[] a = new long[n];
        this.a = a;
        final boolean[] b = new boolean[n];
        this.b = b;
        this.c = new int[n];
        Arrays.fill(a, 0L);
        Arrays.fill(b, false);
    }
}
