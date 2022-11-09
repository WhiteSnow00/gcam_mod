// 
// Decompiled by Procyon v0.6.0
// 

@Deprecated
public final class jnz
{
    protected Boolean a;
    public String b;
    
    public jnz() {
        this.a = false;
    }
    
    public jnz(final joa joa) {
        this.a = false;
        final joa a = joa.a;
        final String b = joa.b;
        this.a = joa.c;
        this.b = joa.d;
    }
    
    public final joa a() {
        return new joa(this);
    }
}
