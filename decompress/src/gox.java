// 
// Decompiled by Procyon v0.6.0
// 

public final class gox implements oun
{
    private final pii a;
    private final pii b;
    private final pii c;
    private final pii d;
    private final pii e;
    private final pii f;
    private final pii g;
    
    public gox(final pii a, final pii b, final pii c, final pii d, final pii e, final pii f, final pii g) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    public static gox b(final pii pii, final pii pii2, final pii pii3, final pii pii4, final pii pii5, final pii pii6, final pii pii7) {
        return new gox(pii, pii2, pii3, pii4, pii5, pii6, pii7);
    }
    
    public final gow a() {
        return new gow(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
    }
}
