import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gev
{
    private final oui a;
    private final oui b;
    private final fxu c;
    private final oui d;
    private final krq e;
    private final hkc f;
    
    public gev(final fxu c, final oui d, final oui a, final oui b, final Executor executor, final krq e, final kse kse, final hkc f) {
        this.c = c;
        this.d = d;
        this.a = a;
        this.b = b;
        this.e = e;
        this.f = f;
        executor.execute(new geu(kse, d, a, b));
    }
    
    public final gew a(final gfg gfg) {
        return new gew(gfg, nii.a, this.c, this.d, this.a, this.b, false, false, this.e, this.f);
    }
    
    public final gew b(final gfg gfg, final gfg gfg2) {
        return new gew(gfg, niz.i(gfg2), this.c, this.d, this.a, this.b, true, false, this.e, this.f);
    }
    
    public final gew c(final gfg gfg, final gfg gfg2) {
        return new gew(gfg, niz.i(gfg2), this.c, this.d, this.a, this.b, true, true, this.e, this.f);
    }
}
