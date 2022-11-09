// 
// Decompiled by Procyon v0.6.0
// 

public final class nyw extends oky implements omk
{
    public static final nyw i;
    private static volatile omp j;
    public int a;
    public int b;
    public ole c;
    public ole d;
    public int e;
    public int f;
    public int g;
    public int h;
    
    static {
        oky.G(nyw.class, i = new nyw());
    }
    
    private nyw() {
        this.c = okr.b;
        this.d = okr.b;
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp j;
                if ((j = nyw.j) == null) {
                    synchronized (nyw.class) {
                        if (nyw.j == null) {
                            o = (nyw.j = new oku(nyw.i));
                        }
                    }
                }
                return j;
            }
            case 5: {
                return nyw.i;
            }
            case 4: {
                return new okt(nyw.i);
            }
            case 3: {
                return new nyw();
            }
            case 2: {
                return oky.F(nyw.i, "\u0001\u0007\u0000\u0001\u0001\t\u0007\u0000\u0002\u0000\u0001\u100c\u0000\u0002\u0013\u0003\u0013\u0004\u1004\u0001\u0006\u1004\u0003\u0007\u1004\u0004\t\u1004\u0006", new Object[] { "a", "b", nxw.o, "c", "d", "e", "f", "g", "h" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
