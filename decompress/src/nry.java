import java.util.logging.Level;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class nry
{
    public final ntl a;
    
    protected nry(final ntl a) {
        this.a = a;
    }
    
    public abstract nsu a(final Level p0);
    
    public final nsu b() {
        return this.a(Level.SEVERE);
    }
    
    public final nsu c() {
        return this.a(Level.WARNING);
    }
    
    protected final String d() {
        return this.a.a();
    }
    
    protected final boolean e(final Level level) {
        return this.a.d(level);
    }
}
