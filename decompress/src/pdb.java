// 
// Decompiled by Procyon v0.6.0
// 

public final class pdb extends pcj
{
    final oxj b;
    final int c;
    
    public pdb(final oxf oxf, final oxj b, final int c) {
        super(oxf);
        this.b = b;
        this.c = c;
    }
    
    @Override
    protected final void g(final oxg oxg) {
        this.a.f(new pda(oxg, this.b.a(), this.c));
    }
}
