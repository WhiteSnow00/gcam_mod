// 
// Decompiled by Procyon v0.6.0
// 

public final class gbx implements oun
{
    private final pii a;
    
    public gbx(final pii a) {
        this.a = a;
    }
    
    public static gbx b(final pii pii) {
        return new gbx(pii);
    }
    
    public final gbw a() {
        return new gbw((gxp)this.a.get());
    }
}
