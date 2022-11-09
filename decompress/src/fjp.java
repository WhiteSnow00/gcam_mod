// 
// Decompiled by Procyon v0.6.0
// 

public final class fjp implements oun
{
    private final pii a;
    
    public fjp(final pii a) {
        this.a = a;
    }
    
    public static fjp b(final pii pii) {
        return new fjp(pii);
    }
    
    public final fjo a() {
        return new fjo((dtb)this.a.get());
    }
}
