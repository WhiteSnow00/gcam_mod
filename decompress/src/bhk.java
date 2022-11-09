// 
// Decompiled by Procyon v0.6.0
// 

public enum bhk
{
    a("RUNNING", 0, false), 
    b("PAUSED", 1, false), 
    c("CLEARED", 2, false), 
    d("SUCCESS", 3, true), 
    e("FAILED", 4, true);
    
    public final boolean f;
    
    private bhk(final String s, final int n, final boolean f) {
        this.f = f;
    }
}
