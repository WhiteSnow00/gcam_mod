import java.util.logging.Level;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nsd extends nry
{
    public static final nsc b;
    
    static {
        b = new nsc();
    }
    
    public nsd(final ntl ntl) {
        super(ntl);
    }
    
    @Deprecated
    public static nsd g(final String s) {
        oce.h(s.isEmpty() ^ true, "injected class name is empty");
        return new nsd(nuj.c(s.replace('/', '.')));
    }
    
    public final nsa f(final Level level) {
        final boolean e = this.e(level);
        nuj.m(this.d(), level, e);
        if (!e) {
            return nsd.b;
        }
        return new nsb(this, level);
    }
}
