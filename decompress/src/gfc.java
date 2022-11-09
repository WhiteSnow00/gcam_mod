// 
// Decompiled by Procyon v0.6.0
// 

public final class gfc implements gfg
{
    private final gfg a;
    private final kri b;
    
    public gfc(final gfg a, final kri b) {
        this.a = a;
        this.b = b;
    }
    
    private final void d(final fvl fvl) {
        this.b.aR(fvl);
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
        try {
            this.d(fvl.b);
            this.a.c(gff, gen);
        }
        finally {
            this.d(fvl.a);
        }
    }
    
    @Override
    public final String toString() {
        final niy c = nfa.c(this);
        c.b("delegate", this.a);
        return c.toString();
    }
}
