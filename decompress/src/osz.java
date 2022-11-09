// 
// Decompiled by Procyon v0.6.0
// 

public final class osz extends oky implements omk
{
    public static final osz a;
    private static volatile omp b;
    
    static {
        oky.G(osz.class, a = new osz());
    }
    
    private osz() {
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
                if ((b = osz.b) == null) {
                    synchronized (osz.class) {
                        if (osz.b == null) {
                            o = (osz.b = new oku(osz.a));
                        }
                    }
                }
                return b;
            }
            case 5: {
                return osz.a;
            }
            case 4: {
                return new okt(osz.a);
            }
            case 3: {
                return new osz();
            }
            case 2: {
                return oky.F(osz.a, "\u0001\u0000", null);
            }
            case 0: {
                return 1;
            }
        }
    }
}
