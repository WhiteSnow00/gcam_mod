import java.util.Random;

// 
// Decompiled by Procyon v0.6.0
// 

final class mmk extends mmm
{
    private final Random a;
    private final lmy b;
    private final long c;
    private final mlw d;
    
    public mmk(final pso pso, final Random a, final mlw d, final lmy b) {
        super(pso);
        this.a = a;
        this.c = pso.b;
        this.d = d;
        this.b = b;
    }
    
    @Override
    public final long a(final String s) {
        long c;
        if (njb.d(s)) {
            c = this.c;
        }
        else {
            final mlw d = this.d;
            final long n = this.b.b() - d.d;
            final int n2 = 0;
            if (n >= 14400000L) {
                final long n3 = n / 14400000L;
                final long max = Math.max(n3, 15L);
                for (int i = 0; i < 256; ++i) {
                    final short[] a = d.a;
                    final int n4 = (int)max;
                    final int n5 = a[i] >> n4;
                    a[i] = (short)n5;
                    d.b[i] = (short)(n5 >> n4);
                }
                d.d += n3 * 14400000L;
            }
            final int n6 = s.hashCode() * d.c;
            int char1;
            if (s.isEmpty()) {
                char1 = n2;
            }
            else {
                char1 = s.charAt(0);
            }
            final int n7 = (n6 >>> 24) + char1 & 0xFF;
            final int n8 = (n6 >>> 16) + s.length() & 0xFF;
            final int min = Math.min(d.a[n7], d.b[n8]);
            final int n9 = min + 1;
            final short n10 = (short)Math.min(32767, n9);
            final short[] a2 = d.a;
            if (a2[n7] == min) {
                a2[n7] = n10;
            }
            final short[] b = d.b;
            if (b[n8] == min) {
                b[n8] = n10;
            }
            c = (int)(this.c / (float)Math.sqrt(n9));
        }
        if (this.a.nextFloat() * 1000.0f < c) {
            return c;
        }
        return -1L;
    }
    
    @Override
    public final boolean b() {
        return this.c > 0L;
    }
    
    @Override
    public final pso c() {
        pso pso;
        if (this.b()) {
            pso = this.e();
        }
        else {
            pso = this.d();
        }
        return pso;
    }
}
