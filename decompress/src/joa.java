import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

@Deprecated
public final class joa implements jqn
{
    public static final joa a;
    public final String b;
    public final boolean c;
    public final String d;
    
    static {
        a = new jnz().a();
    }
    
    public joa(final jnz jnz) {
        this.b = null;
        this.c = jnz.a;
        this.d = jnz.b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof joa)) {
            return false;
        }
        final joa joa = (joa)o;
        final String b = joa.b;
        return jvu.m(null, null) && this.c == joa.c && jvu.m(this.d, joa.d);
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { null, this.c, this.d });
    }
}
