import android.media.MediaFormat;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fio implements oun
{
    private final pii a;
    private final pii b;
    private final pii c;
    
    public fio(final pii a, final pii b, final pii c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public static fio b(final pii pii, final pii pii2, final pii pii3) {
        return new fio(pii, pii2, pii3);
    }
    
    public final MediaFormat a() {
        final cxl cxl = (cxl)this.a.get();
        ((fiu)this.b).a();
        final kre kre = (kre)this.c.get();
        final boolean k = cxl.k(cxr.L);
        final cxo a = cxw.a;
        cxl.e();
        final MediaFormat a2 = fin.a(kre, 12000000, 0.23333333f, k);
        pqf.k(a2);
        return a2;
    }
}
