// 
// Decompiled by Procyon v0.6.0
// 

public final class gfp implements oun
{
    private final pii a;
    private final pii b;
    private final pii c;
    private final pii d;
    
    public gfp(final pii a, final pii b, final pii c, final pii d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public static gfp b(final pii pii, final pii pii2, final pii pii3, final pii pii4) {
        return new gfp(pii, pii2, pii3, pii4);
    }
    
    public final gfg a() {
        final krq a = ((dak)this.a).a();
        final kjk kjk = (kjk)this.b.get();
        final gfg gfg = (gfg)this.c.get();
        final kkz kkz = (kkz)this.d.get();
        kjk.c(klq.l(gfg.b(), kkz));
        kkz.aR(gfg.b().aQ());
        kjk.c(klq.l(gfg.a(), new gfm(a.a("ImgCptrCmdReady"), gfg)));
        pqf.k(gfg);
        return gfg;
    }
}
