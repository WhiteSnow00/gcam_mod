// 
// Decompiled by Procyon v0.6.0
// 

public final class oqi extends oky implements omk
{
    public static final oqi a;
    private static volatile omp c;
    private ome b;
    
    static {
        oky.G(oqi.class, a = new oqi());
    }
    
    private oqi() {
        this.b = ome.a;
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp c;
                if ((c = oqi.c) == null) {
                    synchronized (oqi.class) {
                        if (oqi.c == null) {
                            o = (oqi.c = new oku(oqi.a));
                        }
                    }
                }
                return c;
            }
            case 5: {
                return oqi.a;
            }
            case 4: {
                return new okt(oqi.a);
            }
            case 3: {
                return new oqi();
            }
            case 2: {
                return oky.F(oqi.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[] { "b", oqh.a });
            }
            case 0: {
                return 1;
            }
        }
    }
}
