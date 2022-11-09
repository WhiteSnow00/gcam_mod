import java.util.List;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mvj extends mvc
{
    private final boolean a;
    private final Long b;
    private final Set c;
    private final List d;
    
    public mvj(final Set c, final List d) {
        this.a = false;
        this.b = null;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this != o) {
            if (o instanceof mvj) {
                final mvj mvj = (mvj)o;
                final boolean a = mvj.a;
                final Long b = mvj.b;
                if (plr.b(null, null) && plr.b(this.c, mvj.c) && plr.b(this.d, mvj.d)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
    
    @Override
    public final int hashCode() {
        return this.c.hashCode() * 31 + 1;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("QueryResources(isSnapshot=false, onDeviceId=");
        sb.append((Object)null);
        sb.append(", filters=");
        sb.append(this.c);
        sb.append(", sortOrders=");
        sb.append(this.d);
        sb.append(")");
        return sb.toString();
    }
}
