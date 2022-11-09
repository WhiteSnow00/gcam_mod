// 
// Decompiled by Procyon v0.6.0
// 

public final class ori extends Exception
{
    public final orh a;
    
    public ori(final orh orh, final String s) {
        this(orh, s, null);
    }
    
    public ori(final orh a, final String s, final Throwable t) {
        super(s, t);
        this.a = a;
    }
    
    public ori(final orh orh, final Throwable t) {
        this(orh, null, t);
    }
    
    public final boolean a() {
        return this.a.g;
    }
}
