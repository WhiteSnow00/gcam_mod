// 
// Decompiled by Procyon v0.6.0
// 

public final class oqf extends oky implements omk
{
    public static final oqf p;
    private static volatile omp u;
    public int a;
    public int b;
    public boolean c;
    public boolean d;
    public int e;
    public int f;
    public boolean g;
    public boolean h;
    public boolean i;
    public String j;
    public String k;
    public String l;
    public boolean m;
    public boolean n;
    public oqs o;
    private int q;
    private oqr r;
    private oqt s;
    private byte t;
    
    static {
        oky.G(oqf.class, p = new oqf());
    }
    
    private oqf() {
        this.t = 2;
        final oms b = oms.b;
        this.j = "";
        this.k = "";
        this.l = "";
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
                this.t = (byte)n;
                return null;
            }
            case 6: {
                final omp u;
                if ((u = oqf.u) == null) {
                    synchronized (oqf.class) {
                        if (oqf.u == null) {
                            o = (oqf.u = new oku(oqf.p));
                        }
                    }
                }
                return u;
            }
            case 5: {
                return oqf.p;
            }
            case 4: {
                return new okt(oqf.p);
            }
            case 3: {
                return new oqf();
            }
            case 2: {
                return oky.F(oqf.p, "\u0001\u0010\u0000\u0002\u00075\u0010\u0000\u0000\u0000\u0007\u1009\u0012\b\u1004\u0006\u000e\u100c\u0005\u0016\u1009\u001a\u001e\u1007\u0018\u001f\u1007\t \u1007\u0001%\u1008\u0015&\u1008\u0016'\u1008\u0017(\u1007\u0019)\u1007\r*\u1009!.\u1007\u00020\u1007\f5\u100c\u0000", new Object[] { "a", "q", "r", "f", "e", opp.c, "o", "m", "g", "c", "j", "k", "l", "n", "i", "s", "d", "h", "b", obh.o });
            }
            case 0: {
                return this.t;
            }
        }
    }
}
