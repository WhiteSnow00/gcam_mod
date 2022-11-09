// 
// Decompiled by Procyon v0.6.0
// 

public final class bkz implements oun
{
    private final pii a;
    private final pii b;
    private final pii c;
    private final pii d;
    
    public bkz(final pii a, final pii b, final pii c, final pii d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public static bkz b(final pii pii, final pii pii2, final pii pii3, final pii pii4) {
        return new bkz(pii, pii2, pii3, pii4);
    }
    
    public final bky a() {
        return new bky((gir)this.a.get(), fyd.d(), ((fzw)this.b).a(), (liy)this.c.get(), (cxl)this.d.get(), null);
    }
}
