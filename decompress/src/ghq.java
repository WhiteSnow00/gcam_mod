import j$.util.function.Consumer;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ghq implements oun
{
    private final pii a;
    private final pii b;
    private final pii c;
    private final pii d;
    private final pii e;
    private final pii f;
    
    public ghq(final pii a, final pii b, final pii c, final pii d, final pii e, final pii f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public static ghq a(final pii pii, final pii pii2, final pii pii3, final pii pii4, final pii pii5, final pii pii6) {
        return new ghq(pii, pii2, pii3, pii4, pii5, pii6);
    }
    
    public final njp b() {
        final cxl cxl = (cxl)this.a.get();
        final hzg hzg = (hzg)this.b.get();
        final jbm a = ((fyy)this.c).a();
        final hzf a2 = ((hzv)this.d).a();
        final kjk kjk = (kjk)this.e.get();
        final duq duq = (duq)this.f.get();
        final int intValue = (int)cxl.a(cxz.f).c();
        final jbm m = jbm.m;
        boolean b = false;
        final boolean b2 = a == m;
        if (a == jbm.b && cxl.k(cxs.W)) {
            b = true;
        }
        else if (a == jbm.g && cxl.k(cxs.X)) {
            b = true;
        }
        njp g;
        if (!b2 && !b) {
            g = nov.G(intValue);
        }
        else {
            final int intValue2 = (int)cxl.a(cxz.g).c();
            final int intValue3 = (int)cxl.a(cxz.h).c();
            final kkz kkz = new kkz(intValue2);
            final ghp ghp = new ghp(kkz);
            final hzi a3 = hzj.a();
            a3.a = "SmartMeteringExtendedPeriod";
            a3.c(odx.a);
            a3.f(a2);
            a3.e(new gho((Consumer)ghp, intValue2, 1));
            a3.d(new gho((Consumer)ghp, intValue3));
            kjk.c(hzg.d(a3.a()));
            g = new ghn(b2, duq, kkz, intValue);
        }
        return g;
    }
}
