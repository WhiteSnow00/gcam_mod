// 
// Decompiled by Procyon v0.6.0
// 

public final class goh implements oun
{
    private final pii a;
    private final pii b;
    private final pii c;
    
    public goh(final pii a, final pii b, final pii c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public static goh b(final pii pii, final pii pii2, final pii pii3) {
        return new goh(pii, pii2, pii3);
    }
    
    public final gog a() {
        return new gog(this.a, this.b, this.c);
    }
}
