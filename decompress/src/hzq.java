// 
// Decompiled by Procyon v0.6.0
// 

public enum hzq
{
    a("FIRST_PREVIEW_FRAME", 0), 
    b("SHUTTER_BUTTON_ENABLED", 1);
    
    private hzq(final String s, final int n) {
    }
    
    public static hzq a(final String s) {
        return Enum.valueOf(hzq.class, s);
    }
}
