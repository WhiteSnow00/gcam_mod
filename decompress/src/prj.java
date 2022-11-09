// 
// Decompiled by Procyon v0.6.0
// 

public final class prj extends oky implements omk
{
    public static final prj an;
    private static volatile omp ao;
    public long A;
    public long B;
    public long C;
    public long D;
    public long E;
    public pri F;
    public long G;
    public pri H;
    public pri I;
    public pri J;
    public pri K;
    public pri L;
    public pri M;
    public pri N;
    public pri O;
    public pri P;
    public pri Q;
    public pri R;
    public pri S;
    public pri T;
    public long U;
    public long V;
    public long W;
    public long X;
    public long Y;
    public long Z;
    public int a;
    public long aa;
    public long ab;
    public long ac;
    public long ad;
    public long ae;
    public long af;
    public long ag;
    public long ah;
    public long ai;
    public pri aj;
    public long ak;
    public long al;
    public long am;
    public int b;
    public long c;
    public long d;
    public long e;
    public long f;
    public olj g;
    public olj h;
    public olj i;
    public olj j;
    public olj k;
    public olj l;
    public pri m;
    public olj n;
    public olj o;
    public olj p;
    public olj q;
    public long r;
    public long s;
    public long t;
    public long u;
    public long v;
    public long w;
    public long x;
    public long y;
    public long z;
    
    static {
        oky.G(prj.class, an = new prj());
    }
    
    private prj() {
        this.g = oms.b;
        this.h = oms.b;
        this.i = oms.b;
        this.j = oms.b;
        this.k = oms.b;
        this.l = oms.b;
        this.n = oms.b;
        this.o = oms.b;
        this.p = oms.b;
        this.q = oms.b;
    }
    
    public final void K() {
        final olj i = this.i;
        if (!i.c()) {
            this.i = oky.C(i);
        }
    }
    
    public final void L() {
        final olj j = this.j;
        if (!j.c()) {
            this.j = oky.C(j);
        }
    }
    
    public final void M() {
        final olj k = this.k;
        if (!k.c()) {
            this.k = oky.C(k);
        }
    }
    
    public final void N() {
        final olj l = this.l;
        if (!l.c()) {
            this.l = oky.C(l);
        }
    }
    
    public final void O() {
        final olj n = this.n;
        if (!n.c()) {
            this.n = oky.C(n);
        }
    }
    
    public final void P(final long x) {
        this.a |= 0x800;
        this.x = x;
    }
    
    public final void Q(final long y) {
        this.a |= 0x1000;
        this.y = y;
    }
    
    public final void R(final long z) {
        this.a |= 0x2000;
        this.z = z;
    }
    
    public final void S(final long a) {
        this.a |= 0x4000;
        this.A = a;
    }
    
    public final void T(final long b) {
        this.a |= 0x8000;
        this.B = b;
    }
    
    public final void U(final long c) {
        this.a |= 0x10000;
        this.C = c;
    }
    
    public final void V(final long d) {
        this.a |= 0x20000;
        this.D = d;
    }
    
    public final void W(final long e) {
        this.a |= 0x40000;
        this.E = e;
    }
    
    public final void X(final pri f) {
        this.F = f;
        this.a |= 0x80000;
    }
    
    public final void Y(final long g) {
        this.a |= 0x100000;
        this.G = g;
    }
    
