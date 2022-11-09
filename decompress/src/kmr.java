import java.util.HashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public enum kmr
{
    a("AAC", 0, 3, a2), 
    b("AAC_ELD", 1, 5, kms.a), 
    c("HE_AAC", 2, 4, kms.a), 
    d("AMR_NB", 3, 1, kms.b), 
    e("AMR_WB", 4, 2, kms.c), 
    f("VORBIS", 5, 6, kms.d);
    
    private static final Map i;
    public final int g;
    public final kms h;
    
    static {
        final kms a2 = kms.a;
        int k = 0;
        i = new HashMap();
        for (kmr[] values = values(); k < values.length; ++k) {
            final kmr kmr = values[k];
            kmr.i.put(kmr.g, kmr);
        }
    }
    
    private kmr(final String s, final int n, final int g, final kms h) {
        this.g = g;
        this.h = h;
    }
    
    public static kmr a(final int n) {
        final kmr kmr = kmr.i.get(n);
        if (kmr != null) {
            return kmr;
        }
        final StringBuilder sb = new StringBuilder(43);
        sb.append("unknown CamcorderProfile value: ");
        sb.append(n);
        throw new IllegalArgumentException(sb.toString());
    }
}
