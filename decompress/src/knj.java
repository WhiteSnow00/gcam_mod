import java.util.HashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public enum knj
{
    a("QUALITY_480P", 0, 2002, f2), 
    b("QUALITY_720P", 1, 2003, kmv.g), 
    c("QUALITY_1080P", 2, 2004, kmv.h), 
    d("QUALITY_2160P", 3, 2005, kmv.i);
    
    private static final Map f;
    private static final Map g;
    public final int e;
    private final kmv i;
    
    static {
        final kmv f2 = kmv.f;
        int i = 0;
        f = new HashMap();
        g = new HashMap();
        for (knj[] values = values(); i < values.length; ++i) {
            final knj knj = values[i];
            knj.f.put(knj.i, knj);
            knj.g.put(knj.e, knj);
        }
    }
    
    private knj(final String s, final int n, final int e, final kmv i) {
        this.e = e;
        this.i = i;
    }
    
    public static knj a(final kmv kmv) {
        return knj.f.get(kmv);
    }
}
