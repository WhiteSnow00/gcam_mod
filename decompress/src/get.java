// 
// Decompiled by Procyon v0.6.0
// 

public final class get implements gfg
{
    private final klj a;
    private final krr b;
    private final klj c;
    private final klj d;
    
    public get(final krq krq, final klj a) {
        this.a = a;
        this.b = krq.a("ImgCptrSwitch");
        this.c = klb.c(klq.j(a, new bol(5)));
        this.d = klb.c(klq.j(a, new bol(6)));
    }
    
    @Override
    public final klj a() {
        return this.c;
    }
    
    @Override
    public final klj b() {
        return this.d;
    }
    
    @Override
    public final void c(final gff gff, final gen gen) {
        final gfg gfg = (gfg)this.a.aQ();
        final krr b = this.b;
        final String value = String.valueOf(gfg.toString());
        String concat;
        if (value.length() != 0) {
            concat = "Running command: ".concat(value);
        }
        else {
            concat = new String("Running command: ");
        }
        b.b(concat);
        gfg.c(gff, gen);
    }
    
    @Override
    public final String toString() {
        final niy c = nfa.c(this);
        c.a(this.a);
        return c.toString();
    }
}
