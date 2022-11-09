// 
// Decompiled by Procyon v0.6.0
// 

public final class gfd implements gfg
{
    private final gfg a;
    private final boolean b;
    private final int c;
    
    public gfd(final gfg a, final int c, final boolean b) {
        a.getClass();
        this.a = a;
        this.c = c;
        this.b = b;
    }
    
    @Override
    public final klj a() {
        return this.a.a();
    }
    
    @Override
    public final klj b() {
        return this.a.b();
    }
    
    @Override
    public final void c(final gff gff, final gen gen) {
        gen.b.k().v(this.b);
        gen.b.Y(this.c);
        this.a.c(gff, gen);
    }
    
    @Override
    public final String toString() {
        final niy c = nfa.c(this);
        c.b("delegate", this.a);
        return c.toString();
    }
}
