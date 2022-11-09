// 
// Decompiled by Procyon v0.6.0
// 

public final class oqq extends oky implements omk
{
    public static final oqq a;
    private static volatile omp b;
    
    static {
        oky.G(oqq.class, a = new oqq());
    }
    
    private oqq() {
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp b;
                if ((b = oqq.b) == null) {
                    synchronized (oqq.class) {
                        if (oqq.b == null) {
                            o = (oqq.b = new oku(oqq.a));
                        }
                    }
                }
                return b;
            }
            case 5: {
                return oqq.a;
            }
            case 4: {
                return new okt(oqq.a);
            }
            case 3: {
                return new oqq();
            }
            case 2: {
                return oky.F(oqq.a, "\u0001\u0000", null);
            }
            case 0: {
                return 1;
            }
        }
    }
}
