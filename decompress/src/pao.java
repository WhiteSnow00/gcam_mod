// 
// Decompiled by Procyon v0.6.0
// 

public final class pao extends pae
{
    final oyf c;
    
    public pao(final owx owx, final oyf c) {
        super(owx);
        this.c = c;
    }
    
    @Override
    protected final void k(final psr psr) {
        if (phn.f(this.b, psr, this.c)) {
            return;
        }
        this.b.j(new pak(psr, this.c));
    }
}
