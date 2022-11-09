// 
// Decompiled by Procyon v0.6.0
// 

public final class ges extends kmg
{
    private final gfg a;
    private final gfg b;
    private final gfg c;
    private final gfg d;
    private final gfg e;
    private final gfg f;
    
    public ges(final klj klj, final gfg a, final gfg b, final gfg c, final gfg d, final gfg e, final gfg f) {
        super(klj);
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    @Override
    public final String toString() {
        final niy c = nfa.c(this);
        c.b("normal", this.a);
        c.b("normalFlash", this.b);
        c.b("hdrPlus", this.c);
        c.b("hdrPlusTorch", this.d);
        c.b("hdrPlusZsl", this.e);
        return c.toString();
    }
}
