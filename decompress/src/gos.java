// 
// Decompiled by Procyon v0.6.0
// 

public final class gos implements oun
{
    private final pii a;
    private final pii b;
    private final pii c;
    private final pii d;
    private final pii e;
    
    public gos(final pii a, final pii b, final pii c, final pii d, final pii e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public static gos b(final pii pii, final pii pii2, final pii pii3, final pii pii4, final pii pii5) {
        return new gos(pii, pii2, pii3, pii4, pii5);
    }
    
    public final gor a() {
        return new gor(this.a, this.b, this.c, this.d, this.e);
    }
}
