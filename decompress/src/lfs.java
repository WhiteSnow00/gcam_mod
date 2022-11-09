// 
// Decompiled by Procyon v0.6.0
// 

public final class lfs implements oun
{
    private final pii a;
    private final pii b;
    
    public lfs(final pii a, final pii b) {
        this.a = a;
        this.b = b;
    }
    
    public final lfr a() {
        return new lfr(((egk)this.a).a(), ((krp)this.b).a());
    }
}
