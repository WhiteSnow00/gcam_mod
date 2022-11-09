import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fzy
{
    private final String a;
    
    public fzy(final String a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o != null && o instanceof fzy && this.a.equals(((fzy)o).a);
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.a });
    }
    
    @Override
    public final String toString() {
        final niy c = nfa.c(this);
        c.b("name", this.a);
        return c.toString();
    }
}
