import j$.util.Objects;
import java.util.Collection;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fzr
{
    public final Set a;
    
    public fzr(final Set set) {
        this.a = noi.F(set);
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o != null && o instanceof fzr && Objects.equals((Object)this.a, (Object)((fzr)o).a);
    }
    
    @Override
    public final int hashCode() {
        return Objects.hashCode((Object)this.a);
    }
}
