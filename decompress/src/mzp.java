// 
// Decompiled by Procyon v0.6.0
// 

public final class mzp implements myy
{
    public final oui a;
    public final mza b;
    public final lmy c;
    
    public mzp(final oui a, final mza b, final lmy c) {
        a.getClass();
        b.getClass();
        c.getClass();
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    private final oxk d(final oey oey, final myz myz) {
        final pfi pfi = new pfi(mvc.g(oey), new mzo(this, myz));
        pip.o();
        return pfi;
    }
    
    @Override
    public final owt a(final myz myz, final oni oni) {
        oni.getClass();
        return this.d(((ajf)this.a.get()).a("F250_AUTO_WORKER_TAG"), myz).a(new mzj(this, oni, myz));
    }
    
    @Override
    public final owt b(final myz myz, final ain ain) {
        ain.getClass();
        return mvc.d(this.d(((ajf)this.a.get()).a("F250_WORKER_TAG"), myz).a(new mzk(this, ain, myz)), new mzl(this, ain, myz));
    }
    
    public final owt c(final ajc ajc, final myz myz, final int n) {
        return mvc.g(((ajn)ajc).c).e().c(new mzm(this, myz)).b(new mzn(this, myz, n));
    }
}
