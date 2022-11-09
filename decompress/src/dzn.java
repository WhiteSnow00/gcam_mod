import java.util.concurrent.Executor;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dzn implements hze
{
    private final cxl a;
    private final hkd b;
    private final List c;
    
    public dzn(final Executor executor, final cxl a, final klv klv, final hzf hzf, final hzf hzf2, final hkd b, final iru iru, final crg crg, final bmz bmz, final klv klv2) {
        this.a = a;
        this.b = b;
        hze hze;
        if (!a.k(cxs.T)) {
            hze = hyy.a;
        }
        else {
            final hzi a2 = hzj.a();
            a2.c(executor);
            a2.a = "HdrNet";
            a2.d(new dzm(klv, 1));
            a2.e(new dzm(klv));
            a2.f(hzf);
            hze = a2.a();
        }
        hze hze2;
        if (gnb.b() && a.k(cxs.ak)) {
            bmz.i().c(crg.a(new dzj(iru, b, klv2), executor));
            final hzi a3 = hzj.a();
            a3.c(executor);
            a3.a = "HdrPlusTorch";
            a3.d(new dzk(this, crg, klv2, iru));
            a3.e(new dzl(this, iru));
            a3.f(hzf2);
            hze2 = a3.a();
        }
        else {
            hze2 = hyy.a;
        }
        this.c = nns.n(hze, hze2);
    }
    
    public final void a(final boolean b) {
        if (!this.a.k(cxs.ak)) {
            return;
        }
        this.b.d(hjq.p, b);
    }
    
    @Override
    public final void c(final hzf hzf) {
        monitorenter(this);
        try {
            final nrw t = ((nns)this.c).t();
            while (t.hasNext()) {
                ((hze)t.next()).c(hzf);
            }
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
}
