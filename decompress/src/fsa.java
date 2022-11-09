// 
// Decompiled by Procyon v0.6.0
// 

public final class fsa implements oun
{
    private final pii a;
    private final pii b;
    private final pii c;
    
    public fsa(final pii a, final pii b, final pii c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public static fsa a(final pii pii, final pii pii2, final pii pii3) {
        return new fsa(pii, pii2, pii3);
    }
    
    public final fsj b() {
        final cxl cxl = (cxl)this.a.get();
        final fsk fsk = (fsk)this.b.get();
        fsj fsj = (ftz)this.c.get();
        if (cxl.k(cxx.t)) {
            fsj = fsk;
        }
        pqf.k(fsj);
        return fsj;
    }
}
