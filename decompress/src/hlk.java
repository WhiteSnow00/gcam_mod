// 
// Decompiled by Procyon v0.6.0
// 

public final class hlk implements oun
{
    private final pii a;
    private final pii b;
    
    public hlk(final pii a, final pii b) {
        this.a = a;
        this.b = b;
    }
    
    public static hlk b(final pii pii, final pii pii2) {
        return new hlk(pii, pii2);
    }
    
    public final hlj a() {
        return new hlj(((ege)this.a).a(), (hkd)this.b.get());
    }
}
