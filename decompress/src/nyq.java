// 
// Decompiled by Procyon v0.6.0
// 

public final class nyq extends oky implements omk
{
    public static final nyq a;
    private static volatile omp b;
    
    static {
        oky.G(nyq.class, a = new nyq());
    }
    
    private nyq() {
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp b;
                if ((b = nyq.b) == null) {
                    synchronized (nyq.class) {
                        if (nyq.b == null) {
                            o = (nyq.b = new oku(nyq.a));
                        }
                    }
                }
                return b;
            }
            case 5: {
                return nyq.a;
            }
            case 4: {
                return new okt(nyq.a);
            }
            case 3: {
                return new nyq();
            }
            case 2: {
                return oky.F(nyq.a, "\u0001\u0000", null);
            }
            case 0: {
                return 1;
            }
        }
    }
}
