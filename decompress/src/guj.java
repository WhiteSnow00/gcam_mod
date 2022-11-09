// 
// Decompiled by Procyon v0.6.0
// 

public final class guj implements oun
{
    private final pii a;
    private final pii b;
    private final pii c;
    private final pii d;
    
    public guj(final pii a, final pii b, final pii c, final pii d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public static guj b(final pii pii, final pii pii2, final pii pii3, final pii pii4) {
        return new guj(pii, pii2, pii3, pii4);
    }
    
    public final gui a() {
        return new gui(this.a, this.b, this.d);
    }
}
