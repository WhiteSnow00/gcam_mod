// 
// Decompiled by Procyon v0.6.0
// 

public final class ckc implements oun
{
    private final pii a;
    private final pii b;
    
    public ckc(final pii a, final pii b) {
        this.a = a;
        this.b = b;
    }
    
    public final ckb a() {
        return new ckb(this.a, ((cjz)this.b).a());
    }
}
