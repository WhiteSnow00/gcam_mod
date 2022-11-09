// 
// Decompiled by Procyon v0.6.0
// 

public final class gpw implements gfg
{
    private final gfg a;
    private final efp b;
    private final efp c;
    private final gue d;
    
    public gpw(final gfg a, final efp b, final efp c, final gue d) {
        this.b = b;
        this.a = a;
        this.c = c;
        this.d = d;
    }
    
    private static fur d(final gue gue) {
        return new gpu(gue);
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
        if (this.b.c() && this.c.c()) {
            ((fun)this.b.b()).k(d(this.d), gen);
            if (gen.b.i() == hio.o) {
                ((fuu)this.c.b()).e(gen.b.h());
            }
            else {
                ((fuu)this.c.b()).f(gen.b.h());
            }
            this.a.c(gff, gen);
            ((fun)this.b.b()).i(d(this.d), gen);
            return;
        }
        this.a.c(gff, gen);
    }
    
    @Override
    public final String toString() {
        final niy c = nfa.c(this);
        c.b("delegate", this.a);
        return c.toString();
    }
}