    public final void Z(final pri h) {
        this.H = h;
        this.a |= 0x200000;
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp ao;
                if ((ao = prj.ao) == null) {
                    synchronized (prj.class) {
                        if (prj.ao == null) {
                            o = (prj.ao = new oku(prj.an));
                        }
                    }
                }
                return ao;
            }
            case 5: {
                return prj.an;
            }
            case 4: {
                return new okt(prj.an);
            }
            case 3: {
                return new prj();
            }
            case 2: {
                return oky.F(prj.an, "\u0001?\u0000\u0002\u0001@?\u0000\n\u0000\u0001\u1002\u0000\u0002\u1002\u0001\u0003\u1002\u0002\u0004\u1002\u0003\u0005\u001b\u0006\u001b\u0007\u001b\b\u001b\t\u001b\n\u001b\u000b\u1009\u0004\f\u001b\r\u001b\u000e\u001b\u000f\u001b\u0010\u1002\u0005\u0011\u1002\u0006\u0012\u1002\u0007\u0013\u1002\b\u0014\u1002\t\u0015\u1002\n\u0016\u1002\u000b\u0017\u1002\f\u0018\u1002\r\u0019\u1002\u000e\u001a\u1002\u000f\u001b\u1002\u0010\u001c\u1002\u0011\u001d\u1002\u0012\u001e\u1009\u0013\u001f\u1002\u0014 \u1009\u0015!\u1009\u0016\"\u1009\u0017#\u1009\u0018$\u1009\u0019%\u1009\u001a&\u1009\u001b'\u1009\u001c(\u1009\u001d)\u1009\u001e*\u1009\u001f+\u1009 ,\u1009!-\u1002\".\u1002#/\u1002$0\u1002%1\u1002&2\u1002'3\u1002(4\u1002)5\u1002*6\u1002+7\u1002,8\u1002-9\u1002.:\u1002/;\u10020=\u10091>\u10022?\u10023@\u10024", new Object[] { "a", "b", "c", "d", "e", "f", "g", pri.class, "h", pri.class, "i", pri.class, "j", pri.class, "k", pri.class, "l", pri.class, "m", "n", pri.class, "o", prf.class, "p", prg.class, "q", pre.class, "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "aa", "ab", "ac", "ad", "ae", "af", "ag", "ah", "ai", "aj", "ak", "al", "am" });
            }
            case 0: {
                return 1;
            }
        }
    }
    
    public final boolean aA() {
        return (this.b & 0x100000) != 0x0;
    }
    
    public final void aa(final pri i) {
        this.I = i;
        this.a |= 0x400000;
    }
    
    public final void ab(final pri j) {
        this.J = j;
        this.a |= 0x800000;
    }
    
    public final void ac(final pri k) {
        this.K = k;
        this.a |= 0x1000000;
    }
    
    public final void ad(final pri l) {
        this.L = l;
        this.a |= 0x2000000;
    }
    
    public final void ae(final pri m) {
        this.M = m;
        this.a |= 0x4000000;
    }
    
    public final void af(final pri n) {
        this.N = n;
        this.a |= 0x8000000;
    }
    
    public final void ag(final pri o) {
        this.O = o;
        this.a |= 0x10000000;
    }
    
    public final void ah(final pri p) {
        this.P = p;
        this.a |= 0x20000000;
    }
    
    public final void ai(final pri q) {
        this.Q = q;
        this.a |= 0x40000000;
    }
    
    public final void aj(final pri r) {
        this.R = r;
        this.a |= Integer.MIN_VALUE;
    }
    
    public final void ak(final pri s) {
        this.S = s;
        this.b |= 0x1;
    }
    
    public final void al(final pri t) {
        this.T = t;
        this.b |= 0x2;
    }
    
    public final void am(final long u) {
        this.b |= 0x4;
        this.U = u;
    }
    
    public final void an(final long v) {
        this.b |= 0x8;
        this.V = v;
    }
    
    public final void ao(final long w) {
        this.b |= 0x10;
        this.W = w;
    }
    
    public final void ap(final long x) {
        this.b |= 0x20;
        this.X = x;
    }
    
    public final void aq(final long y) {
        this.b |= 0x40;
        this.Y = y;
    }
    
    public final void ar(final long z) {
        this.b |= 0x80;
        this.Z = z;
    }
    
    public final void as(final long aa) {
        this.b |= 0x100;
        this.aa = aa;
    }
    
    public final void at(final long ab) {
        this.b |= 0x200;
        this.ab = ab;
    }
    
    public final void au(final long ac) {
        this.b |= 0x400;
        this.ac = ac;
    }
    
    public final void av(final long ad) {
        this.b |= 0x800;
        this.ad = ad;
    }
    
    public final boolean aw() {
        return (this.b & 0x20000) != 0x0;
    }
    
    public final pri ax() {
        pri pri;
        if ((pri = this.aj) == null) {
            pri = pri.e;
        }
        return pri;
    }
    
    public final boolean ay() {
        return (this.b & 0x40000) != 0x0;
    }
    
    public final boolean az() {
        return (this.b & 0x80000) != 0x0;
    }
    
    public final void i() {
        final olj g = this.g;
        if (!g.c()) {
            this.g = oky.C(g);
        }
    }
    
    public final void j() {
        final olj h = this.h;
        if (!h.c()) {
            this.h = oky.C(h);
        }
    }
}
