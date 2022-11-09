// 
// Decompiled by Procyon v0.6.0
// 

public final class pbb extends pae
{
    final int c;
    
    public pbb(final owx owx, final int c) {
        super(owx);
        this.c = c;
    }
    
    @Override
    protected final void k(final psr psr) {
        this.b.i(new pba(psr, this.c));
    }
}
