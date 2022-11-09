// 
// Decompiled by Procyon v0.6.0
// 

public final class ope extends oky implements omk
{
    public static final ope a;
    private static volatile omp b;
    
    static {
        oky.G(ope.class, a = new ope());
    }
    
    private ope() {
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
                if ((b = ope.b) == null) {
                    synchronized (ope.class) {
                        if (ope.b == null) {
                            o = (ope.b = new oku(ope.a));
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ope.a;
            }
            case 4: {
                return new okt(ope.a);
            }
            case 3: {
                return new ope();
            }
            case 2: {
                return oky.F(ope.a, "\u0001\u0000", null);
            }
            case 0: {
                return 1;
            }
        }
    }
}
