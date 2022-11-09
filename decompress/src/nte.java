import java.util.logging.Level;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nte extends ntc
{
    public nte(final ntl ntl) {
        super(ntl);
    }
    
    public static nte g(final String s) {
        return new nte(nuj.c(s));
    }
    
    public static nte h() {
        return new nte(nuj.c(nuj.f().b(nte.class)));
    }
    
    public final nta f(final Level level) {
        final boolean e = this.e(level);
        nuj.m(this.d(), level, e);
        if (!e) {
            return nte.b;
        }
        return new ntd(this, level);
    }
}
