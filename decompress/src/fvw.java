// 
// Decompiled by Procyon v0.6.0
// 

public final class fvw implements oun
{
    private final pii a;
    private final pii b;
    
    public fvw(final pii a, final pii b) {
        this.a = a;
        this.b = b;
    }
    
    public static fvw b(final pii pii, final pii pii2) {
        return new fvw(pii, pii2);
    }
    
    public final fvv a() {
        return new fvv((kkz)this.a.get(), (klj)this.b.get());
    }
}
