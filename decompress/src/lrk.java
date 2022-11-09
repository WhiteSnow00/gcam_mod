// 
// Decompiled by Procyon v0.6.0
// 

public final class lrk extends oky implements omk
{
    public static final lrk L;
    private static volatile omp M;
    public boolean A;
    public boolean B;
    public lrw C;
    public boolean D;
    public ojw E;
    public boolean F;
    public lro G;
    public boolean H;
    public boolean I;
    public boolean J;
    public long K;
    public int a;
    public int b;
    public boolean c;
    public boolean d;
    public lrl e;
    public boolean f;
    public boolean g;
    public int h;
    public lrn i;
    public int j;
    public boolean k;
    public int l;
    public boolean m;
    public boolean n;
    public boolean o;
    public olj p;
    public int q;
    public lrm r;
    public int s;
    public boolean t;
    public int u;
    public boolean v;
    public boolean w;
    public boolean x;
    public long y;
    public lrj z;
    
    static {
        oky.G(lrk.class, L = new lrk());
    }
    
    private lrk() {
        this.j = 1;
        this.l = 3;
        this.p = oms.b;
        this.s = 1;
        this.w = true;
        this.A = true;
        this.E = ojw.b;
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp m;
                if ((m = lrk.M) == null) {
                    synchronized (lrk.class) {
                        if (lrk.M == null) {
                            o = (lrk.M = new oku(lrk.L));
                        }
                    }
                }
                return m;
            }
            case 5: {
                return lrk.L;
            }
            case 4: {
                return new okt(lrk.L);
            }
            case 3: {
                return new lrk();
            }
            case 2: {
                return oky.F(lrk.L, "\u0001#\u0000\u0002\u0001%#\u0000\u0001\u0000\u0001\u1007\u0000\u0002\u1007\u0001\u0003\u1009\u0002\u0004\u1007\u0003\u0005\u1007\u0004\u0007\u1004\u0005\b\u1009\u0006\t\u100c\u0007\n\u1007\b\u000b\u1004\t\f\u1007\n\u000e\u1007\u000b\u000f\u1007\f\u0010\u001b\u0011\u100c\r\u0012\u1009\u000e\u0013\u100c\u000f\u0014\u1007\u0010\u0015\u100c\u0011\u0016\u1007\u0012\u0017\u1007\u0013\u0018\u1007\u0014\u0019\u1003\u0015\u001a\u1009\u0016\u001b\u1007\u0017\u001c\u1007\u0018\u001d\u1009\u0019\u001e\u1007\u001a\u001f\u100a\u001b \u1007\u001c!\u1009\u001d\"\u1007\u001e#\u1007\u001f$\u1003!%\u1007 ", new Object[] { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", lpx.f, "k", "l", "m", "n", "o", "p", lrp.class, "q", lri.c(), "r", "s", lpx.c, "t", "u", lpx.d, "v", "w", "x", "y", "z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "K", "J" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
