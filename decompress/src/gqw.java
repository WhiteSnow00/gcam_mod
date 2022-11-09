// 
// Decompiled by Procyon v0.6.0
// 

public final class gqw implements oun
{
    private final pii a;
    private final pii b;
    private final pii c;
    private final pii d;
    private final pii e;
    private final pii f;
    
    public gqw(final pii a, final pii b, final pii c, final pii d, final pii e, final pii f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public static gqw b(final pii pii, final pii pii2, final pii pii3, final pii pii4, final pii pii5, final pii pii6) {
        return new gqw(pii, pii2, pii3, pii4, pii5, pii6);
    }
    
    public final gqv a() {
        return new gqv(this.a, this.b, this.c, this.d, this.e, this.f);
    }
}
