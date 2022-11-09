import java.util.HashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public enum knl
{
    a("QUALITY_QCIF", 0, 2, b2), 
    b("QUALITY_QVGA", 1, 7, kmv.c), 
    c("QUALITY_CIF", 2, 3, kmv.d), 
    d("QUALITY_480P_4X3", 3, 4, kmv.e), 
    e("QUALITY_480P", 4, 4, kmv.f), 
    f("QUALITY_720P", 5, 5, kmv.g), 
    g("QUALITY_1080P", 6, 6, kmv.h), 
    h("QUALITY_2160P", 7, 8, kmv.i);
    
    private static final Map k;
    private static final Map l;
    public final int i;
    public final kmv j;
    
    static {
        final kmv b2 = kmv.b;
        int i = 0;
        k = new HashMap();
        l = new HashMap();
        for (knl[] values = values(); i < values.length; ++i) {
            final knl knl = values[i];
            knl.k.put(knl.j, knl);
            knl.l.put(knl.i, knl);
        }
    }
    
    private knl(final String s, final int n, final int i, final kmv j) {
        this.i = i;
        this.j = j;
    }
    
    public static knl a(final kmv kmv) {
        return knl.k.get(kmv);
    }
}
