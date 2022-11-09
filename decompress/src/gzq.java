import java.util.HashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public enum gzq
{
    a("OFF", 0, 0), 
    b("AUTO", 1, 1), 
    c("MACRO", 2, 2), 
    d("CONTINUOUS_VIDEO", 3, 3), 
    e("CONTINUOUS_PICTURE", 4, 4), 
    f("EDOF", 5, 5);
    
    public static final Map g;
    public final int h;
    
    static {
        int j = 0;
        g = new HashMap();
        for (gzq[] values = values(); j < values.length; ++j) {
            final gzq gzq = values[j];
            gzq.g.put(gzq.h, gzq);
        }
    }
    
    private gzq(final String s, final int n, final int h) {
        this.h = h;
    }
}
