// 
// Decompiled by Procyon v0.6.0
// 

public final class goz implements oun
{
    private final pii a;
    private final pii b;
    private final pii c;
    private final pii d;
    
    public goz(final pii a, final pii b, final pii c, final pii d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public static goz b(final pii pii, final pii pii2, final pii pii3, final pii pii4) {
        return new goz(pii, pii2, pii3, pii4);
    }
    
    public final goy a() {
        return new goy((kwd)this.a.get(), (kwz)this.b.get(), (kzl)this.c.get(), (gdg)this.d.get());
    }
}
