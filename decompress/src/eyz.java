// 
// Decompiled by Procyon v0.6.0
// 

public final class eyz
{
    public hio a;
    public oaf b;
    public Float c;
    
    public final eza a() {
        final hio a = this.a;
        if (a != null) {
            return new eza(a, this.b, this.c);
        }
        throw new IllegalStateException("Missing required properties: sessionType");
    }
}
