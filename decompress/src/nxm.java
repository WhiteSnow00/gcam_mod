// 
// Decompiled by Procyon v0.6.0
// 

public final class nxm extends oky implements omk
{
    public static final nxm g;
    private static volatile omp h;
    public int a;
    public int b;
    public int c;
    public float d;
    public float e;
    public int f;
    
    static {
        oky.G(nxm.class, g = new nxm());
    }
    
    private nxm() {
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp h;
                if ((h = nxm.h) == null) {
                    synchronized (nxm.class) {
                        if (nxm.h == null) {
                            o = (nxm.h = new oku(nxm.g));
                        }
                    }
                }
                return h;
            }
            case 5: {
                return nxm.g;
            }
            case 4: {
                return new okt(nxm.g);
            }
            case 3: {
                return new nxm();
            }
            case 2: {
                return oky.F(nxm.g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u100c\u0001\u0003\u1001\u0002\u0004\u1001\u0003\u0005\u100c\u0004", new Object[] { "a", "b", lpx.m, "c", lpx.m, "d", "e", "f", nxr.c() });
            }
            case 0: {
                return 1;
            }
        }
    }
}
