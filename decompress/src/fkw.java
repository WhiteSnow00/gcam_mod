// 
// Decompiled by Procyon v0.6.0
// 

final class fkw implements fky
{
    private gzn a;
    private final fjo b;
    
    public fkw(final fjo b) {
        this.a = null;
        this.b = b;
    }
    
    @Override
    public final fkp a() {
        return fkp.h;
    }
    
    @Override
    public final boolean b(final gzn gzn, gzn a) {
        synchronized (this) {
            a = this.a;
            if (a == null || Math.abs(gzn.b - a.b) > 100000000L) {
                this.a = gzn;
                return false;
            }
            final float a2 = this.b.a(gzn, a);
            final long c = gzn.c;
            this.a = gzn;
            if (a2 * c > 1.0E9f) {
                this.a = null;
                return true;
            }
            return false;
        }
    }
}
