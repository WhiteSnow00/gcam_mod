import java.util.HashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hxa
{
    private final Map a;
    private final hxb b;
    
    public hxa(final hxb b) {
        this.a = new HashMap();
        this.b = b;
    }
    
    public final hwz a(final hwy hwy) {
        synchronized (this.a) {
            final String b = hwy.b();
            if (this.a.containsKey(b)) {
                return (hwz)this.a.get(b);
            }
            final boolean a = this.b.a;
            final hwz hwz = new hwz(hwy);
            this.a.put(b, hwz);
            return hwz;
        }
    }
}
