// 
// Decompiled by Procyon v0.6.0
// 

public final class mjp implements oun
{
    private final pii a;
    private final pii b;
    
    public mjp(final pii a, final pii b) {
        this.a = a;
        this.b = b;
    }
    
    public final mjo a() {
        return new mjo(this.a, ((egg)this.b).a());
    }
}
