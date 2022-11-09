// 
// Decompiled by Procyon v0.6.0
// 

public final class gpd implements oun
{
    private final pii a;
    private final pii b;
    private final pii c;
    private final pii d;
    private final pii e;
    private final pii f;
    private final pii g;
    private final pii h;
    private final pii i;
    private final pii j;
    private final pii k;
    private final pii l;
    
    public gpd(final pii a, final pii b, final pii c, final pii d, final pii e, final pii f, final pii g, final pii h, final pii i, final pii j, final pii k, final pii l) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
    }
    
    public static gpd b(final pii pii, final pii pii2, final pii pii3, final pii pii4, final pii pii5, final pii pii6, final pii pii7, final pii pii8, final pii pii9, final pii pii10, final pii pii11, final pii pii12) {
        return new gpd(pii, pii2, pii3, pii4, pii5, pii6, pii7, pii8, pii9, pii10, pii11, pii12);
    }
    
    public final gpc a() {
        return new gpc(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.i, this.j, this.k, this.l);
    }
}
