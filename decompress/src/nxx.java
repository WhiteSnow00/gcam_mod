// 
// Decompiled by Procyon v0.6.0
// 

public final class nxx extends oky implements omk
{
    public static final nxx g;
    private static volatile omp h;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    
    static {
        oky.G(nxx.class, g = new nxx());
    }
    
    private nxx() {
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp h;
                if ((h = nxx.h) == null) {
                    synchronized (nxx.class) {
                        if (nxx.h == null) {
                            o = (nxx.h = new oku(nxx.g));
                        }
                    }
                }
                return h;
            }
            case 5: {
                return nxx.g;
            }
            case 4: {
                return new okt(nxx.g);
            }
            case 3: {
                return new nxx();
            }
            case 2: {
                return oky.F(nxx.g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u100c\u0001\u0003\u100c\u0002\u0004\u100c\u0003\u0005\u100c\u0004", new Object[] { "a", "b", nxw.b, "c", lpx.u, "d", nxw.a, "e", nxr.c(), "f", nxw.c });
            }
            case 0: {
                return 1;
            }
        }
    }
}
