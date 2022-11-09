// 
// Decompiled by Procyon v0.6.0
// 

public enum nti
{
    a("GENERAL", 0, true), 
    b("BOOLEAN", 1, false), 
    c("CHARACTER", 2, false), 
    d("INTEGRAL", 3, false), 
    e("FLOAT", 4, true);
    
    public final boolean f;
    
    private nti(final String s, final int n, final boolean f) {
        this.f = f;
    }
}
