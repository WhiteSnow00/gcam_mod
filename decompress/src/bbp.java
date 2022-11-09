import java.util.Collections;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bbp implements bbm
{
    public final Map b;
    public volatile Map c;
    
    public bbp(final Map map) {
        this.b = Collections.unmodifiableMap((Map<?, ?>)map);
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof bbp && this.b.equals(((bbp)o).b);
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode();
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 21);
        sb.append("LazyHeaders{headers=");
        sb.append(value);
        sb.append('}');
        return sb.toString();
    }
}
