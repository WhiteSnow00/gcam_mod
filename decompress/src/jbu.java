// 
// Decompiled by Procyon v0.6.0
// 

public final class jbu implements oun
{
    private final pii a;
    
    public jbu(final pii a) {
        this.a = a;
    }
    
    public static jbu b(final pii pii) {
        return new jbu(pii);
    }
    
    public final jbt a() {
        return new jbt((gkw)this.a.get());
    }
}
