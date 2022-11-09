// 
// Decompiled by Procyon v0.6.0
// 

public final class cdi
{
    private final cqp a;
    private final cec b;
    private final cid c;
    private final lfh d;
    private final cxl e;
    private ceg f;
    private final cdn g;
    private final cds h;
    
    public cdi(final cqp a, final cec b, final cdn g, final cds h, final cid c, final lfh d, final cxl e) {
        this.a = a;
        this.b = b;
        this.g = g;
        this.h = h;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public final bkx a(final bjz bjz) {
        return this.f.a(bjz);
    }
    
    public final void b(final kwd kwd, final cfo cfo) {
        final jcx jcx = new jcx(this.d, kwd.b().c(), this.e);
        if (cfo.q) {
            if (this.a.a(cfo)) {
                this.f = this.b.a(kwd, cfo, jcx);
            }
            else {
                final cdn g = this.g;
                final cfm cfm = (cfm)g.a.get();
                cfm.getClass();
                final pii b = g.b;
                final gko d = fyd.d();
                final blc blc = (blc)g.c.get();
                blc.getClass();
                final fvt fvt = (fvt)g.d.get();
                fvt.getClass();
                final liy liy = (liy)g.e.get();
                liy.getClass();
                final cxl cxl = (cxl)g.f.get();
                cxl.getClass();
                final niz a = ((ejf)g.g).a();
                kwd.getClass();
                this.f = new cdm(cfm, d, blc, fvt, liy, cxl, a, kwd, cfo, null);
            }
        }
        else {
            final cds h = this.h;
            final cfm cfm2 = (cfm)h.a.get();
            cfm2.getClass();
            final pii b2 = h.b;
            final gko d2 = fyd.d();
            final cid cid = (cid)h.c.get();
            cid.getClass();
            final liy liy2 = (liy)h.d.get();
            liy2.getClass();
            final cxl cxl2 = (cxl)h.e.get();
            cxl2.getClass();
            kwd.getClass();
            this.f = new cdr(cfm2, d2, cid, liy2, cxl2, kwd, cfo, null);
        }
        this.c.a(cic.b).c(this.f);
    }
}
