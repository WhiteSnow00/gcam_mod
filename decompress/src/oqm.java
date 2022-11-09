// 
// Decompiled by Procyon v0.6.0
// 

public final class oqm extends oky implements omk
{
    public static final oqm a;
    private static volatile omp d;
    private ome b;
    private ome c;
    
    static {
        oky.G(oqm.class, a = new oqm());
    }
    
    private oqm() {
        this.b = ome.a;
        this.c = ome.a;
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp d;
                if ((d = oqm.d) == null) {
                    synchronized (oqm.class) {
                        if (oqm.d == null) {
                            o = (oqm.d = new oku(oqm.a));
                        }
                    }
                }
                return d;
            }
            case 5: {
                return oqm.a;
            }
            case 4: {
                return new okt(oqm.a);
            }
            case 3: {
                return new oqm();
            }
            case 2: {
                return oky.F(oqm.a, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0002\u0000\u0000\u00012\u00022", new Object[] { "b", oql.a, "c", oqk.a });
            }
            case 0: {
                return 1;
            }
        }
    }
}
