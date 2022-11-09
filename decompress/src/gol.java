// 
// Decompiled by Procyon v0.6.0
// 

public final class gol implements oun
{
    private final pii a;
    private final pii b;
    private final pii c;
    
    public gol(final pii a, final pii b, final pii c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public static gol b(final pii pii, final pii pii2, final pii pii3) {
        return new gol(pii, pii2, pii3);
    }
    
    public final gok a() {
        return new gok(this.a, this.b, this.c);
    }
}
