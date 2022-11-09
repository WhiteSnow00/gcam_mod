// 
// Decompiled by Procyon v0.6.0
// 

public final class gpv
{
    private final efp a;
    private final efp b;
    private final oui c;
    private final boolean d;
    
    public gpv(final oui oui, final oui oui2, final oui c, final niz niz) {
        this.a = efp.a(oui);
        this.b = efp.a(oui2);
        this.c = c;
        this.d = (boolean)niz.e(false);
    }
    
    public final gfg a(final gfg gfg) {
        if (!this.d) {
            return gfg;
        }
        return new gpw(gfg, this.a, this.b, (gue)this.c.get());
    }
}
