// 
// Decompiled by Procyon v0.6.0
// 

public final class glw implements oun
{
    private final pii a;
    private final pii b;
    private final pii c;
    private final pii d;
    private final pii e;
    private final pii f;
    private final pii g;
    
    public glw(final pii a, final pii b, final pii c, final pii d, final pii e, final pii f, final pii g) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    public static glw b(final pii pii, final pii pii2, final pii pii3, final pii pii4, final pii pii5, final pii pii6, final pii pii7) {
        return new glw(pii, pii2, pii3, pii4, pii5, pii6, pii7);
    }
    
    public final glv a() {
        return new glv((kse)this.a.get(), ((dak)this.b).a(), (fwd)this.c.get(), ((ghb)this.d).a(), (klj)this.e.get(), (jcx)this.f.get(), (cxl)this.g.get());
    }
}
