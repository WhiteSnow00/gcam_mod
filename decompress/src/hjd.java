// 
// Decompiled by Procyon v0.6.0
// 

public enum hjd
{
    a("FPS_AUTO", 0), 
    b("FPS_24", 1), 
    c("FPS_30", 2), 
    d("FPS_60", 3);
    
    private hjd(final String s, final int n) {
    }
    
    public static hjd a(final String s) {
        return Enum.valueOf(hjd.class, s);
    }
}
