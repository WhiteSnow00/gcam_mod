// 
// Decompiled by Procyon v0.6.0
// 

public final class dzq implements oun
{
    private final pii a;
    private final pii b;
    
    public dzq(final pii a, final pii b) {
        this.a = a;
        this.b = b;
    }
    
    public static dzq a(final pii pii, final pii pii2) {
        return new dzq(pii, pii2);
    }
    
    public final Long b() {
        final dug dug = (dug)this.a.get();
        long n;
        if (((cxl)this.b.get()).k(cxs.S)) {
            n = dzp.b;
        }
        else {
            n = dzp.a;
        }
        return Math.max(1000000000L, n * dug.c + jxc.j(500));
    }
}
