// 
// Decompiled by Procyon v0.6.0
// 

public final class ghc implements oun
{
    private final pii a;
    private final pii b;
    private final /* synthetic */ int c;
    
    public ghc(final pii a, final pii b) {
        this.a = a;
        this.b = b;
    }
    
    public ghc(final pii a, final pii b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public ghc(final pii b, final pii a, final int c, final byte[] array) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public final klj a() {
        switch (this.c) {
            default: {
                final hkd hkd = (hkd)this.b.get();
                return new ggy(hkd.b(hjq.i), hkd.b(hjq.j), ((fzw)this.a).a(), ggv.b);
            }
            case 1: {
                final fxu a = ((fzw)this.a).a();
                klj klj;
                if (((cxl)this.b.get()).k(cxz.i)) {
                    klj = klq.g(lft.a);
                }
                else {
                    klj = klq.g(a.k());
                }
                return klj;
            }
            case 0: {
                final cxl cxl = (cxl)this.a.get();
                final hkd hkd2 = (hkd)this.b.get();
                klj klj2;
                if (cxl.k(cxs.ak)) {
                    klj2 = hkd2.b(hjq.p);
                }
                else {
                    klj2 = klq.g(false);
                }
                return klj2;
            }
        }
    }
}
