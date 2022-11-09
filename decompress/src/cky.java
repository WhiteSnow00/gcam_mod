// 
// Decompiled by Procyon v0.6.0
// 

public final class cky implements oun
{
    private final pii a;
    private final pii b;
    private final pii c;
    private final pii d;
    
    public cky(final pii a, final pii b, final pii c, final pii d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final ckz a() {
        final oui a = oum.a(this.a);
        final oui a2 = oum.a(this.b);
        final cek cek = (cek)this.c.get();
        final cxl cxl = (cxl)this.d.get();
        ckz ckz;
        if (cek.a() == jbm.c) {
            final cxo a3 = cwv.a;
            cxl.e();
            ckz = (ckz)a.get();
        }
        else {
            ckz = (ckz)a2.get();
        }
        pqf.k(ckz);
        return ckz;
    }
}
