// 
// Decompiled by Procyon v0.6.0
// 

public final class opu extends oky implements omk
{
    public static final opu b;
    private static volatile omp d;
    public float a;
    private int c;
    
    static {
        oky.G(opu.class, b = new opu());
    }
    
    private opu() {
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp d;
                if ((d = opu.d) == null) {
                    synchronized (opu.class) {
                        if (opu.d == null) {
                            o = (opu.d = new oku(opu.b));
                        }
                    }
                }
                return d;
            }
            case 5: {
                return opu.b;
            }
            case 4: {
                return new okt(opu.b);
            }
            case 3: {
                return new opu();
            }
            case 2: {
                return oky.F(opu.b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1001\u0000", new Object[] { "c", "a" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
