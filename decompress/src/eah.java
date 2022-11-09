// 
// Decompiled by Procyon v0.6.0
// 

public final class eah implements oun
{
    private final pii a;
    private final pii b;
    private final pii c;
    
    public eah(final pii a, final pii b, final pii c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public static eah b(final pii pii, final pii pii2, final pii pii3) {
        return new eah(pii, pii2, pii3);
    }
    
    public final ead a() {
        return new ead((ohs)this.a.get(), ((bob)this.b).a(), (kse)this.c.get());
    }
}
