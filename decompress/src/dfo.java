// 
// Decompiled by Procyon v0.6.0
// 

public enum dfo
{
    a("UNKNOWN", 0, "unknown"), 
    b("DEVICE_FORWARDED", 1, "device_forwarded"), 
    c("DEVICE_HANDLED", 2, "device_handled"), 
    d("FALLBACK_HANDLED", 3, "fallback_handled");
    
    public final String e;
    
    private dfo(final String s, final int n, final String e) {
        this.e = e;
    }
}
