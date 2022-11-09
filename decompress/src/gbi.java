// 
// Decompiled by Procyon v0.6.0
// 

public final class gbi implements oun
{
    private final pii a;
    private final pii b;
    private final pii c;
    private final pii d;
    
    public gbi(final pii a, final pii b, final pii c, final pii d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public static gbi b(final pii pii, final pii pii2, final pii pii3, final pii pii4) {
        return new gbi(pii, pii2, pii3, pii4);
    }
    
    public final gbh a() {
        return new gbh(((bob)this.a).a(), (gxp)this.b.get(), ((gim)this.c).a(), ((gco)this.d).b());
    }
}
