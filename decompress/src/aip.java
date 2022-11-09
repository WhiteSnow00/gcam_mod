import java.util.HashSet;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aip
{
    public final Set a;
    
    public aip() {
        this.a = new HashSet();
    }
    
    public final int a() {
        return this.a.size();
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o != null && this.getClass() == o.getClass() && this.a.equals(((aip)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
}
