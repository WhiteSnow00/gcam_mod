// 
// Decompiled by Procyon v0.6.0
// 

public final class mmd
{
    private static final lmy f;
    public final Object a;
    public final pii b;
    public final lmy c;
    public int d;
    public long e;
    
    static {
        f = new lnb();
    }
    
    public mmd(final pii b, final lmy c) {
        this.a = new Object();
        this.d = 0;
        this.e = 0L;
        this.b = b;
        this.c = c;
    }
    
    public static mmd a(final int n) {
        return new mmd(new mmc(n), mmd.f);
    }
}
