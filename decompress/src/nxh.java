// 
// Decompiled by Procyon v0.6.0
// 

public final class nxh extends oky implements omk
{
    public static final nxh c;
    private static volatile omp d;
    public int a;
    public int b;
    
    static {
        oky.G(nxh.class, c = new nxh());
    }
    
    private nxh() {
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp d;
                if ((d = nxh.d) == null) {
                    synchronized (nxh.class) {
                        if (nxh.d == null) {
                            o = (nxh.d = new oku(nxh.c));
                        }
                    }
                }
                return d;
            }
            case 5: {
                return nxh.c;
            }
            case 4: {
                return new okt(nxh.c);
            }
            case 3: {
                return new nxh();
            }
            case 2: {
                return oky.F(nxh.c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "a", "b", lpx.k });
            }
            case 0: {
                return 1;
            }
        }
    }
}
