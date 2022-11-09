// 
// Decompiled by Procyon v0.6.0
// 

public final class lrr extends oky implements omk
{
    public static final lrr a;
    private static volatile omp b;
    
    static {
        oky.G(lrr.class, a = new lrr());
    }
    
    private lrr() {
        final oms b = oms.b;
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp b;
                if ((b = lrr.b) == null) {
                    synchronized (lrr.class) {
                        if (lrr.b == null) {
                            o = (lrr.b = new oku(lrr.a));
                        }
                    }
                }
                return b;
            }
            case 5: {
                return lrr.a;
            }
            case 4: {
                return new okt(lrr.a);
            }
            case 3: {
                return new lrr();
            }
            case 2: {
                return oky.F(lrr.a, "\u0000\u0000", null);
            }
            case 0: {
                return 1;
            }
        }
    }
}
