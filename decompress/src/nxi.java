// 
// Decompiled by Procyon v0.6.0
// 

public final class nxi extends oky implements omk
{
    public static final nxi c;
    private static volatile omp d;
    public int a;
    public int b;
    
    static {
        oky.G(nxi.class, c = new nxi());
    }
    
    private nxi() {
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp d;
                if ((d = nxi.d) == null) {
                    synchronized (nxi.class) {
                        if (nxi.d == null) {
                            o = (nxi.d = new oku(nxi.c));
                        }
                    }
                }
                return d;
            }
            case 5: {
                return nxi.c;
            }
            case 4: {
                return new okt(nxi.c);
            }
            case 3: {
                return new nxi();
            }
            case 2: {
                return oky.F(nxi.c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "a", "b", lpx.k });
            }
            case 0: {
                return 1;
            }
        }
    }
}
