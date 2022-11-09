// 
// Decompiled by Procyon v0.6.0
// 

public final class dnv
{
    public int a;
    public dnr b;
    public dli c;
    public int d;
    private final dlb e;
    
    public dnv(final dlb e) {
        this.a = 1;
        this.b = dnw.a;
        njo.d(true);
        njo.d(true);
        this.c = new dlj();
        this.d = 1;
        this.e = e;
    }
    
    public static final void c(final int n) {
        njo.d(n > 0);
    }
    
    public final dlc a() {
        final int a = this.a;
        int d;
        if (a != -1) {
            this.d = a;
            d = a;
        }
        else {
            d = this.d;
            if (d <= 0) {
                throw new IllegalStateException("Must specify max dimensions when building variable dimensional views!");
            }
        }
        return new dns(this.e, a, d, this.b, this.c);
    }
    
    public final void b(final dnt dnt) {
        this.b = new dnu(dnt);
    }
}
