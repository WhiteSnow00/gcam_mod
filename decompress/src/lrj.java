// 
// Decompiled by Procyon v0.6.0
// 

public final class lrj extends oky implements omk
{
    public static final lrj a;
    private static volatile omp b;
    
    static {
        oky.G(lrj.class, a = new lrj());
    }
    
    private lrj() {
        final oms b = oms.b;
        final okz b2 = okz.b;
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp b;
                if ((b = lrj.b) == null) {
                    synchronized (lrj.class) {
                        if (lrj.b == null) {
                            o = (lrj.b = new oku(lrj.a));
                        }
                    }
                }
                return b;
            }
            case 5: {
                return lrj.a;
            }
            case 4: {
                return new okt(lrj.a);
            }
            case 3: {
                return new lrj();
            }
            case 2: {
                return oky.F(lrj.a, "\u0001\u0000", null);
            }
            case 0: {
                return 1;
            }
        }
    }
}
