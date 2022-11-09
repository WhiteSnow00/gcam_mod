import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jrq
{
    public final jqp a;
    private final int b;
    private final jqn c;
    private final String d;
    
    public jrq(final jqp a, final jqn c, final String d) {
        this.a = a;
        this.c = c;
        this.d = d;
        this.b = Arrays.hashCode(new Object[] { a, c, d });
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == null) {
            return false;
        }
        if (o == this) {
            return true;
        }
        if (!(o instanceof jrq)) {
            return false;
        }
        final jrq jrq = (jrq)o;
        return jvu.m(this.a, jrq.a) && jvu.m(this.c, jrq.c) && jvu.m(this.d, jrq.d);
    }
    
    @Override
    public final int hashCode() {
        return this.b;
    }
}
