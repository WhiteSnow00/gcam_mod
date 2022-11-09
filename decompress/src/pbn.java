// 
// Decompiled by Procyon v0.6.0
// 

public final class pbn extends pae
{
    final oyf c;
    
    public pbn(final owx owx, final oyf c) {
        super(owx);
        this.c = c;
    }
    
    public final void k(final psr psr) {
        final pih pih = new pih(psr);
        final phr phr = new phr(new pht());
        try {
            final Object a = this.c.a(phr);
            phn.g(a, "handler returned a null Publisher");
            final pbi pbi = new pbi(this.b);
            psr.bY(pbi.d = new pbm(pih, phr, pbi));
            ((psq)a).j(pbi);
            pbi.ce(0);
        }
        finally {
            final Throwable t;
            psn.e(t);
            phb.f(t, psr);
        }
    }
}
