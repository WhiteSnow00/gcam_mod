// 
// Decompiled by Procyon v0.6.0
// 

public final class oqr extends oky implements omk
{
    public static final oqr a;
    private static volatile omp k;
    private int b;
    private ome c;
    private ome d;
    private oqm e;
    private oqm f;
    private ome g;
    private oqm h;
    private ome i;
    private ome j;
    
    static {
        oky.G(oqr.class, a = new oqr());
    }
    
    private oqr() {
        this.c = ome.a;
        this.d = ome.a;
        this.g = ome.a;
        this.i = ome.a;
        this.j = ome.a;
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp k;
                if ((k = oqr.k) == null) {
                    synchronized (oqr.class) {
                        if (oqr.k == null) {
                            o = (oqr.k = new oku(oqr.a));
                        }
                    }
                }
                return k;
            }
            case 5: {
                return oqr.a;
            }
            case 4: {
                return new okt(oqr.a);
            }
            case 3: {
                return new oqr();
            }
            case 2: {
                return oky.F(oqr.a, "\u0001\b\u0000\u0001\u0001\u0014\b\u0005\u0000\u0000\u00012\u00052\u0007\u1009\n\b\u1009\u0003\t2\u00122\u0013\u1009\u000b\u00142", new Object[] { "b", "c", oqn.a, "d", oqj.a, "f", "e", "j", oqg.a, "g", oqo.a, "h", "i", oqp.a });
            }
            case 0: {
                return 1;
            }
        }
    }
}
