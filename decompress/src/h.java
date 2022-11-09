// 
// Decompiled by Procyon v0.6.0
// 

public enum h
{
    a("DESTROYED", 0), 
    b("INITIALIZED", 1), 
    c("CREATED", 2), 
    d("STARTED", 3), 
    e("RESUMED", 4);
    
    private h(final String s, final int n) {
    }
    
    public final boolean a(final h h) {
        return this.compareTo(h) >= 0;
    }
}
