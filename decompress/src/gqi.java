// 
// Decompiled by Procyon v0.6.0
// 

public final class gqi implements oun
{
    private final pii a;
    private final pii b;
    private final pii c;
    private final pii d;
    private final pii e;
    private final pii f;
    private final pii g;
    private final pii h;
    
    public gqi(final pii a, final pii b, final pii c, final pii d, final pii e, final pii f, final pii g, final pii h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    public static gqi b(final pii pii, final pii pii2, final pii pii3, final pii pii4, final pii pii5, final pii pii6, final pii pii7, final pii pii8) {
        return new gqi(pii, pii2, pii3, pii4, pii5, pii6, pii7, pii8);
    }
    
    public final gqh a() {
        return new gqh((kwd)this.a.get(), (klj)this.b.get(), (gue)this.c.get(), (kse)this.d.get(), ((gqs)this.e).a(), (fyr)this.f.get(), (gnu)this.g.get(), (kjk)this.h.get());
    }
}
