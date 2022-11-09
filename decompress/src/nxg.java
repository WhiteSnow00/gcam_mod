// 
// Decompiled by Procyon v0.6.0
// 

public final class nxg extends oky implements omk
{
    public static final nxg u;
    private static volatile omp w;
    public int a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public int f;
    public nxe g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public nxf p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    private boolean v;
    
    static {
        oky.G(nxg.class, u = new nxg());
    }
    
    private nxg() {
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp w;
                if ((w = nxg.w) == null) {
                    synchronized (nxg.class) {
                        if (nxg.w == null) {
                            o = (nxg.w = new oku(nxg.u));
                        }
                    }
                }
                return w;
            }
            case 5: {
                return nxg.u;
            }
            case 4: {
                return new okt(nxg.u);
            }
            case 3: {
                return new nxg();
            }
            case 2: {
                return oky.F(nxg.u, "\u0001\u0014\u0000\u0001\u0002\u0016\u0014\u0000\u0000\u0000\u0002\u1007\u0001\u0003\u1007\u0002\u0004\u1007\u0003\u0005\u1007\u0004\u0006\u100c\u0005\u0007\u1009\u0006\b\u1007\u0007\t\u1007\b\n\u1007\t\u000b\u1007\n\f\u1007\u000b\r\u1007\f\u000e\u1007\r\u0010\u1007\u000f\u0011\u1009\u0010\u0012\u1007\u0011\u0013\u1007\u0012\u0014\u1007\u0013\u0015\u1007\u0014\u0016\u1007\u0015", new Object[] { "a", "b", "c", "d", "e", "f", lpx.j, "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "v" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
