// 
// Decompiled by Procyon v0.6.0
// 

public final class dqa implements oun
{
    private final pii a;
    private final pii b;
    private final pii c;
    private final pii d;
    
    public dqa(final pii a, final pii b, final pii c, final pii d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public static dqa a(final pii pii, final pii pii2, final pii pii3, final pii pii4) {
        return new dqa(pii, pii2, pii3, pii4);
    }
    
    public final Boolean b() {
        final ddm a = ((ddn)this.a).a();
        final cxl cxl = (cxl)this.b.get();
        final fex a2 = ((fzi)this.c).a();
        final fxu a3 = ((fzw)this.d).a();
        final cxo a4 = cxr.a;
        cxl.b();
        final boolean a5 = a.a();
        boolean b = true;
        final boolean b2 = a5 && a2.a;
        final boolean b3 = cxl.j(cyh.b) && a3.l() == lfu.b;
        if (!b2) {
            if (!b3) {
                b = false;
            }
        }
        return b;
    }
}
