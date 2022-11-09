// 
// Decompiled by Procyon v0.6.0
// 

public final class lrw extends oky implements omk
{
    public static final lrw a;
    private static volatile omp b;
    
    static {
        oky.G(lrw.class, a = new lrw());
    }
    
    private lrw() {
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
                if ((b = lrw.b) == null) {
                    synchronized (lrw.class) {
                        if (lrw.b == null) {
                            o = (lrw.b = new oku(lrw.a));
                        }
                    }
                }
                return b;
            }
            case 5: {
                return lrw.a;
            }
            case 4: {
                return new okt(lrw.a);
            }
            case 3: {
                return new lrw();
            }
            case 2: {
                return oky.F(lrw.a, "\u0001\u0000", null);
            }
            case 0: {
                return 1;
            }
        }
    }
}
