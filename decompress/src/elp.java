// 
// Decompiled by Procyon v0.6.0
// 

public final class elp implements iao
{
    public final pii a;
    private final emf b;
    private final elr c;
    private final elq d;
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
    private final pii o;
    private final pii p;
    private final pii q;
    private final pii r;
    private final pii s;
    private final pii t;
    
    public elp(final emf b, final elr c, final elq d) {
        this.b = b;
        this.c = c;
        this.d = d;
        final pii b2 = oum.b(new hku(20));
        this.e = b2;
        final pii b3 = oum.b(new hzw(b.j, 10));
        this.f = b3;
        final idq g = new idq(b3);
        this.g = g;
        final idi h = new idi(g);
        this.h = h;
        final pii b4 = oum.b(new gts(b.bX, c.p, b.f, h, b.j, c.T, d.t, d.u, 8, (byte[][])null));
        this.i = b4;
        final pii b5 = oum.b(new hzw(c.j, 11));
        this.j = b5;
        final pii b6 = oum.b(new ied(c.j, b5, b.B));
        this.k = b6;
        final pii b7 = oum.b(new iga(1));
        this.a = b7;
        final pii b8 = oum.b(new ifk(c.j, b7, d.u, d.j, c.q, 1));
        this.l = b8;
        final pii b9 = oum.b(new icz(d.k, d.i, c.p, d.g, c.j, b.f, d.n, b6, c.au, b.j, b7, d.u, b.B, d.j, c.am, b.x, d.m, b8, c.Q, d.l, d.q, d.d, d.w, d.s, d.D, d.v, d.o));
        this.m = b9;
        final pii b10 = oum.b(new gtm(b.cr, b.cs, d.f, d.E, b.j, b.eB, b.eF, b.x, b9, b.ey, 6, (boolean[])null));
        this.n = b10;
        final pii b11 = oum.b(new huu(b.j, d.u, 17));
        this.o = b11;
        final pii b12 = oum.b(new ibg(b.g, b.eM, b.j, d.x, c.p, b.Y, b.f, b2, b4, b.dJ, b.B, c.t, b.et, b.bu, b.bB, b.bD, b.eF, b.dq, b10, b11, b.o, c.T, d.B, d.t, d.l, c.w));
        this.p = b12;
        final iag q = new iag(d.i, d.n, b.j, d.p, d.q, d.o, d.m, b9, c.Q);
        this.q = q;
        final pii b13 = oum.b(new hzw(q, 8));
        this.r = b13;
        final ich s = new ich(d.d, b.p, b7, b.B, d.r, b.ed, c.aw, b.dK, b.bO, b9);
        this.s = s;
        this.t = oum.b(new ibv(b.bX, c.p, c.N, d.e, c.j, d.F, b.p, b4, b.j, c.K, b7, b.B, d.j, c.t, d.u, d.g, c.ae, b.x, b10, b11, b12, b13, s, b9, b.o, b.N, c.T, b.cU, d.t, c.aE, d.h, d.C, d.G, d.z, d.l, d.H));
    }
    
    @Override
    public final ibu a() {
        return (ibu)this.t.get();
    }
}
