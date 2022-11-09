// 
// Decompiled by Procyon v0.6.0
// 

final class fkv implements fky
{
    private final fjx a;
    private volatile float b;
    private volatile float c;
    private final fjo d;
    
    public fkv(final fjo d, final fjx a) {
        this.a = a;
        this.d = d;
        this.b = Float.MAX_VALUE;
        this.c = a.b;
    }
    
    @Override
    public final fkp a() {
        return fkp.c;
    }
    
    @Override
    public final boolean b(final gzn gzn, final gzn gzn2) {
        final float a = this.d.a(gzn, gzn2);
        final long abs = Math.abs(gzn2.b - gzn.b);
        if (abs <= 200000000L) {
            final float b = this.b;
            final double n = a;
            Double.isNaN(n);
            final double n2 = (double)abs;
            Double.isNaN(n2);
            this.b = Math.min(b, (float)(n * 1.0E9 / n2));
            final float b2 = this.b;
            final fjx a2 = this.a;
            float c;
            if (b2 > 1000.0f) {
                c = 0.0f;
            }
            else if (b2 < 150.0f) {
                c = a2.a;
            }
            else if (b2 > 200.0f) {
                c = a2.b;
            }
            else {
                final float a3 = a2.a;
                c = (b2 - 150.0f) * (a2.b - a3) / 50.0f + a3;
            }
            this.c = c;
        }
        return a > this.c;
    }
}
