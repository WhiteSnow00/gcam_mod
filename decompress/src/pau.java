// 
// Decompiled by Procyon v0.6.0
// 

public final class pau extends pae
{
    final oyf c;
    final int d;
    final int e;
    
    public pau(final owx owx, final oyf c, final int d, final int e) {
        super(owx);
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public static owy m(final psr psr, final oyf oyf, final int n, final int n2) {
        return new pat(psr, oyf, n, n2);
    }
    
    @Override
    protected final void k(final psr psr) {
        if (phn.f(this.b, psr, this.c)) {
            return;
        }
        this.b.i(m(psr, this.c, this.d, this.e));
    }
}
