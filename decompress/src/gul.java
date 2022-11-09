// 
// Decompiled by Procyon v0.6.0
// 

public final class gul implements oun
{
    private final pii a;
    private final pii b;
    private final pii c;
    private final pii d;
    
    public gul(final pii a, final pii b, final pii c, final pii d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public static gul b(final pii pii, final pii pii2, final pii pii3, final pii pii4) {
        return new gul(pii, pii2, pii3, pii4);
    }
    
    public final guk a() {
        return new guk(((guj)this.a).a(), (dvj)this.b.get(), (cxl)this.c.get(), (kjk)this.d.get());
    }
}
