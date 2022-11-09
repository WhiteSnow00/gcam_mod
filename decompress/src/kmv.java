import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public enum kmv
{
    a("RES_UNKNOWN", 0, -1, -1), 
    b("RES_QCIF", 1, 176, 144), 
    c("RES_QVGA", 2, 320, 240), 
    d("RES_CIF", 3, 352, 288), 
    e("RES_480P_4X3", 4, 640, 480), 
    f("RES_480P", 5, 720, 480), 
    g("RES_720P", 6, 1280, 720), 
    h("RES_1080P", 7, 1920, 1080), 
    i("RES_2160P", 8, 3840, 2160);
    
    public static final Map j;
    private final int l;
    private final int m;
    
    static {
        int l = 0;
        j = new HashMap();
        for (kmv[] values = values(); l < values.length; ++l) {
            final kmv kmv = values[l];
            kmv.j.put(new kre(kmv.l, kmv.m), kmv);
        }
    }
    
    private kmv(final String s, final int n, final int l, final int m) {
        this.l = l;
        this.m = m;
    }
    
    public static kmv b(final String s) {
        return Enum.valueOf(kmv.class, s);
    }
    
    public static Comparator d() {
        return new aab(8);
    }
    
    public final long a() {
        return this.l * (long)this.m;
    }
    
    public final kre c() {
        return new kre(this.l, this.m);
    }
    
    public final boolean e() {
        return this == kmv.i;
    }
}
