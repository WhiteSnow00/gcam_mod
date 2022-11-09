// 
// Decompiled by Procyon v0.6.0
// 

public final class nxt extends oky implements omk
{
    public static final nxt ak;
    private static volatile omp am;
    public oaz A;
    public nzu B;
    public String C;
    public nxi D;
    public oay E;
    public obk F;
    public oau G;
    public oag H;
    public nza I;
    public nzb J;
    public obd K;
    public int L;
    public nyb M;
    public obv N;
    public oai O;
    public nzm P;
    public oan Q;
    public long R;
    public nzy S;
    public oax T;
    public nzj U;
    public nyo V;
    public nxh W;
    public nyp X;
    public obq Y;
    public obp Z;
    public int a;
    public nxv aa;
    public obi ab;
    public nxx ac;
    public nzg ad;
    public nzf ae;
    public nyl af;
    public nys ag;
    public obg ah;
    public obx ai;
    public nxq aj;
    private byte al;
    public int b;
    public int c;
    public int d;
    public String e;
    public oak f;
    public nyd g;
    public oae h;
    public nzc i;
    public nxu j;
    public nyn k;
    public nyc l;
    public nxo m;
    public nyi n;
    public nyf o;
    public nye p;
    public nya q;
    public oal r;
    public nym s;
    public nxp t;
    public nyg u;
    public nyh v;
    public int w;
    public long x;
    public int y;
    public boolean z;
    
    static {
        oky.G(nxt.class, ak = new nxt());
    }
    
    private nxt() {
        this.al = 2;
        this.e = "";
        this.C = "";
    }
    
    @Override
    protected final Object a(int n, Object o) {
        final int n2 = 1;
        switch (n - 1) {
            default: {
                n = n2;
                if (o == null) {
                    n = 0;
                }
                this.al = (byte)n;
                return null;
            }
            case 6: {
                final omp am;
                if ((am = nxt.am) == null) {
                    synchronized (nxt.class) {
                        if (nxt.am == null) {
                            o = (nxt.am = new oku(nxt.ak));
                        }
                    }
                }
                return am;
            }
            case 5: {
                return nxt.ak;
            }
            case 4: {
                return new okt(nxt.ak);
            }
            case 3: {
                return new nxt();
            }
            case 2: {
                return oky.F(nxt.ak, "\u0001;\u0000\u0003\u0001O;\u0000\u0000\u0001\u0001\u100c\u0000\u0003\u1008\u0002\u0004\u1009\u0003\u0006\u1009\u0004\u0007\u1009\u0005\b\u1009\u0006\t\u1009\u0007\f\u1009\b\r\u1009\t\u0011\u1009\r\u0012\u1009\u000e\u0013\u1009\u000f\u0014\u1009\u0010\u0015\u1009\u0011\u0016\u1009\u0012\u0017\u1009\u0013\u0018\u1009\u0014\u0019\u1009\u0015\u001a\u1009\u0016 \u1004\u001a!\u1005\u001b\"\u100c\u001c#\u1007\u001d$\u1009\u001e&\u1009 (\u1008\")\u1009#*\u1009$.\u1009(/\u1009)0\u1009*1\u1009+2\u1009,3\u1009-4\u100c.5\u1009/6\u140907\u100918\u100929\u10093:\u10054<\u10096=\u10097>\u10098?\u10099@\u1009:A\u1009;B\u1009<C\u1009=D\u1009>E\u1009?F\u1009@G\u1009AH\u1009BI\u1009CJ\u1009DK\u1009EN\u1009HO\u1009I", new Object[] { "a", "b", "c", "d", lpx.s, "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", lpx.r, "z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", oah.d, "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "aa", "ab", "ac", "ad", "ae", "af", "ag", "ah", "ai", "aj" });
            }
            case 0: {
                return this.al;
            }
        }
    }
}
