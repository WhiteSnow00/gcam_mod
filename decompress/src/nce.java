// 
// Decompiled by Procyon v0.6.0
// 

public final class nce extends oky implements omk
{
    public static final nce b;
    private static volatile omp d;
    public int a;
    private int c;
    
    static {
        oky.G(nce.class, b = new nce());
    }
    
    private nce() {
        final oms b = oms.b;
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp d;
                if ((d = nce.d) == null) {
                    synchronized (nce.class) {
                        if (nce.d == null) {
                            o = (nce.d = new oku(nce.b));
                        }
                    }
                }
                return d;
            }
            case 5: {
                return nce.b;
            }
            case 4: {
                return new okt(nce.b);
            }
            case 3: {
                return new nce();
            }
            case 2: {
                return oky.F(nce.b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "c", "a", lpx.i });
            }
            case 0: {
                return 1;
            }
        }
    }
}
