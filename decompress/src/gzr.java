import java.util.HashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public enum gzr
{
    a("INACTIVE", 0, 0), 
    b("PASSIVE_SCAN", 1, 1), 
    c("PASSIVE_FOCUSED", 2, 2), 
    d("ACTIVE_SCAN", 3, 3), 
    e("FOCUSED_LOCKED", 4, 4), 
    f("NOT_FOCUSED_LOCKED", 5, 5), 
    g("PASSIVE_UNFOCUSED", 6, 6);
    
    private static final Map i;
    public final int h;
    
    static {
        int k = 0;
        i = new HashMap();
        for (gzr[] values = values(); k < values.length; ++k) {
            final gzr gzr = values[k];
            gzr.i.put(gzr.h, gzr);
        }
    }
    
    private gzr(final String s, final int n, final int h) {
        this.h = h;
    }
    
    public static gzr a(final int n) {
        final gzr gzr = gzr.i.get(n);
        if (gzr != null) {
            return gzr;
        }
        final StringBuilder sb = new StringBuilder(35);
        sb.append("unknown metadata value: ");
        sb.append(n);
        throw new IllegalArgumentException(sb.toString());
    }
    
    public final boolean b() {
        return this == gzr.c || this == gzr.g || this == gzr.e || this == gzr.f || this == gzr.a;
    }
}
