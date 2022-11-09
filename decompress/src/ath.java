// 
// Decompiled by Procyon v0.6.0
// 

public enum ath
{
    a("AUTO", 0), 
    b("CONTINUOUS_PICTURE", 1), 
    c("CONTINUOUS_VIDEO", 2), 
    d("EXTENDED_DOF", 3), 
    e("FIXED", 4), 
    f("INFINITY", 5), 
    g("MACRO", 6);
    
    private ath(final String s, final int n) {
    }
    
    public static ath a(final String s) {
        return Enum.valueOf(ath.class, s);
    }
}
