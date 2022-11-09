// 
// Decompiled by Procyon v0.6.0
// 

public abstract class mmm
{
    private final pso a;
    
    public mmm(final pso a) {
        this.a = a;
    }
    
    public abstract long a(final String p0);
    
    public abstract boolean b();
    
    public abstract pso c();
    
    public final pso d() {
        final pso e = this.e();
        final okt okt = (okt)e.H(5);
        okt.o(e);
        if (okt.c) {
            okt.m();
            okt.c = false;
        }
        final pso pso = (pso)okt.b;
        final pso d = pso.d;
        pso.a |= 0x2;
        pso.b = -1L;
        return (pso)okt.h();
    }
    
    public final pso e() {
        final int c = psn.c(this.a.c);
        if (c != 0) {
            if (c == 5) {
                return this.a;
            }
        }
        return this.a;
    }
}
