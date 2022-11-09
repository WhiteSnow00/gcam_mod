// 
// Decompiled by Procyon v0.6.0
// 

public enum cyn
{
    a("ENG", 0), 
    b("FISHFOOD", 1), 
    c("DOGFOOD", 2), 
    d("RELEASE", 3);
    
    private cyn(final String s, final int n) {
    }
    
    public final boolean a(final cyn cyn) {
        return this.ordinal() > cyn.ordinal();
    }
    
    public final boolean b(final cyn cyn) {
        return this.ordinal() <= cyn.ordinal();
    }
}
