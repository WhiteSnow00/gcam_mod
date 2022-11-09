// 
// Decompiled by Procyon v0.6.0
// 

public final class pbx extends owz
{
    final mym a;
    
    public pbx(final mym a) {
        this.a = a;
    }
    
    @Override
    protected final void c(final oxa oxa) {
        final pbw pbw = new pbw(oxa);
        oxa.bV(pbw);
        try {
            final mym a = this.a;
            ((keg)a.b.a()).g(a.a.a(), new myl(a.a, pbw, (myz)a.c.a()));
        }
        finally {
            final Throwable t;
            psn.e(t);
            pbw.c(t);
        }
    }
}
