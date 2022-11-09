// 
// Decompiled by Procyon v0.6.0
// 

public final class fyn implements oun
{
    private final pii a;
    private final pii b;
    
    public fyn(final pii a, final pii b) {
        this.a = a;
        this.b = b;
    }
    
    public static fyn b(final pii pii, final pii pii2) {
        return new fyn(pii, pii2);
    }
    
    public final fym a() {
        return new fym(((ghc)this.a).a(), ((fyy)this.b).a());
    }
}
