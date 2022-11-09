// 
// Decompiled by Procyon v0.6.0
// 

public final class nxs extends oky implements omk
{
    public static final nxs c;
    private static volatile omp d;
    public int a;
    public int b;
    
    static {
        oky.G(nxs.class, c = new nxs());
    }
    
    private nxs() {
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp d;
                if ((d = nxs.d) == null) {
                    synchronized (nxs.class) {
                        if (nxs.d == null) {
                            o = (nxs.d = new oku(nxs.c));
                        }
                    }
                }
                return d;
            }
            case 5: {
                return nxs.c;
            }
            case 4: {
                return new okt(nxs.c);
            }
            case 3: {
                return new nxs();
            }
            case 2: {
                return oky.F(nxs.c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u100c\u0001", new Object[] { "a", "b", lpx.p });
            }
            case 0: {
                return 1;
            }
        }
    }
}
