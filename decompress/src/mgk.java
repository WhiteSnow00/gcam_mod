// 
// Decompiled by Procyon v0.6.0
// 

final class mgk
{
    public final prj a;
    public final Long b;
    public final Long c;
    public final Long d;
    public final Long e;
    public final pqz f;
    public final String g;
    public final prk h;
    
    public mgk(final prj a, final Long b, final Long c, final Long d, final Long e, final pqz f, final String g, final prk h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    @Override
    public final String toString() {
        return String.format("StatsRecord:\n  elapsed: %d\n  current: %d\n  Primes version: %d\n  version name #: %d\n  customName: %s\n", this.b, this.c, this.d, this.e, this.g);
    }
}
