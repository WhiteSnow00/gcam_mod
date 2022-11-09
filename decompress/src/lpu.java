// 
// Decompiled by Procyon v0.6.0
// 

public final class lpu extends oky implements omk
{
    public static final lpu a;
    private static volatile omp b;
    
    static {
        oky.G(lpu.class, a = new lpu());
    }
    
    private lpu() {
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp b;
                if ((b = lpu.b) == null) {
                    synchronized (lpu.class) {
                        if (lpu.b == null) {
                            o = (lpu.b = new oku(lpu.a));
                        }
                    }
                }
                return b;
            }
            case 5: {
                return lpu.a;
            }
            case 4: {
                return new okt(lpu.a);
            }
            case 3: {
                return new lpu();
            }
            case 2: {
                return oky.F(lpu.a, "\u0001\u0000", null);
            }
            case 0: {
                return 1;
            }
        }
    }
}
