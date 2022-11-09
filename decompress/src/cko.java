// 
// Decompiled by Procyon v0.6.0
// 

public final class cko implements oun
{
    private final pii a;
    private final pii b;
    private final pii c;
    
    public cko(final pii a, final pii b, final pii c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public static cko b(final pii pii, final pii pii2, final pii pii3) {
        return new cko(pii, pii2, pii3);
    }
    
    public final ckn a() {
        return new ckn((hkc)this.a.get(), (kmw)this.b.get(), (cxl)this.c.get());
    }
}
