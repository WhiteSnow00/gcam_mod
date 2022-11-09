// 
// Decompiled by Procyon v0.6.0
// 

public final class nxu extends oky implements omk
{
    public static final nxu m;
    private static volatile omp n;
    public int a;
    public int b;
    public String c;
    public String d;
    public int e;
    public int f;
    public int g;
    public nzr h;
    public olf i;
    public int j;
    public boolean k;
    public olj l;
    
    static {
        oky.G(nxu.class, m = new nxu());
    }
    
    private nxu() {
        this.c = "";
        this.d = "";
        final okz b = okz.b;
        this.i = okz.b;
        this.l = oms.b;
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp n2;
                if ((n2 = nxu.n) == null) {
                    synchronized (nxu.class) {
                        if (nxu.n == null) {
                            o = (nxu.n = new oku(nxu.m));
                        }
                    }
                }
                return n2;
            }
            case 5: {
                return nxu.m;
            }
            case 4: {
                return new okt(nxu.m);
            }
            case 3: {
                return new nxu();
            }
            case 2: {
                return oky.F(nxu.m, "\u0001\u000b\u0000\u0001\u0001\r\u000b\u0000\u0002\u0000\u0001\u100c\u0000\u0002\u1008\u0001\u0003\u1008\u0002\u0004\u1004\u0003\u0005\u1004\u0004\u0007\u1004\u0006\b\u1009\u0007\n\u001e\u000b\u1004\b\f\u1007\t\r\u001a", new Object[] { "a", "b", lpx.t, "c", "d", "e", "f", "g", "h", "i", nxr.c(), "j", "k", "l" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
