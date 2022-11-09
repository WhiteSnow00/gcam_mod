// 
// Decompiled by Procyon v0.6.0
// 

public final class par extends pae
{
    final oyg c;
    
    public par(final owx owx, final oyg c) {
        super(owx);
        this.c = c;
    }
    
    @Override
    protected final void k(final psr psr) {
        if (psr instanceof oyx) {
            this.b.i(new pgv((oyx)psr, this.c));
            return;
        }
        this.b.i(new pgw(psr, this.c));
    }
}
