// 
// Decompiled by Procyon v0.6.0
// 

public final class fqe implements oun
{
    private final pii a;
    private final pii b;
    
    public fqe(final pii a, final pii b) {
        this.a = a;
        this.b = b;
    }
    
    public static fqe b(final pii pii, final pii pii2) {
        return new fqe(pii, pii2);
    }
    
    public final fqd a() {
        return new fqd(this.a, this.b);
    }
}
