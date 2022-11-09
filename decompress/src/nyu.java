// 
// Decompiled by Procyon v0.6.0
// 

public final class nyu extends oky implements omk
{
    public static final nyu p;
    private static volatile omp q;
    public int a;
    public String b;
    public String c;
    public float d;
    public int e;
    public float f;
    public float g;
    public boolean h;
    public int i;
    public int j;
    public int k;
    public boolean l;
    public int m;
    public float n;
    public float o;
    
    static {
        oky.G(nyu.class, p = new nyu());
    }
    
    private nyu() {
        this.b = "";
        this.c = "";
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp q;
                if ((q = nyu.q) == null) {
                    synchronized (nyu.class) {
                        if (nyu.q == null) {
                            o = (nyu.q = new oku(nyu.p));
                        }
                    }
                }
                return q;
            }
            case 5: {
                return nyu.p;
            }
            case 4: {
                return new okt(nyu.p);
            }
            case 3: {
                return new nyu();
            }
            case 2: {
                return oky.F(nyu.p, "\u0001\u000e\u0000\u0001\u0001\u0010\u000e\u0000\u0000\u0000\u0001\u1008\u0000\u0003\u1008\u0002\u0004\u1001\u0003\u0005\u1004\u0004\u0006\u1001\u0005\u0007\u1001\u0006\t\u1007\b\n\u1004\t\u000b\u1004\n\f\u1004\u000b\r\u1007\f\u000e\u1004\r\u000f\u1001\u000e\u0010\u1001\u000f", new Object[] { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
