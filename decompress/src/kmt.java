import java.util.LinkedList;
import java.util.Collection;

// 
// Decompiled by Procyon v0.6.0
// 

public enum kmt
{
    a("FPS_AUTO", 0, 30, 30, 60), 
    b("FPS_24", 1, 24, 24, 24), 
    c("FPS_30", 2, 30, 30, 30), 
    d("FPS_60", 3, 60, 60, 60), 
    e("FPS_60C_24E", 4, 60, 24, 60), 
    f("FPS_60C_30E", 5, 60, 30, 60), 
    g("FPS_120_HFR_4X", 6, 120, 30, 120), 
    h("FPS_240_HFR_8X", 7, 240, 30, 240);
    
    public final int i;
    public final int j;
    public final int k;
    
    private kmt(final String s, final int n, final int i, final int j, final int k) {
        this.i = i;
        this.j = j;
        this.k = k;
    }
    
    public static kmt b(final int n, final int n2) {
        if (n2 == 30 && n == 30) {
            return kmt.c;
        }
        final StringBuilder sb = new StringBuilder(79);
        sb.append("unsupported capture frame rate =");
        sb.append(n);
        sb.append(" and encoding frame rate=");
        sb.append(n2);
        throw new IllegalArgumentException(sb.toString());
    }
    
    public static kmt c(final String s) {
        return Enum.valueOf(kmt.class, s);
    }
    
    public static Collection d() {
        final LinkedList list = new LinkedList();
        for (final kmt kmt : values()) {
            if (kmt.f()) {
                list.add(kmt);
            }
        }
        return list;
    }
    
    public final int a() {
        return this.i / this.j;
    }
    
    public final boolean e() {
        return this == kmt.e || this == kmt.f;
    }
    
    public final boolean f() {
        return this.i > 60;
    }
    
    public final boolean g() {
        return this.i <= 60;
    }
}
