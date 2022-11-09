// 
// Decompiled by Procyon v0.6.0
// 

public final class dzs implements oun
{
    private final pii a;
    private final pii b;
    
    public dzs(final pii a, final pii b) {
        this.a = a;
        this.b = b;
    }
    
    public final dzr a() {
        return new dzr(this.a, (cxl)this.b.get());
    }
}
