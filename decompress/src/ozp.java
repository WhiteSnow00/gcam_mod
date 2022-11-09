// 
// Decompiled by Procyon v0.6.0
// 

public final class ozp extends owt
{
    final myq a;
    
    public ozp(final myq a) {
        this.a = a;
    }
    
    @Override
    protected final void j(final owu owu) {
        final ozo ozo = new ozo(owu);
        owu.bV(ozo);
        try {
            final myq a = this.a;
            a.a.a.a().g(a.a.a(), new myp(a, ozo));
        }
        finally {
            final Throwable t;
            psn.e(t);
            ozo.b(t);
        }
    }
}
