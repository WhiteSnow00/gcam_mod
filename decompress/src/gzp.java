import java.util.HashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public enum gzp
{
    a("INACTIVE", 0, 0), 
    b("SEARCHING", 1, 1), 
    c("CONVERGED", 2, 2), 
    d("LOCKED", 3, 3), 
    e("FLASH_REQUIRED", 4, 4), 
    f("PRECAPTURE", 5, 5);
    
    public static final Map g;
    private final int i;
    
    static {
        int i = 0;
        g = new HashMap();
        for (gzp[] values = values(); i < values.length; ++i) {
            final gzp gzp = values[i];
            gzp.g.put(gzp.i, gzp);
        }
    }
    
    private gzp(final String s, final int n, final int i) {
        this.i = i;
    }
}
