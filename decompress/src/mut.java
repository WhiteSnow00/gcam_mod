import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mut extends mya
{
    public final Set a;
    
    public mut(final Set a) {
        a.getClass();
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof mut && plr.b(this.a, ((mut)o).a));
    }
    
    @Override
    public final int hashCode() {
        final Set a = this.a;
        if (a != null) {
            return a.hashCode();
        }
        return 0;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("AirlockFileStateFilter(values=");
        sb.append(this.a);
        sb.append(")");
        return sb.toString();
    }
}
