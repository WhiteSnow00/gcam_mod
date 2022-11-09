// 
// Decompiled by Procyon v0.6.0
// 

public enum orh
{
    a("BAD_URL", 0, false), 
    b("CANCELED", 1, false), 
    c("REQUEST_BODY_READ_ERROR", 2, false), 
    d("CONNECTION_ERROR", 3, true), 
    e("SERVER_ERROR", 4, true), 
    f("UNKNOWN", 5, false);
    
    public final boolean g;
    
    private orh(final String s, final int n, final boolean g) {
        this.g = g;
    }
}
