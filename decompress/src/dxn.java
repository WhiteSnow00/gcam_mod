import java.util.concurrent.Executor;
import j$.util.function.Supplier;

// 
// Decompiled by Procyon v0.6.0
// 

final class dxn implements Supplier
{
    public boolean a;
    private final boolean b;
    private final boolean c;
    private final klj d;
    
    public dxn(final hzg hzg, final hzf hzf, final klj d, final dwf dwf, final cxl cxl, final kjk kjk) {
        this.a = false;
        this.d = d;
        this.b = (dwf == dwf.a || dwf == dwf.b);
        this.c = ((cxl.k(cxs.W) && dwf == dwf.a) || (cxl.k(cxs.X) && dwf == dwf.b));
        final hzi a = hzj.a();
        a.c(odx.a);
        a.a = "TemporalBinning";
        a.f(hzf);
        a.e(new dxm(this, false));
        a.d(new dxm(this, true));
        kjk.c(hzg.d(a.a()));
    }
}
