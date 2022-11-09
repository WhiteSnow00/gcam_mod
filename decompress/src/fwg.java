// 
// Decompiled by Procyon v0.6.0
// 

public final class fwg implements oun
{
    private final pii a;
    private final pii b;
    
    public fwg(final pii a, final pii b) {
        this.a = a;
        this.b = b;
    }
    
    public static fwg b(final pii pii, final pii pii2) {
        return new fwg(pii, pii2);
    }
    
    public final fwf a() {
        return new fwf((kkz)this.a.get(), (klj)this.b.get());
    }
}
