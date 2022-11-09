import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.text.NumberFormat;

// 
// Decompiled by Procyon v0.6.0
// 

final class elt implements ero
{
    private final erm a;
    private final emf b;
    private final pii c;
    private final pii d;
    
    public elt(final emf b, final erm a) {
        this.b = b;
        this.a = a;
        final ern c = new ern(a);
        this.c = c;
        this.d = new ezm(c, b.as, 1);
    }
    
    @Override
    public final erl a() {
        final lfw lfw = (lfw)this.b.Z.get();
        final cxl cxl = (cxl)this.b.j.get();
        final NumberFormat numberFormat = (NumberFormat)this.b.fK.get();
        final dds dds = new dds(ern.b(this.a), (cxl)this.b.j.get());
        final hru hru = new hru(ern.b(this.a), (hjx)this.b.l.get(), (hkc)this.b.as.get(), (hkd)this.b.as.get(), (hrv)this.b.ew.get(), (eyt)this.b.N.get(), (cxl)this.b.j.get());
        final kjm kjm = (kjm)this.b.B.get();
        final gha gha = (gha)this.b.by.get();
        final nqr a = nqr.a;
        final nqr a2 = nqr.a;
        final nqr a3 = nqr.a;
        final klv klv = (klv)this.b.cK.get();
        final eyt eyt = (eyt)this.b.N.get();
        final klv klv2 = (klv)this.b.cM.get();
        final klv klv3 = (klv)this.b.eN.get();
        final dqj dqj = new dqj(egg.b(this.b.d), (klv)this.b.bh.get(), (eyt)this.b.N.get());
        final hxy hxy = new hxy(gts.b((klv)this.b.cM.get(), (klv)this.b.db.get(), (klv)this.b.cV.get(), (klv)this.b.W.get(), (hko)this.b.cU.get(), (hkn)this.b.cT.get(), (hkc)this.b.as.get(), (hkd)this.b.as.get()), (hyl)this.b.dK.get(), new hxu((klv)this.b.cM.get(), (klv)this.b.db.get(), (klv)this.b.cV.get(), (hko)this.b.cU.get(), (hkn)this.b.cT.get(), (hkc)this.b.as.get()), (ScheduledExecutorService)this.b.m.get(), (kjm)this.b.B.get(), (eyt)this.b.N.get(), (cxl)this.b.j.get());
        final oui a4 = oum.a(this.d);
        final kmw kmw = (kmw)this.b.cn.get();
        final hjx hjx = (hjx)this.b.l.get();
        final hkd hkd = (hkd)this.b.as.get();
        final emf b = this.b;
        final boolean d = nrr.D((liy)b.g.get(), (liz)b.f.get());
        final emf b2 = this.b;
        return new erl(lfw, cxl, dds, hru, kjm, gha, a, a2, a3, klv, eyt, klv2, klv3, dqj, hxy, a4, kmw, hjx, hkd, d, dyf.b(b2.dx, (cxl)b2.j.get()));
    }
}
