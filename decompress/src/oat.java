// 
// Decompiled by Procyon v0.6.0
// 

public final class oat extends oky implements omk
{
    public static final oat p;
    private static volatile omp q;
    public int a;
    public String b;
    public int c;
    public int d;
    public long e;
    public long f;
    public int g;
    public int h;
    public int i;
    public float j;
    public olj k;
    public float l;
    public float m;
    public float n;
    public float o;
    
    static {
        oky.G(oat.class, p = new oat());
    }
    
    private oat() {
        this.b = "";
        this.k = oms.b;
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp q;
                if ((q = oat.q) == null) {
                    synchronized (oat.class) {
                        if (oat.q == null) {
                            o = (oat.q = new oku(oat.p));
                        }
                    }
                }
                return q;
            }
            case 5: {
                return oat.p;
            }
            case 4: {
                return new okt(oat.p);
            }
            case 3: {
                return new oat();
            }
            case 2: {
                return oky.F(oat.p, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0001\u0000\u0001\u1008\u0000\u0002\u1004\u0001\u0003\u100c\u0002\u0004\u1002\u0003\u0005\u1002\u0004\u0006\u1004\u0005\u0007\u1004\u0006\b\u1004\u0007\t\u1001\b\n\u001b\u000b\u1001\t\f\u1001\n\r\u1001\u000b\u000e\u1001\f", new Object[] { "a", "b", "c", "d", oah.j, "e", "f", "g", "h", "i", "j", "k", oas.class, "l", "m", "n", "o" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
