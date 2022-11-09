// 
// Decompiled by Procyon v0.6.0
// 

public final class oih extends oky implements omk
{
    public static final oih a;
    private static volatile omp c;
    private ome b;
    
    static {
        oky.G(oih.class, a = new oih());
    }
    
    private oih() {
        this.b = ome.a;
        final oms b = oms.b;
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp c;
                if ((c = oih.c) == null) {
                    synchronized (oih.class) {
                        if (oih.c == null) {
                            o = (oih.c = new oku(oih.a));
                        }
                    }
                }
                return c;
            }
            case 5: {
                return oih.a;
            }
            case 4: {
                return new okt(oih.a);
            }
            case 3: {
                return new oih();
            }
            case 2: {
                return oky.F(oih.a, "\u0001\u0001\u0000\u0000\n\n\u0001\u0001\u0000\u0000\n2", new Object[] { "b", oig.a });
            }
            case 0: {
                return 1;
            }
        }
    }
}
