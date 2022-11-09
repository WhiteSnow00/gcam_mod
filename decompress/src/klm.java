// 
// Decompiled by Procyon v0.6.0
// 

final class klm extends kmg
{
    final /* synthetic */ nir a;
    final /* synthetic */ klj b;
    
    public klm(final klj klj, final nir a, final klj b) {
        this.a = a;
        this.b = b;
        super(klj);
    }
    
    @Override
    protected final Object c(final Object o) {
        return this.a.a(o);
    }
    
    @Override
    public final String toString() {
        final niy d = nfa.d("TransformedObs");
        d.b("input", this.b);
        d.b("func", this.a);
        return d.toString();
    }
}
