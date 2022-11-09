// 
// Decompiled by Procyon v0.6.0
// 

public final class els implements cyz
{
    private final emf a;
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
    private final pii m;
    private final pii n;
    
    public els(final emf a, final cze cze) {
        this.a = a;
        final czg b = new czg(cze);
        this.b = b;
        final czh c = new czh(cze);
        this.c = c;
        final czf d = new czf(cze);
        this.d = d;
        final drf e = new drf(d);
        this.e = e;
        final drh f = new drh(a.dj);
        this.f = f;
        final drj g = new drj(c, d);
        this.g = g;
        final drb h = new drb(a.dk, e, a.dj);
        this.h = h;
        final dre i = new dre(e, f, g, h);
        this.i = i;
        final czb j = new czb(c);
        this.j = j;
        final dna k = new dna(10);
        this.k = k;
        final dna l = new dna(9);
        this.l = l;
        final drz m = new drz(a.dk, a.o, k, l);
        this.m = m;
        this.n = oum.b(new bxh(b, c, i, j, m, e, a.o, 8, (byte[][])null));
    }
    
    @Override
    public final czc a() {
        return (czc)this.n.get();
    }
    
    @Override
    public final hvn b() {
        return (hvn)this.a.v.get();
    }
}
