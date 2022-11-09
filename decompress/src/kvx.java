import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kvx implements Comparable
{
    public final long a;
    public final long b;
    public final long c;
    
    public kvx(final long a, final long b, final long c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final int a(final kvx kvx) {
        return lcmp(this.c, kvx.c);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (!(o instanceof kvx)) {
            return false;
        }
        final kvx kvx = (kvx)o;
        return this.c == kvx.c && this.a == kvx.a && this.b == kvx.b;
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.a, this.c, this.b });
    }
    
    @Override
    public final String toString() {
        final niy c = nfa.c(this);
        c.f("timestamp", this.a);
        c.f("onStartedId", this.c);
        c.f("frameNumber", this.b);
        return c.toString();
    }
}
