// 
// Decompiled by Procyon v0.6.0
// 

public final class hlc implements oun
{
    private final pii a;
    private final pii b;
    private final pii c;
    
    public hlc(final pii a, final pii b, final pii c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public static hlc b(final pii pii, final pii pii2, final pii pii3) {
        return new hlc(pii, pii2, pii3);
    }
    
    public final hlb a() {
        return new hlb((hjx)this.a.get(), (lfw)this.b.get(), (cxl)this.c.get());
    }
}
