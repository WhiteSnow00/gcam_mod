// 
// Decompiled by Procyon v0.6.0
// 

public enum atg
{
    a("NO_FLASH", 0), 
    b("AUTO", 1), 
    c("OFF", 2), 
    d("ON", 3), 
    e("TORCH", 4), 
    f("RED_EYE", 5);
    
    private atg(final String s, final int n) {
    }
    
    public static atg a(final String s) {
        return Enum.valueOf(atg.class, s);
    }
}
