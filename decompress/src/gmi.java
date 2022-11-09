// 
// Decompiled by Procyon v0.6.0
// 

public final class gmi implements oun
{
    private final pii a;
    private final pii b;
    private final pii c;
    private final pii d;
    private final pii e;
    private final pii f;
    private final pii g;
    private final pii h;
    
    public gmi(final pii a, final pii b, final pii c, final pii d, final pii e, final pii f, final pii g, final pii h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    public static gmi b(final pii pii, final pii pii2, final pii pii3, final pii pii4, final pii pii5, final pii pii6, final pii pii7, final pii pii8) {
        return new gmi(pii, pii2, pii3, pii4, pii5, pii6, pii7, pii8);
    }
    
    public final gmh a() {
        return new gmh((kwd)this.a.get(), ((fwn)this.b).b(), (blc)this.c.get(), (fvt)this.d.get(), ((bkz)this.e).a(), (grh)this.f.get(), (kkz)this.g.get(), ((ejf)this.h).a());
    }
}
