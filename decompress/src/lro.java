// 
// Decompiled by Procyon v0.6.0
// 

public final class lro extends oky implements omk
{
    public static final lro a;
    private static volatile omp b;
    
    static {
        oky.G(lro.class, a = new lro());
    }
    
    private lro() {
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp b;
                if ((b = lro.b) == null) {
                    synchronized (lro.class) {
                        if (lro.b == null) {
                            o = (lro.b = new oku(lro.a));
                        }
                    }
                }
                return b;
            }
            case 5: {
                return lro.a;
            }
            case 4: {
                return new okt(lro.a);
            }
            case 3: {
                return new lro();
            }
            case 2: {
                return oky.F(lro.a, "\u0001\u0000", null);
            }
            case 0: {
                return 1;
            }
        }
    }
}
