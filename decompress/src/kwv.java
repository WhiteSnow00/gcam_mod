import j$.util.Objects;
import java.util.Collection;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kwv
{
    public final int a;
    public final nns b;
    public final nns c;
    
    public kwv(final int n) {
        this(n, nns.l(), nns.l());
    }
    
    public kwv(final int n, final List list) {
        this(n, nns.j(list), nns.l());
    }
    
    public kwv(final int a, final nns b, final nns c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (!(o instanceof kwv)) {
            return false;
        }
        final kwv kwv = (kwv)o;
        return this.a == kwv.a && Objects.equals((Object)this.c, (Object)kwv.c) && Objects.equals((Object)this.b, (Object)kwv.b);
    }
    
    @Override
    public final int hashCode() {
        return Objects.hash(new Object[] { this.a, this.c, this.b });
    }
}
