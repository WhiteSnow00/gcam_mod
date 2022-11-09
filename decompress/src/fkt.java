// 
// Decompiled by Procyon v0.6.0
// 

final class fkt implements fky
{
    final /* synthetic */ float a;
    
    public fkt(final float a) {
        this.a = a;
    }
    
    @Override
    public final fkp a() {
        return fkp.d;
    }
    
    @Override
    public final boolean b(final gzn gzn, final gzn gzn2) {
        if (gzn.t == 1 && gzn.u == 0) {
            return false;
        }
        final long n = gzn2.e * gzn2.c * gzn2.f / 100L;
        return Math.abs(gzn.e * gzn.c * gzn.f / 100L - n) > n * this.a;
    }
}
