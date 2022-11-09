// 
// Decompiled by Procyon v0.6.0
// 

public final class gqq implements oun
{
    private final pii a;
    private final pii b;
    private final pii c;
    
    public gqq(final pii a, final pii b, final pii c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public static gqq b(final pii pii, final pii pii2, final pii pii3) {
        return new gqq(pii, pii2, pii3);
    }
    
    public final gqp a() {
        return new gqp(this.a, this.b, (niz)this.c.get());
    }
}
