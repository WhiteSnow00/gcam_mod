import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pin implements Serializable
{
    public final Throwable a;
    
    public pin(final Throwable a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof pin && plr.b(this.a, ((pin)o).a);
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Failure(");
        sb.append(this.a);
        sb.append(')');
        return sb.toString();
    }
}
