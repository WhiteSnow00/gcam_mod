// 
// Decompiled by Procyon v0.6.0
// 

public final class cjz implements oun
{
    private final pii a;
    private final pii b;
    
    public cjz(final pii a, final pii b) {
        this.a = a;
        this.b = b;
    }
    
    public final cjy a() {
        return new cjy((cid)this.a.get(), (der)this.b.get());
    }
}
