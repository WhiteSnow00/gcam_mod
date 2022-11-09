import java.util.Arrays;
import java.util.Collection;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kyi
{
    public final Set a;
    public final Set b;
    public final Set c;
    private final int d;
    
    public kyi(final Set a, final Set b, final Set c) {
        this.a = a;
        this.b = b;
        this.c = c;
        synchronized (lbi.class) {
            final int e = lbi.e;
            lbi.e = e + 1;
            monitorexit(lbi.class);
            this.d = e;
        }
    }
    
    public final Set a() {
        return noi.F(this.c);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o instanceof kyi) {
            final Set a = this.a;
            final kyi kyi = (kyi)o;
            if (nqb.E(a, kyi.a) && nqb.E(this.c, kyi.c) && nqb.E(this.b, kyi.b)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.a, this.b, this.c });
    }
    
    @Override
    public final String toString() {
        final int d = this.d;
        final StringBuilder sb = new StringBuilder(24);
        sb.append("FrameRequest-");
        sb.append(d);
        return sb.toString();
    }
}
