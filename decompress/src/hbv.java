import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hbv
{
    public final hby a;
    private final Object b;
    private final List c;
    
    public hbv(final hby a) {
        this.b = new Object();
        this.c = new ArrayList();
        this.a = a;
    }
    
    public final hcr a() {
        synchronized (this.b) {
            if (this.c.isEmpty()) {
                return null;
            }
            return (hcr)nov.d(this.c);
        }
    }
    
    public final boolean b(final hdb hdb) {
        return this.a.c.containsKey((Object)hdb.c());
    }
}
