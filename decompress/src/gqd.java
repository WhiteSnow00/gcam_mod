// 
// Decompiled by Procyon v0.6.0
// 

public final class gqd implements oun
{
    private final pii a;
    private final pii b;
    private final pii c;
    private final pii d;
    private final pii e;
    private final pii f;
    private final pii g;
    
    public gqd(final pii a, final pii b, final pii c, final pii d, final pii e, final pii f, final pii g) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    public static gqd b(final pii pii, final pii pii2, final pii pii3, final pii pii4, final pii pii5, final pii pii6, final pii pii7) {
        return new gqd(pii, pii2, pii3, pii4, pii5, pii6, pii7);
    }
    
    public final gqc a() {
        return new gqc((kwd)this.a.get(), (kzl)this.b.get(), (kwz)this.c.get(), (gdg)this.d.get(), ((glw)this.e).a(), (kse)this.f.get(), (gna)this.g.get());
    }
}
