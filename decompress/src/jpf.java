import java.util.EnumSet;

// 
// Decompiled by Procyon v0.6.0
// 

public enum jpf
{
    a("ZWIEBACK", 0, 2), 
    b("ANDROID_ID", 1, 4), 
    c("GAIA", 2, 8), 
    d("ACCOUNT_NAME", 3, 16);
    
    public static final EnumSet e;
    public static final EnumSet f;
    public static final EnumSet g;
    public final int h;
    
    static {
        e = EnumSet.allOf(jpf.class);
        f = EnumSet.noneOf(jpf.class);
        final jpf jpf;
        g = EnumSet.of(jpf);
    }
    
    private jpf(final String s, final int n, final int h) {
        this.h = h;
    }
}
